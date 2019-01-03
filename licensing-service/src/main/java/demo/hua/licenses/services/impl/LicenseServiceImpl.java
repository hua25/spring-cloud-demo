/**
 * FileName: LicenseServiceImpl
 * Author:   liuzhenhua
 * Date:     2018/12/26 22:58
 * Description: License Service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package demo.hua.licenses.services.impl;

import demo.hua.licenses.config.ServiceConfig;
import demo.hua.licenses.model.License;
import demo.hua.licenses.repository.LicenseRepository;
import demo.hua.licenses.services.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * License Service <br>
 *
 * @author liuzhenhua
 * @create 2018/12/26
 * @since 1.0.0
 */
@Service
public class LicenseServiceImpl implements LicenseService {

    @Autowired
    private LicenseRepository licenseRepository;

    @Autowired
    private ServiceConfig config;

    @Override
    public List<License> getLicensesByOrg(String organizationId) {
        return licenseRepository.findByOrganizationId(organizationId);
    }

    @Override
    public License getLicense(String organizationId, String licenseId) {
        License license = licenseRepository.findByOrganizationIdAndLicenseId(organizationId, licenseId);
        return license;
    }

    @Override
    public void saveLicense(License license) {
        license.withId(UUID.randomUUID().toString());
        licenseRepository.save(license);

    }

    @Override
    public void updateLicense(License license) {
        licenseRepository.save(license);
    }

    @Override
    public void deleteLicense(License license) {
        licenseRepository.deleteById(license.getLicenseId());
    }
}
