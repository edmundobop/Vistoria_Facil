package br.com.stone4.main.vistoria;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import br.com.stone4.ConsultaRapida.Dados;
import br.com.stone4.ConsultaRapida.MedidaDeSeguranca;
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
import br.com.stone4.ConsultaRapida.AdaptadorConsulta;
import br.com.stone4.ConsultaRapida.Consulta_Rapida_Detalhes;
import br.com.stone4.modulos.GrupoAdapter;
import br.com.stone4.modulos.TipoProcesso;

public class Consulta_rapida extends AppCompatActivity {

    private ListView listView;
    AdaptadorConsulta adaptadorConsulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        listView = findViewById(R.id.lv_colsulta_rapida);

        adaptadorConsulta = new AdaptadorConsulta(Consulta_rapida.this, Dados.getMedidasList(getApplicationContext()));
        listView.setAdapter(adaptadorConsulta);

        listView.setOnItemClickListener((parent, view, position, id) -> {

            System.out.println("O id do item clicado é: " + view.getId());

            /*
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
*/
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

                //filter(newText.toString());

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
/*
    private void filter(String text){

        ArrayList<MedidaDeSeguranca> filteredList = new ArrayList<>();

        for (MedidaDeSeguranca item: listView){
            if(item.getTitle().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        adaptadorConsulta.filterList(listView.);
    }*/
}


