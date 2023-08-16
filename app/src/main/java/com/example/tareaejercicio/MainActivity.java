package com.example.tareaejercicio;  // Declaración del paquete donde se encuentra la clase

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<lista> elementos;  // Declaración de una lista de elementos del tipo "lista"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Establece el diseño de la actividad

        init();  // Llamada al método init() para inicializar y mostrar la lista de elementos en el RecyclerView
    }

    // Método para inicializar la lista de elementos y configurar el RecyclerView
    public void init(){
        elementos = new ArrayList<>();  // Creación de una nueva lista llamada "elementos"

        // Agregar elementos a la lista
        elementos.add(new lista("Carmen Suyapa", "Comayagua", "#614BC3"));
        elementos.add(new lista("Sofia Hernandez", "San Pedro", "#F94C10"));
        elementos.add(new lista("Cesia Castillo", "Comayagua", "#7A9D54"));
        elementos.add(new lista("Camila Giron", "San Pedro", "#F31559"));
        elementos.add(new lista("Ana Posas", "Comayagua", "#45CFDD"));
        elementos.add(new lista("Alizon Padilla", "Comayagua", "#FF55BB"));

        // Creación de un adaptador personalizado llamado "lista" y se le pasa la lista de elementos y el contexto actual
        Adaptador listaAdapter = new Adaptador(elementos, this);

        // Obtener una referencia al RecyclerView del diseño
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);

        recyclerView.setHasFixedSize(true);  // Establecer un tamaño fijo para las vistas del RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  // Configurar el administrador de diseño (LinearLayoutManager)
        recyclerView.setAdapter(listaAdapter);  // Establecer el adaptador personalizado en el RecyclerView
    }
}