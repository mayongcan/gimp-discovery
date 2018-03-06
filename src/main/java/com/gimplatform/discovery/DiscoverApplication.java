package com.gimplatform.discovery;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务发现程序启动主函数 注：@SpringBootApplication注解等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan：
 * @author zzd 
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoverApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DiscoverApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
