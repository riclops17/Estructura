/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import lineales.dinamicas.ListaInt;
/**
 *
 * @author ricardo
 */
public class TestLista {
    public static void main(String[] args) {
            ListaInt p = new ListaInt();
        
        ListaInt d = new ListaInt();
        p.insertar(2, 1);
        p.insertar(3, 2);
        p.insertar(4, 3);
       
      
        System.out.println(p.localizar(3));
        
    }
}
