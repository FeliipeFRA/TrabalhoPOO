package com.aventuraepica.model;

class Arma extends Item {
    private int dano;

    public Arma(String nome, String raridade, int dano) {
        super(nome, raridade);
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }
}