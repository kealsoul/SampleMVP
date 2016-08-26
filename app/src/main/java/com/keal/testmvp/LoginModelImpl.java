package com.keal.testmvp;

/**
 * Created by ${Keal} on 2016/8/26.
 */
public class LoginModelImpl implements LoginModel{
    @Override
    public void login(String pwd, String account, LoginCallback loginCallback) {
        if(pwd.equals("1")&&account.equals("1")){
            loginCallback.success();
        }else {
            loginCallback.error();
        }

    }
}
