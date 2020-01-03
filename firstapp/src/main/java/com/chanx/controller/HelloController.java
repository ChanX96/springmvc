package com.chanx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器类
 */
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    /**
     * 入门案例
     * /user/hello
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello() {

        System.out.println("hello world");
        return "success";
    }

    /**
     * @RequestMapping
     * @return
     */
    @RequestMapping(path = "/testRequestMapping", params = {"username=heihei"}, headers = {"Accept"})
    public String testRequestMapping() {

        System.out.println("测试RequestMapping注解...");
        return "success";
    }
}
