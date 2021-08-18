package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class SPDA {

    // Variáveis
    private String nome = "SPDA";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.spda);


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
    public Boolean Exigencia (int grupo, int divisao, int area, int altura,int lotacao,int pavimentos, int tunel, int liquidos, int produtos, int plataforma){

        boolean tem = false;
        boolean maiorq12e750  = altura >= R.id.ALT4 || area > 750;

        if (maiorq12e750) {
            switch (grupo) {
                case R.id.bt_A:
                    if (altura >= R.id.ALT4){
                        tem = true;
                    }
                    break;
                case R.id.bt_B:
                case R.id.bt_C:
                case R.id.bt_D:
                case R.id.bt_E:
                case R.id.bt_H:
                case R.id.bt_I:
                case R.id.bt_J: // Áreas destinadas a depósitos de explosivos ou inflamáveis devem possuir SPDA independente da área e altura;
                    if (altura >= R.id.ALT4){
                        tem = true;
                    } else if (area >= 1500) tem = true;
                    break;
                case R.id.bt_F:
                    switch (divisao){
                        case R.id.F1:
                        case R.id.F2:
                        case R.id.F3:
                        case R.id.F4:
                        case R.id.F5:
                        case R.id.F6:
                        case R.id.F8:
                        case R.id.F9:
                        case R.id.F10:
                        case R.id.F11:
                            if (altura <= R.id.ALT3){
                                if (area >= 1500) tem = true;
                            } else tem = true;
                            break;
                        case R.id.F7:
                            break;
                    }
                    break;
                case R.id.bt_G:
                    switch (divisao) {
                        case R.id.G1:
                        case R.id.G2:
                            if (altura >= R.id.ALT4) {
                                tem = true;
                            } else if (area >= 1500) tem = true;
                            break;
                        case R.id.G3:
                            tem = true;
                            break;
                        case R.id.G4:
                        case R.id.G5:
                        case R.id.G6:
                            if (altura >= R.id.ALT3) {
                                tem = true;
                            } else if (area >= 1500) tem = true;
                            break;
                    }
                case R.id.bt_L:
                case R.id.bt_M:
                case R.id.bt_N:
                    break;
            }
        }

        if (grupo == R.id.bt_M){
            if (divisao == R.id.M5 || divisao == R.id.M8) tem = true;
            if (divisao == R.id.M2) tem = true;
            if (divisao == R.id.M3){
                if(area >= 1500 && altura < R.id.ALT4) {
                    tem = true;
                } else if (altura > R.id.ALT3) tem = true;
            }
            if (divisao == R.id.M10){
                tem = area >=1500 || pavimentos == R.id.Psim;
            }
        }

        if (grupo == R.id.bt_N){ // Recomendatório
            tem = true;
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
            case R.id.bt_M:
                break;
            case R.id.bt_N:
                recomendado = true;
                break;
        }

        return recomendado;
    }

}
