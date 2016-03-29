/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
//import lineales.estaticas.ColaInt;
 import lineales.dinamicas.ColaInt;
/**
 *
 * @author ricardo
 */
public class TestCola {
    
    public static void main(String[] args) {
        ColaInt p = new ColaInt();
        ColaInt d = new ColaInt();
       p.poner(2);
       p.poner(4);
       p.poner(4);
       d = p.clonar();
       
       
        System.out.println(p.toString());
        
    }
   
}
