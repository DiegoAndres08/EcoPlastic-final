package com.jaimesalebe.ecoplastic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class TareasAdactador extends RecyclerView.Adapter<TareasAdactador.MyViewHolder> {

    TasksFragment context;
    ArrayList<MisTareas> misTareas;

    public TareasAdactador (TasksFragment c, ArrayList<MisTareas> p) {
        context = c;
        misTareas = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context.getActivity()).inflate(R.layout.item_does, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        myViewHolder.titledoes.setText(misTareas.get(i).getTitledoes());
        myViewHolder.descdoes.setText(misTareas.get(i).getDescdoes());
        myViewHolder.datedoes.setText(misTareas.get(i).getDatedoes());

    }

    @Override
    public int getItemCount() {
        return misTareas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titledoes, descdoes, datedoes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descdoes = (TextView) itemView.findViewById(R.id.descdoes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }
}
