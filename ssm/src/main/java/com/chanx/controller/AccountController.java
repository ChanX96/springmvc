package com.chanx.controller;

import com.chanx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 账户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll() {

        System.out.println("表现层：查询所有账户");
        // 调用service的方法
        accountService.findAll();
        return "list";
    }
}
