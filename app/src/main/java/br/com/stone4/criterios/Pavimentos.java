package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.Controle_Resultado;

public class Pavimentos extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pavimentos);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
        // do something when the button is clicked
        //System.out.println("Entrei na Classe Pavimentos");
        intent = getIntent();
        Bundle parametros = intent.getExtras();
        parametros.putInt("pavimentos", v.getId());

        int area = parametros.getInt("area");
        int altura = parametros.getInt("altura");
        int grupo = parametros.getInt("grupo");
        int divisao = parametros.getInt("divisao");

        boolean menorQ = area <= 750 && altura <= R.id.ALT3;

        switch (grupo){
            case R.id.bt_A:
            case R.id.bt_C:
            case R.id.bt_D:
            case R.id.bt_E:
            case R.id.bt_F:
            case R.id.bt_G:
            case R.id.bt_H:
            case R.id.bt_I:
            case R.id.bt_J:
            case R.id.bt_L:
            case R.id.bt_N:
                if (v.getId() == R.id.Pnao && menorQ){
                    intent.setClass(this, Lotacao.class);
                } else intent = new Intent(this, Controle_Resultado.class);
                break;
            case R.id.bt_B:
            case R.id.bt_M:
                intent = new Intent(this, Controle_Resultado.class);
                break;

        }

        intent.putExtras(parametros);



        startActivity(intent);

    }
}