package com.itheima.service;

import com.itheima.domian.User;

public interface UserService {
    User doLogin(String username, String password);
}
