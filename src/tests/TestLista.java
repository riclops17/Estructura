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
        ListaInt r = null;
        ListaInt d = new ListaInt();
        System.out.println("escriba la longitud de su lista");
        lon = p.longitud();
        lon = TecladoIn.readLineInt();
       for(int j = 1 ; j<= lon;j++){
           System.out.println("ingrese el elemento");
           p.insertar(TecladoIn.readLineInt(), j);
       }
        System.out.println(comprobar(p));
        
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
        
}

