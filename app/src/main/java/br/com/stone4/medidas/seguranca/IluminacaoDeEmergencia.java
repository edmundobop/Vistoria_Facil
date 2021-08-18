package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class IluminacaoDeEmergencia {

    // Variáveis
    private String nome = "Iluminção de Emergência";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.ilu_emergencia);


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
    public Boolean Exigencia(int grupo, int divisao, int area, int altura,int lotacao,int pavimentos, int tunel, int liquidos, int produtos, int plataforma) {

        boolean tem = false;
        boolean maiorq12e750  = altura >= R.id.ALT4 || area > 750;

        switch (grupo) {
            case R.id.bt_A:
            case R.id.bt_C:
            case R.id.bt_D:
            case R.id.bt_E:
            case R.id.bt_F:
            case R.id.bt_G:
            case R.id.bt_H:
            case R.id.bt_I:
            case R.id.bt_J:
            case R.id.bt_N:
                if (maiorq12e750) {
                    tem = true;
                } else if (lotacao == R.id.Lsim || pavimentos == R.id.Psim) {
                    tem = true;
                }
                break;
            case R.id.bt_B:
                tem = true;
                break;
            case R.id.bt_L:
                if (divisao != R.id.L1) tem = true;
                else if (altura >= R.id.ALT4)
                    tem = true;
                break;
            case R.id.bt_M:
                switch (divisao) {
                    case R.id.M1:
                        if (tunel != R.id.tunel1) tem = true;
                        break;
                    case R.id.M2:
                        if (produtos != 0 && area > 750) tem = true;
                        break;
                    case R.id.M3:
                    case R.id.M5:
                    case R.id.M6:
                        tem = true;
                        break;
                    case R.id.M9:
                        tem = pavimentos == R.id.Psim;
                        break;
                    case R.id.M10:
                        tem = area >= 750;
                        break;
                }

        } return tem;
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
