package br.com.stone4.main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import br.com.stone4.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView card1 = (CardView) findViewById(R.id.card1);
        CardView card2 = (CardView) findViewById(R.id.card2);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {

        Intent intent = getIntent();
        Bundle parametros = new Bundle();

        switch (v.getId()){
            case R.id.card1:
                parametros.putString("perfil","perfil1");
                break;
            case R.id.card2:
                parametros.putString("perfil","perfil2");
                break;
        }

        intent.setClass(this, Vistorias.class);
        intent.putExtras(parametros);
        startActivity(intent);
    }
}
/*

    problemas a resolver:
    - grupo C - SPDS - criar tela perguntando se possui deposito GLP – Áreas destinadas a depósitos de GLP devem possuir SPDA de acordo com as orientações da NT-40;
    - grupo E - Detecção e Alarme de Incêndio - tabela 6E

    ideias e/ou melhorias:
    - otimizar escolhas - ex: divisão e1 c/ altura > 4 nao precisa perguntar se tem alojamentos
    - otimizar divisao f8 - nao precisa pedir pavimento com altura >= 3
    - otimizar divisão g5/g6 - brigada - somente para quem tem sistema de resfriamento ou espuma
    - colocar lista de exigencias exclusivas - quando olhar posso rolar pro lado e elas somem
    - calculo Carga de Incêndio (CI)
    - incluir menu de exigencias especificas no menu de vistorias
    - incluir menu para baixar ou mostrar pdfs do site: todos relacionados a vistoria
    - no menu de altura, colocar o bizu de como medir - ex: começa a medir no teto
    - madequar os títulos das activitis
    - passo a passo de como fazer uma vistoria: desde organizar os processos até lançar no sistema: com fotos

    - menu resultado contendo:
        - resumo das escolhas feitas
        - carga de incêndio
        - exigências

    Observações:
    - Divisao f4 não testada - motivo: fora da nossa realidade

    Alterações:
    Dia 11/08/21 - Quarta
    - Correção Descrição Normas Técnicas
    - Implementação aviso de Recomendado ou Exigência no painel de Resultado
    - Implementação do Visualizador de PDF da Classe Detalhes de Vistorias
    - Implementação de Opção de COnsulta Rápida


     */

