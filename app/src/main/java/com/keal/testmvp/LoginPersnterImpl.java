package com.keal.testmvp;

/**
 * Created by ${Keal} on 2016/8/26.
 */
public class LoginPersnterImpl implements LoginPersenter,LoginCallback{
    LoginModel loginModel;
    LoginView loginView;

    public LoginPersnterImpl(LoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void v(String account,String pwd) {
        loginModel = new LoginModelImpl();
        loginModel.login(account,pwd,this);
    }

    @Override
    public void success() {
        loginView.success();
    }

    @Override
    public void error() {
        loginView.error();
    }
}
