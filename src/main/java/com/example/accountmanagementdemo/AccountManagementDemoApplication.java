package com.example.accountmanagementdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class AccountManagementDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountManagementDemoApplication.class, args);
    }

}
