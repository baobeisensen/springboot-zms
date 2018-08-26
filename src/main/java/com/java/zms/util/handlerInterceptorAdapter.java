package com.java.zms.util;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class handlerInterceptorAdapter extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session = request.getSession();
//            判断是否已有该用户登录的session
        if(session.getAttribute("SESSION_KEY") != null){
            return true;
        }
//            跳转到登录页
        String url = "/controller";
        response.sendRedirect(url);
        return false;
    }
}
