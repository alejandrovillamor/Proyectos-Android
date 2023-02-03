package com.example.skill4_1_parte1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity8 extends AppCompatActivity {

    TextView estado;
    Spinner comboDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        estado = (TextView) findViewById(R.id.etiSeleccion3);
        comboDias = (Spinner) findViewById(R.id.idSpinnerDias);


        ArrayList<String> comboDiasList = new ArrayList<String>();
        comboDiasList.add("Seleccion");
        comboDiasList.add("Lunes");
        comboDiasList.add("Martes");
        comboDiasList.add("Miercoles");
        comboDiasList.add("Jueves");
        comboDiasList.add("Viernes");
        comboDiasList.add("Sabado");
        comboDiasList.add("Domingo");


        ArrayAdapter<CharSequence> adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,comboDiasList);

        comboDias.setAdapter(adapter1);

        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Seleccionado: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();

                estado.setText("Seleccionado: "+parent.getItemAtPosition(position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.combo_dias, android.R.layout.simple_spinner_item);

        comboDias.setAdapter(adapter);

        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Seleccionado: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();

               estado.setText("Seleccionado: "+parent.getItemAtPosition(position).toString());

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}