package com.example.mvp_netflix_01.contract;

import com.example.mvp_netflix_01.model.pojo.Film;
import com.example.mvp_netflix_01.model.pojo.User;

public interface LoginContract {
    public interface View{
        void successLogin(User user, String message);
        void failureLogin(String error);


    }
    public interface Presenter{
        void successLogin(User user);
        void lstFilms(Film film);

    }
    public interface Model{
        interface OnLoginUserListener{
           void onFinished(User user);
           void onFailure(String error);
        }
        void findUserWS(User user,OnLoginUserListener onLoginUserListener);
    }

}
