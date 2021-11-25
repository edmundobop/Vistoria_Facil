package br.com.stone4.modulos;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import br.com.stone4.R;

public class TipoProcesso extends AppCompatActivity{

    private Spinner spinner_grupos, spinner_divisao;

    private GrupoAdapter grupoAdapter;
    private DivisaoAdapter divisaoAdapter;

    @Override
    protected void onCreate(Bundle saveInstaceState) {
        super.onCreate(saveInstaceState);
        setContentView(R.layout.spinner_tipo_processos);

        spinner_grupos = (Spinner) findViewById(R.id.spinner_grupo);
        spinner_divisao = (Spinner) findViewById(R.id.spinner_divisao);

        grupoAdapter = new GrupoAdapter(TipoProcesso.this, Dados.getGrupoList());
        spinner_grupos.setAdapter(grupoAdapter);

        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListA());
        spinner_divisao.setAdapter(divisaoAdapter);

        // Seletor do spinner Divisao em função do Grupo
        spinner_grupos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListA());
                        break;
                    case 1:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListB());
                        break;
                    case 2:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListC(getApplicationContext()));
                        break;
                    case 3:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListD(getApplicationContext()));
                        break;
                    case 4:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListE(getApplicationContext()));
                        break;
                    case 5:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListF(getApplicationContext()));
                        break;
                    case 6:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListG(getApplicationContext()));
                        break;
                    case 7:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListH(getApplicationContext()));
                        break;
                    case 8:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListI(getApplicationContext()));
                        break;
                    case 9:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListJ(getApplicationContext()));
                        break;
                    case 10:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListL(getApplicationContext()));
                        break;
                    case 11:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListM(getApplicationContext()));
                        break;
                    case 12:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListN(getApplicationContext()));
                        break;
                }
                spinner_divisao.setAdapter(divisaoAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        /// só preciso de: grupo, divisao e área
    }
}
