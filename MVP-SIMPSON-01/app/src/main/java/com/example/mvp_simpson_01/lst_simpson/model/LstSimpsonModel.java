package com.example.mvp_simpson_01.lst_simpson.model;

import com.example.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;
import com.example.mvp_simpson_01.utils.ApiClient;
import com.example.mvp_simpson_01.utils.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstSimpsonModel implements LstSimpsonContract.Model {
    @Override
    public void lstSimpsonWS(Simpson simpson, OnLstSimpsonListener onLstSimpsonListener) {
        //si ha ido bien
      //  onLstSimpsonListener.onSuccess(null);
        //si ha ido mal
       // onLstSimpsonListener.onFailure("Error!!!!!!");
        getSimpsonService(onLstSimpsonListener);
    }

    public void getSimpsonService(final OnLstSimpsonListener onLstSimpsonListener) {
        /*Ejecuto Webservice con retrofit*/
        ApiInterface apiService = ApiClient.getClient()
                .create(ApiInterface.class);
        Call<ArrayList<Simpson>> call = apiService.getPopularSimpson(2);
        call.enqueue(new Callback<ArrayList<Simpson>>() {
            @Override
            public void onResponse(Call<ArrayList<Simpson>> call, Response<ArrayList<Simpson>> response) {
                   ArrayList<Simpson> lstSimpson = response.body();
                   if (lstSimpson!=null){
                       //OnLoginListener.onFnished(user);
                       onLstSimpsonListener.onSuccess(lstSimpson);
                   }
            }

            @Override
            public void onFailure(Call<ArrayList<Simpson>> call, Throwable t) {
                        onLstSimpsonListener.onFailure(t.getMessage());
            }
        });
    }
}
