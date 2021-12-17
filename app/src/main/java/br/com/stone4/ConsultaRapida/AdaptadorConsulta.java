package br.com.stone4.ConsultaRapida;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.R;

public class AdaptadorConsulta extends BaseAdapter implements Filterable {

    Context context;
    private List<MedidaDeSeguranca> medidasListFull;
    private List<MedidaDeSeguranca> medidasList;

    public AdaptadorConsulta(Context context, List<MedidaDeSeguranca> medidasList) {
        this.medidasList = medidasList;
        medidasListFull = new ArrayList<>(medidasList);
        this.context = context;
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

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            List<MedidaDeSeguranca> filteredList = new ArrayList<>();

            if (charSequence.toString().isEmpty()) {
                filteredList.addAll(medidasListFull);
            } else {
                String filterPattern = charSequence.toString().toLowerCase().trim();

                for (MedidaDeSeguranca item : medidasListFull) {
                    if (item.getTitle().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            medidasList.clear();
            medidasList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }
}
