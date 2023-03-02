package com.example.medianotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // variáveis declaradas
    EditText nota1;
    EditText nota2;
    EditText nota3;
    EditText nota4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //associa os elementos d tela aos objetos declarados
        nota1 = findViewById(R.id.notaum);
        nota2 = findViewById(R.id.notadois);
        nota3 = findViewById(R.id.notatres);
        nota4 = findViewById(R.id.notaquatro);

        public void calcularMedia(View v){
            //variáveis declaradas para o cálculo
            float nota1 = float.parseFloat(nota1.getText().tostring());
            float nota2 = float.parseFloat(nota2.getText().tostring());
            float nota3 = float.parseFloat(nota3.getText().tostring());
            float nota4 = float.parseFloat(nota4.getText().tostring());

            float media = (nota1+nota2+nota3+nota4) / 4;
        }


    }
}