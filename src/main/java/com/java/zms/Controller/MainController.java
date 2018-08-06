package com.java.zms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
@RequestMapping(value = "main")
public class MainController  {
    @RequestMapping(value = "font")
    public String toFront() {
        return "font/index";
    }
}
