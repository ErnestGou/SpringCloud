package com.ernest.servicemaster;

import com.ernest.servicemaster.config.filters.TokenFilter;
import com.ernest.servicemaster.config.filters.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ServiceMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMasterApplication.class, args);
    }

    /**
     * 配置限流 Bean
     * @return
     */
    @Bean(name = "uriKeyResolver")
    public UriKeyResolver uriKeyResolver() {
        return new UriKeyResolver();
    }

    /**
     * 配置认证过滤器 Bean
     * @return
     */
    @Bean(name = "tokenFilter")
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
