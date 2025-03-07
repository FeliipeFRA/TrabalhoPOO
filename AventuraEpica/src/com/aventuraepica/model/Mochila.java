// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

package com.aventuraepica.model;

import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private List<Item> itens;
    private int capacidadeMaxima;

    public Mochila(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.itens = new ArrayList<>();
    }

    public boolean adicionarItem(Item item) {
        if (item == null) {
            System.out.println("Não é possível adicionar um item nulo à mochila.");
            return false;
        }
        if (itens.size() >= capacidadeMaxima) {
            System.out.println("Mochila cheia! Não é possível adicionar " + item.getNome());
            return false;
        }
        itens.add(item);
        System.out.println(item.getNome() + " foi adicionado à mochila.");
        return true;
    }
    

    public boolean removerItem(Item item) {
        if (itens.remove(item)) {
            System.out.println(item.getNome() + " foi removido da mochila.");
            return true;
        }
        System.out.println("O item " + item.getNome() + " não está na mochila.");
        return false;
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("A mochila está vazia.");
            return;
        }
        System.out.println("Itens na mochila:");
        for (Item item : itens) {
            System.out.println("- " + item);
        }
    }

    public int getCapacidadeAtual() {
        return itens.size();
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
}
