package com.example.mvp_netflix_01.presenter;

import com.example.mvp_netflix_01.contract.LoginContract;
import com.example.mvp_netflix_01.model.pojo.Film;
import com.example.mvp_netflix_01.model.pojo.User;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.Model.OnLoginUserListener {
    @Override
    public void successLogin(User user) {

    }

    @Override
    public void lstFilms(Film film) {

    }
    // public void lstFilms(){}
}
