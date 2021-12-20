package com.example.ASTM2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pst_ta7_g2.R;

public class libros extends AppCompatActivity {
    String usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.libros);
        Bundle bundle = getIntent().getExtras();
        usuario = bundle.getString("user");

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