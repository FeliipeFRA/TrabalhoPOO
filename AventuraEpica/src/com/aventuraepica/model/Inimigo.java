// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

package com.aventuraepica.model;

public class Inimigo extends Personagem {
    
    public Inimigo(String nome, String raca, String classe, int vida){
        super(nome, raca, classe, vida); // Chama o construtor da superclasse (Personagem)
    }

    public Inimigo(){
        super("?", "?", "?", 20);
    }

}
