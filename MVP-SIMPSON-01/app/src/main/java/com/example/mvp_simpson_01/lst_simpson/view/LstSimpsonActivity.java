package com.example.mvp_simpson_01.lst_simpson.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mvp_simpson_01.R;
import com.example.mvp_simpson_01.lst_simpson.presenter.LstSimpsonPresenter;

public class LstSimpsonActivity extends AppCompatActivity {
    private LstSimpsonPresenter lstSimpsonPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponentes();
        initPresenter();
        lstSimpsonPresenter.lstSimpson(null);
    }
    public void initComponentes(){

    }
    public  void  initPresenter(){
        lstSimpsonPresenter = new LstSimpsonPresenter();
    }
}