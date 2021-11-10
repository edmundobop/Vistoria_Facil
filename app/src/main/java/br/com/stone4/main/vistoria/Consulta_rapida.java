package br.com.stone4.main.vistoria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import br.com.stone4.R;
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
import br.com.stone4.resultados.AdaptadorExigencias;
import br.com.stone4.resultados.Consulta_Rapida_Detalhes;

public class Consulta_rapida extends AppCompatActivity {

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
        Intent intent1 = getIntent();
        Bundle parametros = intent1.getExtras();
        // Pego o conteudo do bundle

        Boolean consulta = parametros.getBoolean("consulta");

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

        ListView listView = findViewById(R.id.listView);

        mTitle = new ArrayList<>();
        sTitle = new ArrayList<>();
        mDescription = new ArrayList<>();
        recomendado = new ArrayList<>();
        images = new ArrayList<>();
        URLpdf = new ArrayList<>();

        // Nt-01:
            mTitle.add("Nt 01/2020: Anexo A");
            sTitle.add("NORMA TÉCNICA 01/2020");
            mDescription.add("Procedimentos Administrativos – Anexo A");
            images.add(R.drawable.nt01);
            recomendado.add("");
            URLpdf.add("NT-01_2020_ANEXO-A.pdf");
        // Acesso de Viatura
            mTitle.add(acessoViatura.getNome());
            sTitle.add(getString(R.string.subtit_viatura));
            mDescription.add(getString(R.string.desc_viatura));
            images.add(acessoViatura.getImagem());
            recomendado.add("");
            URLpdf.add("nt-06_2014-acesso-de-viaturas.pdf");
       // Alarme
            mTitle.add(alarmeDeIncendio.getNome());
            sTitle.add(getString(R.string.subtit_alarme));
            mDescription.add(getString(R.string.desc_alarme));
            images.add(alarmeDeIncendio.getImagem());
            recomendado.add("");
            URLpdf.add("nt-19_2014-sistemas-de-deteccao-e-alarme-de-incendio.pdf");
        // Brigada
            mTitle.add(brigada.getNome());
            sTitle.add(getString(R.string.subtit_brigada));
            mDescription.add(getString(R.string.desc_brigada));
            images.add(brigada.getImagem());
            recomendado.add("");
            URLpdf.add("NT-17_2021-Brigada-de-Incendio.pdf");
        // Carga de Incendio
            mTitle.add("Carga de Incêndio");
            sTitle.add("NORMA TÉCNICA 14/2020");
            mDescription.add("CARGA DE INCÊNDIO NAS EDIFICAÇÕES E ÁREAS DE RISCO");
            images.add(R.drawable.cargadeincendio);
            recomendado.add("");
            URLpdf.add("nt-14-carga_de_incendio.pdf");
        // Central de Gás
            mTitle.add(centralDeGas.getNome());
            sTitle.add(getString(R.string.subtit_gas));
            mDescription.add(getString(R.string.desc_gas));
            images.add(centralDeGas.getImagem());
            recomendado.add("");
            URLpdf.add("nt-29_2014-comercializacao-distribuicao-e-utilizacao-de-gas-natural.pdf");
        // Compartimentação Horizontal
            mTitle.add(horizontal.getNome());
            sTitle.add(getString(R.string.subtit_horizontal));
            mDescription.add(getString(R.string.desc_horizontal));
            images.add(horizontal.getImagem());
            recomendado.add("");
            URLpdf.add("NT-09_2017-Compartimentação-horizontal-e-compartimentação-vertical_.pdf");
        // Compartimentação Vertical
            mTitle.add(vertical.getNome());
            sTitle.add(getString(R.string.subtit_vertical));
            mDescription.add(getString(R.string.desc_vertical));
            images.add(vertical.getImagem());
            recomendado.add("");
            URLpdf.add("NT-09_2017-Compartimentação-horizontal-e-compartimentação-vertical_.pdf");
        //Materiais de Acabamento
            mTitle.add(acabamento.getNome());
            sTitle.add(getString(R.string.subtit_acabamento));
            mDescription.add(getString(R.string.desc_acabamento));
            images.add(acabamento.getImagem());
            recomendado.add("");
            URLpdf.add("nt-10_2014-controle-de-materiais-de-acabamento-e-revestimento.pdf");
        //Controle de Fumaça
            mTitle.add(controleDeFumaca.getNome());
            sTitle.add(getString(R.string.subtit_fumaca));
            mDescription.add(getString(R.string.desc_fumaca));
            images.add(controleDeFumaca.getImagem());
            recomendado.add("");
            URLpdf.add("nt-15_2014-controle-de-fumaca-parte-1-regras-gerais.pdf");
        // Chuveiros Automáticos
            mTitle.add(chuveiroAutomatico.getNome());
            sTitle.add(getString(R.string.subtit_chuveiros));
            mDescription.add(getString(R.string.desc_chuveiros));
            images.add(chuveiroAutomatico.getImagem());
            recomendado.add("");
            URLpdf.add("nt-23_2014-sistema-de-chuveiros-automaticos.pdf");
        // Detecção de Fumaça
            mTitle.add(deteccaoDeIncendio.getNome());
            sTitle.add(getString(R.string.subtit_deteccao));
            mDescription.add(getString(R.string.desc_deteccao));
            images.add(deteccaoDeIncendio.getImagem());
            recomendado.add("");
            URLpdf.add("nt-19_2014-sistemas-de-deteccao-e-alarme-de-incendio.pdf");
        // Elevador de Emergência
            mTitle.add(elevadorDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_elevador));
            mDescription.add(getString(R.string.desc_elevador));
            images.add(elevadorDeEmergencia.getImagem());
            recomendado.add("");
            URLpdf.add("");
        // Extintor
            mTitle.add(extintor.getNome());
            sTitle.add(getString(R.string.subtit_extintor));
            mDescription.add(getString(R.string.desc_extintor));
            images.add(extintor.getImagem());
            recomendado.add("");
            URLpdf.add("nt-21_2014-extintores.pdf");
        // Hidrante Hurbano
            mTitle.add(hidranteHurbano.getNome());
            sTitle.add(getString(R.string.subtit_hidrante));
            mDescription.add(getString(R.string.desc_hidrante));
            images.add(hidranteHurbano.getImagem());
            recomendado.add("");
            URLpdf.add("nt-34_2014-hidrante-urbano.pdf");
        // Imulinação de Emergência
            mTitle.add(iluminacaoDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_iluminacao));
            mDescription.add(getString(R.string.desc_iluminacao));
            images.add(iluminacaoDeEmergencia.getImagem());
            recomendado.add("");
            URLpdf.add("nt-18_2014-iluminacao-de-emergencia.pdf");
        // Piscinas
            mTitle.add("Piscinas e Guarda-vidas");
            sTitle.add("NORMA TÉCNICA 16/2017");
            mDescription.add("SEGURANÇA EM ÁREAS DE PISCINAS E EMPREGO DE GUARDA-VIDAS");
            images.add(R.drawable.piscina);
            recomendado.add("");
            URLpdf.add("NT-16-Piscinas.pdf");
        // Resfriamento
            mTitle.add(resfriamento.getNome());
            sTitle.add(getString(R.string.subtit_Resfriamento));
            mDescription.add(getString(R.string.desc_Resfriamento));
            images.add(resfriamento.getImagem());
            recomendado.add("");
            URLpdf.add("");
        // Saída de Emergência
            mTitle.add(saidaDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_saida));
            mDescription.add(getString(R.string.desc_saida));
            images.add(saidaDeEmergencia.getImagem());
            recomendado.add("");
            URLpdf.add("NT-11_2021-Saidas-de-Emergencia.pdf");
        // Segurança Estrutural
            mTitle.add(estrutural.getNome());
            sTitle.add(getString(R.string.subtit_estrutural));
            mDescription.add(getString(R.string.desc_estrutural));
            images.add(estrutural.getImagem());
            recomendado.add("");
            URLpdf.add("");
        // Sinalização de Emergência
            mTitle.add(sinalizacaoDeEmergencia.getNome());
            sTitle.add(getString(R.string.subtit_sinalizacao));
            mDescription.add(getString(R.string.desc_sinalizacao));
            images.add(sinalizacaoDeEmergencia.getImagem());
            recomendado.add("");
            URLpdf.add("nt-20_2014-sinalizacao-de-emergencia.pdf");
        // SPDA
            mTitle.add(spda.getNome());
            sTitle.add(getString(R.string.subtit_SPDA));
            mDescription.add(getString(R.string.desc_SPDA));
            images.add(spda.getImagem());
            recomendado.add("");
            URLpdf.add("NT-40_2019-SPDA.pdf");
        // Sistema De Espuma
            mTitle.add(sistemaDeEspuma.getNome());
            sTitle.add(getString(R.string.subtit_espuma));
            mDescription.add(getString(R.string.desc_espuma));
            images.add(sistemaDeEspuma.getImagem());
            recomendado.add("");
            URLpdf.add("");
        //Sistema de Comunicacao
            mTitle.add(sistemaDeComunicacao.getNome());
            sTitle.add(getString(R.string.subtit_comunicacao));
            mDescription.add(getString(R.string.desc_comunicacao));
            images.add(sistemaDeComunicacao.getImagem());
            recomendado.add("");
            URLpdf.add("");
        //Sistema de Circuito de TV
            mTitle.add(sistemaDeCircuitoDeTv.getNome());
            sTitle.add(getString(R.string.subtit_tv));
            mDescription.add(getString(R.string.desc_tv));
            images.add(sistemaDeCircuitoDeTv.getImagem());
            recomendado.add("");
            URLpdf.add("");
        // Subsolo:
            mTitle.add("SubSolo");
            sTitle.add("TABELA 7 - Anexo A - NT-01");
            mDescription.add("Exigências para SubSolos");
            images.add(R.drawable.subsolo);
            recomendado.add("");
            URLpdf.add("tabela7.pdf");

        // CHAMA A CLASSE ADAPTER COM AS LISTAS DOS RESULTADOS
        AdaptadorExigencias adapter = new AdaptadorExigencias(this, mTitle, sTitle, mDescription, images, recomendado);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {

            System.out.println("O id do item clicado é: " + view.getId());
            Intent intent = new Intent(getApplicationContext(), Consulta_Rapida_Detalhes.class);
            // this intent put our 0 index image to another activity
            Bundle bundle = new Bundle();
            bundle.putInt("image", images.get(position));
            intent.putExtras(bundle);
            // now put title and description to another activity
            intent.putExtra("title", mTitle.get(position));
            intent.putExtra("subTitle", sTitle.get(position));
            intent.putExtra("description", mDescription.get(position));
            intent.putExtra("recomendado", recomendado.get(position));
            intent.putExtra("urlPDF", URLpdf.get(position));
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