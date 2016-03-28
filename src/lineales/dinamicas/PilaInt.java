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
public class PilaInt {
    private NodoInt tope;
    
    public PilaInt(){
        this.tope = null;
    }
    public boolean apilar(int elemn){
         this.tope = new NodoInt(elemn,tope);
         return true;
    }
    public boolean desapilar(){
        boolean res;
        if(this.tope == null){
            res = false;
        }else{
            this.tope= tope.getEnlace();
            res = true;
        }
        return res;
    }
    public String toString(){
        String s = "";
        NodoInt aux = this.tope;
        while( aux!= null){
            s += aux.getElem()+ "";
            aux = aux.getEnlace();
        }
        return s;
    }
    public boolean esVacia(){
        return this.tope == null ;
    }
    public void vaciar(){
        tope= null;          
    }
    public int obtenerTope(){
        int elemn;
        if(this.tope== null){
            elemn = -1;
        }else{
            elemn = this.tope.getElem();
        }
        return elemn;
    }
    public PilaInt clonar(){
        PilaInt copia = new PilaInt();
        if(this.tope != null){
            copia.tope = new NodoInt( this.tope.getElem(),unir(this.tope.getEnlace()));
        }
        return copia;
        
    }
    private NodoInt unir(NodoInt aux){
        NodoInt res;
        if(aux== null){
            res= null;
        }else{
            NodoInt x = new NodoInt((aux.getElem()),unir(aux.getEnlace()));
            res= x;
        }
        return res;
    }
    
}
       


