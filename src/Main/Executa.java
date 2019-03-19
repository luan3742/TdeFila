/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import tdefila.Fila;

public class Executa {

    public static void main(String[] args) {

        Fila filaA = new Fila(4);
        Fila filaB = new Fila(5);
        
        
        filaA.insere(5);
        filaA.insere(3);
        filaA.insere(2);
        
        System.out.println(filaA.toString());
        System.out.println("");
        System.out.println("Elemento removido: "+filaA.remove());
        System.out.println("");
        System.out.println("Novos elementos: "+filaA.toString());
        System.out.println("");
        System.out.println("Elemento removido: "+filaA.remove());
        System.out.println("");
        System.out.println("Novos elementos:" +filaA.toString());
        

        


    }

}
