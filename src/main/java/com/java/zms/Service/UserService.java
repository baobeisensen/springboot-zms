package com.java.zms.Service;

import com.java.zms.Domain.User;

import javax.servlet.http.HttpSession;
public interface UserService {

    String insert(User user);

    Object findAllUser(int pageNum, int pageSize);

    int addUser(User user);

    Object findAll();

    Object test();

    String login(User user, HttpSession session);
}
