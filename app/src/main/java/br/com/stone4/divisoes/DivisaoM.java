package br.com.stone4.divisoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.criterios.Area;
import br.com.stone4.criterios.LiquidosM2;
import br.com.stone4.criterios.Pavimentos;
import br.com.stone4.R;
import br.com.stone4.Resultado;
import br.com.stone4.criterios.Tunel_M1;

public class DivisaoM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao_m);
    }

    public void onClick(View v) {
        // do something when the button is clicked
        Intent intent = getIntent();
        Bundle parametro = intent.getExtras();

        if (v.getId() != R.id.M1 && v.getId() != R.id.M2 && v.getId() != R.id.M9 && v.getId() != R.id.M6){
            System.out.println("M1: "+R.id.M1+". Eu cliquei no: "+v.getId());
            intent = new Intent(this, Area.class);
        } else if (v.getId() == R.id.M1){
            intent = new Intent(this, Tunel_M1.class);
        } else if (v.getId() == R.id.M2){
            intent = new Intent(this, LiquidosM2.class);
        } else if (v.getId() == R.id.M9){
            intent = new Intent(this, Pavimentos.class);
        } else intent = new Intent(this, Resultado.class);

        parametro.putInt("divisao",v.getId());
        intent.putExtras(parametro);

        startActivity(intent);

    }
}