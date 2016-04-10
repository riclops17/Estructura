/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
//import lineales.estaticas.ColaInt;
 //import lineales.dinamicas.ColaInt;
import lineales.dinamicas.ColaInt;
/**
 *
 * @author ricardo
 */
public class TestCola {
    
    public static void main(String[] args) {
       ColaInt cola = new ColaInt();
       cola.poner(1);
       cola.poner(2);
       cola.poner(3);
       cola.sacar();
        System.out.println(cola.toString());
        
    }
   
}
