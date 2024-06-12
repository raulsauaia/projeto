package com.projeto.estrutura;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        // Passo 1: Insere os números [1, 2, 3, 4 e 5] na lista
        for (int i = 1; i <= 5; i++) {
            lista.insere(i);
        }

        // Passo 2: Remove todos os dados da lista e insere na pilha
        while (!lista.estaVazia()) {
            pilha.empilha(lista.remove());
        }

        // Passo 3: Remove os dados da pilha e insere na fila
        while (!pilha.estaVazia()) {
            fila.enfileira(pilha.desempilha());
        }

        // Passo 4: Insere os números [6, 7, 8, 9 e 10] na lista
        for (int i = 6; i <= 10; i++) {
            lista.insere(i);
        }

        // Passo 5: Repete os passos 2 e 3
        while (!lista.estaVazia()) {
            pilha.empilha(lista.remove());
        }
        while (!pilha.estaVazia()) {
            fila.enfileira(pilha.desempilha());
        }

        // Passo 6: Exibe todos os números que foram inseridos na fila
        while (!fila.estaVazia()) {
            System.out.print(fila.desenfileira() + " ");
        }
    }
}
