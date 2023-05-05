package com.hedima.presentacion;

import com.hedima.modelo.Producto;
import com.hedima.persistencia.AccesoConsulta;
import com.hedima.persistencia.AccesoProductos;
import com.hedima.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarConexion {

    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        AccesoConsulta ac = new AccesoConsulta();
        AccesoProductos ap = new AccesoProductos();
        try {
//            c1.abrirConexion();
//            System.out.println(ac.consultarTodos());
//            System.out.println(ac.consultaUno(1));
//            System.out.println("Cuantos registros se han insertado -> " + ap.insertarProducto(new Producto(81,"Desde java",20,50)));
            System.out.println("Cuantos registros se han insertado -> " + ap.insertarProductoPA(new Producto(84,"Desde java PA",20,50)));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
