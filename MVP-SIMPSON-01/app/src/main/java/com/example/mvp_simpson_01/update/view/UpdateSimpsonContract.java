package com.example.mvp_simpson_01.update.view;

import com.example.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;

import java.util.ArrayList;

public interface UpdateSimpsonContract {
    public interface  View{
        void successUpdateSimpson(Simpson simpson, String message);
        void failurUpdateSimpson(String err);
    }

    public  interface Presenter{
        //CASO DE USO
        void UpdateSimpson(Simpson simpson);
    }
    public interface  Model{
        interface OnUpdateSimpsonListener{
            void onSuccess(Simpson simpson, String message);
            void onFailure(String error);
        }
        void updateSimpsonWS(Simpson simpson, OnUpdateSimpsonListener updateSimpsonListener);
    }
}
