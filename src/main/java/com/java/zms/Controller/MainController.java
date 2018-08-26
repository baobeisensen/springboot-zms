package com.java.zms.Controller;

import com.java.zms.Domain.User;
import com.java.zms.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "main")
public class MainController  {
    @Resource
    private UserService userService;

    @RequestMapping(value = "font")
    public String toFront() {
        return "font/index";
    }
//font
    @RequestMapping(value = "services")
    public String services() {
        return "font/services";
    }
    @RequestMapping(value = "about")
    public String about() {
        return "font/about";
    }
    @RequestMapping(value = "blog")
    public String blog() {
        return "font/blog";
    }
    @RequestMapping(value = "portfolio")
    public String portfolio() {
        return "font/portfolio";
    }
    @RequestMapping(value = "contact")
    public String contact() {
        return "font/contact";
    }
//back
    @RequestMapping(value = "controller")
    public String controller() {
        return "back/login";
    }
    @RequestMapping("login")
    public String login(User user){
        return userService.login(user);
    }
}
