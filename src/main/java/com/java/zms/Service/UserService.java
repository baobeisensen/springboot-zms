package com.java.zms.Service;

import com.java.zms.Domain.User;

import java.util.Map;

public interface UserService {

    Map<String, Object> Insert(User user);

    Object findAllUser(int pageNum, int pageSize);

    int addUser(User user);

    Object findAll();

    Object test();
}
