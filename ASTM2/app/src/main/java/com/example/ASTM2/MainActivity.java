package com.example.ASTM2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pst_ta7_g2.R;

public class MainActivity extends AppCompatActivity {

    EditText etusuario, etcontrasenia;
    Intent intent;
    String u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusuario = (EditText) findViewById(R.id.editTextUser);
        etcontrasenia = (EditText) findViewById(R.id.editTextContrasenia);

    }

    public void ingresar(View v) {
        String[] nombres = {"Andre Alberto", "Dyllan Ricardo"};
        String[] apellidos = {"Aguirre Apolo", "Bastidas Palacios"};
        String[] celular = {"0998082045", "0987447067"};
        String[] genero = {"comedia", "aventura"};
        String[] user1 = {"andragui", "drbastid"};
        String[] cuser1 = {"1234abcd", "2910drbp"};
        boolean bandera = true;
        for (int i = 0; i < user1.length; i++) {
            if (etusuario.getText().toString().equals(user1[i]) && etcontrasenia.getText().toString().equals(cuser1[i])) {
                intent = new Intent(this, libros.class);
                intent.putExtra("user",
                        "Nombres:" + nombres[i] + "\n" + "\n" +
                                "Apellidos:" + apellidos[i] + "\n" + "\n" +
                                "Correo Electrónico:" + user1[i] + "@espol.edu.ec" + "\n" + "\n" +
                                "Teléfono:" + celular[i] + "\n" + "\n" +
                                "Favorito:" + genero[i] + "\n" + "\n");
                bandera = false;
                startActivity(intent);
            }
        }
        if (bandera) {
            Toast.makeText(MainActivity.this, "Usuario o contraseña erroneas", Toast.LENGTH_SHORT).show();
        }
    }
}