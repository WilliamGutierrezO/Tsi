/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import clases.conexion;
import Entidades.Productos;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Willy
 */
public class ModelProductos {
         conexion con = new conexion();
         public ArrayList<Productos> getProductos(){
             ArrayList<Productos> listaProductos = new ArrayList<>();
             ResultSet sel = null;
             
             String bus = "SELECT * FROM producto";
             sel = con.query(bus);
           try {
            while (sel.next()) {
                Productos producto = new Productos();
                producto.setId_producto(sel.getInt("id_producto"));
                producto.setId_proveedor(sel.getInt("id_proveedor"));
                producto.setNom_producto(sel.getString("nom_producto"));
                producto.setDetalle_producto(sel.getString("detalle_producto"));
                producto.setMarca_producto(sel.getString("marca_producto"));
                producto.setValor_producto(sel.getInt("valor_producto"));
                producto.setStock_producto(sel.getInt("Stock"));
                listaProductos.add(producto);
            
            }    
            }catch(SQLException ex) {   
            JOptionPane.showMessageDialog(null, con.getMassage(), "select", JOptionPane.INFORMATION_MESSAGE);
        }      
           return listaProductos;
}   
         
}
