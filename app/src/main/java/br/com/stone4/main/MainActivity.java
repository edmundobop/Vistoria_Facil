package br.com.stone4.main;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import com.google.android.material.snackbar.Snackbar;

import br.com.stone4.R;
import br.com.stone4.main.vistoria.CertiPreviaPassoApasso;
import eu.dkaratzas.android.inapp.update.Constants;
import eu.dkaratzas.android.inapp.update.InAppUpdateManager;
import eu.dkaratzas.android.inapp.update.InAppUpdateStatus;

public class MainActivity extends AppCompatActivity implements InAppUpdateManager.InAppUpdateHandler{

    private ActionBarDrawerToggle actionBarDrawerToggle;
    InAppUpdateManager inAppUpdateManager;
    private Intent intent;

    // Menu da barra supeior
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int item_id = item.getItemId();

        if (item_id == R.id.avaliar){
            Toast.makeText(this,"Botão d avaliar", Toast.LENGTH_SHORT).show();
            try {
                Uri uri = Uri.parse("market://details?id=" +
                        getPackageName());

                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            } catch (ActivityNotFoundException e){
                Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" +getPackageName());
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bundle parametros = new Bundle();

        CardView card1 = (CardView) findViewById(R.id.card1);
        CardView card2 = (CardView) findViewById(R.id.card2);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            parametros.putString("perfil","perfil1");

            intent = new Intent(getApplicationContext(), Vistorias.class);
            intent.putExtras(parametros);
            startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            parametros.putString("perfil","perfil2");

            intent = new Intent(getApplicationContext(), Vistorias.class);
            intent.putExtras(parametros);
            startActivity(intent);
            }
        });



       // Método de Update
        inAppUpdateManager = InAppUpdateManager.Builder(this,7)
                .resumeUpdates(true)
                .mode(Constants.UpdateMode.IMMEDIATE)
                .snackBarAction("Uma atualização foi baixada.")
                .handler(this);

        inAppUpdateManager.checkForAppUpdate();
    }

    @Override
    public void onInAppUpdateError(int code, Throwable error) {

    }

    @Override
    public void onInAppUpdateStatus(InAppUpdateStatus status) {
        if (status.isDownloaded()){
            View view = getWindow().getDecorView().findViewById(android.R.id.content);
            Snackbar snackbar = Snackbar.make(view,
                    "Uma atualização foi baixada.",
                    Snackbar.LENGTH_INDEFINITE);

            snackbar.setAction("", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    inAppUpdateManager.completeUpdate();
                }
            });

            snackbar.show();
        }
    }
}
/*

    problemas a resolver:
    - grupo C - SPDS - criar tela perguntando se possui deposito GLP – Áreas destinadas a depósitos de GLP devem possuir SPDA de acordo com as orientações da NT-40;
    - grupo E - Detecção e Alarme de Incêndio - tabela 6E

    ideias e/ou melhorias:
    - otimizar escolhas - ex: divisão e1 c/ altura > 4 nao precisa perguntar se tem alojamentos
    - otimizar divisao f8 - nao precisa pedir pavimento com altura >= 3
    - otimizar divisão g5/g6 - brigada - somente para quem tem sistema de resfriamento ou espuma
    - colocar lista de exigencias exclusivas - quando olhar posso rolar pro lado e elas somem
    - calculo Carga de Incêndio (CI)
    - incluir menu de exigencias especificas no menu de vistorias
    - incluir menu para baixar ou mostrar pdfs do site: todos relacionados a vistoria
    - no menu de altura, colocar o bizu de como medir - ex: começa a medir no teto
    - madequar os títulos das activitis
    - passo a passo de como fazer uma vistoria: desde organizar os processos até lançar no sistema: com fotos

    - menu resultado contendo:
        - resumo das escolhas feitas
        - carga de incêndio
        - exigências

    Observações:
    - Divisao f4 não testada - motivo: fora da nossa realidade

    Alterações:
    Dia 11/08/21 - Quarta
    - Correção Descrição Normas Técnicas
    - Implementação aviso de Recomendado ou Exigência no painel de Resultado
    - Implementação do Visualizador de PDF da Classe Detalhes de Vistorias
    - Implementação de Opção de COnsulta Rápida


     */

