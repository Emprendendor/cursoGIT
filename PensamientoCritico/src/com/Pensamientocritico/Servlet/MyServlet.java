package com.Pensamientocritico.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.funciones.java.kernel.invoice;
import com.funciones.java.kernel.invoiceservice;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("   getRequestURI( " +  request.getRequestURI()  );
		
		
		if (  request.getRequestURI().equalsIgnoreCase("/PensamientoCritico/inicio")  ) {
 	
			response.setContentType("application/json; charset=UTF-8"); // 
			response.getWriter().print("[]");  // 
		}else {
		
	    response.setContentType("text/html; charset=UTF-8"); // 
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().print("<html>\n" +  // 
	                "<body>\n" +
	                "<h1>This is my HTML page</h1>\n" +
	                "<p> hallo what is going on!!!</p>\n" +
	                "</body>\n" +
	                "</html>");
		};
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		
		String parametro1 = request.getParameter("userId");
		String parametro2 = request.getParameter("cantidad");
		
		System.out.println(" userId " + parametro1  );
		
		System.out.println(" cantidad " + parametro2 );
		
				
		
	     String userId = request.getParameter("userId");                          // 
         Integer amount = Integer.valueOf(request.getParameter("cantidad"));       // 

         invoice invoice = new invoiceservice().create(userId, amount);   // 

         response.setContentType("application/json; charset=UTF-8");
         String json = new ObjectMapper().writeValueAsString(invoice); // 
         response.getWriter().print(json);
		
		
		
	}

}
