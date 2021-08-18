package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class Brigada {

    // Variáveis
    private String nome = "Brigada";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.brigada);


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
    public Boolean Exigencia(int grupo, int divisao, int area, int altura,int lotacao,int pavimentos, int tunel, int liquidos, int produtos, int plataforma, int publico){

        boolean tem = false;
        boolean maiorq12e750  = altura >= R.id.ALT4 || area > 750;

        if (maiorq12e750) {
            switch (grupo) {
                case R.id.bt_A:
                case R.id.bt_D:
                case R.id.bt_G: // G-5 e G6 Exigido para edificações que disponha de sistema de resfriamento e/ou espuma dimensionado conforme NT-25.
                    tem = true;
                    break;
                case R.id.bt_B:
                case R.id.bt_C:
                case R.id.bt_E:
                    if (area >= 5000) tem = true;
                    break;
                case R.id.bt_F:
                    switch (divisao){
                        case R.id.F1:
                        case R.id.F2:
                        case R.id.F4:
                        case R.id.F6:
                        case R.id.F7:
                        case R.id.F8:
                        case R.id.F10:
                            tem = true;
                            break;
                        case R.id.F3:
                            if (area >= 5000) tem = true;
                            break;
                        case R.id.F5:
                        case R.id.F11:
                            if (area >= 1500) tem = true;
                            break;
                    }
                    break;
                case R.id.bt_H:
                    if (divisao == R.id.H2 || divisao == R.id.H3 || divisao == R.id.H5){ // H4 e H6 recomendado
                        if (area >= 1500) tem = true;
                    } else tem = true;
                    break;
                case R.id.bt_I:
                    if (divisao == R.id.I3){ // I1 e I2 recomendado
                        if (area >= 5000) tem = true;
                    } else tem = true;
                    break;
                case R.id.bt_J:
                    if (divisao == R.id.J4){ // J1, J2 e J3 recomendado
                        if (area >= 5000) tem = true;
                    } else tem = true;
                    break;
            }
        }

        if (grupo == R.id.bt_M){
            if (divisao != R.id.M8 && divisao != R.id.M9 && divisao != R.id.M2) tem = true; // Recomendado: M1, M3, M4, M5, M6, M7, M10
            if (divisao == R.id.M2 && (liquidos != R.id.ck_liquidos1 && produtos != R.id.ck_produtos1)) tem = true;
            if (divisao == R.id.M1 && tunel != R.id.tunel1) tem = true;
            if (divisao == R.id.M10) tem = true;
        }

        if (grupo == R.id.bt_L || grupo == R.id.bt_N){
            tem = false;
        }

        return tem;
    }

    @SuppressLint("NonConstantResourceId")
    public Boolean Recomendado(int grupo, int divisao, int area, int publico){

        boolean recomendado = false;

        switch (grupo){
            case R.id.bt_A:
            case R.id.bt_B:
            case R.id.bt_E:
            case R.id.bt_L:
            case R.id.bt_N:
                break;
            case R.id.bt_C:
                if (divisao == R.id.C1){
                    recomendado = true;
                } else if (area < 5000) recomendado = true;
                break;
            case R.id.bt_D:
                recomendado = true;
                break;
            case R.id.bt_F:
                switch (divisao){
                    case R.id.F1:
                    case R.id.F2:
                    case R.id.F4:
                    case R.id.F8:
                    case R.id.F9:
                    case R.id.F10:
                        recomendado = true;
                        break;
                    case R.id.F3:
                        if (area < 5000) recomendado = true;
                        break;
                    case R.id.F7:
                        if (publico < 500) recomendado = true;
                        break;
                }
                break;
            case R.id.bt_G:
                switch (divisao){
                    case R.id.G1:
                    case R.id.G2:
                    case R.id.G3:
                    case R.id.G4:
                        recomendado = true;
                        break;
                    case R.id.G5:
                        if (area > 750 && area < 2000) recomendado = true;
                        break;
                }
                break;
            case R.id.bt_H:
                switch (divisao){
                    case R.id.H4:
                    case R.id.H6:
                        recomendado = true;
                        break;
                }
                break;
            case R.id.bt_I:
                switch (divisao){
                    case R.id.I1:
                    case R.id.I2:
                        recomendado = true;
                        break;
                }
                break;
            case R.id.bt_J:
                switch (divisao){
                    case R.id.J1:
                    case R.id.J2:
                    case R.id.J3:
                        recomendado = true;
                        break;
                }
                break;
            case R.id.bt_M:
                switch (divisao){
                    case R.id.M1:
                    case R.id.M3:
                    case R.id.M4:
                    case R.id.M5:
                    case R.id.M7:
                    case R.id.M10:
                        recomendado = true;
                        break;
                }
                break;
        }

        return recomendado;
    }

}
