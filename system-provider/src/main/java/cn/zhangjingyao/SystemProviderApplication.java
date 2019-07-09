package cn.zhangjingyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 程序启动入口
 * @author
 */

@EnableTransactionManagement
@EnableAutoConfiguration
@SpringBootApplication
public class SystemProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemProviderApplication.class,args);
    }
}
