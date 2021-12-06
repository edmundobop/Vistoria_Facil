package br.com.stone4.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RemoteViews;
import android.widget.Toast;

import java.util.ArrayList;

import br.com.stone4.R;
import br.com.stone4.main.vistoria.CertiPreviaPassoApasso;
import br.com.stone4.main.vistoria.Consulta_rapida;
import br.com.stone4.main.vistoria.VistoriaInteligente;
import br.com.stone4.main.vistoria.perguntas_frequentes.Perguntas_Frequentes;
import br.com.stone4.modulos.TipoProcesso;

public class Vistorias extends AppCompatActivity {

    private ArrayList<String> titulo;
    private ArrayList<String> subTitulo;
    private ArrayList<Integer> imagem;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    // Menu da barra supeior
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id = item.getItemId();

        if (item_id == R.id.avaliar){
            Toast.makeText(this,"Botão d avaliar", Toast.LENGTH_SHORT).show();
            try {
                Uri uri = Uri.parse("market://details?id=" +
                        getPackageName());

                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            } catch (ActivityNotFoundException e){
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" +getPackageName());
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistorias_main);



        Intent intent = getIntent();
        Bundle parametros = intent.getExtras();
        String perfil = parametros.getString("perfil");

        ListView listView = (ListView) findViewById(R.id.listView);

        titulo = new ArrayList<>();
        subTitulo = new ArrayList<>();
        imagem = new ArrayList<>();

        if (perfil.equals("perfil1")){
            titulo.add("Vistoria Inteligente");
            titulo.add("Consulta Rápida");
            titulo.add("Modulos");
            titulo.add("Solicitar Vistoria");
            titulo.add("Perguntas Frequentes");
            subTitulo.add("Passo-a-passo para realizar uma vistoria");
            subTitulo.add("Consulte todos os Bizus e Nt's");
            subTitulo.add("Consulte os módulos do app separadamente");
            subTitulo.add("Passo-a-passo para solicitar vistoria no site do CBMGO");
            subTitulo.add("Consulte as dúvidas mais frequentes aqui");
            imagem.add(R.drawable.vistoria_inteligente);
            imagem.add(R.drawable.lupa);
            imagem.add(R.drawable.modulos);
            imagem.add(R.drawable.solicitar_vistoria);
            imagem.add(R.drawable.perguntas_respostas);
        } else {
            titulo.add("Solicitar Vistoria");
            titulo.add("Perguntas Frequentes");
            titulo.add("Modulos");
            subTitulo.add("Passo-a-passo para solicitar vistoria no site do CBMGO");
            subTitulo.add("PerguntasS e respostas frequentes");
            subTitulo.add("Consulte os módulos do app separadamente");
            imagem.add(R.drawable.solicitar_vistoria);
            imagem.add(R.drawable.perguntas_respostas);
            imagem.add(R.drawable.modulos);
        }

        // DIRECIONA PARA CONSULTA OU VISTORIA INTELIGENTE
        Adaptador_Vistorias_Opcoes adapter = new Adaptador_Vistorias_Opcoes(this, titulo, subTitulo, imagem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent();

                if (perfil.equals("perfil1")){
                    switch (position) {
                        case 0:
                            intent = new Intent(getApplicationContext(), VistoriaInteligente.class);
                            break;
                        case 1:
                            intent = new Intent(getApplicationContext(), Consulta_rapida.class);
                            Bundle chave = new Bundle();
                            chave.putBoolean("consulta", true);
                            intent.putExtras(chave);
                            break;
                        case 2:
                            intent = new Intent(getApplicationContext(), TipoProcesso.class);
                            break;
                        case 3:
                            intent = new Intent(getApplicationContext(), CertiPreviaPassoApasso.class);
                            break;
                        case 4:
                            intent = new Intent(getApplicationContext(), Perguntas_Frequentes.class);
                            break;
                        }
                    } else {
                        switch (position){
                            case 0:
                                intent = new Intent(getApplicationContext(), CertiPreviaPassoApasso.class);
                                break;
                            case 1:
                                intent = new Intent(getApplicationContext(), Perguntas_Frequentes.class);
                                break;
                            case 2:
                                intent = new Intent(getApplicationContext(), TipoProcesso.class);
                                break;
                    }
                }


                startActivity(intent);

            }
        });

    }
}