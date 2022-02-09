package com.Pensamientocritico.Servlet;





import javax.servlet.*;


import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.funciones.java.kernel.*;



/**
 * Servlet implementation class login

@WebServlet("/login")
 */


public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
     BaseDatos   db = null;
  	 private SenteciasSQL s;
  	 String Mensaje = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        Mensaje 	= "Paso por login";
	
        String url = "jdbc:mysql://localhost:3306/negocio?autoReconnect=true&useSSL=false"; 
	    String usuario = "root";
	     String pasword = "point2020";
	     
		  System.out.println("Entrada");	 
        SenteciasSQL  s1   = new SenteciasSQL();
	     s1.AltaBBDD(url , usuario, pasword  );    
	     
		  System.out.println("Entrada  sigo");	 
	     
  /*
       
        	String url = "jdbc:mysql://localhost:3306/negocio?autoReconnect=true&useSSL=false"; 
            String usuario = "root";
            String Pas     = "point2020";
            
            String ip = null; // IP del cliente
            String host = null; // Host del cliente

             				   	
            try {
            	BaseDatos  db = new BaseDatos();
                BaseDatos.Conectar(url , usuario, Pas   );
 //             BaseDatos.bdsentencia();
             
            } catch (Exception e) {
        		System.out.println(" Error al Conectar la base de datos :  ");
                e.printStackTrace();
            } 	
    */
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
 
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    int retorno  = 0;
	    int estado  = 0;

		  java.util.Date utilDate = new java.util.Date(); //fecha actual
		  long lnMilisegundos = utilDate.getTime();
		  
		  java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
		  
		  java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(lnMilisegundos);
	 	  
		  System.out.println("mensajes " + Mensaje + " **   util.Date: "+ utilDate);	  
		  String  IPrequest = null; // IP del cliente
		  String host1 = null; // Host del cliente

		  IPrequest  = request.getRemoteAddr();
		  host1      = request.getRemoteHost();
		 
		  System.out.println( " Hora : "  + sqlTimestamp +  " Ip : " + IPrequest  + "  host  "  + host1 + " ContextPath : " +  request.getContextPath()  );

		  
		  
 	     request.getRequestDispatcher("/Logeado.jsp").forward(request, response);
	     response.getWriter().append("Served at: ").append(request.getContextPath()); 
		
		//System.out.println("Servlet entrada metodo Pget ;Holas");
		  //  System.out.println("sql.Date: "+ sqlDate);
		//  System.out.println("sql.Time: "+ sqlTime);
		//  System.out.println("sql.Timestamp: "+sqlTimestamp);
	 
		 
		  IPrequest  = request.getRemoteAddr();
		  host1 = request.getRemoteHost();
		 
		  System.out.println( " Hora : "  + sqlTimestamp +  " Ip : " + IPrequest  + "  host  "  + host1 + " ContextPath : " +  request.getContextPath() );
		 
			
		   SenteciasSQL s = new SenteciasSQL();
		  estado =    s.BuscarIP( IPrequest );
		  
		  
		  System.out.println(  "buscar ip resultado  "   + estado  );
	  
		   if ( estado   ==  -1  ) {
		    	retorno =  s.InsertarIP( IPrequest , 0 );   	      

			   System.out.println("Registro Inicial ");
		     } else {
		    	 estado = estado  + 1 ;
		   	    retorno = s.InsertarIP( IPrequest ,estado   );   	      
       		   System.out.println("Registro Version  " + estado  );

		     };
		     
	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		   doGet(request, response);   
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
