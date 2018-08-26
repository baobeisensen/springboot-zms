package com.java.zms.Service.Impl;

import com.java.zms.Dao.UserDao;
import com.java.zms.Domain.User;
import com.java.zms.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public String insert(User user) {
        int i=0;
        String result=null;
        /*首先判断账号是否存在*/
        User users =  userDao.selectUserByName(user.getUserName());
        if(null!=users){
            result="用户已存在,请直接登陆";
        }else{
            try {
                i = userDao.addUser(user);
                result="注册成功;请登陆";
            }catch (Exception e){
                e.printStackTrace();
                result = "网络异常";
            }
        }
        return result;
    }

    @Override
    public Object findAllUser(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public Object findAll() {
        return userDao.findAll();
    }

    @Override
    public Object test() {
        return userDao.test();
    }

    @Override
    public String login(User user) {
            User users =  userDao.selectUserByName(user.getUserName());
            if(null!=user){
                user.getPwd().equals(users.getPwd());
            }

            return "user/index";
        }


}
