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
        p.poner(2);
        p.poner(352532);
        p.sacar();
        System.out.println(p.toString());
        
    }
   
}
