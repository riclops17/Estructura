/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquicas;
import lineales.dinamicas.ListaInt;
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
    public boolean insertar(int  elem, int elemPadre){
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
    public ListaInt listarAncestrosAux(int elem){
        ListaInt l1 = new ListaInt();
        return listarAncestrosAux(this.raiz,elem,l1);
    }
    private ListaInt listarAncestrosAux(NodoGen n, int elem ,ListaInt l1){
        boolean res = false;
        NodoGen hijo;
        if ( n != null){
            if(n.getElem() == elem){
                l1.insertar(n.getElem(), l1.longitud() +1);
            }else{
                hijo = n.getEIzq();
                while(hijo != null){
                    if(hijo.getElem() == elem && res != true){
                        l1.insertar(hijo.getElem(), l1.longitud() +1);
                        res = true;
                    }
                    hijo = hijo.getHermanoDer();
                }
                hijo = n.getEIzq();
                while (l1.esVacia() && hijo != null && res != true){
                    l1 = listarAncestrosAux(hijo,elem , l1);
                    hijo = hijo.getHermanoDer();
                }
                if(!l1.esVacia()){
                    l1.insertar(n.getElem(), l1.longitud() +1);
                }
            }
        }
        return l1;
    }
            
            
            
            
            
            
            
 
    
}