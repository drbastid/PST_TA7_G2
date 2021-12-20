package com.example.ASTM2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pst_ta7_g2.R;

public class categoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
    }
    public void informacion(View v){
        Intent i = new Intent(this, informacion.class);
        startActivity(i);

    }
    public void librosButton(View v){
        finish();
    }
}