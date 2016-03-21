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
public class PilaInt {

    private int[] pila;
    private int tope;
    private static final int tam = 30;

    public PilaInt() {
        this.pila = new int[tam];
        this.tope = -1;
    }

    public boolean apilar(int nElem) {
        boolean res;
        if (this.tope + 1 >= this.tam) {
            res = false;
        } else {
            this.tope++;
            this.pila[tope] = nElem;
            res = true;
        }
        return res;
    }

    public boolean desapilar() {
        boolean res1;
        if (this.tope == -1) {
            res1 = false;

        } else {
            this.tope--;
            res1 = true;

        }
        return res1;
    }

    public int obtenerTope() {
        return this.pila[tope];
    }

    public boolean esVacia() {
        return this.tope == -1;

    }

    public void vaciar() {
        this.tope = -1;
    }

    public PilaInt clonar() {
        PilaInt p = new PilaInt();
        p.tope = this.tope;
        p.pila = this.pila.clone();
        return p;
    }

    public String toString() {
        String s;
        s = "";
        if (this.tope == -1) {
            s = "la pila esta vacia";
        } else {
            for (int i = 0; i < this.tope + 1; i++) {
                s += this.pila[i] + "->";
            }
            s += "/";
        }

        return s;
    }
}
