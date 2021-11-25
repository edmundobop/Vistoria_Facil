package br.com.stone4.modulos;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;
import br.com.stone4.criterios.Divisao;
import br.com.stone4.criterios.Grupo;

public class Dados {

    public static List<Grupo> getGrupoList(){

        List<Grupo> grupoList = new ArrayList<>();

        Grupo Residencial = new Grupo();
        Residencial.setId("A-Residêncial");
        Residencial.setImage(R.drawable.ic_residencia);
        grupoList.add(Residencial);

        Grupo Hospedagem = new Grupo();
        Hospedagem.setId("B-Serviços De Hospedagem");
        Hospedagem.setImage(R.drawable.ic_residencia);
        grupoList.add(Hospedagem);

        Grupo Comercial = new Grupo();
        Comercial.setId("C-Comercial");
        Comercial.setImage(R.drawable.ic_residencia);
        grupoList.add(Comercial);

        Grupo Profissional = new Grupo();
        Profissional.setId("D-Serviço Profissional");
        Profissional.setImage(R.drawable.ic_residencia);
        grupoList.add(Profissional);

        Grupo Educacional = new Grupo();
        Educacional.setId("E-Educacional E Cultura Física");
        Educacional.setImage(R.drawable.ic_residencia);
        grupoList.add(Educacional);

        Grupo Publico = new Grupo();
        Publico.setId("F-Local De Reunião De Público");
        Publico.setImage(R.drawable.ic_residencia);
        grupoList.add(Publico);

        Grupo Automotivo = new Grupo();
        Automotivo.setId("G-Serviço Automotivo E Assemelhados");
        Automotivo.setImage(R.drawable.ic_residencia);
        grupoList.add(Automotivo);

        Grupo Saude = new Grupo();
        Saude.setId("H-Serviço De Saúde E Institucional");
        Saude.setImage(R.drawable.ic_residencia);
        grupoList.add(Saude);

        Grupo Industria = new Grupo();
        Industria.setId("I-Indústria");
        Industria.setImage(R.drawable.ic_residencia);
        grupoList.add(Industria);

        Grupo Deposito = new Grupo();
        Deposito.setId("J-Depósito");
        Deposito.setImage(R.drawable.ic_residencia);
        grupoList.add(Deposito);

        Grupo Explosivo = new Grupo();
        Explosivo.setId("L-Explosivos");
        Explosivo.setImage(R.drawable.ic_residencia);
        grupoList.add(Explosivo);

        Grupo Especial = new Grupo();
        Especial.setId("M-Especial");
        Especial.setImage(R.drawable.ic_residencia);
        grupoList.add(Especial);

        Grupo Primario = new Grupo();
        Primario.setId("N-Setor Primário");
        Primario.setImage(R.drawable.ic_residencia);
        grupoList.add(Primario);

        return grupoList;

    }

    public static List<Divisao> getDivisaoListA(){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO A
        Divisao ResidencialA1 = new Divisao();
        ResidencialA1.setId("A-1:Habitação unifamiliar: Condomínios de casas térreas ou assobradadas isoladas e assemelhados");
        ResidencialA1.setImage(R.drawable.ic_residencia);
        divisaoList.add(ResidencialA1);

        Divisao ResidencialA2 = new Divisao();
        ResidencialA2.setId("A-2:Habitação multifamiliar: Condomínios de casas térreas ou assobradadas não isoladas, edifícios de apartamentos em geral e condomínios verticais e assemelhados");
        ResidencialA2.setImage(R.drawable.ic_residencia);
        divisaoList.add(ResidencialA2);

        Divisao ResidencialA3 = new Divisao();
        ResidencialA3.setId("A-3:Habitação coletiva: Pensionatos, internatos, alojamentos, mosteiros, conventos, residências geriátricas. Todos com capacidade máxima de 16 leitos e assemelhados");
        ResidencialA3.setImage(R.drawable.ic_residencia);
        divisaoList.add(ResidencialA3);

        return divisaoList;

    }

    public static List<Divisao> getDivisaoListB(){

        List<Divisao> divisaoList = new ArrayList<>();

        // GRUPO B
        Divisao HospedagemB1 = new Divisao();
        HospedagemB1.setId("B-1:Hotel e assemelhado: Hotéis, motéis, pensões, hospedarias, pousadas, albergues, casas \n" +
                "        de cômodos e divisão A3 com mais de 16 leitos e assemelhados");
        HospedagemB1.setImage(R.drawable.ic_residencia);
        divisaoList.add(HospedagemB1);

        Divisao HospedagemB2 = new Divisao();
        HospedagemB2.setId("B-2:Hotel residencial: Hotéis e assemelhados com cozinha própria nos apartamentos \n" +
                "        (incluem-se apart-hotéis, flats, hotéis residenciais) e assemelhados");
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

    public static List<Divisao> getDivisaoListH(Context context){

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

    public static List<Divisao> getDivisaoListI(Context context){

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

    public static List<Divisao> getDivisaoListJ(Context context){

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

    public static List<Divisao> getDivisaoListL(Context context){

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

    public static List<Divisao> getDivisaoListM(Context context){

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

    public static List<Divisao> getDivisaoListN(Context context){

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


}
