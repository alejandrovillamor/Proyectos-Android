package com.example.mvp_simpson_01.lst_simpson.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvp_simpson_01.R;
import com.example.mvp_simpson_01.entities.Simpson;
import com.example.mvp_simpson_01.lst_simpson.LstSimpsonContract;
import com.example.mvp_simpson_01.lst_simpson.model.pojo.Simpson;
import com.example.mvp_simpson_01.lst_simpson.presenter.LstSimpsonPresenter;

import java.util.ArrayList;

public class LstSimpsonActivity extends AppCompatActivity  implements LstSimpsonContract.View {
    private LstSimpsonPresenter lstSimpsonPresenter;

    @Override
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
    public void successLstSimpson(ArrayList<Simpson> lstSimpson) {

        Toast.makeText(this, lstSimpson.get(0).toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void failureLstSimpson(String err) {
        Toast.makeText(this,"Los datos no han podido ser cargados", Toast.LENGTH_SHORT ).show();
    }
}