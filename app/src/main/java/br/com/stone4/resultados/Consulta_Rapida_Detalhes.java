package br.com.stone4.resultados;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        TextView bizus = findViewById(R.id.bizus_consulta);
        ImageView imgBizus = findViewById(R.id.img_bizus_consulta);

        System.out.println("Exigências tem essevalor: "+exigencia);
        switch (exigencia){
            case "Acesso de Viatura na Edificacao":
                imgBizus.setImageResource(R.drawable.anexo_acesso_viatura);
                break;
            case "Extintor":
                bizus.setText(R.string.bizus_Extintor);
                break;
            case "Saida de Emergencia":
                bizus.setText(R.string.bizus_SaidaDeEmergencia);
                break;
            case "Iluminção de Emergência":
                bizus.setText(R.string.bizus_iluminacaoDeEmergencia);
                break;
            case "Central de Gás":
                bizus.setText(R.string.bizus_centralDeGas);
                break;
            case "Sinalização de Emergência":
                bizus.setText(R.string.bizus_sinalizacaoDeEmergencia);
                break;
            case "SPDA":
                bizus.setText(R.string.bizus_spda);
                break;
            case "Controle de Materiais de Acabamento":
                bizus.setText(R.string.bizus_material_acabamento);
                break;
            case "Hidrante e Mangotinho":
                bizus.setText(R.string.bizus_hidranteM);
                break;
            case "Compartimentação Horizontal":
                imgBizus.setImageResource(R.drawable.anexo_compartimentacao);
                break;
            case "Hidrante Hurbano":
                bizus.setText(R.string.bizus_hidranteH);
                break;
            case "Alarme de Incêndio":
                bizus.setText(R.string.bizus_alarme);
                break;
            case "Detecção de Incêndio":
                bizus.setText(R.string.bizus_deteccao);
                break;
            case "Brigada":
                bizus.setText(R.string.bizus_brigada);
                break;
            case "SubSolo":
                bizus.setText(R.string.bizus_subsolo);
                break;
        }


    }

    public void onClick(View view){
        // PDF Viwer
        intent.setClass(this,Consulta_Rapida_NT.class);
        intent.putExtras(parametros);
        startActivity(intent);
    }
}