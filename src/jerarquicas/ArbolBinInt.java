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
public class ArbolBinInt {
    private NodoArbol raiz;
    
    public ArbolBinInt(){
        this.raiz = null;
    }
    private NodoArbol obtenerNodo(NodoArbol n , int buscado){
        // busca el elemento y devuelve el nodo
        NodoArbol res = null;
        if(n != null){
            if(n.getElem() == buscado){
                // si el buscado es n , lo devuelve
                res = n;
            }else{
                // no es el buscado , busca primero en el HI
                res = obtenerNodo(n.getIzq(),buscado);
                // si no lo encuentra en el HI busca en el derecho
                if ( res == null){
                    res  = obtenerNodo(n.getDer(),buscado);
                }
            }
        }
        return res;
    }
    public boolean insertar(int elemN , int elemP , char lugar){
       boolean exito = true;
       if(this.raiz == null){
           // si el arbol esta vacio ponemos el elemento en la raiz
           this.raiz = new NodoArbol(elemN);
       }else{
           //sino esta vacio se busca al padre
           NodoArbol nodoPadre = obtenerNodo(this.raiz, elemP);
         if(nodoPadre != null){
              if(lugar == 'I' && nodoPadre.getIzq() == null){
               // si el padre existe y no tiene hijo izq se lo agrega
               nodoPadre.setIzq(new NodoArbol(elemN));
           }else{
               if( lugar == 'D'&& nodoPadre.getDer()== null){
                   // si el padre existe y no tiene hijo der se lo agrega
                   nodoPadre.setDer(new NodoArbol(elemN));
               }else{
                   // el padre no existe o ya tiene ese hijo, da error
                   exito = false;
               }
           }
          
         }else{
             exito = false;
         } 
       }
      return exito;   
    }
    public void preorden(){
        preordenAux(this.raiz);
    }
    private void preordenAux(NodoArbol nodo){
        if( nodo != null){
            //visita el elemento en el nodo
            System.out.println(nodo.getElem());
            // recorre a sus hijos en preorden 
            preordenAux(nodo.getIzq());
            preordenAux(nodo.getDer());
        }
    }
}
    
    

    

