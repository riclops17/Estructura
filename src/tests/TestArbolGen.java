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
        arbol.insertar("a",null );
        arbol.insertar("b", "a");
        arbol.insertar("f", "a");
        arbol.insertar("g", "a");
        arbol.insertar("c", "b");
        arbol.insertar("d", "c");
       arbol.insertar("h", "c");
        System.out.println(arbol.toString());
        System.out.println(arbol.pertenece("a"));
         System.out.println(arbol.pertenece("b")); 
          System.out.println(arbol.pertenece("f")); 
           System.out.println(arbol.pertenece("g"));
            System.out.println(arbol.pertenece("c"));
             System.out.println(arbol.pertenece("d")); 
             System.out.println(arbol.pertenece("z")); 
              System.out.println(arbol.pertenece("h")); 
    }
}
