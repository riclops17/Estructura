/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import jerarquicas.ArbolBinInt;
import lineales.dinamicas.ListaInt;
/**
 *
 * @author ricardo
 */
public class testArbol {
    public static void main(String[] args) {
       ArbolBinInt a = new ArbolBinInt();
       ArbolBinInt b = new ArbolBinInt();
       a.insertar(1, 1, 'I');
       a.insertar(4, 1, 'I');
       a.insertar(5, 1,'D');
       a.insertar(6, 4, 'I');
       a.insertar(7, 4, 'D');
       a.insertar(3, 6, 'I');
       a.insertar(9, 6 , 'D');
       a.insertar(2, 5, 'I');
       a.insertar(8, 5, 'D');
       b = a.clonarInvertido();
       System.out.println(b.toString());
    
    }
    
}
