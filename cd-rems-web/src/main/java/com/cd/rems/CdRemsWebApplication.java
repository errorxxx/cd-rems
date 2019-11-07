package com.cd.rems;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})//前端默认不加载datasource
@CrossOrigin//允许跨域访问
@EnableDubboConfiguration
public class CdRemsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdRemsWebApplication.class, args);
    }

}
