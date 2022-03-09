package br.com.stone4.main.vistoria.perguntas_frequentes;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;

public class Perguntas_Frequentes extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Perguntas> listaPerguntas;
    PerguntasAdaptador perguntasAdaptador;

    @Override
    protected void onCreate (Bundle savedInstanceStace) {
        super.onCreate(savedInstanceStace);
        setContentView(R.layout.activity_perguntas_frequentes);

        recyclerView = findViewById(R.id.recycleview);

        iniciarDados();
        setRecyclerView();
    }

    private void setRecyclerView() {
        perguntasAdaptador = new PerguntasAdaptador(listaPerguntas);
        recyclerView.setAdapter(perguntasAdaptador);
        recyclerView.setHasFixedSize(true);
    }

    private void iniciarDados() {

        listaPerguntas = new ArrayList<>();

        listaPerguntas.add(new Perguntas(getString(R.string.perguntaVistoria),getString(R.string.respostaVistoria)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta1_projeto),getString(R.string.resposta1_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta3_projeto),getString(R.string.resposta3_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta4_projeto),getString(R.string.resposta4_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta5_projeto),getString(R.string.resposta5_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta9_projeto),getString(R.string.resposta9_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta6_projeto),getString(R.string.resposta6_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta8_projeto),getString(R.string.resposta8_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta2_projeto),getString(R.string.resposta2_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta11_projeto),getString(R.string.resposta11_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta7_projeto),getString(R.string.resposta7_projeto)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta1_fat),getString(R.string.resposta1_fat)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta1_art),getString(R.string.resposta1_art)));
        listaPerguntas.add(new Perguntas(getString(R.string.pergunta2_art),getString(R.string.resposta2_art)));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.nav_menu,menu);

        MenuItem menuItem = menu.findItem(R.id.nav_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Digite aqui para procurar");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;

            }

            @Override
            public boolean onQueryTextChange(String newText) {

                perguntasAdaptador.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
