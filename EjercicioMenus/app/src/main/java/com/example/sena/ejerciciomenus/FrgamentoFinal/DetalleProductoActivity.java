package com.example.sena.ejerciciomenus.FrgamentoFinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sena.ejerciciomenus.R;

public class DetalleProductoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_detail);

        if (savedInstanceState == null ) {
        Producto producto = new Producto(
        getIntent().getIntExtra(DetalleProductoFragment.ID, 0),
        getIntent().getStringExtra(DetalleProductoFragment.DESCRIPCION),
        getIntent().getDoubleExtra(DetalleProductoFragment.PRECIO, 0),
        getIntent().getStringExtra(DetalleProductoFragment.IMAGEN));

        getSupportFragmentManager().beginTransaction()
                .add(R.id.producto_detail_container, DetalleProductoFragment.newInstance(producto))
                .commit();
        }
    }
}