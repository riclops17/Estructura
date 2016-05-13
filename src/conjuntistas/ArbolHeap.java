/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntistas;

/**
 *
 * @author ricardo
 */
public class ArbolHeap {
    private int tam ;
    private int tabla [];
    private int ultimo  = 0;
    
    public ArbolHeap(int tam1){
        this.tam = tam1;
        this.tabla = new int [tam1];
        this.ultimo = 0;
    }
    public boolean eliminarCima(){
        boolean exito ;
        if(this.ultimo == 0){
            // estructura vacia
            exito = false;
        }else{
            //saca la raiz y la pone la ultima hoja en su lugar
            this.tabla[1] = this.tabla[ultimo];
            this.ultimo--;
            //reestablece la propiedad de heap minimo
            hacerBajar(1);
            exito = true;
        }
        return exito;
    }
    private void hacerBajar (int posicion){
        int hijoMenor;
        int temp = this.tabla[posicion];
        boolean salir = false;
        while (!salir){
            hijoMenor = posicion * 2;
            if(hijoMenor <= this.ultimo){
                // temp tiene hijos (al menos uno)
                if(hijoMenor < this.ultimo){
                    //hijoMenor tiene hermano derecho
                    if(this.tabla[hijoMenor + 1]< this.tabla[hijoMenor]){
                        
                    }
                }
                if(this.tabla[hijoMenor]< temp){
                    this.tabla[posicion ] = this.tabla[hijoMenor];
                    posicion = hijoMenor;
                }else{
                    //el padre es menor que sus hijos
                    salir = true;
                }
            }else{
                //hijoMenor es hoja
                salir = true;
            }
        }
        this.tabla[posicion] = temp;
    }    
    
    public boolean insertar (int elem){
        boolean res = true;
        int i = 1;
        int hijoIzq = 2 * i;
        if (this.ultimo == 0){
            this.tabla[1] = elem;   
        }else{
            if (this.tabla[ultimo]< tam){
                this.tabla[ultimo] = elem;
            }
        }
        return res;
    }
    public int recuperarCima(){
        int res;
        if(this.ultimo == 0){
            res = -1;
        }else{
            res = this.tabla[1];
        }
        return res;
    }
    
}


