package com.itjun.controller;

import com.github.pagehelper.PageInfo;
import com.itjun.bean.User;

import com.itjun.service.Userservice2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController2 {
    @Autowired
    private Userservice2 userservice2;
    @RequestMapping("save2")
    public String save() {
        User user = new User();
        user.setName("wawa");
        user.setAge(18);
        user.setId(15);
        userservice2.save(user);
        return "save success~!~``";
    }
    @RequestMapping("delete2")
    public String delete() {
        userservice2.delete(0);
        return "delete success~";
    }

    @RequestMapping("update2")
    public String update() {
        User user = new User();
        user.setId(12);
        user.setAge(48);
        user.setName("jingjing");
        userservice2.update(user);
        return "update success~";
    }

    @RequestMapping("selectOne2")
    public String selectOne() {
        System.out.println(userservice2.selectOne(15));
        return "selectOne success~";
    }

    @RequestMapping("selectAll2")
    public String selectAll() {
        System.out.println(userservice2.selectAll());
        return "selectAll success~";
    }

    @RequestMapping("findByPage")
    public String findByPage(int currentPage, int pageSize) {
        PageInfo<User> pageInfo = userservice2.findByPage(currentPage, pageSize);
        //通过pageinfon获取属于当前页面的相关数据
        List<User> list = pageInfo.getList();

        for(User user:list) {
            System.out.println("user=" + user);
        }
        System.out.println("total"+pageInfo.getTotal());
        return "findByPage success~";
    }

}


