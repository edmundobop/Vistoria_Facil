package br.com.stone4.modulos;

import br.com.stone4.R;

public class Algoritmos {

    public int tipoProcesso(int grupo, int divisao, int area, int pavimentos) {

        // 0 = Projeto Técnico;
        // 1 = Processo Técnico para Certificação Prévia;
        // 2 = Processo Simplificado para Certificação Facilitada
        int tipo = 0;

        if (area > 750 || grupo == R.id.bt_F || grupo == R.id.bt_L || divisao == R.id.M2) {

        } else if (grupo != R.id.bt_B && (divisao == R.id.C1 || divisao == R.id.C2 || divisao == R.id.E2
                || divisao == R.id.E3 || divisao == R.id.H1 || divisao == R.id.H6
                || divisao == R.id.J1)) {
            tipo = 1;
        } else if (area <= 200) {
            tipo = 2;
        }

        return tipo;

    }

    public void cargaIncendio(){

    }
}
