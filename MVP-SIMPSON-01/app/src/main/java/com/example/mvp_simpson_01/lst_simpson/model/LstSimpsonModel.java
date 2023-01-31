package com.example.mvp_simpson_01.lst_simpson.model;

import com.example.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;

public class LstSimpsonModel implements LstSimpsonContract.Model {
    @Override
    public void lstSimpsonWS(Simpson simpson, OnLstSimpsonListener onLstSimpsonListener) {
        //si ha ido bien
        onLstSimpsonListener.onSuccess(null);
        //si ha ido mal
        onLstSimpsonListener.onFailure("Error!!!!!!");
    }
}
