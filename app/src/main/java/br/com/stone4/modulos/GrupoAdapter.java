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
import br.com.stone4.criterios.Grupo;

public class GrupoAdapter extends BaseAdapter {

    private Context context;
    private List<Grupo> grupoList;

    public GrupoAdapter(Context context, List<Grupo> grupoList) {
        this.context = context;
        this.grupoList = grupoList;
    }

    @Override
    public int getCount() {
        return grupoList != null ? grupoList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public String getItemName(int position) {
        return grupoList.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View rootView = LayoutInflater.from(context).inflate(R.layout.item_grupos, viewGroup, false);

        TextView txtName = rootView.findViewById(R.id.tv_nameGrupo);
        ImageView image = rootView.findViewById(R.id.img_iconGrupo);

        txtName.setText(grupoList.get(position).getId());
        image.setImageResource(grupoList.get(position).getImage());

        return rootView;
    }
}
