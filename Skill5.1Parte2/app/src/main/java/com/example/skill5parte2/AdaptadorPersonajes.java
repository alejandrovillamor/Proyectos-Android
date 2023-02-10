package com.example.skill5parte2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {

   ArrayList<PersonajeVo> listaPersonajes;

    public  AdaptadorPersonajes(ArrayList<PersonajeVo> listaPersonajes){
        this.listaPersonajes = listaPersonajes;
    }


    @Override
    public ViewHolderPersonajes onCreateViewHolder( ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listpersonajes,null,false);

        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder( ViewHolderPersonajes holder, int position) {

        holder.etiNombre.setText(listaPersonajes.get(position).getNombre());
        holder.etiInfromacion.setText(listaPersonajes.get(position).getNombre());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {
        TextView etiNombre,etiInfromacion;
        ImageView foto;

        public ViewHolderPersonajes(View itemView) {
            super(itemView);
            etiNombre = (TextView) itemView.findViewById(R.id.idNombre);
            etiInfromacion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
