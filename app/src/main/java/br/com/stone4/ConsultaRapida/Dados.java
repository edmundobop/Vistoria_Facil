package br.com.stone4.ConsultaRapida;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;
import br.com.stone4.criterios.Divisao;
import br.com.stone4.criterios.Grupo;

public class Dados {

    public static List<MedidaDeSeguranca> getMedidasList(Context context){

        List<MedidaDeSeguranca> medidasList = new ArrayList<>();

        // Nt-01:
        MedidaDeSeguranca nt01 = new MedidaDeSeguranca();
        nt01.setImage(R.drawable.nt01);
        nt01.setRecomend("");
        nt01.setTitle("Nt 01/2020: Anexo A");
        nt01.setSubTitle("NORMA TÉCNICA 01/2020");
        nt01.setURLpdf("NT-01_2020_ANEXO-A.pdf");
        medidasList.add(nt01);

        // Acesso de Viatura
        MedidaDeSeguranca AcessoDeViatura = new MedidaDeSeguranca();
        AcessoDeViatura.setImage(R.drawable.acesso_viatura);
        AcessoDeViatura.setRecomend("");
        AcessoDeViatura.setTitle("Acesso de Viatura na Edificacao");
        AcessoDeViatura.setSubTitle(context.getString(R.string.subtit_viatura));
        AcessoDeViatura.setURLpdf("nt-06_2014-acesso-de-viaturas.pdf");
        medidasList.add(AcessoDeViatura);

        // Alarme
        MedidaDeSeguranca Alarme = new MedidaDeSeguranca();
        Alarme.setImage(R.drawable.alarme);
        Alarme.setRecomend("");
        Alarme.setTitle("Alarme de Incêndio");
        Alarme.setSubTitle(context.getString(R.string.subtit_alarme));
        Alarme.setURLpdf("nt-19_2014-sistemas-de-deteccao-e-alarme-de-incendio.pdf");
        medidasList.add(Alarme);

        // Brigada
        MedidaDeSeguranca Brigada = new MedidaDeSeguranca();
        Brigada.setImage(R.drawable.brigada);
        Brigada.setRecomend("");
        Brigada.setTitle("Brigada");
        Brigada.setSubTitle(context.getString(R.string.subtit_brigada));
        Brigada.setURLpdf("NT-17_2021-Brigada-de-Incendio.pdf");
        medidasList.add(Brigada);

        // Carga de Incendio
        MedidaDeSeguranca CargaDeIncendio = new MedidaDeSeguranca();
        CargaDeIncendio.setImage(R.drawable.cargadeincendio);
        CargaDeIncendio.setRecomend("");
        CargaDeIncendio.setTitle("Carga de Incêndio");
        CargaDeIncendio.setSubTitle("NORMA TÉCNICA 14/2020");
        CargaDeIncendio.setURLpdf("nt-14-carga_de_incendio.pdf");
        medidasList.add(CargaDeIncendio);

        // Central de Gás
        MedidaDeSeguranca CentralDeGas = new MedidaDeSeguranca();
        CentralDeGas.setImage(R.drawable.central_de_gas);
        CentralDeGas.setRecomend("");
        CentralDeGas.setTitle("Central de Gás");
        CentralDeGas.setSubTitle("Norma tecnica NT:28-29/2014");
        CentralDeGas.setURLpdf("nt28_pt01.pdf");
        medidasList.add(CentralDeGas);

        // Compartimentação Horizontal
        MedidaDeSeguranca CompartimentacaoHorizontal = new MedidaDeSeguranca();
        CompartimentacaoHorizontal.setImage(R.drawable.comp_horizontal);
        CompartimentacaoHorizontal.setRecomend("");
        CompartimentacaoHorizontal.setTitle("Compartimentação Horizontal");
        CompartimentacaoHorizontal.setSubTitle("Norma tecnica NT: 09/2017");
        CompartimentacaoHorizontal.setURLpdf("NT-09_2017-Compartimentação-horizontal-e-compartimentação-vertical_.pdf");
        medidasList.add(CompartimentacaoHorizontal);

        // Compartimentação Vertical
        MedidaDeSeguranca CompartimentacaoVertical = new MedidaDeSeguranca();
        CompartimentacaoVertical.setImage(R.drawable.com_vertical);
        CompartimentacaoVertical.setRecomend("");
        CompartimentacaoVertical.setTitle("Compartimentação Vertical");
        CompartimentacaoVertical.setSubTitle("Norma tecnica NT: 09/2017");
        CompartimentacaoVertical.setURLpdf("NT-09_2017-Compartimentação-horizontal-e-compartimentação-vertical_.pdf");
        medidasList.add(CompartimentacaoVertical);

        //Materiais de Acabamento
        MedidaDeSeguranca MateriaisDeAcabamento = new MedidaDeSeguranca();
        MateriaisDeAcabamento.setImage(R.drawable.mat_acabamento);
        MateriaisDeAcabamento.setRecomend("");
        MateriaisDeAcabamento.setTitle("Controle de Materiais de Acabamento");
        MateriaisDeAcabamento.setSubTitle("Norma tecnica NT: 10/2014");
        MateriaisDeAcabamento.setURLpdf("nt-10_2014-controle-de-materiais-de-acabamento-e-revestimento.pdf");
        medidasList.add(MateriaisDeAcabamento);

        //Controle de Fumaça
        MedidaDeSeguranca ControleDeFumaca = new MedidaDeSeguranca();
        ControleDeFumaca.setImage(R.drawable.cont_fumaca);
        ControleDeFumaca.setRecomend("");
        ControleDeFumaca.setTitle("Controle de Fumaca");
        ControleDeFumaca.setSubTitle("Norma tecnica NT: 15/2014");
        ControleDeFumaca.setURLpdf("nt-15_2014-controle-de-fumaca-parte-1-regras-gerais.pdf");
        medidasList.add(ControleDeFumaca);

        // Chuveiros Automáticos
        MedidaDeSeguranca ChuveirosAutomaticos = new MedidaDeSeguranca();
        ChuveirosAutomaticos.setImage(R.drawable.chuveiro_aut);
        ChuveirosAutomaticos.setRecomend("");
        ChuveirosAutomaticos.setTitle("Chuveiro Automático");
        ChuveirosAutomaticos.setSubTitle("Norma tecnica NT: 23/2014");
        ChuveirosAutomaticos.setURLpdf("nt-23_2014-sistema-de-chuveiros-automaticos.pdf");
        medidasList.add(ChuveirosAutomaticos);

        // Detecção de Fumaça
        MedidaDeSeguranca deteccaoDeFumaca = new MedidaDeSeguranca();
        deteccaoDeFumaca.setImage(R.drawable.detector_inc);
        deteccaoDeFumaca.setRecomend("");
        deteccaoDeFumaca.setTitle("Detecção de Incêndio");
        deteccaoDeFumaca.setSubTitle("Norma tecnica NT: 19/2014");
        deteccaoDeFumaca.setURLpdf("nt-19_2014-sistemas-de-deteccao-e-alarme-de-incendio.pdf");
        medidasList.add(deteccaoDeFumaca);

        // Elevador de Emergência
        MedidaDeSeguranca elevadorDeEmergencia = new MedidaDeSeguranca();
        elevadorDeEmergencia.setImage(R.drawable.elevador);
        elevadorDeEmergencia.setRecomend("");
        elevadorDeEmergencia.setTitle("Elevador de Emergencia");
        elevadorDeEmergencia.setSubTitle("");
        elevadorDeEmergencia.setURLpdf("");
        medidasList.add(elevadorDeEmergencia);

        // Extintor
        MedidaDeSeguranca extintor = new MedidaDeSeguranca();
        extintor.setImage(R.drawable.extintor);
        extintor.setRecomend("");
        extintor.setTitle("Extintor");
        extintor.setSubTitle("Norma tecnica NT: 21/2014");
        extintor.setURLpdf("nt-21_2014-extintores.pdf");
        medidasList.add(extintor);

        // Hidrante Hurbano
        MedidaDeSeguranca HidranteHurbano = new MedidaDeSeguranca();
        HidranteHurbano.setImage(R.drawable.hidrante_hurb);
        HidranteHurbano.setRecomend("");
        HidranteHurbano.setTitle("Hidrante Hurbano");
        HidranteHurbano.setSubTitle("Norma tecnica NT: 34/2014");
        HidranteHurbano.setURLpdf("nt-34_2014-hidrante-urbano.pdf");
        medidasList.add(HidranteHurbano);

        // Hidrante e Mangotinho
        MedidaDeSeguranca hidranteEmangotinho = new MedidaDeSeguranca();
        hidranteEmangotinho.setImage(R.drawable.hidrante_mang);
        hidranteEmangotinho.setRecomend("");
        hidranteEmangotinho.setTitle("Hidrante e Mangotinho");
        hidranteEmangotinho.setSubTitle("Norma tecnica NT: 22/2014");
        hidranteEmangotinho.setURLpdf("NT-22_2014-sistemas-de-hidrantes-e-de-mangotinhos.pdf");
        medidasList.add(hidranteEmangotinho);

        // Imulinação de Emergência
        MedidaDeSeguranca iluminacaoDeEmergencia = new MedidaDeSeguranca();
        iluminacaoDeEmergencia.setImage(R.drawable.ilu_emergencia);
        iluminacaoDeEmergencia.setRecomend("");
        iluminacaoDeEmergencia.setTitle("Iluminção de Emergência");
        iluminacaoDeEmergencia.setSubTitle("Norma tecnica NT: 18/2014");
        iluminacaoDeEmergencia.setURLpdf("nt-18_2014-iluminacao-de-emergencia.pdf");
        medidasList.add(iluminacaoDeEmergencia);

        // Piscinas
        MedidaDeSeguranca piscina = new MedidaDeSeguranca();
        piscina.setImage(R.drawable.piscina);
        piscina.setRecomend("");
        piscina.setTitle("Piscinas e Guarda-vidas");
        piscina.setSubTitle("NORMA TÉCNICA 16/2017");
        piscina.setURLpdf("NT-16-Piscinas.pdf");
        medidasList.add(piscina);

        // Resfriamento
        MedidaDeSeguranca resfriamento = new MedidaDeSeguranca();
        resfriamento.setImage(R.drawable.resfriamento);
        resfriamento.setRecomend("");
        resfriamento.setTitle("Resfriamento");
        resfriamento.setSubTitle("");
        resfriamento.setURLpdf("");
        medidasList.add(resfriamento);

        // Saída de Emergência
        MedidaDeSeguranca saidaDeEmergencia = new MedidaDeSeguranca();
        saidaDeEmergencia.setImage(R.drawable.saida_emergencia);
        saidaDeEmergencia.setRecomend("");
        saidaDeEmergencia.setTitle("Saida de Emergencia");
        saidaDeEmergencia.setSubTitle("Norma tecnica NT: 11/2021");
        saidaDeEmergencia.setURLpdf("NT-11_2021-Saidas-de-Emergencia.pdf");
        medidasList.add(saidaDeEmergencia);

        // Segurança Estrutural
        MedidaDeSeguranca segurancaEstrutural = new MedidaDeSeguranca();
        segurancaEstrutural.setImage(R.drawable.seg_estrutural);
        segurancaEstrutural.setRecomend("");
        segurancaEstrutural.setTitle("Segurança Estrutural");
        segurancaEstrutural.setSubTitle("");
        segurancaEstrutural.setURLpdf("");
        medidasList.add(segurancaEstrutural);

        // Sinalização de Emergência
        MedidaDeSeguranca sinalizacaoDeEmergencia = new MedidaDeSeguranca();
        sinalizacaoDeEmergencia.setImage(R.drawable.sin_emergencia);
        sinalizacaoDeEmergencia.setRecomend("");
        sinalizacaoDeEmergencia.setTitle("Sinalização de Emergência");
        sinalizacaoDeEmergencia.setSubTitle("Norma tecnica NT: 20/2014");
        sinalizacaoDeEmergencia.setURLpdf("nt-20_2014-sinalizacao-de-emergencia.pdf");
        medidasList.add(sinalizacaoDeEmergencia);

        // SPDA
        MedidaDeSeguranca spda = new MedidaDeSeguranca();
        spda.setImage(R.drawable.spda);
        spda.setRecomend("");
        spda.setTitle("SPDA");
        spda.setSubTitle("Norma tecnica NT: 40/2019");
        spda.setURLpdf("NT-40_2019-SPDA.pdf");
        medidasList.add(spda);

        // Sistema De Espuma
        MedidaDeSeguranca sistemaEspuma = new MedidaDeSeguranca();
        sistemaEspuma.setImage(R.drawable.espuma);
        sistemaEspuma.setRecomend("");
        sistemaEspuma.setTitle("Sistema de Espuma");
        sistemaEspuma.setSubTitle("");
        sistemaEspuma.setURLpdf("");
        medidasList.add(sistemaEspuma);

        //Sistema de Comunicacao
        MedidaDeSeguranca sistemaComunicacao = new MedidaDeSeguranca();
        sistemaComunicacao.setImage(R.drawable.sist_comunica);
        sistemaComunicacao.setRecomend("");
        sistemaComunicacao.setTitle("Sistema de Comunicação");
        sistemaComunicacao.setSubTitle("");
        sistemaComunicacao.setURLpdf("");
        medidasList.add(sistemaComunicacao);

        //Sistema de Circuito de TV
        MedidaDeSeguranca sistemaCircuitoTv = new MedidaDeSeguranca();
        sistemaCircuitoTv.setImage(R.drawable.circuito_tv);
        sistemaCircuitoTv.setRecomend("");
        sistemaCircuitoTv.setTitle("Sistema de Circuito de Tv");
        sistemaCircuitoTv.setSubTitle("");
        sistemaCircuitoTv.setURLpdf("");
        medidasList.add(sistemaCircuitoTv);

        // Subsolo:
        MedidaDeSeguranca subsolo = new MedidaDeSeguranca();
        subsolo.setImage(R.drawable.subsolo);
        subsolo.setRecomend("");
        subsolo.setTitle("SubSolo");
        subsolo.setSubTitle("TABELA 7 - Anexo A - NT-01");
        subsolo.setURLpdf("tabela7.pdf");
        medidasList.add(subsolo);

        return medidasList;

    }
}
