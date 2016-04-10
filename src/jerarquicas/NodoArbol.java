/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquicas;

/**
 *
 * @author ricardo
 */
public class NodoArbol {
    private int elem;
    private NodoArbol izq;
    private NodoArbol der;
    
    public NodoArbol(int elem ,NodoArbol izq ,NodoArbol der){
       this.elem = elem;
       this.izq = izq;
       this.der = der;
    }
    
    public NodoArbol(int elem1){
        this.elem = elem1;
        this.izq = null;
        this.der = null;
    }
    public int getElem(){
        return elem;
    }
    public NodoArbol getIzq(){
        return izq;
    }
    public NodoArbol getDer(){
        return der;
    }
    public void setElem(int elem){
        this.elem = elem;
    }
    public void setIzq(NodoArbol izq){
       this.izq = izq;
    }
    public void setDer(NodoArbol der){
        this.der = der;
    }
    
    
}
