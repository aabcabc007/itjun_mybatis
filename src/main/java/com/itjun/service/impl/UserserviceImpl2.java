package com.itjun.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itjun.bean.User;
import com.itjun.mapper.UserMapper2;
import com.itjun.service.Userservice2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceImpl2 implements Userservice2 {

    @Autowired
    private UserMapper2 userMapper2;

    @Override
    public void save(User user) {
        userMapper2.insert(user);
    }

    @Override
    public void delete(Integer id) {
        userMapper2.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper2.updateByPrimaryKey(user);
    }

    @Override
    public User selectOne(int id) {
        return userMapper2.selectByPrimaryKey(id);

    }

    @Override
    public List<User> selectAll() {
        return userMapper2.selectAll();
    }

    @Override
    public PageInfo<User> findByPage(int currentPage, int pageSize) {
        //设置分页查询条件    几页，几条
        PageHelper.startPage(currentPage, pageSize);
        //查询回来这一页的数据
        List<User> list = userMapper2.select(null);

        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
