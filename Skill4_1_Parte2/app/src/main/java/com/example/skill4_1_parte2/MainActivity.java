package com.example.skill4_1_parte2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listaDias;
    TextView etiSeleccion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDias = (ListView) findViewById(R.id.listViewId);
        etiSeleccion = (TextView) findViewById(R.id.textView);


        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arrayDias, android.R.layout.simple_list_item_1);

        listaDias.setAdapter(adaptador);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Seleccion: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                etiSeleccion.setText("Seleccion: "+parent.getItemAtPosition(position).toString());
            }
        });

        listaDias = (ListView) findViewById(R.id.listViewId);

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Alejandro");
        listaNombres.add("Cristian");
        listaNombres.add("Maria");
        listaNombres.add("Ana");
        for (int i= 0; i <10; i++){
            listaNombres.add("Nombre "+i);
        }

        ArrayAdapter adaptador1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listaNombres);

        listaDias.setAdapter(adaptador1);

        listaDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Seleccion: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();

                etiSeleccion.setText("Seleccion: "+parent.getItemAtPosition(position).toString());
            }
        });

    }
}