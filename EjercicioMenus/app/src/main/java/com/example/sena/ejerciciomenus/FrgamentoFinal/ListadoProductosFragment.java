package com.example.sena.ejerciciomenus.FrgamentoFinal;

import android.os.Bundle;
import android.widget.ListView;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.annotation.Nullable;

import com.example.sena.ejerciciomenus.R;

import java.util.List;

/**
 * Este fragmento representa el detalle de la entrada selecionada en la lista
 */

public class ListadoProductosFragment extends Fragment{

    private ListView lista;

    private List<Producto> productos;
    private Callbacks callback;



    public interface Callbacks {
    public void onProductoSelected(Producto producto);
    }

    //El fragmento ha sido creado
    @Override
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    productos = new ProductoFactory().obtenerProductor();
    }

    //el fragmento se ha ejecutado al activity
    @Override
    public void onAttach (Context context){
    super.onAttach(context);

        try {
            callback = (Callbacks) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.getClass().getName() + " debe implementar la interface Callbacks");
        }
    }
    // el fragment va a cargas su layout, el cual debes}mos especificar

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_listado_productos, container, false);
    }

    // el activity que contiene el fragment ha interrumpido su creacion

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

     //Donde se guardan las entradas de la lista

        lista = (ListView) getView();
        lista.setAdapter(new ProductoAdapter(productos));
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                callback.onProductoSelected((Producto) lista.getItemAtPosition(position));
            }
        });
    }

}





