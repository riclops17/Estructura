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
public class NodoGen {
    private String elem;
    private NodoGen eIzq;
    private NodoGen hermanoDer;
    
    public NodoGen(String elem1){
       this.elem = elem1;
        this.eIzq = null;
        this.hermanoDer= null;
    }
    public NodoGen(){
        
        this.eIzq = null;
        this.hermanoDer= null;
    }
    
    public String getElem(){
        return this.elem;
    }
    public NodoGen getEIzq(){
        return this.eIzq;
    }
    public NodoGen getHermanoDer(){
        return this.hermanoDer;
    }
    public void setElem(String elem1){
        elem1 = this.elem;
    }
    public void setEIzq(NodoGen eIzq1){
        eIzq1 = this.eIzq;
        
    }
    public void setHermanoDer(NodoGen hermanoDer1){
        hermanoDer1 = this.hermanoDer;
        
    }
}
