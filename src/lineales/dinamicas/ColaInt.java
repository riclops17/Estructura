/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineales.dinamicas;

/**
 *
 * @author ricardo
 */
public class ColaInt {
    private NodoInt frente;
    private NodoInt fin;
    
    public boolean poner(int elemn){
       NodoInt nuevo = new NodoInt( elemn,null);
       if(fin!= null){
           this.fin.setEnlace(nuevo);
       }else{
           this.frente = nuevo;
       }
       this.fin= nuevo;
       return true;
    }
    public boolean sacar(){
        boolean exito = true;
        if(this.frente == null){
            // la cola esta vacia
            exito = false;
            
        }else{
            // al menos hay un elemento
            // quita el primer elmento y actualiza frente (y fin si queda vacia)
            this.frente = this.frente.getEnlace();
            if(this.frente == null){
                this.fin = null;
            }
        }
        return exito;
    }
    public void vaciar(){
        frente= null;
        fin = null;
    }
    public boolean esVacia(){
       return this.frente==null  ;
    }
    public String toString(){
         String s = "";
        NodoInt aux = this.frente;
        while( aux!= null){
            s += aux.getElem()+ ", ";
            aux = aux.getEnlace();
        }
        return s;
    }
     public int obtenerFrente(){
        int elemn;
        if(this.frente== null){
            elemn = -1;
        }else{
            elemn = this.frente.getElem();
        }
        return elemn;
    }
     public ColaInt clonar(){
         ColaInt copia = new ColaInt();
         NodoInt aux = this.frente;
         if(aux != null){
             NodoInt nuevo = new NodoInt(aux.getElem(),null);
             copia.frente= nuevo;
             copia.fin = nuevo;
             while(aux.getEnlace() != null){
                 aux = aux.getEnlace();
                 nuevo = new NodoInt(aux.getElem(),null);
                 copia.fin.setEnlace(nuevo);
                 copia.fin= nuevo;
             }
         }
         return copia;
     }
     
   
    
    
    
}
