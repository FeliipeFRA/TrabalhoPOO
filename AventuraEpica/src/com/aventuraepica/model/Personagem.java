package com.aventuraepica.model;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    protected String nome; // protected para que classes possam acessar
    private String raca;
    private String classe;
    private List<Habilidade> habilidades = new ArrayList<>();
    private int vida;
    // private Armadura armadura;


    // CONSTRUTURORES

    public Personagem(String novo_Nome, String novo_Raca, int novo_Vida) {
        nome = novo_Nome;
        raca = novo_Raca;
        vida = novo_Vida;
    }

    public Personagem() {
        nome = "?";
        raca = "?";
        classe = "?";
    }
  
    // GETTERS AND SETTERS
   
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getClasse() {
        return classe;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public void NovaHabilidade(String nome) {

    }
}
