package br.com.stone4.divisoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.criterios.Area;
import br.com.stone4.R;

public class DivisaoL extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisao_l);
    }

    public void onClick(View v) {
        // do something when the button is clicked
        Intent intent = getIntent();
        Bundle parametro = intent.getExtras();
        System.out.println("Estou na Divisão e tenho esse valor: "+parametro.getInt("grupo"));

        intent = new Intent(this, Area.class);

        parametro.putInt("divisao",v.getId());

        intent.putExtras(parametro);

        System.out.println("Agora tenho esse valor de Grupo: "+parametro.getInt("grupo"));

        startActivity(intent);

    }
}