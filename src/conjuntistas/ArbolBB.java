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
   public ListaInt listarPreorden() {
        ListaInt lis = new ListaInt();
        preordenAux(this.raiz, lis);
        return lis;
    }
   private void preordenAux(NodoArbol nodo, ListaInt l1) {
        if (nodo != null) {
            //visita el elemento en el nodo
            l1.insertar(nodo.getElem(), l1.longitud() + 1);
            // recorre a sus hijos en preorden 
            preordenAux(nodo.getIzq(), l1);
            preordenAux(nodo.getDer(), l1);
        }
    }
}
