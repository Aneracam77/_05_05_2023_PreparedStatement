package com.hedima.modelo;

public class Producto {

    private int producto_id;
    private String nombre;
    private double precio;
    private int cantidad_existencia;


    @Override
    public String toString() {
        return "Producto{" +
                "producto_id=" + producto_id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad_existencia=" + cantidad_existencia +
                '}'+"\n";
    }

    public Producto() {
    }

    public Producto(int producto_id, String nombre, double precio, int cantidad_existencia) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_existencia = cantidad_existencia;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad_existencia() {
        return cantidad_existencia;
    }

    public void setCantidad_existencia(int cantidad_existencia) {
        this.cantidad_existencia = cantidad_existencia;
    }
}
