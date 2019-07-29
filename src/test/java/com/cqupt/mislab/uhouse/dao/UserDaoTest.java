package com.cqupt.mislab.uhouse.dao;

import com.cqupt.mislab.uhouse.model.user.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDaoTest {

    @Autowired
    private UserMapper userMapper;

    @Before
    public void adduser(){
        User user=new User();
        user.setUserName("Test");
        user.setPassword("123456");
        userMapper.adduser(user);
    }

    @Test
    @Transactional//用于数据回滚
    public void findUserByUserIdTest(){
        User user = userMapper.findUserByUserName("Test");
        assertEquals("123456", user.getPassword());
    }


   @Test
   @Transactional//用于数据回滚
   public void updateUsers(){
       User user=new User();
       user.setUserId(9);//这里的id只能是数据库里面的数据，由于回滚过后主键依旧递增了，所以找不到传什么id，所以就传一个数据表中的确定id
       user.setPassword("999");
       boolean flag=userMapper.updateUser(user);
       assertEquals(true,flag);
   }
}
