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
        if (area > 750 || grupo == 10 || (grupo == 11 && divisao == 1)) {
            tipo = 0;
            System.out.println("tipo 0");

        // 1 = Processo Técnico para Certificação Prévia; > 200m <= 750
        } else if (area > 200) {

            System.out.println("tipo 1");

            switch (grupo) {
                case 0: // Grupo A
                case 3: // Grupo D
                case 6: // Grupo G
                case 8: // Grupo I
                case 12: // Grupo N
                    tipo = 1;
                    break;
                case 2: // Grupo C
                    switch (divisao) { // Divisão C1 e C2
                        case 0:
                        case 1:
                            tipo = 1;
                            break;
                        default:
                            tipo = 0;
                            break;
                    }
                    break;
                case 4: // Grupo E
                    switch (divisao) { // Divisão E2 e E3
                        case 1:
                        case 2:
                            tipo = 1;
                            break;
                        default:
                            tipo = 0;
                            break;
                    }
                    break;
                case 7: // Grupo H
                    switch (divisao) { // Divisão 61 e H6
                        case 0:
                        case 5:
                            tipo = 1;
                            break;
                        default:
                            tipo = 0;
                            break;
                    }
                    break;
                case 9: // Grupo J
                    // Divisão J1
                    if (divisao == 0) {
                        tipo = 1;
                    }
                    break;
                case 11: // Grupo M
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
        } else if (grupo == 5){
            if (divisao == 4 || divisao == 5 || divisao == 6){
                resposta = true;
            }
        }

        return resposta;
    }


    public void cargaIncendio(){

    }
}
