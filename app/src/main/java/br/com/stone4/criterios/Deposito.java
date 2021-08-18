package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.Resultado;

public class Deposito extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposito);
    }
    public void onClick(View v) {
        // do something when the button is clicked
        intent = getIntent();
        Bundle parametros = intent.getExtras();
        parametros.putInt("deposito", v.getId());
        int altura = parametros.getInt("altura");

        if (altura != R.id.ALT1) {
            intent.setClass(this, Pavimentos.class);
        } else intent.setClass(this, Resultado.class);

        intent.putExtras(parametros);

        startActivity(intent);

    }

}