package com.example.inicioaplicativo;

//Essa tela onde o usuário difere se é um Doador ou uma ONG.

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.inicioaplicativo.LoginActivityDoador;
import com.example.inicioaplicativo.LoginActivityOng;
import com.example.inicioaplicativo.R;
import com.example.inicioaplicativo.LoginActivityDoador;
import com.example.inicioaplicativo.LoginActivityOng;
import com.example.inicioaplicativo.R;

public class EscolhaInicio  extends AppCompatActivity {

    private Object view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_inicio);

        Button btnDoador = findViewById(R.id.btnDoador); // Ao clicar no botão ele vai para a Activity de login do Doador
        btnDoador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EscolhaInicio.this, LoginActivityDoador.class);
                startActivity(i);
            }
        });

        Button btnONG = findViewById(R.id.btnONG);  // Ao clicar no botão ele vai para a Activity de login da ONG
        btnONG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EscolhaInicio.this, LoginActivityOng.class);
                startActivity(i);
            }
        });

    }
}