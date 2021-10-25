package br.com.stone4.main.vistoria.VistoriaPassoApasso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import br.com.stone4.R;

public class VistoriaPassoApasso extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vistoria_passo_a_passo_menu);

        intent = getIntent();

    }

    public void onClick(View view){

        intent.putExtra("escolha",view.getId());
        intent.setClass(this, VistoriaPassoApasso_Result.class);
        startActivity(intent);
    }
}