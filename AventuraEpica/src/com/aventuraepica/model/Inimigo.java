package com.aventuraepica.model;

public class Inimigo extends Personagem {
    
    public Inimigo(String nome, String raca, String classe, int vida){
        super(nome, raca, classe, 20); // Chama o construtor da superclasse (Personagem)
    }

    public Inimigo(){
    
    }
    // INSERIR LOOT
}
