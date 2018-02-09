/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
/*import java.sql.DriverManager;*/

/**
 * Abre y mantiene una conexion con la base de datos
 * @author Jose
 */
public class Db {
   
    /**
     * Devuelve una conexion con la base de datos y la abre si no estaba abierta.
     * @return  La conexion con la base de datos o null si no se ha podido conectar.
     */
    public static Connection getConexion(){
        Connection con=null;
        try{
            Context ctx=new InitialContext();
            DataSource dts=(DataSource)ctx.lookup("jdbc/Peliculas");
            con=dts.getConnection();
        }
        catch(NamingException ne){
            ne.printStackTrace();
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
        }
        return con;
    }
}
