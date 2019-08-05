package com.cqupt.mislab.uhouse.controller.User;

import com.cqupt.mislab.uhouse.common.response.ResponseEntity;
import com.cqupt.mislab.uhouse.constant.Message;
import com.cqupt.mislab.uhouse.constant.ReturnCode;
import com.cqupt.mislab.uhouse.model.User.User;
import com.cqupt.mislab.uhouse.service.User.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    /*
    * @ApiOperation和@ApiImplicitParams为Swagger的注解
    * */
     @ApiOperation(value="用户接口",
     notes = "主要用户登录进后台"
     )
     @ApiImplicitParams(
             {
                     @ApiImplicitParam(name = "userName",value = "用户名",required = true,paramType = "query"),
                     @ApiImplicitParam(name = "password",value = "用户密码",required = true,paramType = "query")
             }
     )
    @PostMapping("/login")
    public ResponseEntity<User> login(User user) {
        User userinfo = userService.login(user);
        if (userinfo.getPassword().equals(user.getPassword()))
            return new ResponseEntity(ReturnCode.SUCCESS_CODE, Message.SUCCESS, userinfo);
        else
            return new ResponseEntity(ReturnCode.FAIL_CODE, Message.LOGIN_IS_FAIL, null);
    }


    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "userId",value = "用户Id",required = true,paramType = "query"),
                    @ApiImplicitParam(name = "password",value = "账号密码",required = true,paramType = "query")
            }
    )
    @PostMapping("/update")
    public ResponseEntity<Object> updateUser(User user) {
        boolean flag = userService.updateUser(user);
        if (flag)
            return new ResponseEntity<>(ReturnCode.SUCCESS_CODE, Message.SUCCESS, null);
        else
            return new ResponseEntity<>(ReturnCode.FAIL_CODE, Message.UPDATE_IS_FAIL, null);
    }
}