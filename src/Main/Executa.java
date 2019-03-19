package Main;

import tdefila.Fila;

public class Executa {

    public static void main(String[] args) {
        Fila filaA = new Fila(4);

        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(64);
       
        Fila filaB = new Fila(5);

        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(55);
        filaB.insere(75);
        
        System.out.println("Fila A:");
        filaA.mostrarElementosDaFila();
        
        System.out.println("Fila B:");
        filaB.mostrarElementosDaFila();
        
        System.out.println("Fila A cheia? " + filaA.cheia());
        System.out.println("Fila B cheia? " + filaB.cheia());
        System.out.println("Fila A vazia? " + filaA.vazia());
        System.out.println("Fila B vazia? " + filaB.vazia());
        
        System.out.println("Fila A primeiro? " + filaA.primeiro());
        System.out.println("Fila B primeiro? " + filaB.primeiro());
        
        System.out.println("Fila A último? " + filaA.ultimo());
        System.out.println("Fila B último? " + filaB.ultimo());
        
        //System.out.println("Elemento removido: " + filaA.remove());
        //System.out.println("Elemento removido: " + filaB.remove());

        Fila filaMergeada = Fila.merge(filaA, filaB);

        filaMergeada.mostrarElementosDaFila();

        
        
        
    }

}
