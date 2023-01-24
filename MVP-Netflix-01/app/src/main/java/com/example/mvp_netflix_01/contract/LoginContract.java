package com.example.mvp_netflix_01.contract;

public interface LoginContract {
    public interface View{
        void successLogin(User user, String message);
        void failureLogin(String error);


    }
    public interface Presenter{
        void successLogin(User user);

    }
    public interface Model{
        interface OnLoginUserListener{
           void onFinished(User user);
           void onFailure(String error);
        }
        void findUserWS(User user,OnLoginUserListener onLoginUserListener);
    }

}
