package br.com.stone4.principal.vistoria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import br.com.stone4.resultados.AdaptadorExigencias;
import br.com.stone4.R;
import br.com.stone4.resultados.Consulta_Rapida_Detalhes;
import br.com.stone4.resultados.Consulta_Rapida_NT;
import br.com.stone4.medidas.seguranca.AcessoViaturaEdificacao;
import br.com.stone4.medidas.seguranca.AlarmeDeIncendio;
import br.com.stone4.medidas.seguranca.Brigada;
import br.com.stone4.medidas.seguranca.CentralDeGas;
import br.com.stone4.medidas.seguranca.ChuveiroAutomatico;
import br.com.stone4.medidas.seguranca.CompartimentacaoHorizontal;
import br.com.stone4.medidas.seguranca.CompartimentacaoVertical;
import br.com.stone4.medidas.seguranca.ControleDeFumaca;
import br.com.stone4.medidas.seguranca.ControleMaterialAcabamento;
import br.com.stone4.medidas.seguranca.DeteccaoDeIncendio;
import br.com.stone4.medidas.seguranca.ElevadorDeEmergencia;
import br.com.stone4.medidas.seguranca.Extintor;
import br.com.stone4.medidas.seguranca.HidranteEMangotinho;
import br.com.stone4.medidas.seguranca.HidranteHurbano;
import br.com.stone4.medidas.seguranca.IluminacaoDeEmergencia;
import br.com.stone4.medidas.seguranca.Resfriamento;
import br.com.stone4.medidas.seguranca.SPDA;
import br.com.stone4.medidas.seguranca.SaidaDeEmergencia;
import br.com.stone4.medidas.seguranca.SegurancaEstrutural;
import br.com.stone4.medidas.seguranca.SinalizacaoDeEmergencia;
import br.com.stone4.medidas.seguranca.SistemaDeCircuitoDeTv;
import br.com.stone4.medidas.seguranca.SistemaDeComunicacao;
import br.com.stone4.medidas.seguranca.SistemaDeEspuma;

public class Consulta_rapida extends AppCompatActivity {

    private ListView listView;
    private Intent intent;
    private ArrayList<String> mTitle;
    private ArrayList<String> sTitle;
    private ArrayList<String> mDescription;
    private ArrayList<String> recomendado;
    private ArrayList<Integer> images;
    private ArrayList<String> URLpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Controle de Resultado
        intent = getIntent();
        Bundle parametros = intent.getExtras();
        // Pego o conteudo do bundle

        Boolean consulta = parametros.getBoolean("true");

        int grupo = parametros.getInt("grupo");
        int divisao = parametros.getInt("divisao");
        int area = parametros.getInt("area");
        int altura = parametros.getInt("altura");
        int lotacao = parametros.getInt("lotacao");
        int pavimentos = parametros.getInt("pavimentos");
        int tunel = parametros.getInt("tunel");
        int liquidos = parametros.getInt("liquidos");
        int produtos = parametros.getInt("produtos");
        int plataforma = parametros.getInt("plataforma");
        int deposito = parametros.getInt("deposito");
        int alojamentos = parametros.getInt("alojamentos");
        int deteccaof4 = parametros.getInt("deteccaof4");
        int publico = parametros.getInt("publico");
        int prisoes = parametros.getInt("prisoes");


        //System.out.println("Plataforma: "+plataforma);

        // Criando os Objetos Medidas de Segurança
        AcessoViaturaEdificacao acessoViatura = new AcessoViaturaEdificacao();
        ControleMaterialAcabamento acabamento = new ControleMaterialAcabamento();
        SegurancaEstrutural estrutural = new SegurancaEstrutural();
        CompartimentacaoHorizontal horizontal = new CompartimentacaoHorizontal();
        CompartimentacaoVertical vertical = new CompartimentacaoVertical();
        SaidaDeEmergencia saidaDeEmergencia = new SaidaDeEmergencia();
        ElevadorDeEmergencia elevadorDeEmergencia = new ElevadorDeEmergencia();
        Brigada brigada = new Brigada();
        IluminacaoDeEmergencia iluminacaoDeEmergencia = new IluminacaoDeEmergencia();
        DeteccaoDeIncendio deteccaoDeIncendio = new DeteccaoDeIncendio();
        AlarmeDeIncendio alarmeDeIncendio = new AlarmeDeIncendio();
        SinalizacaoDeEmergencia sinalizacaoDeEmergencia = new SinalizacaoDeEmergencia();
        Extintor extintor = new Extintor();
        HidranteEMangotinho hidranteEMangotinho = new HidranteEMangotinho();
        ChuveiroAutomatico chuveiroAutomatico = new ChuveiroAutomatico();
        ControleDeFumaca controleDeFumaca = new ControleDeFumaca();
        CentralDeGas centralDeGas = new CentralDeGas();
        SPDA spda = new SPDA();
        HidranteHurbano hidranteHurbano = new HidranteHurbano();
        SistemaDeEspuma sistemaDeEspuma = new SistemaDeEspuma();
        Resfriamento resfriamento = new Resfriamento();
        SistemaDeComunicacao sistemaDeComunicacao = new SistemaDeComunicacao();
        SistemaDeCircuitoDeTv sistemaDeCircuitoDeTv = new SistemaDeCircuitoDeTv();

        listView = (ListView) findViewById(R.id.listView);

        mTitle = new ArrayList<>();
        sTitle = new ArrayList<>();
        mDescription = new ArrayList<>();
        recomendado = new ArrayList<>();
        images = new ArrayList<>();
        URLpdf = new ArrayList<>();

        if (acessoViatura.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(acessoViatura.getNome());
            sTitle.add(getString(R.string.subtit_viatura));
            mDescription.add(getString(R.string.desc_viatura));
            images.add(acessoViatura.getImagem());
            if (acessoViatura.Recomendado(grupo, divisao)) recomendado.add("Recomendado");
            else recomendado.add("Exigência");
            URLpdf.add("nt-06_2014-acesso-de-viaturas.pdf");
        }
        if (alarmeDeIncendio.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma, deposito, alojamentos) || consulta) {
            mTitle.add(alarmeDeIncendio.getNome());
            sTitle.add(getString(R.string.subtit_alarme));
            mDescription.add(getString(R.string.desc_alarme));
            images.add(alarmeDeIncendio.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-19_2014-sistemas-de-deteccao-e-alarme-de-incendio.pdf");
        }
        if (brigada.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma, publico) || consulta) {
            mTitle.add(brigada.getNome());
            sTitle.add(getString(R.string.subtit_brigada));
            mDescription.add(getString(R.string.desc_brigada));
            images.add(brigada.getImagem());
            if (brigada.Recomendado(grupo, divisao, area, publico)) recomendado.add("Recomendado");
            else recomendado.add("Exigência");
            URLpdf.add("NT-17_2021-Brigada-de-Incendio.pdf");
        }
        if (centralDeGas.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(centralDeGas.getNome());
            sTitle.add(getString(R.string.subtit_gas));
            mDescription.add(getString(R.string.desc_gas));
            images.add(centralDeGas.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-29_2014-comercializacao-distribuicao-e-utilizacao-de-gas-natural.pdf");
        }
        if (horizontal.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(horizontal.getNome());
            sTitle.add(getString(R.string.subtit_horizontal));
            mDescription.add(getString(R.string.desc_horizontal));
            images.add(horizontal.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("NT-09_2017-Compartimentação-horizontal-e-compartimentação-vertical_.pdf");
        }
        if (vertical.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(vertical.getNome());
            sTitle.add(getString(R.string.subtit_vertical));
            mDescription.add(getString(R.string.desc_vertical));
            images.add(vertical.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("NT-09_2017-Compartimentação-horizontal-e-compartimentação-vertical_.pdf");
        }
        if (acabamento.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(acabamento.getNome());
            sTitle.add(getString(R.string.subtit_acabamento));
            mDescription.add(getString(R.string.desc_acabamento));
            images.add(acabamento.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-10_2014-controle-de-materiais-de-acabamento-e-revestimento.pdf");
        }
        if (controleDeFumaca.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(controleDeFumaca.getNome());
            sTitle.add(getString(R.string.subtit_fumaca));
            mDescription.add(getString(R.string.desc_fumaca));
            images.add(controleDeFumaca.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-15_2014-controle-de-fumaca-parte-1-regras-gerais.pdf");
        }
        if (chuveiroAutomatico.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma, publico) || consulta) {
            mTitle.add(chuveiroAutomatico.getNome());
            sTitle.add(getString(R.string.subtit_chuveiros));
            mDescription.add(getString(R.string.desc_chuveiros));
            images.add(chuveiroAutomatico.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-23_2014-sistema-de-chuveiros-automaticos.pdf");
        }
        if (deteccaoDeIncendio.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma, deposito, deteccaof4, prisoes) || consulta) {
            mTitle.add(deteccaoDeIncendio.getNome());
            sTitle.add(getString(R.string.subtit_deteccao));
            mDescription.add(getString(R.string.desc_deteccao));
            images.add(deteccaoDeIncendio.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-19_2014-sistemas-de-deteccao-e-alarme-de-incendio.pdf");
        }
        if (elevadorDeEmergencia.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(elevadorDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_elevador));
            mDescription.add(getString(R.string.desc_elevador));
            images.add(elevadorDeEmergencia.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("");
        }
        if (extintor.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(extintor.getNome());
            sTitle.add(getString(R.string.subtit_extintor));
            mDescription.add(getString(R.string.desc_extintor));
            images.add(extintor.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-21_2014-extintores.pdf");
        }
        if (hidranteEMangotinho.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma, alojamentos) || consulta) {
            mTitle.add(hidranteEMangotinho.getNome());
            sTitle.add(getString(R.string.subtit_mangotinhos));
            mDescription.add(getString(R.string.desc_mangotinhos));
            images.add(hidranteEMangotinho.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("nt-22_2014-sistemas-de-hidrantes-e-de-mangotinhos-para-combate-a-incendio.pdf");
        }
        if (hidranteHurbano.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(hidranteHurbano.getNome());
            sTitle.add(getString(R.string.subtit_hidrante));
            mDescription.add(getString(R.string.desc_hidrante));
            images.add(hidranteHurbano.getImagem());
            if (hidranteHurbano.Recomendado(grupo, divisao)) recomendado.add("Recomendado");
            else recomendado.add("Exigência");
            URLpdf.add("nt-34_2014-hidrante-urbano.pdf");
        }
        if (iluminacaoDeEmergencia.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(iluminacaoDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_iluminacao));
            mDescription.add(getString(R.string.desc_iluminacao));
            images.add(iluminacaoDeEmergencia.getImagem());
            if (iluminacaoDeEmergencia.Recomendado(grupo, divisao)) recomendado.add("Recomendado");
            else recomendado.add("Exigência");
            URLpdf.add("nt-18_2014-iluminacao-de-emergencia.pdf");
        }
        if (resfriamento.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(resfriamento.getNome());
            sTitle.add(getString(R.string.subtit_Resfriamento));
            mDescription.add(getString(R.string.desc_Resfriamento));
            images.add(resfriamento.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("");
        }
        if (saidaDeEmergencia.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(saidaDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_saida));
            mDescription.add(getString(R.string.desc_saida));
            images.add(saidaDeEmergencia.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("NT-11_2021-Saidas-de-Emergencia.pdf");
        }
        if (estrutural.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(estrutural.getNome());
            sTitle.add(getString(R.string.subtit_estrutural));
            mDescription.add(getString(R.string.desc_estrutural));
            images.add(estrutural.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("");
        }
        if (sinalizacaoDeEmergencia.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(sinalizacaoDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_sinalizacao));
            mDescription.add(getString(R.string.desc_sinalizacao));
            images.add(sinalizacaoDeEmergencia.getImagem());
            if (sinalizacaoDeEmergencia.Recomendado(grupo, divisao)) recomendado.add("Recomendado");
            else recomendado.add("Exigência");
            URLpdf.add("nt-20_2014-sinalizacao-de-emergencia.pdf");
        }
        if (spda.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(spda.getNome());
            sTitle.add(getString(R.string.subtit_SPDA));
            mDescription.add(getString(R.string.desc_SPDA));
            images.add(spda.getImagem());
            if (spda.Recomendado(grupo, divisao)) recomendado.add("Recomendado");
            else recomendado.add("Exigência");
            URLpdf.add("NT-40_2019-SPDA.pdf");
        }
        if (sistemaDeEspuma.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(sistemaDeEspuma.getNome());
            sTitle.add(getString(R.string.subtit_espuma));
            mDescription.add(getString(R.string.desc_espuma));
            images.add(sistemaDeEspuma.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("");
        }
        if (sistemaDeComunicacao.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(sistemaDeComunicacao.getNome());
            sTitle.add(getString(R.string.subtit_comunicacao));
            mDescription.add(getString(R.string.desc_comunicacao));
            images.add(sistemaDeComunicacao.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("");
        }
        if (sistemaDeCircuitoDeTv.Exigencia(grupo, divisao, area, altura, lotacao, pavimentos, tunel, liquidos, produtos, plataforma) || consulta) {
            mTitle.add(sistemaDeCircuitoDeTv.getNome());
            sTitle.add(getString(R.string.subtit_tv));
            mDescription.add(getString(R.string.desc_tv));
            images.add(sistemaDeCircuitoDeTv.getImagem());
            recomendado.add("Exigência");
            URLpdf.add("");
        }

        // DIRECIONA PARA CONSULTA OU VISTORIA INTELIGENTE
        AdaptadorExigencias adapter = new AdaptadorExigencias(this, mTitle, sTitle, mDescription, images, recomendado);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((AdapterView.OnItemClickListener) (parent, view, position, id) -> {

            System.out.println("O id do item clicado é: " + view.getId());
            Intent intent = new Intent(getApplicationContext(), Consulta_Rapida_Detalhes.class);
            // this intent put our 0 index image to another activity
            Bundle bundle = new Bundle();
            bundle.putInt("image", (int) images.get(position));
            intent.putExtras(bundle);
            // now put title and description to another activity
            intent.putExtra("title", (String) mTitle.get(position));
            intent.putExtra("subTitle", (String) sTitle.get(position));
            intent.putExtra("description", (String) mDescription.get(position));
            intent.putExtra("recomendado", (String) recomendado.get(position));
            intent.putExtra("urlPDF", (String) URLpdf.get(position));
            // also put your position
            intent.putExtra("position", "" + position);
            startActivity(intent);

        });
    }
}

// vou chamar a tela da nova Listagem, passando como parametro o conteudo, por meio de lista
        /*
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(Resultado.this, "Item Clicado:" + i + " " + lista.get(i).toString(), Toast.LENGTH_SHORT).show();
            }
        });
        */