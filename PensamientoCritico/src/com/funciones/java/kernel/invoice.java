package com.funciones.java.kernel;

 
import java.util.UUID;

public class invoice {

    private String id, pdfUrl, userId;

    private Integer amount;

    public invoice() {
    }

    public invoice(String userId, Integer amount, String pdfUrl) { // 
        this.id = UUID.randomUUID().toString();
        this.pdfUrl = pdfUrl;
        this.userId = userId;
        this.amount = amount;
    }

    // Getter & Setter omitted
}