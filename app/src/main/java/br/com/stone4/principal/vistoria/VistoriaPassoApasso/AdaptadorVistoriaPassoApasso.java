package br.com.stone4.principal.vistoria.VistoriaPassoApasso;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;

public class AdaptadorVistoriaPassoApasso extends ArrayAdapter<String> {

    //private final Controle_Resultado controle_resultado;
    Context context;
    List iItem;
    List iImages;

    public AdaptadorVistoriaPassoApasso(Context c, ArrayList item, ArrayList numero) {
        super(c, R.layout.activity_passo_apasso_vist_design, item);

        this.context = c;
        this.iItem = item;
        this.iImages = numero;
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        @SuppressLint("ViewHolder") View row = layoutInflater.inflate(R.layout.activity_passo_apasso_vist_design, parent, false);


        CheckedTextView item = row.findViewById(R.id.ct_item);
        item.setCheckMarkDrawable((int)iImages.get(position));

        return row;
    }
}
