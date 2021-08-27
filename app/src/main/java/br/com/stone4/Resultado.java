package br.com.stone4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_main);

        Intent intent = new Intent();
        Bundle parametros = intent.getExtras();

        int grupo = parametros.getInt("grupo");
        int divisao = parametros.getInt("divisao");
        int area = parametros.getInt("area");
        int altura = parametros.getInt("altura");


    }
}
