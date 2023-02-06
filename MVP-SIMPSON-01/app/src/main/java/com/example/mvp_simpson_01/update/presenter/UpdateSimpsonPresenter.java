package com.example.mvp_simpson_01.update.presenter;

import android.widget.Toast;

import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;
import com.example.mvp_simpson_01.update.model.UpdateSimpsonModel;
import com.example.mvp_simpson_01.update.view.UpdateSimpsonActivity;
import com.example.mvp_simpson_01.update.view.UpdateSimpsonContract;

public class UpdateSimpsonPresenter implements UpdateSimpsonContract.Presenter {
    private UpdateSimpsonModel updateSimpsonModel;
    private UpdateSimpsonContract.View view;

    public UpdateSimpsonPresenter(UpdateSimpsonContract.View view){
        this.view = view;
        updateSimpsonModel = new UpdateSimpsonModel();
    }


    @Override
    public void UpdateSimpson(Simpson simpson) {
        updateSimpsonModel.updateSimpsonWS(simpson, new UpdateSimpsonContract.Model.OnUpdateSimpsonListener() {
            @Override
            public void onSuccess(Simpson simpson, String message) {
                  view.successUpdateSimpson(simpson, message);
            }

            @Override
            public void onFailure(String error) {
                view.failurUpdateSimpson(error);
            }
        });
    }
}
