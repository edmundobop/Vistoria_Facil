package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class CompartimentacaoVertical {

    // Variáveis
    private String nome = "Compartimentação Vertical";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.com_vertical);


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

        if (maiorq12e750) {
            switch (grupo) {
                case R.id.bt_A:
                case R.id.bt_B:
                case R.id.bt_C:
                case R.id.bt_D:
                case R.id.bt_E:
                case R.id.bt_I:
                case R.id.bt_J:
                    tem = altura >= R.id.ALT4;
                    break;
                case R.id.bt_F:
                    tem = divisao != R.id.F7 && altura >= R.id.ALT4;
                    break;
                case R.id.bt_G:
                    if (divisao == R.id.G5 || divisao == R.id.G6) {
                        tem = altura != R.id.ALT1;
                    } else tem = altura >= R.id.ALT4;
                    break;
                case R.id.bt_H:
                    switch (divisao){
                        case R.id.H1:
                        case R.id.H2:
                        case R.id.H4:
                        case R.id.H5:
                        case R.id.H6:
                            tem = altura >= R.id.ALT4;
                            break;
                        case R.id.H3:
                            tem = altura >= R.id.ALT3;
                            break;
                    }
                    break;
                case R.id.bt_L:
                case R.id.bt_N:
                    break;
                case R.id.bt_M:
                    switch (divisao){
                        case R.id.M3:
                            tem = altura >= R.id.ALT4;
                            break;
                    }
                    break;

            }
        }

        if (grupo == R.id.bt_M){
            if (divisao == R.id.M2 && produtos != 0) tem = true;
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
