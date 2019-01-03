/**
 * FileName: ServiceConfig
 * Author:   liuzhenhua
 * Date:     2018/12/26 22:59
 * Description: Service Config
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package demo.hua.licenses.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Service Config <br>
 *
 * @author liuzhenhua
 * @create 2018/12/26
 * @since 1.0.0
 */
@Component
public class ServiceConfig {

    @Value("${example.property}")
    private String exampleProperty;

    public String getExampleProperty() {
        return exampleProperty;
    }

}
