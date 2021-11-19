package br.com.stone4.modulos;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import br.com.stone4.R;
import br.com.stone4.criterios.Grupo;

public class TipoProcesso extends AppCompatActivity{

    private Spinner spinner_grupos;

    private GrupoAdapter adapter;

    @Override
    protected void onCreate(Bundle saveInstaceState) {
        super.onCreate(saveInstaceState);
        setContentView(R.layout.spinner_tipo_processos);

        spinner_grupos = (Spinner) findViewById(R.id.spinner_grupo);

        adapter = new GrupoAdapter(TipoProcesso.this,Dados.getGrupoList());
        spinner_grupos.setAdapter(adapter);


        /// só preciso de: grupo, divisao e área
    }
}
