/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;
import conjuntistas.ArbolBB;
/**
 *
 * @author ricardo
 */
public class TestArbolBB {
    public static void main(String[] args) {
        ArbolBB a = new ArbolBB();
        ArbolBB b = new ArbolBB();
        a.insertar(56);
        a.insertar(34);
        a.insertar(23);
        a.insertar(78);
        a.insertar(63);
        a.insertar(89);
        a.insertar(80);
        a.insertar(71);
       
        System.out.println(a.eliminarMaximo());
        System.out.println(a.toString());
        
       
    }
}
