package br.com.stone4.main.vistoria;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import br.com.stone4.R;

public class Processos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_processos);

        PDFView pdfView = findViewById(R.id.pdf_processos);
        pdfView.fromAsset("bizuario").load();
        // justifica o texto
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }*/
    }
}