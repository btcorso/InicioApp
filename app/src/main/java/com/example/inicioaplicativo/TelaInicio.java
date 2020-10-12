package com.example.inicioaplicativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class TelaInicio extends AppCompatActivity {

    private Object view;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicio);


        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Intent i = new Intent(TelaInicio.this, EscolhaInicio.class);
                startActivity(i);
                finish();
            }
        }.start();

    }


}
