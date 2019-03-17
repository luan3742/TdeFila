/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import tdefila.Fila;

public class Executa {

    public static void main(String[] args) {
        Fila f1 = new Fila(10);
        Fila f2 = new Fila(2);
         
        for (int i = 1; i <=10; i++) {
            f1.insere(f1, i);
        }
        
        System.out.println(f1.toString());
        
        System.out.println("Elemento do topo: " +f1.primeiro());
        
        f1.remove();
       
        System.out.println("");
        
        System.out.println(f1);
        System.out.println("Elemento do topo: "+f1.primeiro());
        
        
        System.out.println("");
      
        System.out.println(f1);
        
        System.out.println("Ultimo elemento: "+f1.ultimo());
        
        System.out.println("");
        System.out.println(f1.vazia());
        
        
        
    }

}
