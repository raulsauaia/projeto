package com.projeto.estrutura;

import java.util.Stack;

public class Pilha {
    private Stack<Integer> pilha;

    public Pilha() {
        pilha = new Stack<>();
    }

    public void empilha(int numero) {
        pilha.push(numero);
    }

    public int desempilha() {
        return pilha.pop();
    }

    public boolean estaVazia() {
        return pilha.isEmpty();
    }
}
