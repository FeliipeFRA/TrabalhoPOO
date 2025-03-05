package com.aventuraepica.model;

public class Player extends Personagem {
    private int nivel;
    private Mochila mochila;

    public Player(String nome, String raca, String classe){
        super(nome, raca, classe, 20); // Chama o construtor da superclasse (Personagem)
        nivel = 1;
        mochila = new Mochila();
        
    }

    public Player(){
        nivel = 1;
        mochila = new Mochila();
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int novo_nivel) {
        this.nivel = novo_nivel;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila nova_mochila) {
        this.mochila = nova_mochila;
    }
}
