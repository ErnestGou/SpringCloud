package com.ernest.servicemaster.hystrix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关熔断器
 * @author Ernest
 * @create 2020-04-24
 * @ClassName FallbackController
 * @version 0.0.1-SNAPSHOT
 */
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback() {
        return "I'm Spring Cloud Gateway Fallback.";
    }

}
