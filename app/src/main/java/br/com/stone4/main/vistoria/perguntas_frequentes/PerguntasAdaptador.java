package br.com.stone4.main.vistoria.perguntas_frequentes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.stone4.R;

public class PerguntasAdaptador extends RecyclerView.Adapter<PerguntasAdaptador.PerguntaVH> {

    List<Perguntas> listaPerguntas;
    LinearLayout linearLayout;
    RelativeLayout layoultExpansivel;

    public PerguntasAdaptador(List<Perguntas> listaPerguntas) {
        this.listaPerguntas = listaPerguntas;
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
        }
    }
}
