package br.com.stone4.resultados;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import br.com.stone4.R;
import br.com.stone4.modulos.Algoritmos;

public class Controle_Resultado extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private TextView tituloAlerta, textoAlerta;
    private Button bt_ok;
    Intent intent;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint({"NonConstantResourceId", "ResourceAsColor", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_main);

        // Controle de Resultado
        intent = getIntent();
        Bundle parametros = intent.getExtras();
        // Pego o conteudo do bundle

        Boolean consulta = parametros.getBoolean("true");

        int grupo = parametros.getInt("grupo");
        int divisao = parametros.getInt("divisao");
        int area = parametros.getInt("area");
        int altura = parametros.getInt("altura");
        int lotacao = parametros.getInt("lotacao");
        int pavimentos = parametros.getInt("pavimentos");
        int tunel = parametros.getInt("tunel");
        int liquidos = parametros.getInt("liquidos");
        int produtos = parametros.getInt("produtos");
        int plataforma = parametros.getInt("plataforma");
        int deposito = parametros.getInt("deposito");
        int alojamentos = parametros.getInt("alojamentos");
        int deteccaof4 = parametros.getInt("deteccaof4");
        int publico = parametros.getInt("publico");
        int prisoes = parametros.getInt("prisoes");

        TextView tvGrupo = findViewById(R.id.textView7);
        TextView tvDivisao = findViewById(R.id.textView8);
        TextView tvArea = findViewById(R.id.textView10);
        TextView tvAltura = findViewById(R.id.textView9);

        switch (grupo) {
            case R.id.bt_A:
                tvGrupo.setText(R.string.button_A);
                switch (divisao){
                    case R.id.A1:
                        tvDivisao.setText(R.string.button_A1);
                        break;
                    case R.id.A2:
                        tvDivisao.setText(R.string.button_A2);
                        break;
                    case R.id.A3:
                        tvDivisao.setText(R.string.button_A3);
                        break;
                }
                break;
            case R.id.bt_B:
                tvGrupo.setText(R.string.button_B);
                switch (divisao){
                    case R.id.B1:
                        tvDivisao.setText(R.string.button_B1);
                        break;
                    case R.id.B2:
                        tvDivisao.setText(R.string.button_B2);
                        break;
                }
                break;
            case R.id.bt_C:
                tvGrupo.setText(R.string.button_C);
                switch (divisao){
                    case R.id.C1:
                        tvDivisao.setText(R.string.button_C1);
                        break;
                    case R.id.C2:
                        tvDivisao.setText(R.string.button_C2);
                        break;
                    case R.id.C3:
                        tvDivisao.setText(R.string.button_C3);
                        break;
                }
                break;
            case R.id.bt_D:
                tvGrupo.setText(R.string.button_D);
                switch (divisao){
                    case R.id.D1:
                        tvDivisao.setText(R.string.button_D1);
                        break;
                    case R.id.D2:
                        tvDivisao.setText(R.string.button_D2);
                        break;
                    case R.id.D3:
                        tvDivisao.setText(R.string.button_D3);
                        break;
                    case R.id.F4:
                        tvDivisao.setText(R.string.button_D4);
                        break;
                }
                break;
            case R.id.bt_E:
                tvGrupo.setText(R.string.button_E);
                switch (divisao){
                    case R.id.E1:
                        tvDivisao.setText(R.string.button_E1);
                        break;
                    case R.id.E2:
                        tvDivisao.setText(R.string.button_E2);
                        break;
                    case R.id.E3:
                        tvDivisao.setText(R.string.button_E3);
                        break;
                    case R.id.E4:
                        tvDivisao.setText(R.string.button_E4);
                        break;
                    case R.id.E5:
                        tvDivisao.setText(R.string.button_E5);
                        break;
                    case R.id.E6:
                        tvDivisao.setText(R.string.button_E6);
                        break;
                }
                break;
            case R.id.bt_F:
                tvGrupo.setText(R.string.button_F);
                switch (divisao){
                    case R.id.F1:
                        tvDivisao.setText(R.string.button_F1);
                        break;
                    case R.id.F2:
                        tvDivisao.setText(R.string.button_F2);
                        break;
                    case R.id.F3:
                        tvDivisao.setText(R.string.button_F3);
                        break;
                    case R.id.F4:
                        tvDivisao.setText(R.string.button_F4);
                        break;
                    case R.id.F5:
                        tvDivisao.setText(R.string.button_F5);
                        break;
                    case R.id.F6:
                        tvDivisao.setText(R.string.button_F6);
                        break;
                    case R.id.F7:
                        tvDivisao.setText(R.string.button_F7);
                        break;
                    case R.id.F8:
                        tvDivisao.setText(R.string.button_F8);
                        break;
                    case R.id.F9:
                        tvDivisao.setText(R.string.button_F9);
                        break;
                    case R.id.F10:
                        tvDivisao.setText(R.string.button_F10);
                        break;
                    case R.id.F11:
                        tvDivisao.setText(R.string.button_F11);
                        break;
                }
                break;
            case R.id.bt_G:
                tvGrupo.setText(R.string.button_G);
                switch (divisao){
                    case R.id.G1:
                        tvDivisao.setText(R.string.button_G1);
                        break;
                    case R.id.G2:
                        tvDivisao.setText(R.string.button_G2);
                        break;
                    case R.id.G3:
                        tvDivisao.setText(R.string.button_G3);
                        break;
                    case R.id.G4:
                        tvDivisao.setText(R.string.button_G4);
                        break;
                    case R.id.G5:
                        tvDivisao.setText(R.string.button_G5);
                        break;
                    case R.id.G6:
                        tvDivisao.setText(R.string.button_G6);
                        break;
                }
                break;
            case R.id.bt_H:
                tvGrupo.setText(R.string.button_H);
                switch (divisao){
                    case R.id.H1:
                        tvDivisao.setText(R.string.button_H1);
                        break;
                    case R.id.H2:
                        tvDivisao.setText(R.string.button_H2);
                        break;
                    case R.id.H3:
                        tvDivisao.setText(R.string.button_H3);
                        break;
                    case R.id.H4:
                        tvDivisao.setText(R.string.button_H4);
                        break;
                    case R.id.H5:
                        tvDivisao.setText(R.string.button_H5);
                        break;
                    case R.id.H6:
                        tvDivisao.setText(R.string.button_H6);
                        break;
                }
                break;
            case R.id.bt_I:
                tvGrupo.setText(R.string.button_I);
                switch (divisao){
                    case R.id.I1:
                        tvDivisao.setText(R.string.button_I1);
                        break;
                    case R.id.I2:
                        tvDivisao.setText(R.string.button_I2);
                        break;
                    case R.id.I3:
                        tvDivisao.setText(R.string.button_I3);
                        break;
                   }
                break;
            case R.id.bt_J:
                tvGrupo.setText(R.string.button_J);
                switch (divisao){
                    case R.id.J1:
                        tvDivisao.setText(R.string.button_J1);
                        break;
                    case R.id.J2:
                        tvDivisao.setText(R.string.button_J2);
                        break;
                    case R.id.J3:
                        tvDivisao.setText(R.string.button_J3);
                        break;
                    case R.id.J4:
                        tvDivisao.setText(R.string.button_J4);
                        break;
                }
                break;
            case R.id.bt_L:
                tvGrupo.setText(R.string.button_L);
                switch (divisao){
                    case R.id.L1:
                        tvDivisao.setText(R.string.button_L1);
                        break;
                    case R.id.L2:
                        tvDivisao.setText(R.string.button_L2);
                        break;
                    case R.id.L3:
                        tvDivisao.setText(R.string.button_L3);
                        break;
                }
                break;
            case R.id.bt_M:
                tvGrupo.setText(R.string.button_M);
                switch (divisao){
                    case R.id.M1:
                        tvDivisao.setText(R.string.button_M1);
                        break;
                    case R.id.M2:
                        tvDivisao.setText(R.string.button_M2);
                        break;
                    case R.id.M3:
                        tvDivisao.setText(R.string.button_M3);
                        break;
                    case R.id.M4:
                        tvDivisao.setText(R.string.button_M4);
                        break;
                    case R.id.M5:
                        tvDivisao.setText(R.string.button_M5);
                        break;
                    case R.id.M6:
                        tvDivisao.setText(R.string.button_M6);
                        break;
                    case R.id.M7:
                        tvDivisao.setText(R.string.button_M7);
                        break;
                    case R.id.M8:
                        tvDivisao.setText(R.string.button_M8);
                        break;
                    case R.id.M9:
                        tvDivisao.setText(R.string.button_M9);
                        break;
                    case R.id.M10:
                        tvDivisao.setText(R.string.button_M10);
                        break;
                }
                break;
            case R.id.bt_N:
                tvGrupo.setText(R.string.button_N);
                switch (divisao){
                    case R.id.N1:
                        tvDivisao.setText(R.string.button_N1);
                        break;
                    case R.id.N2:
                        tvDivisao.setText(R.string.button_N2);
                        break;
                    case R.id.N3:
                        tvDivisao.setText(R.string.button_N3);
                        break;
                }
                break;
        }

        tvArea.setText(String.valueOf(area));

        switch (altura){
            case R.id.ALT1:
                tvAltura.setText(R.string.bt_altura1);
                break;
            case R.id.ALT2:
                tvAltura.setText(R.string.bt_altura2);
                break;
            case R.id.ALT3:
                tvAltura.setText(R.string.bt_altura3);
                break;
            case R.id.ALT4:
                tvAltura.setText(R.string.bt_altura4);
                break;
            case R.id.ALT5:
                tvAltura.setText(R.string.bt_altura5);
                break;
            case R.id.ALT6:
                tvAltura.setText(R.string.bt_altura6);
                break;
            case R.id.ALT7:
                tvAltura.setText(R.string.bt_altura7);
                break;
            case R.id.ALT8:
                tvAltura.setText(R.string.bt_altura8);
                break;
        }

        // Outras informações + Guia Prático:
        TextView tvProcesso = (TextView) findViewById(R.id.tv_processo);
        TextView tvProjeto = (TextView) findViewById(R.id.tv_projeto);
        TextView tvGuiaPratico = findViewById(R.id.txt_guiapratico);

        // Chama o método Tipo Processo da classe Modulos
        Algoritmos algoritmos = new Algoritmos();
        int processo = algoritmos.tipoProcesso(grupo,divisao,area,pavimentos);
        boolean projeto = algoritmos.exigeProjeto(grupo,divisao,area);

        switch (processo) {
            case 1:
                tvProcesso.setText("*Processo Simplificado para Certificação Prévia*");
                tvProcesso.setTextColor(getColor(R.color.red_700));
                tvGuiaPratico.setText(R.string.txt_vistProcSimpCertPrevia);

                // botão pra acessar o diálogo
                tvProjeto.setText("Não");

                tvProcesso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createNewContactDialog(projeto,"*Certificação Prévia","processo");
                    }
                });
                break;
            case 2:
                tvProcesso.setText("*Processo Simplificado para Certificação Facilitada*");
                tvProcesso.setTextColor(getColor(R.color.red_700));
                tvGuiaPratico.setText(R.string.txt_vistProcSimpCertFac);

                // botão pra acessar o diálogo
                tvProjeto.setText("Não");

                tvProcesso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createNewContactDialog(projeto,"*Certificação Facilitada","processo");
                    }
                });
                break;
            case 0:
                tvProcesso.setText("*Processo Técnico");
                tvProcesso.setTextColor(getColor(R.color.red_700));

                tvGuiaPratico.setText(R.string.txt_vistPaP1500HidTxt);
                // botão pra acessar o diálogo
                if(projeto){
                    tvProjeto.setText("Sim");
                    tvProjeto.setTextColor(getColor(R.color.red_700));
                } else tvProjeto.setText("Não");

                tvProcesso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createNewContactDialog(projeto,"Processo Técnico", "processo");
                    }
                });

                tvProjeto.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createNewContactDialog(projeto,"Processo Técnico","projeto");
                    }
                });
                break;
        }

        intent.setClass(this, VistoriaInteligente_Resultado.class);

        intent.putExtras(parametros);
    }

    public int CargaDeIncendio(int grupo, int divisao){

        return 0;
    }

    public void createNewContactDialog(boolean TemProjeto, String tipoProcesso, String chamada) {
        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView = getLayoutInflater().inflate(R.layout.popup, null);
        tituloAlerta = (TextView) contactPopupView.findViewById(R.id.tv_alertTitle);
        textoAlerta = (TextView) contactPopupView.findViewById(R.id.tv_alertText);

        bt_ok = (Button) contactPopupView.findViewById(R.id.bt_alert);

        System.out.println("cHAMADA: " + chamada);

        if (chamada.equals("processo")) {
            if ("Processo Técnico".equals(tipoProcesso)) {
                tituloAlerta.setText(R.string.alerta_tituloProcessoTecnico);
                textoAlerta.setText(R.string.alerta_textoProcessoTecnico);
            }
        } else {
            tituloAlerta.setText(R.string.alerta_tituloProjeto);
            if (TemProjeto) {
                System.out.println("Entrei no if do TipoProcesso Sim");
                textoAlerta.setText(R.string.alerta_textoProjetoSim);
            } else {
                System.out.println("Entrei no if do TipoProcesso Não");
                textoAlerta.setText(R.string.alerta_textoProjetoNao);
            }
        }

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

    public void onClick(View view) {
        startActivity(intent);
    }

}


// vou chamar a tela da nova Listagem, passando como parametro o conteudo, por meio de lista
        /*
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(Resultado.this, "Item Clicado:" + i + " " + lista.get(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
        */