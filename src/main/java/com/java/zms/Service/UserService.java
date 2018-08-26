package com.java.zms.Service;

import com.java.zms.Domain.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

import java.util.Map;
public interface UserService {

    String insert(User user);

    Object findAllUser(int pageNum, int pageSize);

    int addUser(User user);

    Object findAll();

    Object test();

    String login(User user);
}
