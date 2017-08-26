package com.example.sena.ejerciciomenus.FrgamentoFinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sena.ejerciciomenus.R;

import java.util.ArrayList;
import java.util.List;

public class ProductoFactory {

    private List<Producto> productos;

    public ProductoFactory () {
        this.productos = new ArrayList<>();
        productos.add(new Producto(1, "Mouse", 12.5, "mouse"));
        productos.add(new Producto(2, "Teclado", 34, "teclado"));
        productos.add(new Producto(3, "Monitor", 120, "monitor"));
        productos.add(new Producto(4, "Cpu", 200, "cpu"));
        productos.add(new Producto(5, "Disco Duro", 46, "discoduro"));
        productos.add(new Producto(6, "Procesador", 190, "procesador"));
        productos.add(new Producto(7, "Fuente", 56, "fuente"));
        productos.add(new Producto(8, "Unidad de Cd", 42, "unidadcd"));
        productos.add(new Producto(9, "Tv", 312, "tv"));
        productos.add(new Producto(10, "Reloj", 56, "reloj"));
        productos.add(new Producto(11, "Auriculares", 10, "auriculares"));

    }

    public List<Producto> obtenerProductor () {return productos; }

}
