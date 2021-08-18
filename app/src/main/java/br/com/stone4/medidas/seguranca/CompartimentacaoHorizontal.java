package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class CompartimentacaoHorizontal {

    // Variáveis
    private String nome = "Compartimentação Horizontal";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.comp_horizontal);


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
                    break;
                case R.id.bt_B:
                    if (altura != R.id.ALT1) tem = true; // Altura 2 e 3: – Pode ser substituída por chuveiros automáticos; Altura 4 e 5: Pode ser substituída por sistema de detecção de incêndio e chuveiros automáticos;
                    break;
                case R.id.bt_C:
                case R.id.bt_D:
                    tem = true; // Altura 1 e 2: – Pode ser substituída por chuveiros automáticos; Altura 3, 4 e 5: Pode ser substituída por sistema de detecção de incêndio e chuveiros automáticos;
                    break;
                case R.id.bt_E:
                    if (altura >= R.id.ALT4) tem = true;
                    break;
                case R.id.bt_F:
                    if (divisao == R.id.F5 || divisao == R.id.F6 || divisao == R.id.F10 || divisao == R.id.F11) tem = true;
                    if (divisao == R.id.F8 && (altura >= R.id.ALT4)) tem = true;
                    break;
                case R.id.bt_G:
                    if (divisao == R.id.G4) tem = true;
                    break;
                case R.id.bt_H:
                    if (divisao == R.id.H2 || divisao == R.id.H3 || divisao == R.id.H6) tem = true;
                    break;
                case R.id.bt_I:
                    if (divisao != R.id.I1) tem = true;
                    break;
                case R.id.bt_J:
                    if (divisao != R.id.J1) tem = true;
                    break;
            }
        }

        if (grupo == R.id.bt_M){
            if ((divisao == R.id.M2 && produtos != 0) || divisao == R.id.M3 || divisao == R.id.M10) tem = true;
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
