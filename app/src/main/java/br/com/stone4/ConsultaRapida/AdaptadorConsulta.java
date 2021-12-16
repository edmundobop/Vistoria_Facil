package br.com.stone4.ConsultaRapida;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.stone4.R;
import br.com.stone4.criterios.Divisao;

public class AdaptadorConsulta extends BaseAdapter {

    private Context context;
    private List<MedidaDeSeguranca> medidasList;

    public AdaptadorConsulta(Context context, List<MedidaDeSeguranca> medidasList) {
        this.context = context;
        this.medidasList = medidasList;
    }

    @Override
    public int getCount() {
        return medidasList != null ? medidasList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        @SuppressLint("ViewHolder") View rootView = LayoutInflater.from(context).inflate(R.layout.arte_resultado, viewGroup, false);

        ImageView image = rootView.findViewById(R.id.image);
        TextView title = rootView.findViewById(R.id.txt_main_titulo1);
        TextView subTitle = rootView.findViewById(R.id.textView2);
        TextView recomend = rootView.findViewById(R.id.tv_Recomend);

        image.setImageResource(medidasList.get(position).getImage());
        title.setText(medidasList.get(position).getTitle());
        subTitle.setText(medidasList.get(position).getSubTitle());
        recomend.setText(medidasList.get(position).getRecomend());

        return rootView;
    }

    public void filterList(ArrayList<MedidaDeSeguranca> filteredList){

        medidasList = filteredList;
        notifyDataSetChanged();
    }
}
