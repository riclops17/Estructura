/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import lineales.estaticas.ColaInt;
/**
 *
 * @author ricardo
 */
public class TestCola {
    
    public static void main(String[] args) {
        ColaInt p = new ColaInt();
       
        ColaInt n = new ColaInt();
        n = p.clonar();
        System.out.println(n.toString());
        
    }
   
}
