package com.ernest.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ERNEST
 * @Date 2020/4/24
 * @ClassName ARestController
 * @Version 0.0.1-SNAPSHOT
 */
@RestController
@RequestMapping
public class ARestController {
    /**
     * 读取配置文件中的端口
     */
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello！I'm a. port：" + port;
    }

    /**
     *
     * @param name 接收从网关传入的参数
     * @return
     */
    @RequestMapping("/name")
    public String name(String name){
        return "My name is " + name + ". aaa";
    }

    /**
     *
     * @param age 接收从网关传入的参数
     * @return
     */
    @RequestMapping("/age")
    public String age(String age){
        return "I am " + age + " years old this year. aaa";
    }

    /**
     *
     * @param pass 接收从网关传入的参数
     * @return
     */
    @RequestMapping("/routeAll")
    public String routeAll(String pass) {
        return "Can I pass? " + pass + "! port：" + port;
    }
}
