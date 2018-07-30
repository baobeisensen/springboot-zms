package com.java.zms.Service.Impl;

import com.java.zms.Dao.UserDao;
import com.java.zms.Domain.User;
import com.java.zms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> Insert(User user) {
        /*首先判断账号是否存在*/
        List<User> users =  userDao.selectUserByName(user.getUserName());
        try{
           userDao.addUser(user);
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
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
}
