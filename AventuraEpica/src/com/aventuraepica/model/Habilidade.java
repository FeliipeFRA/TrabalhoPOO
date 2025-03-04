package com.aventuraepica.model;

public class Habilidade {
    private String nome;
    private int dano;
    private int cura;
    
    public Habilidade() {
        this.nome = "--";
        this.dano = 0;
        this.cura = 0;
    }

    public Habilidade(String nome, int dano, int cura) {
        this.nome = nome;
        this.dano = dano;
        this.cura = cura;
    }
        
    // GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public int getCura() {
        return cura;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }
}
