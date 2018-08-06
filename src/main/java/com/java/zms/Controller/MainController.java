package com.java.zms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/main")
public class MainController  {
    @RequestMapping(value = "/font")
    public String toFront() {
        return "/font/index";
    }
}
