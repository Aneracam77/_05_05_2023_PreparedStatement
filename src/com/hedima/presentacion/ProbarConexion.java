package com.hedima.presentacion;

import com.hedima.persistencia.AccesoConsulta;
import com.hedima.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarConexion {

    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        AccesoConsulta ac = new AccesoConsulta();
        try {
//            c1.abrirConexion();
            System.out.println(ac.consultarTodos());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
