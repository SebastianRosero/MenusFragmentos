package com.example.sena.ejerciciomenus.FrgamentoFinal;


public class Producto {

        private int id;
        private String description;
        private double price;
        private String image;

    public Producto(int id, String nombre, double precio, String apellido) {
        this.id = id;
        this.description = nombre;
        this.price = precio;
        this.image = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
