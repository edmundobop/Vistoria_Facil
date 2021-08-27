package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.Controle_Resultado;

public class Lotacao extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotacao);

    }

    public void onClick(View v) {
        // do something when the button is clicked
        //System.out.println("Entrei na Classe Lotação");
        intent = getIntent();
        Bundle parametros = intent.getExtras();
        parametros.putInt("lotacao", v.getId());

        int grupo = parametros.getInt("grupo");
        int divisao = parametros.getInt("divisao");

        intent = new Intent(this, Controle_Resultado.class);

        intent.putExtras(parametros);

        startActivity(intent);

    }
}