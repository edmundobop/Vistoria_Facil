package br.com.stone4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import br.com.stone4.R;

public class cert_previa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cert_previa2);

        WebView webview = findViewById(R.id.webview);

        webview.setContentDescription(getString(R.string.txt_certPrevia));
    }
}