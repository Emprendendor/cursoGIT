package com.funciones.java.kernel;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

 


public class EjemploInsertar 
//public class JDBC_ResultSet
{
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
  static final String dburl = "jdbc:mysql://localhost/STOREDB";    
  static final String dbuser = "root";
  static final String dbpass = "root";
  
 
	
	public EjemploInsertar() {
		// TODO Auto-generated constructor stub
	}	
	
	public static void main(String[] args)
{
Connection con = null;
Statement stmt = null;
/*
try 
{

	
	BaseDatos   db = null;
	   
   	String url = "jdbc:mysql://localhost:3306/negocio?autoReconnect=true&useSSL=false"; 
    String usuario = "root";
    String Pas     = "point2020";
    				   	
            try {
            	db = new BaseDatos();
                BaseDatos.Conectar(url , usuario, Pas   );
                BaseDatos.sentencia();
             
            } catch (Exception e) {
        		System.out.println(" Error al Conectar la base de datos :  ");
                e.printStackTrace();
      //Step 2 : Initialize Statement
   stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
   //Step 3 : SQL Query
   String query="SELECT * FROM ITEM";
   
   //Step 4 : Run Query In ResultSet
   ResultSet rset = stmt.executeQuery(query);
   	    
   rset.moveToInsertRow();
   rset.updateString("PRODUCT", "Charger");
   rset.updateString("PRICE", "1800");
   rset.insertRow();
   rset.moveToCurrentRow();
   System.out.println("Row Inserted");
*/
 

/*
catch (SQLException e) 
{
   System.err.println("Cannot connect ! ");
   e.printStackTrace();
}

finally {
   System.out.println("Closing the connection.");
   if (con != null) try { con.close(); } catch (SQLException ignore) {}
}


*/

}

}

