package com.cqupt.mislab.uhouse.model.User;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiParam;

//import javax.persistence.Entity;
//import javax.persistence.Table;


/*
* 此注解用来过滤掉不返回前端的字段，作用于类上，value值即是要过滤的值
* 此注解还可用@JsonIgnore代替，此注解直接作用于字段上，被此注解作用的字段不随实体返回前端。
* */
//@Entity
//@Table(name = "user")
@JsonIgnoreProperties(value = {"userName","password"})
public class User {
    //此注解用于在Swagger-ui中隐藏此参数
    @ApiParam(hidden = true)
    private int userId;
    //此注解用于在Swagger-ui中隐藏此参数
    @ApiParam(hidden = true)
    private String userName;
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
