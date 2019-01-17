package com.neuedu.service;

import com.neuedu.common.ServerResponse;
import com.neuedu.pojo.UserInfo;

public interface IUserservice {
//    登陆接口
    ServerResponse login(String username,String password);
//    注册接口
    ServerResponse register(UserInfo userInfo);
//    找回密保问题
    ServerResponse forget_get_question(String username);
//    提交问题答案
    ServerResponse forget_check_answer(String username, String question, String answer);
//    重置密码
    ServerResponse forget_reset_password(String username, String passwordNew, String forgettoken);
//    检查用户名和邮箱是否有效
    ServerResponse check_valid(String str,String type);
//    登录状态下更改密码
    ServerResponse reset_password(String username,String passwordOld,String passwordNew);
//    登录状态下更新个人信息
    ServerResponse update_information(UserInfo user);
//    根据用户id查询个人信息
    UserInfo selectUserByUserid(Integer userId);
}
