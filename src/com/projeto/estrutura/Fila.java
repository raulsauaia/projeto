package com.projeto.estrutura;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private Queue<Integer> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void enfileira(int numero) {
        fila.add(numero);
    }

    public int desenfileira() {
        return fila.poll();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }
}
