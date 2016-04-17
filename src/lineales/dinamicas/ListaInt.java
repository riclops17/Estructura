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
public class ListaInt {
    private NodoInt cabecera;
     private int longitud;
    public ListaInt(){
        this.cabecera= null;
        this.longitud = 0;
    }
    public int longitud(){
        return this.longitud;
    }
    public boolean insertar(int elem , int pos){
        // insertar el elemento nuevo en la posicion pos
        // detecta y reporat error en posicion invalida
        boolean exito = true;
        if(pos < 1 || pos > this.longitud +1){
            exito = false;
        }else{
            if (pos == 1){
                // crea un nuevo nodo y se enlaza en la cabecera
                this.cabecera = new NodoInt ( elem,null);
                this.longitud++;
                
            }else{
                //avanza hasta el elemento en posicion pos -1
                NodoInt aux = this.cabecera;
                int i = 1;
                while (i< pos-1){
                    aux = aux.getEnlace();
                    i++;
                }
                // crea el nodo y lo enlaza
                NodoInt nuevo = new NodoInt(elem,aux.getEnlace());
                aux.setEnlace(nuevo);
                this.longitud++;
            }
                
        }
        // nunca hay error de lista llena , entonces devuelve true
        return exito;
    }
    public boolean esVacia(){
        return this.cabecera == null;
    }
    public void vaciar(){
        this.cabecera = null;
    }
    public boolean eliminar(int pos){
        boolean res = true;
        if(esVacia()||pos > this.longitud || pos <= 0){
            res= false;    
        }else{
            if(pos == 1){
                this.cabecera = this.cabecera.getEnlace();
                
            }else{
               NodoInt aux = this.cabecera;
               int i = 1;
                while (i< pos-1){
                    aux = aux.getEnlace();
                    i++;
                }
                if(this.longitud != pos){
                aux.setEnlace(aux.getEnlace().getEnlace());
               
                
            }else{
                    aux.setEnlace(null);
                } 
                
             
            }
           this.longitud--;    
        }
         return res;
    }
    public String toString(){
         String s = "";
         int i;
        NodoInt aux = this.cabecera;
        for(i=1 ; i<= this.longitud;i++){
            s += aux.getElem()+ ", ";
            aux = aux.getEnlace();
        }
        return s;
    }
    public ListaInt clonar2(){
       
         ListaInt copia = new ListaInt();
         NodoInt aux = this.cabecera;
         NodoInt aux2= null;
         copia.longitud = this.longitud;
        if (aux != null){
             NodoInt nuevo = new NodoInt(aux.getElem(),null);
             copia.cabecera = nuevo;
       
             for( int i=2;i<= this.longitud;i++){
                 aux2 = nuevo;
                 nuevo = new NodoInt(aux.getElem(),null);
                 aux2.setEnlace(nuevo);
                 aux = aux.getEnlace(); 
             }
             
         
         }

         return copia;
    }
    
    public int recuperar(int pos){
     int res = -1 ;
     NodoInt aux = null  ;
     if (!((pos < 1 )|| (pos > this.longitud ))){
         int i = 1;
         aux = this.cabecera;
         while(i < pos ){
          aux = aux.getEnlace();
           i++;
     }
         res = aux.getElem();
    
    }
     return res;

}
    public int localizar(int elem){
        int pos = -1;
        int i=1;
        boolean exito = false;
        NodoInt aux = this.cabecera;
        while(i <= this.longitud && !exito ){
            if(elem == aux.getElem()){
                pos = i;
                exito = true;
            }
            aux = aux.getEnlace();
            i++;
        }
        return pos;
        
    }
    public ListaInt clonar(){
        ListaInt copia = new ListaInt();
        if(this.cabecera != null){
            copia.cabecera = new NodoInt( this.cabecera.getElem(),unir(this.cabecera.getEnlace()));
            copia.longitud =longitud;
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
    public void insertarPromedio(){
        NodoInt aux = this.cabecera;
        int res = 0;
        int promedio;
        for(int i = 1; i<= longitud; i++){
            res = res +aux.getElem();
            aux = aux.getEnlace();
        }
        promedio = res/longitud;
        
    }
    public void eliminarApariciones(int x){
        NodoInt aux = this.cabecera;
        int i = 1;
        while(i< longitud){
            if(x == aux.getElem()){
                aux.setEnlace(null);
            }
            aux = aux.getEnlace();
            i++;
        }
        
    }
}

