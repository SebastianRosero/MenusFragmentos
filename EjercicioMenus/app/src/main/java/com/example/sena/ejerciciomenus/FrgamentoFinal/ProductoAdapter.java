package com.example.sena.ejerciciomenus.FrgamentoFinal;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sena.ejerciciomenus.R;

import java.lang.reflect.Field;
import java.util.List;


public class ProductoAdapter extends BaseAdapter {

    private List<Producto> productos;
    public ProductoAdapter (List<Producto> contactos ) { this.productos = contactos; }


    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Object getItem(int i) {
        return productos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return productos.get(i).getId();
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view1;

        View view;
        if(convertView == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_producto, viewGroup, false);
        }else {
        view = convertView;
        }

        Producto producto = (Producto) getItem(i);

        TextView description = (TextView) view.findViewById(R.id.producto_descripcion);

        description.setText(producto.getDescription());
        ImageView imagen = (ImageView) view.findViewById(R.id.producto_imagen); //se le modifica y asigna la imagen a cada uno de los menus del producto//
        try {
            Class res = R.drawable.class;
            Field field = res.getField(producto.getImage());
            int drawableId = field.getInt(null);
            imagen.setImageResource(drawableId);

        }
        catch (Exception e) {
            Log.e("MyTag" , "Failure yo get drawable id.", e);

        }                                                                     // aca finaliza la asigancion de las imagenes


        return view;
}
}