package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class ControleMaterialAcabamento {

    // Variáveis
    private String nome = "Controle de Materiais de Acabamento";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.mat_acabamento);


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
    public Boolean Exigencia(int grupo, int divisao, int area, int altura,int lotacao,int pavimentos, int tunel, int liquidos, int produtos, int plataforma){

        boolean tem = false;
        boolean maiorq12e750  = altura >= R.id.ALT4 || area > 750;

        switch (grupo){
            case R.id.bt_A:
                if (altura >= R.id.ALT4) tem = true;
                break;
            case R.id.bt_B:
                tem = true;
                break;
            case R.id.bt_C:
            case R.id.bt_D:
            case R.id.bt_E:
            case R.id.bt_G:
            case R.id.bt_I:
                tem = maiorq12e750;
                break;
            case R.id.bt_F:
                if (!maiorq12e750){
                    tem = (divisao!=R.id.F9 && divisao!=R.id.F10);
                } else tem = true;
                break;
            case R.id.bt_H:
                if (maiorq12e750) {
                    tem = true;
                } else if (divisao == R.id.H2 || divisao == R.id.H3 || divisao == R.id.H5) {
                    tem = true;
                }
                break;
            case R.id.bt_J:
                if (maiorq12e750) {
                    if (divisao != R.id.J1) {
                        tem = true;
                    } else if (altura >= R.id.ALT2) tem = true;
                }
                break;
            case R.id.bt_L:
                tem = divisao == R.id.L1 && !maiorq12e750;
                break;
            case R.id.bt_M:
                switch (divisao){
                    case R.id.M2:
                        if (produtos == R.id.ck_produtos2) {
                            tem = true;
                        } else if (produtos == R.id.ck_produtos1 && area > 750) tem = true;
                        break;
                    case R.id.M3:
                    case R.id.M5:
                        tem = true;
                        break;
                    case R.id.M10:
                        tem = area >= 750;
                        break;
                }
                break;
            case R.id.bt_N:
                break;
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
