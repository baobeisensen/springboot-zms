package com.java.zms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "main")
public class MainController  {

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
        return "back/index";
    }
}
