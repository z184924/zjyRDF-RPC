package cn.zhangjingyao;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 程序启动入口
 * @author
 */

@EnableCaching
@EnableAutoConfiguration
@SpringBootApplication
public class SystemConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemConsumerApplication.class,args);
    }
}
