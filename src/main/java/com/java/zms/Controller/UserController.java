package com.java.zms.Controller;

import com.java.zms.Domain.User;
import com.java.zms.Service.UserService;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RequestMapping(value = "user")
@RestController
@Log
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "insert")
    public String Insert(User user){
       //return  "程序接收到的"+userName;
    return userService.insert(user);
    }

    @RequestMapping(value = "add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
    @RequestMapping(value = "findAll", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(){
        return userService.test();
       // return userService.findAll();
    }

}
