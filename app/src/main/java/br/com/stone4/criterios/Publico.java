package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.resultados.Controle_Resultado;

public class Publico extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publico);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
        // do something when the button is clicked
        intent = getIntent();
        Bundle parametros = intent.getExtras();
        parametros.putInt("publico", v.getId());
        int altura = parametros.getInt("altura");
        int divisao = parametros.getInt("divisao");

        switch (divisao){
            case R.id.F1:
            case R.id.F2:
            case R.id.F3:
            case R.id.F8:
            case R.id.F9:
            case R.id.F10:
                if (altura != R.id.ALT1) {
                    intent.setClass(this, Pavimentos.class);
                } else intent.setClass(this, Controle_Resultado.class);
                break;
            case R.id.F7:
                intent.setClass(this, Controle_Resultado.class);
                break;
            case R.id.F4:
            case R.id.F5:
            case R.id.F11:
                if (altura <= R.id.ALT4) {
                    intent.setClass(this, Deteccao_F4.class);
                } else intent.setClass(this, Controle_Resultado.class);
                break;
            case R.id.F6:
                if (altura <= R.id.ALT1) {
                    intent.setClass(this, Deteccao_F4.class);
                } else intent.setClass(this, Controle_Resultado.class);
                break;
        }

        intent.putExtras(parametros);

        startActivity(intent);

    }
}