package com.itjun.mapper;

import com.itjun.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void save(User user);

    void delete(Integer id);

    void update(User user);

    User selectOne(int id);

    List<User> selectAll();
}
