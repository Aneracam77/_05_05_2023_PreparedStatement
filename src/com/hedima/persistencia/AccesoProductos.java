package com.hedima.persistencia;

import com.hedima.modelo.Producto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoProductos extends Conexion{

    public Producto mostrarUno(int idProducto) throws SQLException, ClassNotFoundException {
        /*
        1. Declarar variables
        2. Abrir la conexion
        3. Recoger de la conexion del statement
        4. Ejecutar el Statement
        5. Recoger los datos del ResultSet
        6. Cerrar todo
        7. devolver el resultado
         */
        Statement st;
        ResultSet rs;
        Producto resultado = new Producto();
        String sql = "select product_id, product_name, unit_price, units_in_stock from products where product_id = " + idProducto+";";
        abrirConexion();
        st = miConexion.createStatement();
        rs = st.executeQuery(sql);
        if (rs.next()){
            int id = rs.getInt(1); //recoge el product_id
            String nombre = rs.getString(2);
            double precio = rs.getDouble(3);
            int cantidad = rs.getInt(4);
            resultado.setProducto_id(id);
            resultado.setNombre(nombre);
            resultado.setPrecio(precio);
            resultado.setCantidad_existencia(cantidad);
        }
        rs.close();
        st.close();
        cerrar();
        return resultado;


    }

    public List<Producto> mostrarTodos() throws SQLException, ClassNotFoundException {
        /*
        1. Declarar variables
        2. Abrir la conexion
        3. Recoger de la conexion del statement
        4. Ejecutar el Statement
        5. Recoger los datos del ResultSet
        6. Cerrar todo
        7. devolver el resultado
         */
        Statement st;
        ResultSet rs;
        List<Producto> resultado = new ArrayList<>();
        String sql = "select product_id, product_name, unit_price, units_in_stock from products;";
        abrirConexion();
        st = miConexion.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()){
//            int id = rs.getInt(1); //recoge el product_id
//            String nombre = rs.getString(2);
//            double precio = rs.getDouble(3);
//            int cantidad = rs.getInt(4);
//            resultado.setProducto_id(id);
//            resultado.setNombre(nombre);
//            resultado.setPrecio(precio);
//            resultado.setCantidad_existencia(cantidad);
            Producto p = new Producto(rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getInt(4)
                    );
            resultado.add(p);

        }
        rs.close();
        st.close();
        cerrar();
        return resultado;
    }

    public int insertarProducto(Producto p) throws SQLException, ClassNotFoundException {
         /*
        1. Declarar variables
        2. Abrir la conexion
        3. Recoger de la conexion del statement
        4. Ejecutar el Statement
        5. Cerrar todo
        6. devolver el resultado
         */
        PreparedStatement st;

       int resultado;
        String sql = "insert into products (product_id,product_name,discontinued ) values (?,?,?);" ;
        abrirConexion();
        st = miConexion.prepareStatement(sql);
        st.setInt(1,p.getProducto_id());
        st.setString(2, p.getNombre());
        st.setInt(3,1);
        resultado  = st.executeUpdate();

        st.close();
        cerrar();
        return resultado;
    }

    public int insertarProductoPA(Producto p) throws SQLException, ClassNotFoundException {
         /*
        1. Declarar variables
        2. Abrir la conexion
        3. Recoger de la conexion del statement
        4. Ejecutar el Statement
        5. Cerrar todo
        6. devolver el resultado
         */
        CallableStatement st;

        int resultado;
        String sql = "CALL insertar_producto(?, ?, ?);" ;
        abrirConexion();
        st = miConexion.prepareCall(sql);
        st.setInt(1,p.getProducto_id());
        st.setString(2, p.getNombre());
        st.setInt(3,1);
        resultado  = st.executeUpdate();

        st.close();
        cerrar();
        return resultado;
    }

    public int modificarProducto(Producto p) throws SQLException, ClassNotFoundException {
         /*
        1. Declarar variables
        2. Abrir la conexion
        3. Recoger de la conexion del statement
        4. Ejecutar el Statement
        5. Cerrar todo
        6. devolver el resultado
         */
        Statement st;

        int resultado;
        String sql = "update products set unit_price = " +
                p.getPrecio() + " where product_id = " + p.getProducto_id() + ";";

        abrirConexion();
        st = miConexion.createStatement();
        resultado  = st.executeUpdate(sql);

        st.close();
        cerrar();
        return resultado;

    }

    public int eliminarProducto(int id) throws SQLException, ClassNotFoundException {

        /*
        1. Declarar variables
        2. Abrir la conexion
        3. Recoger de la conexion del statement
        4. Ejecutar el Statement
        5. Cerrar todo
        6. devolver el resultado
         */
        Statement st;

        int resultado;
        String sql = "delete from products where product_id =" +
                 id + ";";

        abrirConexion();
        st = miConexion.createStatement();
        resultado  = st.executeUpdate(sql);

        st.close();
        cerrar();
        return resultado;

    }
}
