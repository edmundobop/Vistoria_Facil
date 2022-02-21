package br.com.stone4.main.vistoria.perguntas_frequentes;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.stone4.ConsultaRapida.MedidaDeSeguranca;
import br.com.stone4.R;

public class PerguntasAdaptador extends RecyclerView.Adapter<PerguntasAdaptador.PerguntaVH> implements Filterable {

    List<Perguntas> listaPerguntasFull;
    List<Perguntas> listaPerguntas;
    LinearLayout linearLayout;
    RelativeLayout layoultExpansivel;

    public PerguntasAdaptador(List<Perguntas> listaPerguntas) {
        this.listaPerguntas = listaPerguntas;
        listaPerguntasFull = new ArrayList<>(listaPerguntas);

    }

    @NonNull
    @Override
    public PerguntaVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_perguntas_frequentes_row,parent,false);
        return new PerguntaVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PerguntaVH holder, int position) {

        Perguntas perguntas = listaPerguntas.get(position);

        holder.perguntaTxt.setText(perguntas.getPergunta());
        holder.respostaTxt.setText(perguntas.getResposta());

        boolean isExpansivel = listaPerguntas.get(position).isExpansivel();
        holder.layoultExpansivel.setVisibility(isExpansivel ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return listaPerguntas.size();
    }

    public class PerguntaVH extends RecyclerView.ViewHolder {

        TextView perguntaTxt, respostaTxt;
        LinearLayout linearLayout;
        RelativeLayout layoultExpansivel;

        public PerguntaVH(@NonNull View itemView) {
            super(itemView);

            perguntaTxt = itemView.findViewById(R.id.pergunta);
            respostaTxt = itemView.findViewById(R.id.resposta);

            linearLayout = itemView.findViewById(R.id.linear_layoult);
            layoultExpansivel = itemView.findViewById(R.id.expansivel_layoult);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Perguntas perguntas = listaPerguntas.get(getAbsoluteAdapterPosition());
                    perguntas.setExpansivel(!perguntas.isExpansivel());
                    notifyItemChanged(getAbsoluteAdapterPosition());
                }
            });

            linearLayout.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    return false;
                }
            });
        }
    }

    private Filter exampleFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {

            List<Perguntas> filteredList = new ArrayList<>();

            if (charSequence.toString().isEmpty()) {
                filteredList.addAll(listaPerguntasFull);
            } else {
                String filterPattern = charSequence.toString().toLowerCase().trim();

                for (Perguntas item : listaPerguntasFull) {
                    if (item.getPergunta().toLowerCase().contains(filterPattern) || item.getResposta().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @SuppressLint("NotifyDataSetChanged")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            listaPerguntas.clear();
            listaPerguntas.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    @Override
    public Filter getFilter() {
        return exampleFilter;
    }
}
