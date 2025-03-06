// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

package com.aventuraepica.model;

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