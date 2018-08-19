package com.java.zms.Service.Impl;

import com.java.zms.Dao.UserDao;
import com.java.zms.Domain.User;
import com.java.zms.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public String insert(User user) {
        int i=0;
        String result="保存失败";
        /*首先判断账号是否存在*/
        List<User> users =  userDao.selectUserByName(user.getUserName());
        if(null==users||users.size()==0){
            try {
                i = userDao.addUser(user);
            }catch (Exception e){
                e.printStackTrace();
                result = "网络异常;保存失败";
                return result;
            }
        }else{
            result="用户已存在";
            return result;
        }
        if(i==1){
            result="保存成功";
        }else{
            result="保存失败";
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
}
