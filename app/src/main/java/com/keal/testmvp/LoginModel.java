package com.keal.testmvp;

/**
 * Created by ${Keal} on 2016/8/26.
 */
public interface LoginModel {
    void login(String pwd,String account,LoginCallback loginCallback);
}
