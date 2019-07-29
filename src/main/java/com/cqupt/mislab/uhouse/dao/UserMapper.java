package com.cqupt.mislab.uhouse.dao;

import com.cqupt.mislab.uhouse.model.user.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    //用于用户修改密码
    boolean updateUser(User user);
    //用于查找用户信息
    User findUserByUserName(String userName);
    //用于添加用户
    boolean adduser(User user);
}
