package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.stone4.R;
import br.com.stone4.resultados.Controle_Resultado;

public class Area extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
    }

    // Implement the OnClickListener callback
    public void onClick(View v) {
        // do something when the button is clicked
        Intent intent = getIntent();

        EditText area = (EditText) findViewById(R.id.tx_area);

        System.out.println("Valor de Área: "+area.getText());

        if (area.getText().length() == 0){

            //System.out.println("A area esta vazia");
            Toast.makeText(getBaseContext(), "Informe um valor Válido!", Toast.LENGTH_SHORT).show();

        } else {

            //Intent intent = getIntent();

            Bundle parametro = intent.getExtras();

            parametro.putInt("area",Integer.parseInt(area.getText().toString()));

            int grupo = parametro.getInt("grupo");
            int divisao = parametro.getInt("divisao");

            if (grupo != R.id.bt_M || divisao == R.id.M3 || divisao == R.id.M10){
                intent = new Intent(this, Altura.class);
            }   //para as divisoes abaixo que nao precisam de altura, vão direto para a tela de resultado
            else if (divisao == R.id.M2){
                intent = new Intent(this, Pavimentos.class);
                //o restante dos grupos vão para a tela de altura
            } else intent = new Intent(this, Controle_Resultado.class);

            intent.putExtras(parametro);

            startActivity(intent);
        }

    }

}