package com.cd.rems;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDubboConfiguration
@EnableTransactionManagement
@MapperScan(annotationClass = Repository.class, basePackages = "com.cd.rems.dao")
public class CdRemsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdRemsServiceApplication.class, args);
    }
}
