package com.example.medianotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // variáveis declaradas
    EditText nota1;
    EditText nota2;
    EditText nota3;
    EditText nota4;
    TextView resultado_media;


    // esquema para obter as notas do usuário
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //associa os elementos d tela aos objetos declarados
        nota1 = findViewById(R.id.notaum);
        nota2 = findViewById(R.id.notadois);
        nota3 = findViewById(R.id.notatres);
        nota4 = findViewById(R.id.notaquatro);
        resultado_media = findViewById(R.id.resultado_media);

        // esquema para resetar o aplicativo para nova operação
        Button resetButton = findViewById(R.id.Button_Reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetFields();
            }
        });
    }

    // Parte para fazer o calculo da média
    public void calcularMedia(View v){
            //variáveis declaradas para o cálculo
            float valorNota1 = Float.parseFloat(nota1.getText().toString());
            float valorNota2 = Float.parseFloat(nota2.getText().toString());
            float valorNota3 = Float.parseFloat(nota3.getText().toString());
            float valorNota4 = Float.parseFloat(nota4.getText().toString());

            float media = (valorNota1 + valorNota2 + valorNota3 + valorNota4) / 4;

            resultado_media.setText(String.valueOf(media));
        }
        // outra parte para resetar
    public void resetFields() {
        nota1.setText("");
        nota2.setText("");
        nota3.setText("");
        nota4.setText("");
        resultado_media.setText("");
    }


}