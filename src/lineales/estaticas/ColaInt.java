/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineales.estaticas;

/**
 *
 * @author ricardo
 */
public class ColaInt {
    private static final int tam = 30;
    private  int [] cola;
    private  int frente ;
    private  int fin ;
    
    public ColaInt(){
        this.cola = new int[tam];
        this.fin=0;
        this.frente=0;
       
    }
    public boolean poner(int elem){
        boolean res;
        if(this.frente == (this.fin +1)% this.tam){
            res = false;
            
        }else{
            this.cola[fin]= elem;
            this.fin = (this.fin +1) % tam;
            
            res = true;
        }
        return res;
        
        
    }
    public boolean esVacia(){
        return this.frente == this.fin;
    }
    public void vaciar(){
        this.fin = this.frente;
                 
    }
    public boolean sacar(){
        boolean exito  = true;
        if (this.esVacia()){
            exito = false;
        }else{
            this.frente = (this.frente+1)%this.tam;
        }
        return exito;
    }
    public int obtenerFrente(){
        return this.cola[frente];
    }
    public String toString(){
        String s;
        s = "";
        if(this.esVacia()){
            s = "la cola esta vacia";
        }else{
            for ( int i = this.frente; i <this.fin; i++) {
                s += this.cola[i] + " ";
                
            }
            }
        return s;
        }
    public ColaInt clonar(){
        ColaInt copia = new ColaInt();
        if(this.esVacia()){
            copia.cola = this.cola.clone();
           
        }else{
            for (int i = this.frente; i < this.fin; i++) {
                int j = cola[i];
                
            }
        }
        
    }
    }

