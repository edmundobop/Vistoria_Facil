package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class HidranteHurbano {

    // Variáveis
    private String nome = "Hidrante Hurbano";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.hidrante_hurb);


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
                case R.id.bt_B:
                case R.id.bt_C:
                case R.id.bt_D:
                case R.id.bt_E:
                case R.id.bt_G:
                case R.id.bt_H:
                case R.id.bt_I:
                case R.id.bt_J:
                    if (area >= 1500) tem = true;
                    break;
                case R.id.bt_F:
                    if (divisao != R.id.F7 && area >= 1500) tem = true;
                    break;
                case R.id.bt_L:
                case R.id.bt_M:
                case R.id.bt_N:
                    break;
            }
        }

        if (grupo == R.id.bt_M){
            if (divisao == R.id.M5) tem = true; // Recomendatório
            if (divisao == R.id.M3) {
                if (area >= 1500) tem = true;
            }
            if ( divisao == R.id.M4 || divisao == R.id.M7){
                tem = area >= 1500;
            }
            if (divisao == R.id.M10) {
                if (area >= 1500 || pavimentos == R.id.Psim) tem = true;
            }
            if (divisao == R.id.M2){
                if (liquidos == R.id.ck_liquidos1 || produtos == R.id.ck_produtos1) {
                    tem = area >= 1500;
                } else tem = true;
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
                break;
            case R.id.bt_M:
                if (divisao == R.id.M5) recomendado = true;
                break;
            case R.id.bt_N:
                recomendado = true;
                break;
        }

        return recomendado;
    }

}
