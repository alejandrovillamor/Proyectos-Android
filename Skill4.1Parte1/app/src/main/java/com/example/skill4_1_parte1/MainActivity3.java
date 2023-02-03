package com.example.skill4_1_parte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    android.widget.RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        r1 = (android.widget.RadioButton) findViewById(R.id.idRadio1);
        r2 = (android.widget.RadioButton) findViewById(R.id.idRadio2);

    }

    public void onclick(View view) {
        if (view.getId()==R.id.btn1){
            validar();
        }
    }

    private void validar() {
        String cad = "Seleccionado: \n";

        if (r1.isChecked()==true){
            cad="Opcion1\n";
        }
        if (r2.isChecked()==true){
            cad="Opcion2";
        }

        Toast.makeText(getApplicationContext(),cad,Toast.LENGTH_SHORT).show();
    }
}