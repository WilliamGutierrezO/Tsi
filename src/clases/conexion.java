
package clases;

import java.sql.*;

public class conexion {
    private String db="la_favorita_spa";
    private String url="jdbc:mysql://localhost:3306/"+db;
    private String usuario="root";
    private String pass="";
    private String msg;
    private Connection con;
    private Statement st;

    public conexion(){
        msg=null;
        con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,usuario,pass);
            st=con.createStatement();
            msg="Conexion Exitosa";
            System.out.println(msg);
        }catch (Exception ex){
            msg="Ha ocurrido un error en la conexion: "+ex;
        }
    }
    public String getMassage(){
        return msg;
    }
    public ResultSet query(String SQL){
        ResultSet sel=null;
        try{
            sel=st.executeQuery(SQL);
            //sel.next();
            msg="operacion realizada";
        }catch (SQLException ex){
            msg="Ha ocurrido un error, operacion cancelada";
        }
        return sel;
    }
    public void update(String SQL){
        try{
            st.executeUpdate(SQL);
            msg="operacion realizada correctamente";
        }catch (SQLException ex){
            msg="Ha ocurrido un error"+ex;
        }
    }
    public boolean close(){
        try{
            con.close();
            msg="Desconectado de la BD";
            return true;
        }catch(Exception ex){
            msg= "no se ha podido desconectar de la BD: "+ex;
            return false;
        }
    }
}

