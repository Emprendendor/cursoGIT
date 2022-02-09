package com.funciones.java.kernel;

 

public class PruebaClase {
	
	
 
	public PruebaClase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseDatos   db = null;
   
       	String url = "jdbc:mysql://localhost:3306/negocio?autoReconnect=true&useSSL=false"; 
        String usuario = "root";
        String Pas     = "point2020";
	    				   	
	            try {
	            	db = new BaseDatos();
	                BaseDatos.Conectar(url , usuario, Pas   );
	                //BaseDatos.bdsentencia();
	             
	            } catch (Exception e) {
	        		System.out.println(" Error al Conectar la base de datos :  ");
	                e.printStackTrace();
	            } 	

		
	    SenteciasSQL s  = new SenteciasSQL();
        
        String     ip1 = "1";
        int   estado =    s.BuscarIP( ip1);
		  
	   System.out.println(  "buscar ip resultado  "   + estado  );
		
		
		
		
		
		
	}

}
