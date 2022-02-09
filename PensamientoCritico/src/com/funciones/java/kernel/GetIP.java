package com.funciones.java.kernel;
 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 
import java.net.InetAddress;
 
/**
 *
 * @author xavi
 */
public class GetIP {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception {
        // Aqui obtenemos la ip local de la maquina
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("IP Local :"+address.getHostAddress());
 
        // Aqui obtenemos la ip de la web del programador
        String domain="www.lawebdelprogramador.com";
        InetAddress address2 = InetAddress.getByName(domain);
        byte IP[] = address2.getAddress();
        System.out.print("IP del dominio "+domain+" :");
        for (int index = 0; index < IP.length; index++)
        {
           if (index > 0)
                 System.out.print(".");
           System.out.print(((int)IP[index])& 0xff);
        }
    }






}



