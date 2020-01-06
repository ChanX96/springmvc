package com.chanx.controller;

import com.chanx.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * 常用的注解
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) // 把msg=美美存入session域中
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String username) {
        System.out.println("执行了");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取到请求体的内容
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("执行了");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid") String id) {
        System.out.println("执行了");
        System.out.println(id);
        return "success";
    }

    /**
     * RequestHeader
     * @return
     */
    @RequestMapping(value = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String header) {
        System.out.println("执行了");
        System.out.println(header);
        return "success";
    }

    /**
     * 获取Cookie的值
     * @return
     */
    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String cookie) {
        System.out.println("执行了");
        System.out.println(cookie);
        return "success";
    }

    /**
     * ModelAttribute注解
     * @return
     */
    @RequestMapping(value = "/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user) {
        System.out.println("执行了");
        System.out.println(user);
        return "success";
    }

    /**
     * 该方法会先执行
     */
    @ModelAttribute
    public User showUser(String uname, Map<String, User> map) {
        System.out.println("showUser执行了");
        // 通过用户名查询数据库(模拟)
        User user = new User();
        user.setUname(uname);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);
        return user;
    }

//    /**
//     * 该方法会先执行
//     */
//    @ModelAttribute
//    public User showUser(String uname) {
//        System.out.println("showUser执行了");
//        // 通过用户名查询数据库(模拟)
//        User user = new User();
//        user.setUname(uname);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }

    /**
     * SessionAttributes注解
     * @return
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("执行了");
        model.addAttribute("msg","美美");
        return "success";
    }

    /**
     * SessionAttributes注解——获取值
     * @return
     */
    @RequestMapping(value = "/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap) {
        String msg = (String) modelMap.getAttribute("msg");
        System.out.println(msg);
        return "success";
    }
}
