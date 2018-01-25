package com.javi.pell.listvier_adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by javier on 25/1/18.
 */

public class AnimalesAdapter extends ArrayAdapter
{
    Context context;
    ArrayList<Animal> datos;

    public AnimalesAdapter(Context context, ArrayList datos)
    {
        super(context, R.layout.item_listview, datos);
        this.context = context;
        this.datos = datos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        AnimalesHolder holder;
        View item = convertView;

        if (item == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            item = inflater.inflate(R.layout.item_listview, null);

            holder = new AnimalesHolder();
            holder.imgAnimal = item.findViewById(R.id.imgAnimal);
            holder.tvContent = item.findViewById(R.id.tvContent);
            holder.tvField = item.findViewById(R.id.tvField);

            item.setTag(holder);
        }

        holder = (AnimalesHolder) item.getTag();

        holder.imgAnimal.setImageResource(datos.get(position).getDrawableImagenID());
        holder.tvContent.setText(datos.get(position).getNombre());
        holder.tvField.setText(String.valueOf(position));

        /*LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_listview, null);

        ImageView imagen = item.findViewById(R.id.imgAnimal);
        imagen.setImageResource(datos.get(position).getDrawableImagenID());
        TextView nombre = item.findViewById(R.id.tvContent);
        nombre.setText(datos.get(position).getNombre());
        TextView numCelda = item.findViewById(R.id.tvField);
        numCelda.setText(String.valueOf(position));
        */

        return item;
    }
}
