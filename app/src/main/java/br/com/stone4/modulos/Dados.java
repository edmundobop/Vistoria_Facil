package br.com.stone4.modulos;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.stone4.R;
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


}
