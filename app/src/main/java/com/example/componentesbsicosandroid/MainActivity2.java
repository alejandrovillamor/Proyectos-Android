package com.example.componentesbsicosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

     Button btn1,btn2;

     //bt1 referencia boton anonimo y btn2 corresponde al implements

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn1 = findViewById(R.id.btnClaseAnonima);
        btn2 = findViewById(R.id.btnImplements);
        btn2.setOnClickListener(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Desde la anonima", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(), "Desde el onclick del implements", Toast.LENGTH_SHORT).show();
    }

    public void eventoBoton(View view) {
        Toast.makeText(getApplicationContext(), "Desde el onclick del metodo", Toast.LENGTH_SHORT).show();
    }
}