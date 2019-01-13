package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @create: 20181231
 * @author: liu
 **/

@Mapper
@Component
public interface UserMapper {
    void insertUser(User user);

}
