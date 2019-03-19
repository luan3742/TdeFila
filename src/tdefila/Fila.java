package tdefila;

import java.util.Arrays;


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

    public void mostrarElementosDaFila() {
        for (int elemento : dado) {
            System.out.print(elemento + " ");
        }
        System.out.println("");
    }

    public boolean cheia() {
        if (this.max == this.dado.length) {
            return true;
        } else {
            return false;
        }
    }

    public boolean vazia() {
        if (this.max == 0) {
            return true;
        }
        return false;
    }

    public Object primeiro() {
        if (this.max == 0) {
            return "A fila esta vazia !";
        }
        else{
            return this.dado[0];
        }
    }
        

    public Object ultimo() {
        return this.dado[--max];
    }

    public Object remove() {

        if (vazia()) {
            System.out.println(" Fila vazia, não há como remover");
        }

        int removeElemento = this.dado[0];

        this.max--;
        for (int i = 0; i < this.max; i++) {
            dado[i] = dado[i + 1];
        }

        this.dado[this.max] = 0;

        return removeElemento;

    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < this.max; i++) {
            s.append(this.dado[i]);
            s.append(" ");
        }
        return s.toString();

    }

    public static Fila merge(Fila filaA, Fila filaB) {
        Fila filaC = new Fila(filaA.max + filaB.max);

        int proximoA = 0;
        int proximoB = 0;
        int proximoC = 0;

        while (proximoA < filaA.max && proximoB < filaB.max) {
            if (filaA.dado[proximoA] <= filaB.dado[proximoB]) {
                filaC.dado[proximoC++] = filaA.dado[proximoA++];
            } else {
                filaC.dado[proximoC++] = filaB.dado[proximoB++];
            }
        }

        while (proximoA < filaA.max) {
            filaC.dado[proximoC++] = filaA.dado[proximoA++];
        }

        while (proximoB < filaB.max) {
            filaC.dado[proximoC++] = filaB.dado[proximoB++];
        }

        return filaC;

    }

}
