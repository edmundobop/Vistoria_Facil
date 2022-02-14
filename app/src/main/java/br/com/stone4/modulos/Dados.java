package br.com.stone4.modulos;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;
import br.com.stone4.criterios.Divisao;
import br.com.stone4.criterios.Grupo;

public class Dados {

    public static List<Grupo> getGrupoList(Context context){

        List<Grupo> grupoList = new ArrayList<>();

        Grupo Residencial = new Grupo();
        Residencial.setId(context.getString(R.string.button_A));
        Residencial.setImage(R.drawable.ic_residencia);
        grupoList.add(Residencial);

        Grupo Hospedagem = new Grupo();
        Hospedagem.setId(context.getString(R.string.button_B));
        Hospedagem.setImage(R.drawable.ic_residencia);
        grupoList.add(Hospedagem);

        Grupo Comercial = new Grupo();
        Comercial.setId(context.getString(R.string.button_C));
        Comercial.setImage(R.drawable.ic_residencia);
        grupoList.add(Comercial);

        Grupo Profissional = new Grupo();
        Profissional.setId(context.getString(R.string.button_D));
        Profissional.setImage(R.drawable.ic_residencia);
        grupoList.add(Profissional);

        Grupo Educacional = new Grupo();
        Educacional.setId(context.getString(R.string.button_E));
        Educacional.setImage(R.drawable.ic_residencia);
        grupoList.add(Educacional);

        Grupo Publico = new Grupo();
        Publico.setId(context.getString(R.string.button_F));
        Publico.setImage(R.drawable.ic_residencia);
        grupoList.add(Publico);

        Grupo Automotivo = new Grupo();
        Automotivo.setId(context.getString(R.string.button_G));
        Automotivo.setImage(R.drawable.ic_residencia);
        grupoList.add(Automotivo);

        Grupo Saude = new Grupo();
        Saude.setId(context.getString(R.string.button_H));
        Saude.setImage(R.drawable.ic_residencia);
        grupoList.add(Saude);

        Grupo Industria = new Grupo();
        Industria.setId(context.getString(R.string.button_I));
        Industria.setImage(R.drawable.ic_residencia);
        grupoList.add(Industria);

        Grupo Deposito = new Grupo();
        Deposito.setId(context.getString(R.string.button_J));
        Deposito.setImage(R.drawable.ic_residencia);
        grupoList.add(Deposito);

        Grupo Explosivo = new Grupo();
        Explosivo.setId(context.getString(R.string.button_L));
        Explosivo.setImage(R.drawable.ic_residencia);
        grupoList.add(Explosivo);

        Grupo Especial = new Grupo();
        Especial.setId(context.getString(R.string.button_M));
        Especial.setImage(R.drawable.ic_residencia);
        grupoList.add(Especial);

        Grupo Primario = new Grupo();
        Primario.setId(context.getString(R.string.button_N));
        Primario.setImage(R.drawable.ic_residencia);
        grupoList.add(Primario);

        return grupoList;

    }

    public static List<Divisao> getDivisaoListA(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO A
        Divisao ResidencialA1 = new Divisao();
        ResidencialA1.setId(context.getString(R.string.button_A1));
        ResidencialA1.setImage(R.drawable.ic_residencia);
        divisaoList.add(ResidencialA1);

        Divisao ResidencialA2 = new Divisao();
        ResidencialA2.setId(context.getString(R.string.button_A2));
        ResidencialA2.setImage(R.drawable.ic_residencia);
        divisaoList.add(ResidencialA2);

        Divisao ResidencialA3 = new Divisao();
        ResidencialA3.setId(context.getString(R.string.button_A3));
        ResidencialA3.setImage(R.drawable.ic_residencia);
        divisaoList.add(ResidencialA3);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListB(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO B
        Divisao HospedagemB1 = new Divisao();
        HospedagemB1.setId(context.getString(R.string.button_B1));
        HospedagemB1.setImage(R.drawable.ic_residencia);
        divisaoList.add(HospedagemB1);

        Divisao HospedagemB2 = new Divisao();
        HospedagemB2.setId(context.getString(R.string.button_B2));
        HospedagemB2.setImage(R.drawable.ic_residencia);
        divisaoList.add(HospedagemB2);


        return divisaoList;

    }

    public static List<Divisao> getDivisaoListC(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO C
        Divisao comercialC1 = new Divisao();
        comercialC1.setId(context.getString(R.string.button_C1));
        comercialC1.setImage(R.drawable.ic_residencia);
        divisaoList.add(comercialC1);

        Divisao comercialC2 = new Divisao();
        comercialC2.setId(context.getString(R.string.button_C2));
        comercialC2.setImage(R.drawable.ic_residencia);
        divisaoList.add(comercialC2);

        Divisao comercialC3 = new Divisao();
        comercialC3.setId(context.getString(R.string.button_C3));
        comercialC3.setImage(R.drawable.ic_residencia);
        divisaoList.add(comercialC3);


        return divisaoList;

    }

    public static List<Divisao> getDivisaoListD(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO C
        Divisao profissionalD1 = new Divisao();
        profissionalD1.setId(context.getString(R.string.button_D1));
        profissionalD1.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalD1);

        Divisao profissionalD2 = new Divisao();
        profissionalD2.setId(context.getString(R.string.button_D2));
        profissionalD2.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalD2);

        Divisao profissionalD3 = new Divisao();
        profissionalD3.setId(context.getString(R.string.button_D3));
        profissionalD3.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalD3);

        Divisao profissionalD4 = new Divisao();
        profissionalD4.setId(context.getString(R.string.button_D4));
        profissionalD4.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalD4);


        return divisaoList;

    }

    public static List<Divisao> getDivisaoListE(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO C
        Divisao educacionalE1 = new Divisao();
        educacionalE1.setId(context.getString(R.string.button_E1));
        educacionalE1.setImage(R.drawable.ic_residencia);
        divisaoList.add(educacionalE1);

        Divisao educacionalE2 = new Divisao();
        educacionalE2.setId(context.getString(R.string.button_E2));
        educacionalE2.setImage(R.drawable.ic_residencia);
        divisaoList.add(educacionalE2);

        Divisao educacionalE3 = new Divisao();
        educacionalE3.setId(context.getString(R.string.button_E3));
        educacionalE3.setImage(R.drawable.ic_residencia);
        divisaoList.add(educacionalE3);

        Divisao educacionalE4 = new Divisao();
        educacionalE4.setId(context.getString(R.string.button_E4));
        educacionalE4.setImage(R.drawable.ic_residencia);
        divisaoList.add(educacionalE4);

        Divisao educacionalE5 = new Divisao();
        educacionalE5.setId(context.getString(R.string.button_E5));
        educacionalE5.setImage(R.drawable.ic_residencia);
        divisaoList.add(educacionalE5);

        Divisao educacionalE6 = new Divisao();
        educacionalE6.setId(context.getString(R.string.button_E6));
        educacionalE6.setImage(R.drawable.ic_residencia);
        divisaoList.add(educacionalE6);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListF(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO C
        Divisao publicoF1 = new Divisao();
        publicoF1.setId(context.getString(R.string.button_F1));
        publicoF1.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF1);

        Divisao publicoF2 = new Divisao();
        publicoF2.setId(context.getString(R.string.button_F2));
        publicoF2.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF2);

        Divisao publicoF3 = new Divisao();
        publicoF3.setId(context.getString(R.string.button_F3));
        publicoF3.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF3);

        Divisao publicoF4 = new Divisao();
        publicoF4.setId(context.getString(R.string.button_F4));
        publicoF4.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF4);

        Divisao publicoF5 = new Divisao();
        publicoF5.setId(context.getString(R.string.button_F5));
        publicoF5.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF5);

        Divisao publicoF6 = new Divisao();
        publicoF6.setId(context.getString(R.string.button_F6));
        publicoF6.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF6);

        Divisao publicoF7 = new Divisao();
        publicoF7.setId(context.getString(R.string.button_F7));
        publicoF7.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF7);

        Divisao publicoF8 = new Divisao();
        publicoF8.setId(context.getString(R.string.button_F8));
        publicoF8.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF8);

        Divisao publicoF9 = new Divisao();
        publicoF9.setId(context.getString(R.string.button_F9));
        publicoF9.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF9);

        Divisao publicoF10 = new Divisao();
        publicoF10.setId(context.getString(R.string.button_F10));
        publicoF10.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF10);

        Divisao publicoF11 = new Divisao();
        publicoF11.setId(context.getString(R.string.button_F11));
        publicoF11.setImage(R.drawable.ic_residencia);
        divisaoList.add(publicoF11);


        return divisaoList;

    }

    public static List<Divisao> getDivisaoListG(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO G
        Divisao profissionalG1 = new Divisao();
        profissionalG1.setId(context.getString(R.string.button_G1));
        profissionalG1.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalG1);

        Divisao profissionalG2 = new Divisao();
        profissionalG2.setId(context.getString(R.string.button_G2));
        profissionalG2.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalG2);

        Divisao profissionalG3 = new Divisao();
        profissionalG3.setId(context.getString(R.string.button_G3));
        profissionalG3.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalG3);

        Divisao profissionalG4 = new Divisao();
        profissionalG4.setId(context.getString(R.string.button_G4));
        profissionalG4.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalG4);

        Divisao profissionalG5 = new Divisao();
        profissionalG5.setId(context.getString(R.string.button_G5));
        profissionalG5.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalG5);

        Divisao profissionalG6 = new Divisao();
        profissionalG6.setId(context.getString(R.string.button_G6));
        profissionalG6.setImage(R.drawable.ic_residencia);
        divisaoList.add(profissionalG6);


        return divisaoList;

    }

    public static List<Divisao> getDivisaoListH(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO H
        Divisao saudeH1 = new Divisao();
        saudeH1.setId(context.getString(R.string.button_H1));
        saudeH1.setImage(R.drawable.ic_residencia);
        divisaoList.add(saudeH1);

        Divisao saudeH2 = new Divisao();
        saudeH2.setId(context.getString(R.string.button_H2));
        saudeH2.setImage(R.drawable.ic_residencia);
        divisaoList.add(saudeH2);

        Divisao saudeH3 = new Divisao();
        saudeH3.setId(context.getString(R.string.button_H3));
        saudeH3.setImage(R.drawable.ic_residencia);
        divisaoList.add(saudeH3);

        Divisao saudeH4 = new Divisao();
        saudeH4.setId(context.getString(R.string.button_H4));
        saudeH4.setImage(R.drawable.ic_residencia);
        divisaoList.add(saudeH4);

        Divisao saudeH5 = new Divisao();
        saudeH5.setId(context.getString(R.string.button_H5));
        saudeH5.setImage(R.drawable.ic_residencia);
        divisaoList.add(saudeH5);

        Divisao saudeH6 = new Divisao();
        saudeH6.setId(context.getString(R.string.button_H6));
        saudeH6.setImage(R.drawable.ic_residencia);
        divisaoList.add(saudeH6);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListI(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO I
        Divisao industrialI1 = new Divisao();
        industrialI1.setId(context.getString(R.string.button_I1));
        industrialI1.setImage(R.drawable.ic_residencia);
        divisaoList.add(industrialI1);

        Divisao industrialI2 = new Divisao();
        industrialI2.setId(context.getString(R.string.button_I2));
        industrialI2.setImage(R.drawable.ic_residencia);
        divisaoList.add(industrialI2);

        Divisao industrialI3 = new Divisao();
        industrialI3.setId(context.getString(R.string.button_I3));
        industrialI3.setImage(R.drawable.ic_residencia);
        divisaoList.add(industrialI3);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListJ(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO J
        Divisao depositosJ1 = new Divisao();
        depositosJ1.setId(context.getString(R.string.button_J1));
        depositosJ1.setImage(R.drawable.ic_residencia);
        divisaoList.add(depositosJ1);

        Divisao depositosJ2 = new Divisao();
        depositosJ2.setId(context.getString(R.string.button_J2));
        depositosJ2.setImage(R.drawable.ic_residencia);
        divisaoList.add(depositosJ2);

        Divisao depositosJ3 = new Divisao();
        depositosJ3.setId(context.getString(R.string.button_J3));
        depositosJ3.setImage(R.drawable.ic_residencia);
        divisaoList.add(depositosJ3);

        Divisao depositosJ4 = new Divisao();
        depositosJ4.setId(context.getString(R.string.button_J4));
        depositosJ4.setImage(R.drawable.ic_residencia);
        divisaoList.add(depositosJ4);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListL(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO L
        Divisao explosivosL1 = new Divisao();
        explosivosL1.setId(context.getString(R.string.button_L1));
        explosivosL1.setImage(R.drawable.ic_residencia);
        divisaoList.add(explosivosL1);

        Divisao explosivosL2 = new Divisao();
        explosivosL2.setId(context.getString(R.string.button_L2));
        explosivosL2.setImage(R.drawable.ic_residencia);
        divisaoList.add(explosivosL2);

        Divisao explosivosL3 = new Divisao();
        explosivosL3.setId(context.getString(R.string.button_L3));
        explosivosL3.setImage(R.drawable.ic_residencia);
        divisaoList.add(explosivosL3);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListM(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO M
        Divisao especialM1 = new Divisao();
        especialM1.setId(context.getString(R.string.button_M1));
        especialM1.setImage(R.drawable.ic_residencia);
        divisaoList.add(especialM1);

        Divisao especialM2 = new Divisao();
        especialM2.setId(context.getString(R.string.button_M2));
        especialM2.setImage(R.drawable.ic_residencia);
        divisaoList.add(especialM2);

        Divisao especial3 = new Divisao();
        especial3.setId(context.getString(R.string.button_M3));
        especial3.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial3);

        Divisao especial4 = new Divisao();
        especial4.setId(context.getString(R.string.button_M4));
        especial4.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial4);

        Divisao especial5 = new Divisao();
        especial5.setId(context.getString(R.string.button_M5));
        especial5.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial5);

        Divisao especial6 = new Divisao();
        especial6.setId(context.getString(R.string.button_M6));
        especial6.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial6);

        Divisao especial7 = new Divisao();
        especial7.setId(context.getString(R.string.button_M7));
        especial7.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial7);

        Divisao especial8 = new Divisao();
        especial8.setId(context.getString(R.string.button_M8));
        especial8.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial8);

        Divisao especial9 = new Divisao();
        especial9.setId(context.getString(R.string.button_M9));
        especial9.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial9);

        Divisao especial10 = new Divisao();
        especial10.setId(context.getString(R.string.button_M10));
        especial10.setImage(R.drawable.ic_residencia);
        divisaoList.add(especial10);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListN(Context context){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO N
        Divisao setor_primarioN1 = new Divisao();
        setor_primarioN1.setId(context.getString(R.string.button_N1));
        setor_primarioN1.setImage(R.drawable.ic_residencia);
        divisaoList.add(setor_primarioN1);

        Divisao setor_primarioN2 = new Divisao();
        setor_primarioN2.setId(context.getString(R.string.button_N2));
        setor_primarioN2.setImage(R.drawable.ic_residencia);
        divisaoList.add(setor_primarioN2);

        Divisao setor_primarioN3 = new Divisao();
        setor_primarioN3.setId(context.getString(R.string.button_N3));
        setor_primarioN3.setImage(R.drawable.ic_residencia);
        divisaoList.add(setor_primarioN3);


        return divisaoList;

    }


}
