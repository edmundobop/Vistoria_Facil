package br.com.stone4.medidas.seguranca;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class SistemaDeComunicacao {

    // Variáveis
    private String nome = "Sistema de Comunicação";
    private String subTitulo = "Norma tecnica N: 25/2014";
    private String descricao = "Esta norma trata sobre o Acesso de Viaturas do Corpo de Bombeiros na Edificação, conforme:";
    private int imagem = (R.drawable.sist_comunica);


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

        switch (grupo) {
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
                tem = false;
                break;
            case R.id.bt_M:
                tem = divisao == R.id.M1 && (tunel == R.id.tunel3 || tunel == R.id.tunel4) ;
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
