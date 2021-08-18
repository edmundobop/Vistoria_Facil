package br.com.stone4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.stone4.R;

public class Vistorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistorias);

        /** Called when the user taps the Send button */
        // Botão Certidão Prévia
        Button bt_certPrevia = (Button) findViewById(R.id.button_certPrevia);
        bt_certPrevia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent irTela = new Intent(Vistorias.this, Cert_Previa.class);
                startActivity(irTela);
            }
        });

        // Botão Passo a Passo
        Button bt_pas = (Button) findViewById(R.id.button_passoapasso);
        bt_pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent irTela = new Intent(Vistorias.this, PassoApasso.class);
                startActivity(irTela);
            }
        });

        // Botão Guia Vistoriador
        Button bt_guia = (Button) findViewById(R.id.button_vistoriador);
        bt_guia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent irTela = new Intent(Vistorias.this, VistoriaInteligente.class);
                startActivity(irTela);
            }
        });

        // Botão Consulta Rapida
        Button bt_consulta = (Button) findViewById(R.id.button_consultaRapida);
        bt_consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                System.out.println("Cliquei em Consulta Rápida");
                Intent irTela = new Intent(Vistorias.this, Resultado.class);

                Bundle parametros = new Bundle();
                parametros.putBoolean("true",true);

                irTela.putExtras(parametros);

                startActivity(irTela);
            }
        });
    }
}