package com.funciones.java.kernel;

import com.mysql.jdbc.Statement;
import java.sql.*;

 
public class BaseDatos {
 
    public   static  Connection   conexion = null;     

    public   static  int         numero  ;     
/** 
    * Crea una instancia de la clase MySQL y realiza todo el código 
    * de conexión, consulta y muestra de resultados.
    */

    public          BaseDatos ()   throws Exception {
        numero  =  numero + 1;
     	System.out.println(" Clase BaseDatos1 : " + numero );
     Class.forName("com.mysql.jdbc.Driver");
      System.out.println(" Clase BaseDatos 2: " + numero ); 
    }
    public  static  void  Conectar(String url, String Usuario , String Pasword )  throws Exception
   {
       // Se mete todo en un try por los posibles errores de MySQL     
	  numero = numero  + 1;      
	//	try
      
    	 /*  Class.ForName("com.mysql.jdbc.Driver").newInstance(); 
    	  */
	     	System.out.println(" Clase BaseDatos1 : " + numero );
	     Class.forName("com.mysql.jdbc.Driver");
          System.out.println(" Clase BaseDatos 2: " + numero ); 
          // Se registra el Driver de MySQL
         /*  String url = "jdbc:mysql://localhost:3306/negocio?autoReconnect=true&useSSL=false"; */
    
           conexion = DriverManager.getConnection(url,  Usuario ,  Pasword);

           System.out.println(" Clase BaseDatos conectado"); 
            
   }
   
   /**
    * Método principal, instancia una clase PruebaMySQL
    *
    * @param args the command line arguments
    */


    public   void close(){
        if(this.conexion  != null){
            try {
                this.conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public static void bdsentencia() 
    {
    		   
    		// Preparamos la consulta 
    		 
      try { 
    	  
    	       String   SqlConsulta ="select * from negocio.registroentrada";
      
    		   Statement s = (Statement) conexion.createStatement(); 
    
    		   ResultSet rs = s.executeQuery(SqlConsulta);
               System.out.println(" Metodo BaseDatosjava.sentencia :   " +  SqlConsulta);
               
            // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
               while (rs.next()) 
               { 
                   System.out.println(" registro  ");
                   System.out.println (rs.getString (1) + " " + rs.getString (2)   ); 
               }
               
               
               
      }  catch (Exception e)
      {
    	   e.printStackTrace();
    	}

         
      
    		   
    		   
    }
    
    /*

    Properties properties = new Properties();
    properties.setProperty("user", "root");
    properties.setProperty("password", "milos23);
    properties.setProperty("useSSL", "false");
    properties.setProperty("autoReconnect", "true");

    try (Connection conn = DriverManager.getConnection(connectionUrl, properties)) {
    ...
    } catch (SQLException e) {
    ...
    }
   
   connectionString = "jdbc:mysql://{server-name}:3306/%s?useUnicode=yes&characterEncoding=UTF-8&useSSL=false
   <property name="connection.url">jdbc:mysql://hostname:3306/hibernatedb?autoReconnect=true&amp;useSSL=false</property>
 
 <property>
   <name>javax.jdo.option.ConnectionURL</name>
   <value>jdbc:mysql://localhost/metastore?createDatabaseIfNotExist=true&amp;autoReconnect=true&amp;useSSL=false</value>
   <description>metadata is stored in a MySQL server</description>
</property>

 
   */
  
        
    
}









