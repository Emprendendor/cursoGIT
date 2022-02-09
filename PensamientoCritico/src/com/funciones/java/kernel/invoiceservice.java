package com.funciones.java.kernel;

public class invoiceservice {

	public invoiceservice() {
		// TODO Apéndice de constructor generado automáticamente
	}
	 
	    public invoice create(String userId, Integer amount) { // 
	        // TODO real pdf creation and storing it on network server
	        return new invoice(userId, amount, "http://www.africau.edu/images/default/sample.pdf"); // 
	    }
 

}
