package com.example.ASTM2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pst_ta7_g2.R;

import java.util.ArrayList;
import java.util.List;

public class libros extends AppCompatActivity {
    String usuario;
    List<String> items;
    private ListView lista;
    ArrayAdapter ADP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.libros);
        Bundle bundle = getIntent().getExtras();
        usuario = bundle.getString("user");
        lista = findViewById(R.id.list);
        items = new ArrayList<>();
        items.add("\n" + "Siete cuentos morales" + "\n" + "\n" + "Autor:  J. M. Coetzee" + "\n" + "\n" + "Genero: CUENTO" + "\n");
        items.add("\n" + "Cómo mueren las democracias" + "\n" + "\n" + "Autor: Steven Levitsky y Daniel Ziblatt" + "\n" + "\n" + "Genero:ENSAYO" + "\n");
        items.add("\n" + "Diccionario de la memoria colectiva" + "\n" + "\n" + "Autor: Ricard Ninyes" + "\n" + "\n" + "Genero: DESCONOCIDO" + "\n");
        items.add("\n" + "En defensa de la Ilustración. Por la razón, la ciencia, el humanismo y el progreso" + "\n" + "\n" + "Autor: Steven Pinker" + "\n" + "\n" + "Genero: ENSAYO CULTURAL Y LITERARIO" + "\n");
        items.add("\n" + "Otra Cataluña. Seis siglos de cultura catalana en castellano" + "\n" + "\n" + "Autor: Sergio Vila-Sanjuán" + "\n" + "\n" + "Genero: DESCONOCIDO" + "\n");

        ADP = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,items);
        lista.setAdapter(ADP);

        for(String i:items){
            ADP.notifyDataSetChanged();
        }



    }
    public void informacion(View v){
        Intent i = new Intent(this, informacion.class);
        i.putExtra("info_user",usuario);
        startActivity(i);
    }
    public void categoriaButton(View v){
        Intent i = new Intent(this, categoria.class);
        startActivity(i);
    }

}