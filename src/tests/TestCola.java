/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
//import lineales.estaticas.ColaInt;
 //import lineales.dinamicas.ColaInt;
import lineales.dinamicas.ColaInt;
import lineales.dinamicas.PilaInt;
/**
 *
 * @author ricardo
 */
public class TestCola {
    
    public static void main(String[] args) {
       ColaInt cola = new ColaInt();
       cola.poner(1);
       cola.poner(2);
       cola.poner(0);
       cola.poner(1);
       cola.poner(0);
       cola.poner(3);
       cola.poner(5);
       cola.poner(6);
        System.out.println(generar(cola).toString());
        
    }
   public static ColaInt generar(ColaInt c1){
       ColaInt c2 = new ColaInt();
       ColaInt c3 = new ColaInt();
       PilaInt pila = new PilaInt();
       while(!c1.esVacia()){
          
           while(!c1.esVacia() && c1.obtenerFrente()!= 0){
                c3.poner(c1.obtenerFrente());
                pila.apilar(c1.obtenerFrente());
                c2.poner(c1.obtenerFrente());
                c1.sacar();
           }   
            
           while(!pila.esVacia() ) {
               c2.poner(pila.obtenerTope());
               pila.desapilar();
               
           }
           while(!c3.esVacia()){
               c2.poner(c3.obtenerFrente());
               c3.sacar();   
               
        }
           c1.sacar();
           c2.poner(0);
       }
       return c2;
        
   }
     }
       
   


