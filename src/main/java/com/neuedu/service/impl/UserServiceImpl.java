package com.neuedu.service.impl;

import com.neuedu.common.ServerResponse;
import com.neuedu.dao.UserInfoMapper;
import com.neuedu.pojo.UserInfo;
import com.neuedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public ServerResponse login(String username, String password) {

        //step1:参数的非空校验
        if(username==null||username.equals("")){
            return ServerResponse.serverResponseByError("用户名不能为空");
        }
        if (password==null||password.equals("")){
            return ServerResponse.serverResponseByError("密码不能为空");
        }
        //step2:检查用户是否存在
        int result=userInfoMapper.checkUser(username);
        if (result==0){
            return ServerResponse.serverResponseByError("用户名不存在");
        }
        //step3:根据用户名查找用户信息
        UserInfo userInfo = userInfoMapper.selectUserInfoByUsernameAndPassword(username,password);
        //step4：给前台返回数据

        return ServerResponse.serverResponseBySuccess(userInfo);
    }
}
