package com.zxyj.dao;

import com.zxyj.entity.User;

public interface UserDao {
    public User find(String userName,String password);
}