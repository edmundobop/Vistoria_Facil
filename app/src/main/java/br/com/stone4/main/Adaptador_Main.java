package br.com.stone4.main;

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

public class Adaptador_Main extends ArrayAdapter<String> {

    //private final Controle_Resultado controle_resultado;
    Context context;
    List titulo;
    List subTitulo;
    List imagem;

    public Adaptador_Main(Context c, ArrayList titulo, ArrayList subTitulo, ArrayList imagem) {
        super(c, R.layout.activity_main_menu, titulo);

        this.context = c;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.imagem = imagem;
    }

    @SuppressLint("ResourceAsColor")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) this.context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        @SuppressLint("ViewHolder") View row = layoutInflater.inflate(R.layout.activity_main_menu, parent, false);

        ImageView images = row.findViewById(R.id.img_main);
        TextView myTitle = row.findViewById(R.id.txt_vist_option_titulo);
        TextView myDescription = row.findViewById(R.id.txt_main_sutitulo);

        images.setImageResource((int) imagem.get(position));
        myTitle.setText((String) titulo.get(position));
        myDescription.setText((String) subTitulo.get(position));

        return row;
    }
}
