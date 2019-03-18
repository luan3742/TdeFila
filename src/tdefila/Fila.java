/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdefila;

import java.util.Arrays;

/**
 *
 * @author Luan
 */
public class Fila {

    private int max = 0;
    public int dado[];

    public Fila(int tamanhoFila) {
        this.dado = new int[tamanhoFila];
    }

    public void insere(int elemento) {
        if (this.max < this.dado.length) {
            this.dado[this.max] = elemento;
            this.max++;
        }
    }

    public static Fila merge(Fila filaA, Fila filaB) {
        Fila filaC = new Fila(filaA.dado.length + filaB.dado.length);

        int proximoA = 0;
        int proximoB = 0;
        int proximoC = 0;

        while (proximoA < filaA.dado.length && proximoB < filaB.dado.length) {
            if (filaA.dado[proximoA] <= filaB.dado[proximoB]) {
                filaC.dado[proximoC++] = filaA.dado[proximoA++];
            } else {
                filaC.dado[proximoC++] = filaB.dado[proximoB++];
            }
        }

        while (proximoA < filaA.dado.length) {
            filaC.dado[proximoC++] = filaA.dado[proximoA++];
        }

        while (proximoB < filaB.dado.length) {
            filaC.dado[proximoC++] = filaB.dado[proximoB++];
        }

        return filaC;

    }

    public void mostrarElementosDaFila() {
        for (int elemento : dado) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public void cheia() {
        if (this.max == this.dado.length) {
            System.out.println("A Fila esta cheia");
        } else {
            System.out.println("A Fila não esta cheia");
        }
    }

    public boolean vazia() {
        if (this.max == 0) {
            return true;
        }
        return false;
    }

    public Object primeiro() {
        if (this.vazia()) {
            return "A fila esta vazia !";
        }

        return this.dado[0];
    }

    public Object ultimo() {
        return this.dado[--max];
    }

    public Object remove() {
        int pos = 0;
        int removeElemento = this.dado[pos];

        for (int i = pos; i < this.max - 1; i++) {
            dado[i] = dado[i + 1];
        }
        this.max--;

        return removeElemento;

    }

    public void mergeFilas() {

    }

    @Override
    public String toString() {
        return Arrays.toString(this.dado);
    }

}
