package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.resultados.Controle_Resultado;

public class Altura extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altura);
    }

    // Implement the OnClickListener callback
    @SuppressLint("NonConstantResourceId")
    public void onClic(View v) {

        intent = getIntent();
        Bundle parametros = intent.getExtras();
        parametros.putInt("altura", v.getId());
        int area = parametros.getInt("area");
        int altura = parametros.getInt("altura");
        int grupo = parametros.getInt("grupo");
        int divisao = parametros.getInt("divisao");

        boolean maiorQ = altura >= R.id.ALT4 || area > 750;
        boolean menorQ = altura <= R.id.ALT3 && area <= 750;

        switch (grupo){
            case R.id.bt_A:
            case R.id.bt_D:
            case R.id.bt_G:
            case R.id.bt_I:
            case R.id.bt_L:
                if (menorQ) {
                    if (v.getId() != R.id.ALT1) {
                        intent.setClass(this, Pavimentos.class);
                    } else intent.setClass(this, Lotacao.class);
                } else {
                    if (v.getId() != R.id.ALT1) {
                        intent.setClass(this, Pavimentos.class);
                    } else intent.setClass(this, Controle_Resultado.class);
                }
                break;
            case R.id.bt_B:
                if (maiorQ){
                    intent.setClass(this, Pavimentos.class);
                } else intent.setClass(this, Controle_Resultado.class);
                break;
            case R.id.bt_C:
                if (menorQ) {
                    if (v.getId() != R.id.ALT1) {
                        intent.setClass(this, Pavimentos.class);
                    } else intent.setClass(this, Lotacao.class);
                } else intent.setClass(this, Deposito.class);
                break;
            case R.id.bt_E:
                if (menorQ) {
                    if (v.getId() != R.id.ALT1) {
                        intent.setClass(this, Pavimentos.class);
                    } else intent.setClass(this, Lotacao.class);
                } else intent.setClass(this, Alojameos.class);
                break;
            case R.id.bt_F:
                switch (divisao){
                    case R.id.F1:
                    case R.id.F2:
                    case R.id.F3:
                    case R.id.F4:
                    case R.id.F8:
                    case R.id.F9:
                        if (menorQ) {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Lotacao.class);
                        } else intent.setClass(this, Pavimentos.class);
                        break;
                    case R.id.F5:
                    case R.id.F11:
                        if (menorQ) {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Lotacao.class);
                        } else if (altura <= R.id.ALT4){
                            intent.setClass(this, Deteccao_F4.class);
                        } else intent.setClass(this, Controle_Resultado.class);
                        break;
                    case R.id.F6:
                        if (menorQ) {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Lotacao.class);
                        } else if (altura <= R.id.ALT5){
                            intent.setClass(this, Publico.class);
                        } else if (altura <= R.id.ALT1){
                            intent.setClass(this, Deteccao_F4.class);
                        } else intent.setClass(this, Controle_Resultado.class);
                        break;
                    case R.id.F7:
                        if (menorQ) {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Lotacao.class);
                        } else intent.setClass(this, Publico.class);
                        break;
                    case R.id.F10:
                        if (menorQ) {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Lotacao.class);
                        } else intent.setClass(this, Controle_Resultado.class);
                        break;
                }
                break;
            case R.id.bt_H:
                switch (divisao) {
                    case R.id.H1:
                    case R.id.H2:
                    case R.id.H3:
                    case R.id.H4:
                    case R.id.H6:
                        if (menorQ) {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Lotacao.class);
                        } else {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Controle_Resultado.class);
                        }
                        break;
                    case R.id.H5:
                        if (menorQ) {
                            if (v.getId() != R.id.ALT1) {
                                intent.setClass(this, Pavimentos.class);
                            } else intent.setClass(this, Lotacao.class);
                        } else intent.setClass(this, Prisoes.class);
                        break;
                }
                break;
            case R.id.bt_M:
                if (v.getId() != R.id.ALT1 && divisao == R.id.M10) {
                    intent.setClass(this, Pavimentos.class);
                } else intent.setClass(this, Controle_Resultado.class);
                break;
            case R.id.bt_J:
                if (menorQ) {
                    if (v.getId() != R.id.ALT1) {
                        intent.setClass(this, Pavimentos.class);
                    } else intent.setClass(this, Lotacao.class);
                } else intent.setClass(this, Controle_Resultado.class);
                break;
            case R.id.bt_N:
                intent.setClass(this, Controle_Resultado.class);
                break;
        }

        intent.putExtras(parametros);

        startActivity(intent);
    }



}