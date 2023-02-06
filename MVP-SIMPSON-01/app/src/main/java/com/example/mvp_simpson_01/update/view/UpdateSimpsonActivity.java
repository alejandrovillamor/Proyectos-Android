package com.example.mvp_simpson_01.update.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp_simpson_01.R;
import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;
import com.example.mvp_simpson_01.lst_simpson.presenter.LstSimpsonPresenter;
import com.example.mvp_simpson_01.update.presenter.UpdateSimpsonPresenter;

public class UpdateSimpsonActivity extends AppCompatActivity implements UpdateSimpsonContract.View {

    private UpdateSimpsonPresenter updateSimpsonPresenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponentes();
        initPresenter();
        initData();
        lstSimpsonPresenter.lstSimpson(null);
    }

    public void initComponentes(){

    }
    public  void  initPresenter(){

        lstSimpsonPresenter = new LstSimpsonPresenter();
    }
    public void initData(){
        lstSimpsonPresenter.lstSimpson(null);//Select * from simpson
    }

    @Override
    public void successUpdateSimpson(Simpson simpson, String message) {

    }

    @Override
    public void failurUpdateSimpson(String err) {

    }
}
