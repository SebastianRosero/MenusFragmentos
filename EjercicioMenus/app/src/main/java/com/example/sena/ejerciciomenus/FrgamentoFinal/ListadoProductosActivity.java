package com.example.sena.ejerciciomenus.FrgamentoFinal;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import com.example.sena.ejerciciomenus.R;



public class ListadoProductosActivity extends FragmentActivity implements ListadoProductosFragment.Callbacks {

    private  boolean esDoblePanel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_lista);

        if (findViewById(R.id.producto_detail_container) !=null) {

            esDoblePanel = true;

        }
    }
    @Override
    public void onProductoSelected (Producto producto) {

        if (esDoblePanel) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.producto_detail_container, DetalleProductoFragment.newInstance(producto))
                .commit();

        } else {
            Intent detailIntent = new Intent(this, DetalleProductoActivity.class);
            detailIntent.putExtra(DetalleProductoFragment.ID, producto.getId());
            detailIntent.putExtra(DetalleProductoFragment.DESCRIPCION, producto.getDescription());
            detailIntent.putExtra(DetalleProductoFragment.PRECIO, producto.getPrice());
            detailIntent.putExtra(DetalleProductoFragment.IMAGEN, producto.getImage());

            startActivity(detailIntent);
        }
    }
}

