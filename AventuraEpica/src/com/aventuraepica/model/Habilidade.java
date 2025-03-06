// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

package com.aventuraepica.model;

public class Habilidade {
    private String nome;
    private String descricao;
    private int dano;
    private int cura;
    
    public Habilidade() {
        this.nome = "--";
        this.descricao = "--";
        this.dano = 0;
        this.cura = 0;
    }

    public Habilidade(String nome, String descricao, int dano, int cura) {
        this.nome = nome;
        this.descricao = descricao;
        this.dano = dano;
        this.cura = cura;
    }
        
    // GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }
    public String getDesc() {
        return descricao;
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

    public void setDesc(String desc) {
        this.descricao = desc;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setCura(int cura) {
        this.cura = cura;
    }

    @Override
    public String toString() {
        if (dano == 0){
            return ("Nome: " + nome + "\nDescricao: " + descricao + " e cura " + cura + " pontos de vida.");
        } else {
            return ("Nome: " + nome + "\nDescricao: " + descricao + " e tira " + dano + " pontos de vida.");
        }
    }
}
