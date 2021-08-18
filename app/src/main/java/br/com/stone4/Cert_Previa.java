package br.com.stone4;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import br.com.stone4.R;

public class Cert_Previa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cert__previa);

        // justifica o texto
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }*/
    }
}