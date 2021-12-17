package br.com.stone4.modulos;

import br.com.stone4.R;

public class Algoritmos {

    public int tipoProcesso(int grupo, int divisao, int area, int pavimentos) {

        // 0 = Projeto Técnico;
        // 1 = Processo Técnico para Certificação Prévia;
        // 2 = Processo Simplificado para Certificação Facilitada
        int tipo = 0;

        if (area <= 200) {
            tipo = 2;
        } else if (divisao != R.id.F5 && divisao != R.id.F6 && divisao != R.id.F7 && grupo != R.id.bt_L
                && divisao != R.id.M2 && area <= 750){
            if (grupo != R.id.bt_B && grupo != R.id.bt_F && (divisao == R.id.C1 || divisao == R.id.C2 || divisao == R.id.E2
                    || divisao == R.id.E3 || divisao == R.id.H1 || divisao == R.id.H6 || divisao == R.id.J1)) {
                tipo = 1;
            }
        }

        return tipo;

    }

    public boolean exigeProjeto(int grupo, int divisao, int area,int processo){
        if(processo == 0) return true;
        else return false;

    }


    public void cargaIncendio(){

    }
}
