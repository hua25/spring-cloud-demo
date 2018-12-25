/**
 * FileName: ConfigServerApplication Author: liuzhenhua Date: 2018/12/25 22:46 Description: Spring
 * Cloud Config 引导类 History: <author> <time> <version> <desc> 作者姓名 修改时间 版本号 描述
 */
package demo.hua.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config 引导类 <br>
 *
 * @author liuzhenhua
 * @create 2018/12/25
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
