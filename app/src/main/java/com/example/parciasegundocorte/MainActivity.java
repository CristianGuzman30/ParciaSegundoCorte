package com.example.parciasegundocorte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Usuario, Contraseña;
    Button Mapa;

    String validarUsuario, validarContraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = findViewById(R.id.editTextUsuario);
        Contraseña = findViewById(R.id.editTerxtContraseña);
        Mapa = findViewById(R.id.button);

        Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validarUsuario = (Usuario.getText().toString());
                validarContraseña = (Contraseña.getText().toString());

                if (validarUsuario == "Cristian" || validarContraseña == "12345"){
                        irMapa();
                } else {

                }
            }
        });

    }
    private void irMapa() {
        Intent Mapa = new Intent(this, Mapa.class);
        startActivity(Mapa);
    }

}