package com.itjun.controller;

import com.itjun.bean.User;
import com.itjun.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;

@RestController
public class UserController {
    @Autowired
    private Userservice userservice;

    @RequestMapping("save")
    public String save() {
        User user = new User();
        user.setName("静a");
        user.setAge(18);
        user.setId(13);
        userservice.save(user);
        return "save success~";
    }

    @RequestMapping("delete")
    public String delete() {
        userservice.delete(1);
        return "delete success~";
    }

    @RequestMapping("update")
    public String update() {
        User user = new User();
        user.setId(1);
        user.setAge(38);
        userservice.update(user);
        return "update success~";
    }

    @RequestMapping("selectOne")
    public String selectOne() {
        System.out.println(userservice.selectOne(3));
        return "selectOne success~";
    }

    @RequestMapping("selectAll")
    public String selectAll() {
        System.out.println(userservice.selectAll());
        return "selectAll success~";
    }
}