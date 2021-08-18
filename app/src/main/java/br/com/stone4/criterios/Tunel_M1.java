package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.Resultado;


public class Tunel_M1 extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tunel__m2);
    }

    public void onClick(View v){

        // do something when the button is clicked
        intent = getIntent();
        Bundle parametro = intent.getExtras();
        intent.setClass(this, Resultado.class);
        parametro.putInt("tunel",v.getId());
        intent.putExtras(parametro);
        startActivity(intent);


    }
}