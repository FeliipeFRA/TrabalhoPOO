package com.aventuraepica.model;

public class Armadura extends Item {
    private int defesa;

    public Armadura(String nome, String raridade, int defesa) {
        super(nome, raridade);
        this.defesa = defesa;
    }

    public int getDefesa() {
        return defesa;
    }

    @Override
    public String toString() {
        return super.toString() + " | Defesa: " + defesa;
    }
}

