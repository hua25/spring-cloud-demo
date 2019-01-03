/**
 * FileName: LicenseRepository
 * Author:   liuzhenhua
 * Date:     2018/12/26 23:04
 * Description: LicenseRepository
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package demo.hua.licenses.repository;

import demo.hua.licenses.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * LicenseRepository <br>
 *
 * @author liuzhenhua
 * @create 2018/12/26
 * @since 1.0.0
 */
@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
    public List<License> findByOrganizationId(String organizationId);
    public License findByOrganizationIdAndLicenseId(String organizationId,String licenseId);
}
