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
public class ArbolGenString {
    private NodoGen raiz;
   
    public ArbolGenString(){
        this.raiz= null;
    }
    public String toString(){
        return toStringAux(this.raiz);
    }
    private String toStringAux(NodoGen n){
        String s = "";
        if(n != null){
            s += n.getElem() + "->";
            NodoGen hijo = n.getEIzq();
            while(hijo != null){
                s+= hijo.getElem() + ",";
                hijo = hijo.getHermanoDer();
            }
            hijo = n.getEIzq();
            while(hijo != null){
                s += "\n" + toStringAux(hijo);
                hijo = hijo.getHermanoDer();
            }
        }
        return s;
    }
    private NodoGen obtenerNodo(NodoGen n ,int  buscado){
        NodoGen  res = null;
        if( n != null){
           
            if(n.getElem() == buscado){
                res = n;
            }else{
                res = obtenerNodo(n.getEIzq(),buscado);
                if(res == null){
                    res = obtenerNodo(n.getHermanoDer(),buscado);
                }
            }
        }
        return res;
    }
    public boolean insertar(String elem, String elemPadre){
        boolean exito =true;
        if(this.raiz == null){
            this.raiz = new NodoGen (elem,null,null);
        }else{
            NodoGen nodoPadre = obtenerNodo(this.raiz,elemPadre);
          
            if(nodoPadre!= null){
                NodoGen nuevo = new NodoGen(elem,null,null);
                if(nodoPadre.getEIzq() == null){
                    nodoPadre.setEIzq(nuevo);
                    exito = true;
                }else{
                   nuevo.setHermanoDer(nodoPadre.getEIzq());
                   nodoPadre.setEIzq(nuevo);
                   exito = true;
                }
            }else{
                exito = false;
            }
        }
        return exito;
    }
    public boolean pertenece(String elem){
        return perteneceAux(this.raiz,elem);
    }
    
 
    
}