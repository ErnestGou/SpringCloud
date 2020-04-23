package com.ernest.springcloudgatewaybservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ernest
 * @create 2020-04-23
 */
@RestController
@RequestMapping
public class BRestController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(){
        return "Hello！I'm b. port：" + port;
    }

    @GetMapping("/name")
    public String name(String name){
        return "My name is " + name + ". bbb";
    }

    @GetMapping("/age")
    public String age(String age){
        return "I am " + age + " years old this year. bbb";
    }

    @GetMapping("/routeAll")
    public String routeAll(String pass) {
        return "Can I pass? " + pass + "! port：" + port;
    }
}
