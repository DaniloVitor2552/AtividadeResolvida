package br.com.danilo.drawerlayout.atividaderesolvida;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder{

    public ImageView imagemArtigo;
    public TextView titulo;
    public TextView desc;
    public Button btnLer;


    public ViewHolder(View itemView) {
        super(itemView);
        imagemArtigo = itemView.findViewById(R.id.imagemArtigo);
        titulo = itemView.findViewById(R.id.titulo);
        desc = itemView.findViewById(R.id.desc);
        btnLer = itemView.findViewById(R.id.btn_ler);
    }
}
