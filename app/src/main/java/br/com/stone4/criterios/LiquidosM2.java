package br.com.stone4.criterios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;

import br.com.stone4.R;

public class LiquidosM2 extends AppCompatActivity {

    CheckedTextView checkedTextView;
    Intent intent;
    int check = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liquidos_m2);

    }

    @SuppressLint("NonConstantResourceId")
    public void onClic(View v) {
        checkedTextView = new CheckedTextView(v.getContext());

        intent = getIntent();
        Bundle parametro = intent.getExtras();

        intent.setClass(this, Area.class);




        switch (v.getId()) {
            case R.id.ck_liquidos1:
                //Toast.makeText(LiquidosM2.this, "liquidos 1", Toast.LENGTH_SHORT).show();
                checkedTextView = (CheckedTextView) (findViewById(v.getId()));
                if (checkedTextView.isChecked()){
                    checkedTextView.setChecked(false);
                    check = 0;
                    parametro.remove("liquidos");
                } else {
                    checkedTextView.setChecked(true);
                    parametro.putInt("liquidos", v.getId());
                    checkedTextView = (CheckedTextView) (findViewById(R.id.ck_liquidos2));
                    checkedTextView.setChecked(false);
                    check = 1;
                }
                break;
            case R.id.ck_liquidos2:
                //Toast.makeText(LiquidosM2.this, "liquidos 2", Toast.LENGTH_SHORT).show();
                checkedTextView = (CheckedTextView) (findViewById(v.getId()));
                if (checkedTextView.isChecked()){
                    checkedTextView.setChecked(false);
                    check = 0;
                    parametro.remove("liquidos");
                } else {
                    checkedTextView.setChecked(true);
                    parametro.putInt("liquidos", v.getId());
                    checkedTextView = (CheckedTextView) (findViewById(R.id.ck_liquidos1));
                    checkedTextView.setChecked(false);
                    check = 1;
                }
                break;
            case R.id.ck_produtos1:
                //Toast.makeText(LiquidosM2.this, "produtos 1", Toast.LENGTH_SHORT).show();
                checkedTextView = (CheckedTextView) (findViewById(v.getId()));
                if (checkedTextView.isChecked()){
                    checkedTextView.setChecked(false);
                    check = 0;
                    parametro.remove("produtos");
                } else {
                    checkedTextView.setChecked(true);
                    parametro.putInt("produtos", v.getId());
                    checkedTextView = (CheckedTextView) (findViewById(R.id.ck_produtos2));
                    checkedTextView.setChecked(false);
                    check = 1;
                }
                break;
            case R.id.ck_produtos2:
                //Toast.makeText(LiquidosM2.this, "produtos 2", Toast.LENGTH_SHORT).show();
                checkedTextView = (CheckedTextView) (findViewById(v.getId()));
                if (checkedTextView.isChecked()){
                    checkedTextView.setChecked(false);
                    check = 0;
                    parametro.remove("produtos");
                } else {
                    checkedTextView.setChecked(true);
                    parametro.putInt("produtos", v.getId());
                    checkedTextView = (CheckedTextView) (findViewById(R.id.ck_produtos1));
                    checkedTextView.setChecked(false);
                    check = 1;
                }
                break;
            case R.id.ck_plataforma:
                //Toast.makeText(LiquidosM2.this, "plataforma", Toast.LENGTH_SHORT).show();
                checkedTextView = (CheckedTextView) (findViewById(v.getId()));
                if(checkedTextView.isChecked()) {
                    checkedTextView.setChecked(false);
                    check = 0;
                    parametro.remove("plataforma");
                } else {
                    checkedTextView.setChecked(true);
                    check = 1;
                    parametro.putInt("plataforma", v.getId());
                }
                break;
        }

        intent.putExtras(parametro);

    }

    public void onClicBt(View v) {

        System.out.println("Valor de ck: "+ checkedTextView);

        if(check == 1){

            startActivity(intent);

        } else Toast.makeText(LiquidosM2.this, "Marque uma opção para continuar!", Toast.LENGTH_SHORT).show();

    }
}