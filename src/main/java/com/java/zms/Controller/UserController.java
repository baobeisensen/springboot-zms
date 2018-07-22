package com.java.zms.Controller;

import com.java.zms.Dao.UserDao;
import com.java.zms.Domain.User;
import com.java.zms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public Boolean InsertUser(User user){
        return userService.save(user);
    }
}
