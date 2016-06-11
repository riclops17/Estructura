/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntistas;
import lineales.dinamicas.NodoInt;
/**
 *
 * @author ricardo
 */
public class HashAbierto {
    private NodoInt tabla [];
    private int cant = 0;
    private int tam;
    
    public HashAbierto(int tam1){
        this.tam = tam1;
        this.tabla = new NodoInt [tam1];
        
    }
    public boolean insertar(int nuevoElem){
        int pos = nuevoElem % this.tam;
        //primero verifica  si el elemento ya esta cargado
        boolean encontrado = this.pertenece(nuevoElem);
        //si no lo encuentra, lo pone adelante del resto
         if(!encontrado){
             this.tabla[pos] = new NodoInt(nuevoElem, this.tabla[pos]);
             this.cant++;
         }
         return !encontrado;
    }
    public boolean pertenece( int elem){
        int i = 0;
        boolean exito = false;
        while (i < this.tam && !exito) {
            if (elem == tabla[i]) {
                exito = true; 
            }
            i++;
            
        
    }
        return exito;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
