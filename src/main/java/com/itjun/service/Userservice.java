package com.itjun.service;

import com.github.pagehelper.PageInfo;
import com.itjun.bean.User;

import java.util.List;

public interface Userservice {
    void save(User user);

    void delete(Integer id);

    void update(User user);

    User selectOne(int id);

    List<User> selectAll();


}
