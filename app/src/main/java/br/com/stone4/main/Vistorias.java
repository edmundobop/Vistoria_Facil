package br.com.stone4.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.stone4.R;
import br.com.stone4.main.vistoria.CertiPreviaPassoApasso;
import br.com.stone4.main.vistoria.Consulta_rapida;
import br.com.stone4.main.vistoria.VistoriaInteligente;
import br.com.stone4.main.vistoria.perguntas_frequentes.Perguntas_Frequentes;

public class Vistorias extends AppCompatActivity {

    private ArrayList<String> titulo;
    private ArrayList<String> subTitulo;
    private ArrayList<Integer> imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistorias_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        titulo = new ArrayList<>();
        subTitulo = new ArrayList<>();
        imagem = new ArrayList<>();

        titulo.add("Vistoria Inteligente");
        titulo.add("Consulta Rápida");
        titulo.add("Solicitar Vistoria");
        titulo.add("Perguntas Frequentes");
        subTitulo.add("Passo-a-passo para realizar uma vistoria");
        subTitulo.add("Consulte todos os Bizus e Nt's");
        subTitulo.add("Passo-a-passo para solicitar vistoria no site do CBMGO");
        subTitulo.add("Perguntas que mais geram dúvidas para o vistoriador");
        imagem.add(R.drawable.vistoria_inteligente);
        imagem.add(R.drawable.lupa);
        imagem.add(R.drawable.solicitar_vistoria);
        imagem.add(R.drawable.perguntas_respostas);

        // DIRECIONA PARA CONSULTA OU VISTORIA INTELIGENTE
        Adaptador_Vistorias_Opcoes adapter = new Adaptador_Vistorias_Opcoes(this, titulo, subTitulo, imagem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();

                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), VistoriaInteligente.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), Consulta_rapida.class);
                        Bundle chave = new Bundle();
                        chave.putBoolean("consulta",true);
                        intent.putExtras(chave);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), CertiPreviaPassoApasso.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), Perguntas_Frequentes.class);
                        break;
                }

                startActivity(intent);

            }
        });

    }
}