/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import lineales.dinamicas.ListaInt;
import lineales.dinamicas.PilaInt;
import lineales.dinamicas.ColaInt;
import utiles.TecladoIn;
/**
 *
 * @author ricardo
 */
public class TestLista {
    public static void main(String[] args) {
        int lon = 0;
        ListaInt p = new ListaInt();
       p.insertar(1, 1);
       p.insertar(2, 2);
       p.insertar(3, 3);
       p.insertar(2, 4);
       p.insertar(1, 5);
       
       
        System.out.println(esCapicua(p));
        
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
   public static int contar(ListaInt l1,int elem){
       int cant = 0;
       int i = 1;
       while( i < l1.longitud()){
           if(elem == l1.recuperar(i)){
               cant++;
           }
           i++;
       }
       return cant;
       
   }
   public static int contarR(ListaInt l1 , int elem){
       int cant = 0;
       return cant;
   }
    public static ListaInt invertir (ListaInt l1){
        ListaInt nuevo = new ListaInt() ;
        PilaInt pilaAux = new PilaInt();
        for(int i = 1 ; i<= l1.longitud() ; i++){
            pilaAux.apilar(l1.recuperar(i));
        }
        
        for ( int i= 1; i<= l1.longitud(); i++){
            nuevo.insertar(pilaAux.obtenerTope(), i);
            pilaAux.desapilar();
        }
        return nuevo;
    }
    public static boolean comprobar(ListaInt l1){
        ColaInt colaAux = new ColaInt();
        PilaInt pilaAux = new PilaInt();
        int val = 1;
        int i = 1;
        val = l1.recuperar(i);
        int lon = l1.longitud();
        boolean res = true;
        if(l1.esVacia()){
            res = false;
        }else{
            while(val != 0 && i <= lon){
                pilaAux.apilar(val);
                colaAux.poner(val);
                i++; 
                val = l1.recuperar(i);
            }
            i++;
            val = l1.recuperar(i);
            while(val != 0  && i <= lon && res){
                if(val == colaAux.obtenerFrente()){
                   colaAux.sacar();
                }else{
                    res = false;
                }
                
                  i++;   
                  val =l1.recuperar(i);
                }
             i++;
             
             if(!pilaAux.esVacia()&& i > lon){
                 res = false;
             }
            while(i <= lon && res){
                
                if(l1.recuperar(i) == pilaAux.obtenerTope()){
                    pilaAux.desapilar();
                }else{
                    res = false;
                }
                i++;
            }
        }
           return res; 
        }
    public static boolean esCapicua(ListaInt l1){
        boolean res = true;
        PilaInt pilaAux = new PilaInt();
        int j= 1;
        for(int i = 1 ; i<= l1.longitud();i++){
            pilaAux.apilar(l1.recuperar(i));
        }
        while(j<= l1.longitud()&& res){
            if(l1.recuperar(j)== pilaAux.obtenerTope()){
                res = true;
            }else{
                res = false;
            }
            j++;
            pilaAux.desapilar();
        }
        return res;
    }
        
}

