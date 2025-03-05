package com.aventuraepica.model;

class Tesouro extends Item {
    private int valor;

    public Tesouro(String nome, String raridade, int valor) {
        super(nome, raridade);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
