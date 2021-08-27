package br.com.stone4.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.stone4.R;
import br.com.stone4.divisoes.DivisaoA;
import br.com.stone4.divisoes.DivisaoB;
import br.com.stone4.divisoes.DivisaoC;
import br.com.stone4.divisoes.DivisaoD;
import br.com.stone4.divisoes.DivisaoE;
import br.com.stone4.divisoes.DivisaoF;
import br.com.stone4.divisoes.DivisaoG;
import br.com.stone4.divisoes.DivisaoH;
import br.com.stone4.divisoes.DivisaoI;
import br.com.stone4.divisoes.DivisaoJ;
import br.com.stone4.divisoes.DivisaoL;
import br.com.stone4.divisoes.DivisaoM;
import br.com.stone4.divisoes.DivisaoN;

public class VistoriaInteligente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistoria_inteligente);

    }

    // Implement the OnClickListener callback

    public void onClick(View v) {
        // do something when the button is clicked
        Intent intent = new Intent(this, DivisaoA.class);

        Bundle parametro = new Bundle();
        parametro.putInt("grupo",v.getId());
        intent.putExtras(parametro);

        switch (v.getId()) {
            case R.id.bt_A:
                intent.setClass(this, DivisaoA.class);
                break;
            case R.id.bt_B:
                intent.setClass(this, DivisaoB.class);
                break;
            case R.id.bt_C:
                intent.setClass(this, DivisaoC.class);
                break;
            case R.id.bt_D:
                intent.setClass(this, DivisaoD.class);
                break;
            case R.id.bt_E:
                intent.setClass(this, DivisaoE.class);
                break;
            case R.id.bt_F:
                intent.setClass(this, DivisaoF.class);
                break;
            case R.id.bt_G:
                intent.setClass(this, DivisaoG.class);
                break;
            case R.id.bt_H:
                intent.setClass(this, DivisaoH.class);
                break;
            case R.id.bt_I:
                intent.setClass(this, DivisaoI.class);
                break;
            case R.id.bt_J:
                intent.setClass(this, DivisaoJ.class);
                break;
            case R.id.bt_L:
                intent.setClass(this, DivisaoL.class);
                break;
            case R.id.bt_M:
                intent.setClass(this, DivisaoM.class);
                break;
            case R.id.bt_N:
                intent.setClass(this, DivisaoN.class);
                break;
        }
        startActivity(intent);
    }


}