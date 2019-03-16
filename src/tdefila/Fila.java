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


    private int remove;
    private int max = 0;
    private int dado[];

    public Fila(int tamanhoFila) {
        this.dado = new int[tamanhoFila];
        this.remove = 0;
    }

    Fila() {
        this(3);
    }

    public void insere(Fila f, int elemento) {
        if (this.max < this.dado.length) {
            this.dado[this.max] = elemento;
            this.max++;
        }
    }
    
    public void cheia(){
        if(this.max == this.dado.length){
            System.out.println("A fila esta cheia");
        }
    }
    
    public boolean vazia( ){
        if(this.max == 0){
            return true;
        }
        return false;
    }
    
    public Object primeiro(){
        if (this.vazia()){
            return "A fila esta vazia !";
        }
        
        return this.dado[0];
    }
    
    public void ultimo(){
        int ultimo = this.dado[this.max --];
    }
    
    public Object remove() {
        int pos = 0;
        int removeElemento = this.dado[pos];

        for (int i = pos; i < this.max - 1; i++) {
            dado[i] = dado[i+1];
        }
        this.max--;
        
        return removeElemento;
        
    }
    
    

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        
        for (int i = 0; i <this.max; i++) {
           s.append(this.dado[i]);
           s.append(" ");
        }
        return s.toString();
        
    }
}
