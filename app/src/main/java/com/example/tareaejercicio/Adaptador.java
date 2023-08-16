package com.example.tareaejercicio;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private List<lista> mData;
    private LayoutInflater mInflater;
    private Context context;

    // Constructor: Recibe una lista de elementos y el contexto de la actividad o fragmento
    public Adaptador(List<lista> itemlista, Context context) {
        this.mData = itemlista;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    // Método que devuelve la cantidad de elementos en la lista de datos
    @Override
    public int getItemCount() {
        return mData.size();
    }

    // Método para crear nuevas instancias de ViewHolder (se llama al crear nuevos elementos de la lista)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    // Método para vincular datos de la lista a los elementos del ViewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        lista item = mData.get(position);
        holder.bindData(item); // Llamada al método bindData para configurar los datos en el ViewHolder
    }

    // Método para actualizar los datos en el adaptador y notificar cambios
    public void setItems(List<lista> items) {
        mData = items;
        notifyDataSetChanged(); // Actualiza la vista cuando los datos cambian
    }

    // Clase ViewHolder para mantener referencias a las vistas de cada elemento en la lista
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImagen;
        TextView nombre, ciudad;

        public ViewHolder(View itemView) {
            super(itemView);

            // Inicialización de las vistas del elemento
            iconImagen = itemView.findViewById(R.id.iconImagenView);
            nombre = itemView.findViewById(R.id.txtnombre);
            ciudad = itemView.findViewById(R.id.txtCiudad);
        }

        // Método para configurar los datos de un elemento en el ViewHolder
        void bindData(final lista item) {
            iconImagen.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombre.setText(item.getNombre());
            ciudad.setText(item.getCiudad());
        }
    }
}
