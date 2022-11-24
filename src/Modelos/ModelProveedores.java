/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import clases.conexion;
import Entidades.Proveedores;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
 
public class ModelProveedores {
         conexion con = new conexion();
         public ArrayList<Proveedores> getProveedores(){
             ArrayList<Proveedores> listaProveedores= new ArrayList<>();
        ResultSet sel = null;
        String bus = "SELECT * FROM proveedores";
        sel = con.query(bus);
           try {
            while (sel.next()) {
                Proveedores proveedor = new Proveedores();
                proveedor.setId_proveedor(sel.getInt("id_proveedor"));
                proveedor.setNom_proveedor(sel.getString("nom_proveedor"));
                proveedor.setTelefono_proveedor(sel.getString("tel_proveedor"));
                proveedor.setEmail_proveedor(sel.getString("email_proveedor"));
                listaProveedores.add(proveedor);
            
            }    
            }catch(SQLException ex) {   
            JOptionPane.showMessageDialog(null, con.getMassage(), "select", JOptionPane.INFORMATION_MESSAGE);
        }      
           return listaProveedores;
}   
         
}    

