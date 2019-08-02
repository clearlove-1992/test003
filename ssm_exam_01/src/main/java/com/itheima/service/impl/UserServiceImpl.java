package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domian.User;
import com.itheima.service.CustService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User doLogin(String username, String password) {
        Map<String,Object> map=new HashMap<>();
        map.put("username",username );
        map.put("password",password );

        User user=userDao.doLogin(map);

        return user;
    }
}
