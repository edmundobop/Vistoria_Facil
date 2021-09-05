package br.com.stone4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class VistoriaInteligente_Resultado_Detalhes extends AppCompatActivity {

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