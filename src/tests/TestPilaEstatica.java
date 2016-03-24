/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import lineales.estaticas.PilaInt;

/**
 *
 * @author ricardo
 */
public class TestPilaEstatica {
    public static void main(String[] args) {
        PilaInt p = new PilaInt();
        
        PilaInt n = new PilaInt();
         
         
         n  = p.clonar();
         
         
       
        
       
        System.out.println(n);
    }
}
