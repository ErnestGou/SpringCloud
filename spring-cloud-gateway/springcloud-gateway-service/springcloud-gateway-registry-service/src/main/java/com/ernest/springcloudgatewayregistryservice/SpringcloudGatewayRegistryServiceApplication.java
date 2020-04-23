package com.ernest.springcloudgatewayregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudGatewayRegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudGatewayRegistryServiceApplication.class, args);
    }

}
