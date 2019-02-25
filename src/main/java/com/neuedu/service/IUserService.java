package com.neuedu.service;

import com.neuedu.common.ServerResponse;

public interface IUserService {
    /*
    * 登陆接口
    * */
    ServerResponse login(String username,String password);

}
