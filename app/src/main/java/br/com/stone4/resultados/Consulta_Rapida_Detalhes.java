package br.com.stone4.resultados;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import br.com.stone4.R;

public class Consulta_Rapida_Detalhes extends AppCompatActivity {

    Intent intent;
    Bundle parametros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_rapida);

        intent = getIntent();

        // pegando os parametros da intent que chamou esta
        parametros = intent.getExtras();
        String URLpdf = intent.getStringExtra("urlPDF");
        String exigencia = parametros.getString("title");
        String nt = parametros.getString("subTitle");
        int icone = parametros.getInt("image");

        TextView eXigencia = findViewById(R.id.titulo_detalhes);
        eXigencia.setText(exigencia);
        TextView normaTecnica = findViewById(R.id.subTitulo_detalhes);
        normaTecnica.setText(nt);
        ImageView iCone = findViewById(R.id.imagem_detalhe);
        iCone.setImageResource(icone);

        PDFView pdfView = findViewById(R.id.tv_arte_result);
        pdfView.fitToWidth();
        pdfView.fromAsset(URLpdf).load();


    }

    public void onClick(View view){
        // PDF Viwer
        intent.setClass(this,Consulta_Rapida_NT.class);
        intent.putExtras(parametros);
        startActivity(intent);
    }
}