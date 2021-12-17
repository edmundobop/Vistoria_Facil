package br.com.stone4.main.vistoria;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.ConsultaRapida.AdaptadorConsulta;
import br.com.stone4.ConsultaRapida.Consulta_Rapida_Detalhes;
import br.com.stone4.ConsultaRapida.Dados;
import br.com.stone4.ConsultaRapida.MedidaDeSeguranca;
import br.com.stone4.R;

public class Consulta_rapida extends AppCompatActivity {

    private AdaptadorConsulta adaptadorConsulta;
    private List<MedidaDeSeguranca> medidasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consulta_rapida);

        ListView listView = findViewById(R.id.lv_consultaRapida);

        adaptadorConsulta = new AdaptadorConsulta(Consulta_rapida.this,Dados.getMedidasList(getApplicationContext()));
        listView.setAdapter(adaptadorConsulta);

        listView.setOnItemClickListener((parent, view, position, id) -> {

            System.out.println("O id do item clicado é: "+ adaptadorConsulta.getTitle(position));

            Intent intent = new Intent(getApplicationContext(), Consulta_Rapida_Detalhes.class);
            // this intent put our 0 index image to another activity
            Bundle bundle = new Bundle();
            bundle.putInt("image", adaptadorConsulta.getSubImage(position));
            intent.putExtras(bundle);
            // now put title and description to another activity
            intent.putExtra("title", adaptadorConsulta.getTitle(position));
            intent.putExtra("subTitle", adaptadorConsulta.getSubTitle(position));
            intent.putExtra("recomendado", adaptadorConsulta.getRecomend(position));
            intent.putExtra("urlPDF", adaptadorConsulta.getUrl(position));
            // also put your position
            intent.putExtra("position", "" + position);
            startActivity(intent);

        });

    }

    // Barra de pesquisa
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

                adaptadorConsulta.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

}


