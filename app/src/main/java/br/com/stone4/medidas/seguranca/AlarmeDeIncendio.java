package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class AlarmeDeIncendio {

    // Variáveis
    private String nome = "Alarme de Incêndio";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.alarme);


    // Métodos Get()
    public String getNome(){
        return nome;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getImagem() {
        return imagem;
    }


    // Métodos Set()
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSubTitulo(String subTitulo){
        this.subTitulo = subTitulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @SuppressLint("NonConstantResourceId")
    public Boolean Exigencia (int grupo, int divisao, int area, int altura,int lotacao,int pavimentos, int tunel, int liquidos, int produtos, int plataforma, int deposito, int alojamentos){

        boolean tem = false;
        boolean maiorq12e750  = altura >= R.id.ALT4 || area > 750;

        if (maiorq12e750) {
            switch (grupo) {
                case R.id.bt_A:
                    if (altura <= R.id.ALT2) {
                        if (area >= 1500) tem = true;
                    } else if (area >= 1200) tem = true;
                    break;
                case R.id.bt_B:
                    if (altura == R.id.ALT1) {
                        if (area >= 1500 || pavimentos == R.id.Psim) tem = true;
                    } else tem = true;
                    break;
                case R.id.bt_C:
                    if (altura <= R.id.ALT2) {
                        if (area >= 1500 || pavimentos == R.id.Psim || deposito == R.id.Dsim) tem = true;
                    } else tem = true;
                    break;
                case R.id.bt_D:
                    if (altura <= R.id.ALT2) {
                        if (area >= 1500 || pavimentos == R.id.Psim) tem = true;
                    } else tem = true;
                    break;
                case R.id.bt_E:
                    if (altura <= R.id.ALT2) {
                        if (area >= 1500 || pavimentos == R.id.Psim || alojamentos == R.id.Alsim) tem = true;
                    } else tem = true;
                    break;
                case R.id.bt_F:
                    switch (divisao){
                        case R.id.F1:
                        case R.id.F2:
                        case R.id.F3:
                        case R.id.F4:
                        case R.id.F8:
                        case R.id.F9:
                            if (altura <= R.id.ALT2){
                                if (area >= 1500 || pavimentos == R.id.Psim) tem = true;
                            } else tem = true;
                            break;
                        case R.id.F5:
                        case R.id.F6:
                        case R.id.F11:
                            tem = true;
                            break;
                        case R.id.F7:
                            break;
                        case R.id.F10:
                            if (altura <= R.id.ALT2){
                                if (area >= 1500) tem = true;
                            } else tem = true;
                            break;
                    }
                    break;
                case R.id.bt_G:
                    switch (divisao){
                        case R.id.G1:
                        case R.id.G2:
                        case R.id.G3:
                        case R.id.G4:
                            if (altura >= R.id.ALT2) {
                                tem = true;
                            } else if (area >= 1500 || pavimentos == R.id.Psim) tem = true;
                            break;
                        case R.id.G5:
                        case R.id.G6:
                            tem = true;
                            break;
                    }
                    break;
                case R.id.bt_H:
                    switch (divisao){
                        case R.id.H1:
                        case R.id.H4:
                        case R.id.H6:
                            if (altura <= R.id.ALT2){
                                if (area >= 1500 || pavimentos == R.id.Psim) tem = true;
                            } else tem = true;
                            break;
                        case R.id.H2:
                        case R.id.H3:
                        case R.id.H5:
                            tem = true;
                            break;
                    }
                    break;
                case R.id.bt_I:
                    switch (divisao){
                        case R.id.I1:
                            if (altura >= R.id.ALT3){
                                tem = true;
                            } else tem = (area >= 1500 || pavimentos == R.id.Psim);
                            break;
                        case R.id.I2:
                        case R.id.I3:
                            tem = true;
                            break;
                    }
                    break;
                case R.id.bt_J:
                    if (divisao == R.id.J1){
                        if (altura>= R.id.ALT4){
                            tem = true;
                        }
                    } else tem = true;
                    break;
                case R.id.bt_M:
                    break;
            }
        }

        if (grupo == R.id.bt_M){
            if ((divisao == R.id.M2 && (liquidos == R.id.ck_liquidos2 || plataforma != 0 || produtos == R.id.ck_produtos2)) || divisao == R.id.M5) tem = true;
            if (divisao == R.id.M3) {
                if (altura > R.id.ALT2) {
                    tem = true;
                } else if (area >= 750) tem = true;
            }
            if(divisao == R.id.M10) {
                tem = area >= 750;
            }
        }

        if (grupo == R.id.bt_L || grupo == R.id.bt_N){
            tem = false;
        }

        return tem;
    }

    @SuppressLint("NonConstantResourceId")
    public Boolean Recomendado(int grupo, int divisao){

        boolean recomendado = false;

        switch (grupo){
            case R.id.bt_A:
            case R.id.bt_B:
            case R.id.bt_C:
            case R.id.bt_D:
            case R.id.bt_E:
            case R.id.bt_F:
            case R.id.bt_G:
            case R.id.bt_H:
            case R.id.bt_I:
            case R.id.bt_J:
            case R.id.bt_L:
            case R.id.bt_N:
            case R.id.bt_M:
                break;
        }

        return recomendado;
    }

}
