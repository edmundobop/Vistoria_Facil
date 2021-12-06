package br.com.stone4.main;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import com.google.android.play.core.tasks.OnSuccessListener;

import br.com.stone4.R;
import br.com.stone4.main.vistoria.CertiPreviaPassoApasso;
import eu.dkaratzas.android.inapp.update.Constants;
import eu.dkaratzas.android.inapp.update.InAppUpdateManager;
import eu.dkaratzas.android.inapp.update.InAppUpdateStatus;

public class MainActivity extends AppCompatActivity{

    private ActionBarDrawerToggle actionBarDrawerToggle;
    private AppUpdateManager appUpdateManager;
    private static final int RC_APP_UPDATE = 100;
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

                parametros.putString("perfil", "perfil1");

                intent = new Intent(getApplicationContext(), Vistorias.class);
                intent.putExtras(parametros);
                startActivity(intent);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                parametros.putString("perfil", "perfil2");

                intent = new Intent(getApplicationContext(), Vistorias.class);
                intent.putExtras(parametros);
                startActivity(intent);
            }
        });

        // Método Update
        appUpdateManager = AppUpdateManagerFactory.create(this);
        appUpdateManager.getAppUpdateInfo().addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() {
            @Override
            public void onSuccess(AppUpdateInfo result) {
                if(result.updateAvailability()  == UpdateAvailability.UPDATE_AVAILABLE
                        && result.isUpdateTypeAllowed(AppUpdateType.FLEXIBLE))
                {
                    try {
                        appUpdateManager.startUpdateFlowForResult(result,AppUpdateType.FLEXIBLE, MainActivity.this,
                                RC_APP_UPDATE);
                    } catch (IntentSender.SendIntentException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        appUpdateManager.registerListener(installStateUpdatedListener);
    }

    private InstallStateUpdatedListener installStateUpdatedListener = new InstallStateUpdatedListener() {
        @Override
        public void onStateUpdate(@NonNull InstallState state) {
            if (state.installStatus() == InstallStatus.DOWNLOADED) {
                showCompleteUpdate();
            }
        }
    };

    @Override
    protected void onStop()
    {
        if(appUpdateManager != null) appUpdateManager.unregisterListener(installStateUpdatedListener);
        super.onStop();
    }

    private void showCompleteUpdate()
    {
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Existe uma nova Atualização do APP!",
                Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Instalar", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appUpdateManager.completeUpdate();
            }
        });
        snackbar.show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        if(requestCode == RC_APP_UPDATE && resultCode != RESULT_OK)
        {
            Toast.makeText(this,"Cancelado",Toast.LENGTH_SHORT).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
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

