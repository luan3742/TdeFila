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

        filaA.insere(2);
        filaA.insere(4);
        filaA.insere(5);
        filaA.insere(6);

        filaB.insere(9);
        filaB.insere(1);
        filaB.insere(10);
        filaB.insere(3);
        filaB.insere(12);
        
        Fila filaMergeada = Fila.merge(filaA, filaB);

        filaMergeada.mostrarElementosDaFila();

    }

}
