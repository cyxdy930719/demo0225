package com.neuedu.controller.protal;

import com.neuedu.common.Const;
import com.neuedu.common.ServerResponse;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    /*
    * 调用业务逻辑层
    * */
    @Autowired
    IUserService userService;

    /*
    * 登陆
    * */
    @RequestMapping(value = "/login.do")
    public ServerResponse login(HttpSession session,
                                @RequestParam String username,
                                @RequestParam String password){
        ServerResponse serverResponse=userService.login(username,password);
        if (serverResponse.isSuccess()){//登陆成功
            UserInfo userInfo=(UserInfo) serverResponse.getData();
            session.setAttribute(Const.CURRENTUSER,userInfo);




        }






        return null;
    }

}
