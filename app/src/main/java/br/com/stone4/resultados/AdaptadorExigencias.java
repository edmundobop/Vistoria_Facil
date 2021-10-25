package br.com.stone4.resultados;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;

public class AdaptadorExigencias extends ArrayAdapter<String> {

    //private final Controle_Resultado controle_resultado;
    Context context;
    List rTitle;
    List sTitle;
    List rImages;
    List Recomend;

    public AdaptadorExigencias(Context c, ArrayList title, ArrayList sTitle, ArrayList mDescription, ArrayList imgs, ArrayList Recomend) {
        super(c, R.layout.arte_resultado, title);

        this.context = c;
        this.rTitle = title;
        this.sTitle = sTitle;
        this.rImages = imgs;
        this.Recomend = Recomend;
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        @SuppressLint("ViewHolder") View row = layoutInflater.inflate(R.layout.arte_resultado, parent, false);

        ImageView images = row.findViewById(R.id.image);
        TextView myTitle = row.findViewById(R.id.txt_main_titulo1);
        TextView myDescription = row.findViewById(R.id.textView2);
        TextView myRecomend = row.findViewById(R.id.tv_Recomend);

        images.setImageResource((int) rImages.get(position));
        myTitle.setText((String) rTitle.get(position));
        myDescription.setText((String) sTitle.get(position));
        myRecomend.setText((String) Recomend.get(position));

        if (myRecomend.getText().equals("Recomendado")){
           myRecomend.setBackgroundResource(R.color.teal_200);
        } else {
            myRecomend.setBackgroundResource(R.color.red_700);
        }


        return row;
    }
}
