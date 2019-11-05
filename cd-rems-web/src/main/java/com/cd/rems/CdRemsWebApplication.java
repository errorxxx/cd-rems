package com.cd.rems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})//前端默认不加载datasource
public class CdRemsWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdRemsWebApplication.class, args);
    }

}
