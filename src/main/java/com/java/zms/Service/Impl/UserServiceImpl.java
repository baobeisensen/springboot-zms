package com.java.zms.Service.Impl;

import com.java.zms.Dao.UserDao;
import com.java.zms.Domain.User;
import com.java.zms.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public Boolean save(User user) {
        boolean result=false;
        try {
            userDao.save(user);
            result=true;
        } catch (Exception e) {
            result=false;
            e.printStackTrace();
        }
        return result;
    }
}
