/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import jerarquicas.ArbolGenString;
/**
 *
 * @author ricardo
 */
public class TestArbolGen {
    public static void main(String[] args) {
        ArbolGenString arbol = new ArbolGenString();
        arbol.insertar("a","a" );
        
        System.out.println(arbol.pertenece("b")); 
    }
}
