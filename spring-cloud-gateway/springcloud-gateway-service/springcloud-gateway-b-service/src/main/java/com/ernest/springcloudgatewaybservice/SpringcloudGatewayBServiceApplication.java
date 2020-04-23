package com.ernest.springcloudgatewaybservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudGatewayBServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayBServiceApplication.class, args);
    }

}
