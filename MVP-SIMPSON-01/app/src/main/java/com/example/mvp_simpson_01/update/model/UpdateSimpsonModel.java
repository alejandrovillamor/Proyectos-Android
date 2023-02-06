package com.example.mvp_simpson_01.update.model;

import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;
import com.example.mvp_simpson_01.update.view.UpdateSimpsonContract;

public class UpdateSimpsonModel  implements UpdateSimpsonContract.Model {
    @Override
    public void updateSimpsonWS(Simpson simpson, OnUpdateSimpsonListener updateSimpsonListener) {
        updateSimpsonListener.onSuccess(simpson, "Actualizacion exitosa");

        updateSimpsonListener.onFailure("No se ha podido actualizar");
    }
}
