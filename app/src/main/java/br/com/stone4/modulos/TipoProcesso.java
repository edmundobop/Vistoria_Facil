package br.com.stone4.modulos;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import br.com.stone4.R;

public class TipoProcesso extends AppCompatActivity{

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private TextView tituloAlerta, textoAlerta;
    private Button bt_ok;
    private Spinner spinner_grupos, spinner_divisao;
    private GrupoAdapter grupoAdapter;
    private DivisaoAdapter divisaoAdapter;

    @Override
    protected void onCreate(Bundle saveInstaceState) {
        super.onCreate(saveInstaceState);
        setContentView(R.layout.spinner_tipo_processos);

        spinner_grupos = (Spinner) findViewById(R.id.spinner_grupo);
        spinner_divisao = (Spinner) findViewById(R.id.spinner_divisao);

        grupoAdapter = new GrupoAdapter(TipoProcesso.this, Dados.getGrupoList(getApplicationContext()));
        spinner_grupos.setAdapter(grupoAdapter);

        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListA(getApplicationContext()));
        spinner_divisao.setAdapter(divisaoAdapter);

        // Seletor do spinner Divisao em função do Grupo
        spinner_grupos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 0:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListA(getApplicationContext()));
                        break;
                    case 1:
                        divisaoAdapter = new DivisaoAdapter(TipoProcesso.this, Dados.getDivisaoListB(getApplicationContext()));
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


        /// Comportamento Botao Buscar

        EditText area = (EditText) findViewById(R.id.edtx_area);

        Button buscar = (Button) findViewById(R.id.btn_buscar);
        buscar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v)
            {
                if (area.getText().length() == 0) // se o campo area estiver vazio, avisa pra inserir algo
                {
                    Toast.makeText(getBaseContext(), "Informe um valor para a Área!", Toast.LENGTH_SHORT).show();
                } else { // senao passa para a verificação do tipo de processo
                    // spinner_grupos.getSelectedItem().toString() = mostra a posicao

                    System.out.println("valores de divisao: "+grupoAdapter.getItemName(0));
                    Algoritmos algoritmos = new Algoritmos();
                    int processo = algoritmos.tipoProcesso(spinner_grupos.getSelectedItem().hashCode(), spinner_divisao.getSelectedItem().hashCode(), Integer.parseInt(area.getText().toString()), 0);

                    TextView resultado = (TextView) findViewById(R.id.txt_resultado);

                    switch (processo) {
                        case 1:
                            resultado.setText("Processo Simplificado para Certificação Prévia*");
                            resultado.setTextColor(getColor(R.color.red_700));

                            resultado.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    createNewContactDialog();
                                }
                            });
                            break;
                        case 2:
                            resultado.setText("Processo Técnico para Certificação Facilitada*");
                            resultado.setTextColor(getColor(R.color.red_700));

                            resultado.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    createNewContactDialog();
                                }
                            });
                            break;
                        case 0:
                            resultado.setText("Processo Técnico");
                            break;
                    }
                }

            }
        });
    }

    public void createNewContactDialog(){
        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView = getLayoutInflater().inflate(R.layout.popup,null);
        tituloAlerta = (TextView) contactPopupView.findViewById(R.id.tv_alertTitle);
        textoAlerta = (TextView) contactPopupView.findViewById(R.id.tv_alertText);

        bt_ok = (Button) contactPopupView.findViewById(R.id.bt_alert);

        dialogBuilder.setView(contactPopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


    }

}
