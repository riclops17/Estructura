/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntistas;
import jerarquicas.NodoArbol;
import lineales.dinamicas.ListaInt;
/**
 *
 * @author ricardo
 */
public class ArbolBB {
   private NodoArbol raiz;
   public boolean insertar (int elem){
       boolean exito = true;
       if(this.raiz == null){
           this.raiz = new NodoArbol(elem);
       }else{
           exito = insertarAux(this.raiz,elem);
       }
       return exito;
   }
   private boolean insertarAux(NodoArbol n , int elem){
       //precondicon: n no es nulo
       boolean exito = true;
       if(elem == n.getElem()){
           //reporta error: elemento repetido
           exito = false;
       }else{
           if(elem < n.getElem()){
               //elemento es menor que n.getElem
               // si tienen HD baja a la izquieda,sino agrega elemento
               if(n.getIzq() != null){
                   exito = insertarAux(n.getIzq(),elem);
               }else{
                   n.setIzq(new NodoArbol (elem));
               }
           }else{
               //elemento es mayor que n.getElem()
               // si tienen HD baja a la derecha , sino agrega elemento
               if(n.getDer()!= null){
                   exito = insertarAux(n.getDer(),elem);
               }else{
                   n.setDer(new NodoArbol(elem));
               }
           }
       }
       return exito;
   }
   
   public String toString() {
        String s = "";
        if (this.raiz != null) {
            s = stringAux(this.raiz);
        } else {
            s = "arbol vacio";
        }
        return s;

    }
   private String stringAux(NodoArbol n) {
        String s = "" + n.getElem();
        if (n.getIzq() != null) {
            s = s + "HI:" + n.getIzq().getElem();

        } else {
            s = s + "HI:#";
        }
        if (n.getDer() != null) {
            s = s + "HD:" + n.getDer().getElem() + "\n";

        } else {
            s = s + "HD:#" + "\n";
        }

        if (n.getIzq() != null) {
            s += stringAux(n.getIzq());
        }
        if (n.getDer() != null) {
            s += stringAux(n.getDer());

        }
        return s;
    }
   public ListaInt listarInorden() {
        ListaInt lis = new ListaInt();
        inordenAux(this.raiz, lis);
        return lis;
    }
   private void inordenAux(NodoArbol nodo, ListaInt l1) {
        if (nodo != null) {
            inordenAux(nodo.getIzq(), l1);
            l1.insertar(nodo.getElem(), l1.longitud() + 1);
            inordenAux(nodo.getDer(), l1);
        }
    }
   public int minimoElem(){
       int minimo ;
       if (this.raiz == null){
           minimo = Integer.MAX_VALUE;
       }else{
           minimo = minimoElemAux(this.raiz);
       }
       return minimo;
   }
   
   private int minimoElemAux(NodoArbol n){
       int minimo = 0;
       if(n != null){
           
           if(n.getIzq() == null){
               minimo = n.getElem();
           }else{
               minimo = minimoElemAux(n.getIzq());
                   
               }
           
       }
       return minimo;
   }
   public boolean eliminarMinimo(){
       boolean res ;
       if(this.raiz == null){
           res = false;
       }else{
           eliminarMinimoAux(this.raiz);
           res = true;
       }
       return res;
   }
   public void eliminarMinimoAux(NodoArbol n){
       if(n.getIzq() == null){
         this.raiz = this.raiz.getDer();
       }else{
       while (n.getIzq().getIzq() != null){
        n = n.getIzq() ;
       }
       if(n.getIzq().getDer() == null){
           n.setIzq(null);   
       }else{
           n.setIzq(n.getIzq().getDer());
       }
     
     }
   }
   
   public int maximoElem(){
       int maximo;
       if(this.raiz == null){
           maximo = Integer.MAX_VALUE;
       }else{
           maximo = maximoElemAux(this.raiz);
       }
       return maximo;
   }
    private int maximoElemAux(NodoArbol n){
       int maximo = 0;
       if(n != null){
           
           if(n.getDer() == null){
               maximo = n.getElem();
           }else{
               maximo = maximoElemAux(n.getDer());
                   
               } 
       }
       return maximo;
   }
    public ArbolBB clonar(){
        ArbolBB clon = new ArbolBB();
        NodoArbol aux = new NodoArbol(this.raiz.getElem());
        clon.raiz = aux;
        clonarAux(this.raiz,clon.raiz);
        return clon;
    }
    private void clonarAux(NodoArbol n, NodoArbol clon){
        NodoArbol nuevo ;
        if(n.getIzq() != null){
            nuevo = new NodoArbol(n.getIzq().getElem());
            clon.setIzq(nuevo);
            clonarAux(n.getIzq(),nuevo);
        }
        if(n.getDer() != null){
            nuevo = new NodoArbol(n.getDer().getElem());
            clon.setDer(nuevo);
            clonarAux(n.getDer(),nuevo);
        }
        
    }
}
