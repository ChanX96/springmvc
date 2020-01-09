package com.chanx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testInterceptor")
    public String testException() throws Exception {

        System.out.println("testInterceptor执行了");

        return "success";
    }
}
