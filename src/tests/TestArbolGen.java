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
        arbol.insertar(1,1 );
        arbol.insertar(2, 1);
        arbol.insertar(4, 1);
        arbol.insertar(5, 1);
        arbol.insertar(3, 2);
        arbol.insertar(6, 3);
        arbol.insertar(7, 3);
        System.out.println(arbol.listarAncestrosAux(6).toString());
        
    }
}
