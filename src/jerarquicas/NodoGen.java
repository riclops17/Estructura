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
    private int elem;
    private NodoGen eIzq;
    private NodoGen hermanoDer;
    
    public NodoGen(int elem1,NodoGen hijoIzq,NodoGen hijoDer){
        this.elem = elem1;
        this.eIzq = hijoIzq;
        this.hermanoDer= hijoDer;
    }
    public NodoGen(){
        this.eIzq = null;
        this.hermanoDer= null;
    }
    
    public int getElem(){
        return this.elem;
    }
    public NodoGen getEIzq(){
        return this.eIzq;
    }
    public NodoGen getHermanoDer(){
        return this.hermanoDer;
    }
    public void setElem(int elem1){
        this.elem = elem1;
    }
    public void setEIzq(NodoGen eIzq1){
        this.eIzq = eIzq1;
        
    }
    public void setHermanoDer(NodoGen hermanoDer1){
      this.hermanoDer = hermanoDer1;
        
    }
}
