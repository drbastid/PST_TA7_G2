package com.example.ASTM2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.pst_ta7_g2.R;

public class informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        Bundle bundle = getIntent().getExtras();
        TextView textInfo = (TextView) findViewById(R.id.info) ;
        textInfo.setText(bundle.getString("info_user"));
    }
    public void categoriaButton(View v){
        Intent i = new Intent(this, categoria.class);
        startActivity(i);
    }
    public void librosButton(View v){
        finish();
    }
    public void cerrarSesion(View v){
        finishAffinity();
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}