package br.com.stone4.main.vistoria.VistoriaPassoApasso;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckedTextView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import br.com.stone4.R;

public class VistoriaPassoApasso_Result extends AppCompatActivity {

    private ArrayList<String> item;
    private ArrayList<Integer> imagem;

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passo_apasso_vist_listview);

        Intent intent = getIntent();
        int escolha = intent.getExtras().getInt("escolha");

        item = new ArrayList<>();
        imagem = new ArrayList<>();

        ListView listView = (ListView) findViewById(R.id.lv_consulta_rapida);

        if (escolha==R.id.bt_escolha1){
            item.add(getResources().getString(R.string.txt_vistPaP750menorTxt1));
            imagem.add(R.drawable.um);
            item.add(getResources().getString(R.string.txt_vistPaP750menorTxt2));
            imagem.add(R.drawable.dois);
            item.add(getResources().getString(R.string.txt_vistPaP750menorTxt3));
            imagem.add(R.drawable.tres);
            item.add(getResources().getString(R.string.txt_vistPaP750menorTxt4));
            imagem.add(R.drawable.quatro);
            item.add(getResources().getString(R.string.txt_vistPaP750menorTxt5));
            imagem.add(R.drawable.cinco);
            item.add(getResources().getString(R.string.txt_vistPaP750menorTxt6));
            imagem.add(R.drawable.seis);

        } else {
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt1));
            imagem.add(R.drawable.um);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt2));
            imagem.add(R.drawable.dois);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt3));
            imagem.add(R.drawable.tres);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt4));
            imagem.add(R.drawable.quatro);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt5));
            imagem.add(R.drawable.cinco);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt6));
            imagem.add(R.drawable.seis);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt7));
            imagem.add(R.drawable.sete);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt8));
            imagem.add(R.drawable.oito);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt9));
            imagem.add(R.drawable.nove);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt10));
            imagem.add(R.drawable.dez);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt11));
            imagem.add(R.drawable.onze);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt12));
            imagem.add(R.drawable.doze);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt13));
            imagem.add(R.drawable.treze);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt14));
            imagem.add(R.drawable.quatorze);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt15));
            imagem.add(R.drawable.quinze);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt16));
            imagem.add(R.drawable.dezeseis);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt17));
            imagem.add(R.drawable.dezesete);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt18));
            imagem.add(R.drawable.dezoito);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt19));
            imagem.add(R.drawable.dezenove);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt20));
            imagem.add(R.drawable.vinte);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt21));
            imagem.add(R.drawable.vinteeum);
            item.add(getResources().getString(R.string.txt_vistPaP1500HidTxt22));
            imagem.add(R.drawable.vinteedois);
        }

        AdaptadorVistoriaPassoApasso adapter = new AdaptadorVistoriaPassoApasso(this, item, imagem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                CheckedTextView ctv = view.findViewById(R.id.ct_item);
                ctv.toggle();
            }
        });
    }

        /*
        TextView txtTitulo = findViewById(R.id.tv_PapT);
        TextView txtobs = findViewById(R.id.tv_PapObs);
        TextView txtTexto = findViewById(R.id.tv_PapTxt);


        if (escolha==R.id.bt_escolha1){

            txtTitulo.setText(R.string.txt_vistPaP750menorT);
            txtTexto.setText(R.string.txt_vistPaP750menorTxt);
            txtobs.setText(R.string.txt_vistPaP750menorObs);

        } else {
            txtTitulo.setText(R.string.txt_vistPaP1500HidT);
            txtobs.setText(R.string.txt_vistPaP1500HidObs);
            txtTexto.setText(R.string.txt_vistPaP1500HidTxt);

        }
*/


    /*
    android:gravity="center"

                android:textColorHint="@color/design_default_color_error"
                android:textSize="24sp"
                android:textStyle="bold"
                android:justificationMode="inter_word"
                android:hint="@string/txt_vistPaP1500HidTxt"
                android:textColorHint="@color/black"
                android:textIsSelectable="true"
                android:textSize="20sp"

     */
}