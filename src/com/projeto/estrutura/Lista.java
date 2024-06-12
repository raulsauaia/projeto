package com.projeto.estrutura;

import java.util.LinkedList;

public class Lista {
    private LinkedList<Integer> lista;

    public Lista() {
        lista = new LinkedList<>();
    }

    public void insere(int numero) {
        lista.add(numero);
    }

    public int remove() {
        return lista.removeFirst();
    }

    public boolean estaVazia() {
        return lista.isEmpty();
    }
}
