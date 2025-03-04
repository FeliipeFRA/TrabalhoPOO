package com.aventuraepica.model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    protected String nome;
    protected String raridade;

    public Item(String novo_nome, String nova_raridade){
        nome = novo_nome;
        raridade = nova_raridade;
    }

    public Item(){
        nome = "?";
        raridade = "?";
    }

    public String getNome(){
        return nome;
    }

    public String getRaridade(){
        return raridade;
    }
}

// Subclassse Arma
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

