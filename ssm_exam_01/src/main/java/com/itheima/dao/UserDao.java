package com.itheima.dao;

import com.itheima.domian.User;

import java.util.Map;

public interface UserDao {
    User doLogin(Map<String, Object> map);
}
