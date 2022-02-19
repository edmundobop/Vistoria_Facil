package br.com.stone4.modulos;

import android.annotation.SuppressLint;

import br.com.stone4.R;

public class Algoritmos {

    @SuppressLint("NonConstantResourceId")
    public int tipoProcesso(int grupo, int divisao, int area, int pavimentos) {

        // 0 = Projeto Técnico; > 750m
        // 1 = Processo Técnico para Certificação Prévia; => 200m
        // 2 = Processo Simplificado para Certificação Facilitada < 200m <= 750
        int tipo = 0;
        System.out.println("Grupo chegando: "+grupo);
        System.out.println("Divisao chegando: "+divisao);

        // 0 = Projeto Técnico; > 750m
        if (area > 750 || grupo == 10 || grupo == R.id.bt_L || ((grupo == 11 || grupo == R.id.bt_M) && (divisao == 1 || divisao == R.id.M2))) {
            tipo = 0;
            System.out.println("tipo 0");

        // 1 = Processo Técnico para Certificação Prévia; > 200m <= 750
        } else if (area > 200) {

            System.out.println("tipo 1");

            switch (grupo) {
                case 0: // Grupo A
                case R.id.bt_A:
                case 3: // Grupo D
                case R.id.bt_D:
                case 6: // Grupo G
                case R.id.bt_G:
                case 8: // Grupo I
                case R.id.bt_I:
                case 12: // Grupo N
                case R.id.bt_N:
                    tipo = 1;
                    break;
                case 2: // Grupo C
                case R.id.bt_C:
                    switch (divisao) { // Divisão C1 e C2
                        case 0:
                        case R.id.C1:
                        case 1:
                        case R.id.C2:
                            tipo = 1;
                            break;
                        default:
                            tipo = 0;
                            break;
                    }
                    break;
                case 4: // Grupo E
                case R.id.bt_E:
                    switch (divisao) { // Divisão E2 e E3
                        case 1:
                        case R.id.E2:
                        case 2:
                        case R.id.E3:
                            tipo = 1;
                            break;
                        default:
                            tipo = 0;
                            break;
                    }
                    break;
                case 7: // Grupo H
                case R.id.bt_H:
                    switch (divisao) { // Divisão 61 e H6
                        case 0:
                        case R.id.H1:
                        case 5:
                        case R.id.H6:
                            tipo = 1;
                            break;
                        default:
                            tipo = 0;
                            break;
                    }
                    break;
                case 9: // Grupo J
                case R.id.bt_J:
                    // Divisão J1
                    if (divisao == 0 || divisao == R.id.J1) {
                        tipo = 1;
                    }
                    break;
                case 11: // Grupo M
                case R.id.bt_M:
                    // Divisão M1, M3, M4, M5, M6, M7, M8, M9, M10
                    tipo = 1;
                    break;
                default: // Demais grupos
                    tipo = 0;
                    break;
            }
        // 2 = Processo Simplificado para Certificação Facilitada <= 200
        } else {
            tipo = 2;
            System.out.println("tipo 2");
        }

        System.out.println("tipo final: "+tipo);
        return tipo;

    }

    public boolean exigeProjeto(int grupo, int divisao, int area){

        boolean resposta = false;

        if(area > 750) {
            resposta = true;
        } else if (grupo == 5 || grupo == R.id.bt_F){
            if (divisao == 4 || divisao == R.id.F5 || divisao == 5 || divisao == R.id.F6|| divisao == 6|| divisao == R.id.F7){
                resposta = true;
            }
        }
        System.out.println("Exige projeto: "+resposta);
        return resposta;
    }


    public void cargaIncendio(){

    }
}
