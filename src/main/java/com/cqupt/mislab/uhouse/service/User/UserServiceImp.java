package com.cqupt.mislab.uhouse.service.User;

import com.cqupt.mislab.uhouse.dao.UserMapper;
import com.cqupt.mislab.uhouse.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp  implements UserService{

    @Autowired
    private UserMapper userMapper;

    /*
     * 用于用户修改密码
     * */
    @Override
   public boolean updateUser(User user){
        if (user.getPassword()==null)
            return false;
        else
            userMapper.updateUser(user);
        return true;
    }

    /*
    * 用于用户登录
    * */
    @Override
    public User login(User user){
      return userMapper.findUserByUserName(user.getUserName());
    }
}
