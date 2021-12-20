package com.example.ASTM2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.pst_ta7_g2.R;

public class splash extends Activity {

    private final int DURACION_INICIO = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_INICIO);
    }
}