package br.com.stone4.main.vistoria.perguntas_frequentes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;

public class Perguntas_Frequentes extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Perguntas> listaPerguntas;

    @Override
    protected void onCreate (Bundle savedInstanceStace) {
        super.onCreate(savedInstanceStace);
        setContentView(R.layout.activity_perguntas_frequentes);

        recyclerView = findViewById(R.id.recycleview);

        iniciarDados();
        setRecyclerView();
    }

    private void setRecyclerView() {
        PerguntasAdaptador perguntasAdaptador = new PerguntasAdaptador(listaPerguntas);
        recyclerView.setAdapter(perguntasAdaptador);
        recyclerView.setHasFixedSize(true);
    }

    private void iniciarDados() {

        listaPerguntas = new ArrayList<>();

        listaPerguntas.add(new Perguntas(getString(R.string.pergunta1_projeto),getString(R.string.resposta1_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta2_projeto),getString(R.string.resposta2_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta3_projeto),getString(R.string.resposta3_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta4_projeto),getString(R.string.resposta4_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta5_projeto),getString(R.string.resposta5_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta6_projeto),getString(R.string.resposta6_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta7_projeto),getString(R.string.resposta7_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta1_fat),getString(R.string.resposta1_fat)));
    }
}
