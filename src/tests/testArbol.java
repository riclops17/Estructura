/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import jerarquicas.ArbolBinInt;
/**
 *
 * @author ricardo
 */
public class testArbol {
    public static void main(String[] args) {
       ArbolBinInt a = new ArbolBinInt();
       a.insertar(2, 1, 'I');
       a.insertar(3, 0, 'D');
       a.preorden();
    
    }
    
}
