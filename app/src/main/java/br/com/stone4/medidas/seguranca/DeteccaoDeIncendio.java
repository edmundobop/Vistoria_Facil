package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class DeteccaoDeIncendio {

    // Variáveis
    private String nome = "Detecção de Incêndio";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.detector_inc);


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
    public Boolean Exigencia (int grupo, int divisao, int area, int altura,int lotacao,int pavimentos, int tunel, int liquidos, int produtos, int plataforma, int deposito, int deteccaof4, int prisoes){

        boolean tem = false;
        boolean maiorq12e750  = altura >= R.id.ALT4 || area > 750;

        if (maiorq12e750) {
            switch (grupo) {
                case R.id.bt_A:
                    break;
                case R.id.bt_B:
                    if (altura != R.id.ALT1) tem = true;
                    break;
                case R.id.bt_C:
                    if (deposito == R.id.Dsim || altura >= R.id.ALT6){
                        tem = true;
                    }
                    break;
                case R.id.bt_E:
                    tem = true;
                case R.id.bt_D:
                    if (altura >= R.id.ALT6) tem = true;
                    break;
                case R.id.bt_F:
                    switch (divisao){
                        case R.id.F1:
                            tem = true;
                            break;
                        case R.id.F2:
                            tem = altura >= R.id.ALT6;
                            break;
                        case R.id.F4:
                            tem = deteccaof4 == R.id.DetecSim;
                            break;
                        case R.id.F5:
                        case R.id.F11:
                            tem = altura >= R.id.ALT5 || deteccaof4 == R.id.DetecSim;
                            break;
                        case R.id.F6:
                            tem = altura >= R.id.ALT2 || deteccaof4 == R.id.DetecSim;
                            break;
                        case R.id.F3:
                        case R.id.F9:
                        case R.id.F7:
                            break;
                        case R.id.F8:
                            tem = altura >= R.id.ALT5;
                            break;
                        case R.id.F10:
                            tem = altura >= R.id.ALT3;
                            break;
                    }
                    break;
                case R.id.bt_G:
                    if (divisao != R.id.G5 && divisao != R.id.G6){
                        if (altura >= R.id.ALT6) tem = true;
                    } else tem = true;
                    break;
                case R.id.bt_H:
                    if (divisao == R.id.H2 || divisao == R.id.H3) tem = true;
                    if ((divisao == R.id.H1 || divisao == R.id.H6) && altura >= R.id.ALT6) tem = true;
                    if (divisao == R.id.H5){
                        if (altura >= R.id.ALT2 && prisoes == R.id.prisaoNao) tem = true;
                    }
                    break;
                case R.id.bt_I:
                    if (divisao == R.id.I1 && altura>= R.id.ALT6) tem = true;
                    if (divisao == R.id.I2 && (altura >= R.id.ALT5)) tem = true;
                    if (divisao == R.id.I3 && (altura >= R.id.ALT4)) tem = true;
                    break;
                case R.id.bt_J:
                    if (divisao == R.id.J1 && altura>= R.id.ALT6) tem = true;
                    if (divisao == R.id.J2 && (altura >= R.id.ALT5)) tem = true;
                    if ((divisao == R.id.J3 || divisao == R.id.J4) && (altura >= R.id.ALT4)) tem = true;
                    break;
            }
        }

        if (grupo == R.id.bt_M){
            if ((divisao == R.id.M2 && produtos == R.id.ck_produtos2)) tem = true;
            if (divisao == R.id.M10 && (altura >= R.id.ALT4)) tem = true;
            if (divisao == R.id.M3 && (altura <= R.id.ALT2)) tem = true;
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
