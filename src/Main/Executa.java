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

        filaA.insere(2);
        filaA.insere(6);
        filaA.insere(8);
        filaA.insere(64);

        Fila filaB = new Fila(5);

        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);
        filaB.insere(56);

        Fila filaMergeada = Fila.merge(filaA, filaB);

        filaMergeada.mostrarElementosDaFila();

    }

}
