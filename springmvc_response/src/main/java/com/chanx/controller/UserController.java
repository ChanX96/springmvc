package com.chanx.controller;

import com.chanx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值字符串
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString执行了");
        // 模拟从数据库中查询User对象
        User user = new User();
        user.setUsername("美美");
        user.setPassword("123");
        user.setAge(30);
        // model对象存数据
        model.addAttribute("user", user);
        return "success";
    }

    /**
     * 返回值为void
     * @return
     */
    @RequestMapping("/testVoid")
    public void testVoid() {
        System.out.println("testVoid执行了");
    }
}
