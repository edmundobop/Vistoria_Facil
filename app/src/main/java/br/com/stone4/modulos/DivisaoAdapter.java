package br.com.stone4.modulos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.stone4.R;
import br.com.stone4.criterios.Divisao;

public class DivisaoAdapter extends BaseAdapter {

    private Context context;
    private List<Divisao> divisaoList;

    public DivisaoAdapter(Context context, List<Divisao> divisaoList) {
        this.context = context;
        this.divisaoList = divisaoList;
    }

    @Override
    public int getCount() {
        return divisaoList != null ? divisaoList.size() : 0;
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
        View rootView = LayoutInflater.from(context).inflate(R.layout.item_divisao, viewGroup, false);

        TextView txtName = rootView.findViewById(R.id.tv_nameDivisao);
        ImageView image = rootView.findViewById(R.id.img_iconDivisao);

        txtName.setText(divisaoList.get(position).getId());
        image.setImageResource(divisaoList.get(position).getImage());

        return rootView;
    }
}
