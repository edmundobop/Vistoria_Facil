package br.com.stone4.principal.vistoria.VistoriaPassoApasso;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.stone4.R;

public class VistoriaPassoApasso_Result extends AppCompatActivity {

    @SuppressLint({"ResourceAsColor", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passo_apasso_vist_design);

        Intent intent = getIntent();
        int escolha = intent.getExtras().getInt("escolha");

        if (escolha==R.id.bt_escolha1){



        } else {


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
    }

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