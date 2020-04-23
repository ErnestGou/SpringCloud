package com.ernest.springcloudgatewayaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayAServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayAServiceApplication.class, args);
    }

}
