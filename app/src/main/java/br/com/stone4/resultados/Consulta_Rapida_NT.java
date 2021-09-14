package br.com.stone4.resultados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import br.com.stone4.R;

public class Consulta_Rapida_NT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado__detalhes2);

        Intent intent = getIntent();
        String URLpdf = intent.getStringExtra("urlPDF");

        // PDF Viwer
        PDFView pdfView = findViewById(R.id.Rdetalhe);
        pdfView.fromAsset(URLpdf).load();
    }
}