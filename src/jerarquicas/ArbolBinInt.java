/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquicas;
import lineales.dinamicas.ListaInt;
import lineales.dinamicas.ColaNodo;
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
    public boolean esVacio(){
        return this.raiz == null;
    }
    public void vaciar(){
        raiz = null;
    }
    public void inorden(){
        inordenAux(this.raiz);
    }
    private void inordenAux(NodoArbol nodo){
        if(nodo!= null){
            preordenAux(nodo.getIzq());
            System.out.println(nodo.getElem());
            preordenAux(nodo.getDer());
        }
    }
    private void posordenAux(NodoArbol nodo){
        if(nodo != null){
            posordenAux(nodo.getIzq());
            posordenAux(nodo.getDer());
            System.out.println(nodo.getElem());
        }
    }
    public void posorden(){
        posordenAux(this.raiz);
    }
    public void porNiveles(){
        ColaNodo colaAux = new ColaNodo();
        colaAux.poner(this.raiz);
        while(!colaAux.esVacia()){
            NodoArbol nodo = colaAux.obtenerFrente();
            colaAux.sacar();
            System.out.println(nodo.getElem());
            if(nodo.getIzq()!= null){
                colaAux.poner(nodo.getIzq());
            }
            if(nodo.getDer()!= null){
                colaAux.poner(nodo.getDer());
            }
            
        }
    }
    public int padre(int elem){
        int padreElem = 0;
        if(this.raiz == null){
            padreElem = -1;
        }else{
             padreElem = padreAux(this.raiz, elem);
           
        }
        return padreElem;
    }
    private int padreAux(NodoArbol n,int elem){
        int res = -1;
        if(n!= null){
            if(n.getIzq().getElem() == elem || n.getDer().getElem() == elem){
                res= n.getElem();
            }else{
                res = padreAux(n.getIzq(),elem);
                if(res == -1){
                    res= padreAux(n.getDer(),elem);
                }
            }
        }
        return res;
        
    }
    public String toString(){
     String s = "";
    if(this.raiz != null){
        s  = stringAux(this.raiz);
    }else{
        s = "arbol vacio";
    }
    return s;
         
    }
    private String stringAux(NodoArbol n){
        String s= ""+n.getElem();
        if(n.getIzq()!= null){
            s= s +"HI:"+ n.getIzq().getElem(); 
            
        }else{
            s = s +"HI:#";
        }
        if(n.getDer()!= null){
            s= s +"HD:"+ n.getDer().getElem()+"\n"; 
            
        }else{
            s = s +"HD:#"+"\n";
        }
        
        if(n.getIzq() != null){
         s += stringAux(n.getIzq());
        }
        if(n.getDer() != null){
        s += stringAux(n.getDer());
        
    }
        return s;
}
}
    
    

    

