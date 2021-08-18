package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.Resultado;

public class Prisoes extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisoes);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View v) {
        // do something when the button is clicked
        intent = getIntent();
        Bundle parametros = intent.getExtras();
        parametros.putInt("prisoes", v.getId());

        intent.setClass(this, Resultado.class);

        intent.putExtras(parametros);

        startActivity(intent);

    }
}