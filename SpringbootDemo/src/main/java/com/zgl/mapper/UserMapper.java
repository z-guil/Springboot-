package com.zgl.mapper;

import com.zgl.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryAll();
    int addUser(@Param("user") User user);
    int deleteUser(int id);
}
