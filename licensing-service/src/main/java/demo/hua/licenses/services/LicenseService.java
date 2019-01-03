/**
 * FileName: LicenseService
 * Author:   liuzhenhua
 * Date:     2018/12/26 22:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package demo.hua.licenses.services;

import demo.hua.licenses.model.License;

import java.util.List;

/**
 * @author liuzhenhua
 * @create 2018/12/26
 * @since 1.0.0
 */
public interface LicenseService {

    List<License> getLicensesByOrg(String organizationId);

    License getLicense(String organizationId, String licenseId);

    void saveLicense(License license);

    void updateLicense(License license);

    void deleteLicense(License license);
}
