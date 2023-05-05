package com.hedima.modelo;

public class Consulta {
    private int idProducto;
    private String nombreProducto;
    private int idCategoria;
    private String nombreCategoria;

    @Override
    public String toString() {
        return "Consulta{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", idCategoria=" + idCategoria +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                '}' + "\n";
    }

    public Consulta() {
    }

    public Consulta(int idProducto, String nombreProducto, int idCategoria, String nombreCategoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
