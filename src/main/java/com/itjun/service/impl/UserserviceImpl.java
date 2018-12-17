package com.itjun.service.impl;

import com.itjun.bean.User;
import com.itjun.mapper.UserMapper;
import com.itjun.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl implements Userservice {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User selectOne(int id) {
        return userMapper.selectOne(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
