package com.funciones.java.kernel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

;

public class SenteciasSQL {
	private int estado;
	private static  Connection conexion = null;
	
	public SenteciasSQL() {
		// TODO Auto-generated constructor stub
	}
	public void  AltaBBDD(String url, String Usuario , String Pasword ){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
	  		   System.out.println(" driver ");

         // sSe registra el Driver de MySQL
        /*  String url = "jdbc:mysql://localhost:3306/negocio?autoReconnect=true&useSSL=false"; */
		
			conexion = DriverManager.getConnection(url,  Usuario ,  Pasword);
		}  catch (Exception e)
		{
				System.out.println(" Error de base de datos   ");
					e.printStackTrace();
     
		}


        
	}
   

     
	public int  BuscarIP(String  direccionIP)  
	{    
         estado = -1;
 
		 try { 
			 
	        
			 String sql = "select * from negocio.registroentrada ";
			 sql =  sql + "where ip = '" + direccionIP  +  "'"  +  " order by  Version desc  ";
			 
   		   System.out.println(" metodo BuscarIP  IP  : " + direccionIP   + "  Sql : "  + sql);
 		
	//	  Connection  c1  = db.GetConexion();
   	//	   stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

   		   java.sql.Statement s = this.conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
			 ResultSet rs = s.executeQuery (sql);
             Boolean   Filas =  rs.next();
             int   N =  rs.getRow();  
             
	 	 //System.out.println(" filas rs.next 1:  " + rs.getRow()   );
	 	 //	System.out.println(" filas rs.next :  " +  Filas );
	 	 //	System.out.println(" filas rs.next :  " +  N );
		 	 	
	 	 	
   // Recorremos el resultado, mientras haya registros para leer, y escribimos el resultado en pantalla. 
	
	 	 	if ( N>0) 
			  	{
		          System.out.println (rs.getString (1) + "/" + rs.getString (2) +  "/" + rs.getString (3) + "/"  +  rs.getString (4)     ); 
				  
				     estado  = rs.getInt(4);
			         
		        	    /*
		             rs.moveToInsertRow();
		             rs.update
		             rs.updateString("PRODUCT", "Charger");
		             rs.updateString("PRICE", "1800");
		             rs.insertRow();
		             rs.moveToCurrentRow();
		             System.out.println("Row Inserted");
		             
		             */
		             
		             
		             
		             
			        // first column of the insert row to be AINSWORTH
				   //    rs.updateInt(2,35); // updates the second column to be 35
				   //    rs.updateBoolean(3, true); // updates the third column to true
				 //  rs.insertRow();

			 	}
            
      
			 	
		}  catch (Exception e)
		 		{
			    System.out.println(" Error de base de datos   ");
	 		    e.printStackTrace();
			    estado = -2;
	 		    return estado;

	    }
		 
		 
		
		return estado ;


	}
	
    
	public int  InsertarIP(String  Ip, int Version ) {

	 
	   try  {      	
	  Statement  st = (Statement) this.conexion.createStatement();		   
//	   st.executeUpdate("INSERT INTO contacto (nombre, apellidos, telefono) VALUES ('"+nombres[i]+"','"+apellidos[i]+"','"+telefonos[i]+"' )");

	  //  Sentencias 
	  
//	  String SQLinsert =  "INSERT INTO negocio.registroentrada (ipdireccion, fecha, usuario, clave, serie, comentarios)  "
//	  + " VALUES ('ORSIE61', '2019-12-01', 'PRUEBA', '10', 22, '30')"; 
	
	  //java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
	  //java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
	  
 
	  
	  java.util.Date utilDate = new java.util.Date(); //fecha actual
	  long lnMilisegundos = utilDate.getTime();
	   
	  
	  java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
	  java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
	  String Hora =   sqlTime.toString();
	  
	  
	  System.out.println("util.Date: "+ sqlDate );
	

	  
	  
	  String SQLinsert =  "INSERT INTO negocio.registroentrada (nombre, DNI, IP, Version ,FechaAlta , HoraAlta )  "  + 
         			     " VALUES ('ANDREW', '22016333', "   + 
			              "'"  +   Ip          + "'," + 
			                       Version     + ","  + 		               	               
			               "'" +  sqlDate      + "','"  +
			                      Hora         + "'"  + " )";
      
	  
	System.out.println("sqlinsert   " + SQLinsert );		  
	  st.executeUpdate(	SQLinsert);

    	}  catch (Exception e)
	    {
		   e.printStackTrace();
	    }
	return 0;
    
  }	  		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String url = "jdbc:mysql://localhost:3306/negocio?autoReconnect=true&useSSL=false"; 
	    String usuario = "root";
	     String pasword = "point2020";
	//    String pasword = "falso";
    //		 BaseDatos db = null;

	    String Ip      =  "69";
	    int retorno = 0;  
        SenteciasSQL  s1   = new SenteciasSQL();
	     s1.AltaBBDD(url , usuario, pasword  );

	    		try {
	
	   	     //db = new BaseDatos();
		     //BaseDatos.Conectar(url , usuario, pasword  );
		      //    db.bdsentencia();
	                
		     int  resultado =  s1.BuscarIP(Ip);	        		
		        		   
		     if ( resultado  ==  -1  ) {
		    	retorno =  s1.InsertarIP(  Ip , 0 );   	      
	
			   System.out.println(" Alta inicial ");
		     } else {
			 	resultado = resultado + 1;   
		   	    retorno = s1.InsertarIP(  Ip ,resultado  );   	      
	 		    System.out.println(" Version  : " + retorno );
	
		     };
			   
	
		 } catch (Exception e) {
		            System.out.println("Excepcion capturada ");
		        	e.printStackTrace();
		 }
	
	}
}
