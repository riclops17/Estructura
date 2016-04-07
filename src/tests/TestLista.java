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
        ListaInt r = new ListaInt();
        ListaInt d = new ListaInt();
        p.insertar(1, 1);
        p.insertar(2, 2);
        p.insertar(3, 3);
        d.insertar(4, 1);
        d.insertar(5, 2);
        
        r =  concatenar(p,d);
        System.out.println(r.toString());
        
    }
    public static ListaInt concatenar(ListaInt l1 , ListaInt l2){
        ListaInt nuevo = new ListaInt();
        nuevo = l1.clonar();
        int longitudN;
        int i = 1;
        longitudN = l1.longitud() + l2.longitud();
        while( nuevo.longitud() < longitudN){
            nuevo.insertar(l2.recuperar(i), l1.longitud()+ i );
            
          i++;
       }
       
        
   
      return nuevo; 
    }
}
