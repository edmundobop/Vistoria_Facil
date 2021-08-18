package br.com.stone4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class Resultado_Detalhes extends AppCompatActivity {

    ImageView imageView;
    TextView title, subtitle, description, recomendado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado__detalhes);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            // aslo set in menifest
        }

        imageView = findViewById(R.id.imagem_detalhe);
        title = findViewById(R.id.titulo_detalhes);
        subtitle = findViewById(R.id.subTitulo_detalhes);
        description = findViewById(R.id.tv_arte_result);
        recomendado = findViewById(R.id.tv_Recomend);



            Intent intent = getIntent();

            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String sTitle = intent.getStringExtra("subTitle");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            subtitle.setText(sTitle);
            description.setText(aDescription);


            actionBar.setTitle(aTitle);

    }
}