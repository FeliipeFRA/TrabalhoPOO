package com.aventuraepica.model;

public class Missao {
    private String nome;
    private String descricao;
    private boolean concluida;
    private int recompensaXP;
    

    public Missao(String nome, String descricao, int recompensaXP) {
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false; // A missão começa como não concluída
        this.recompensaXP = recompensaXP;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public int getRecompensaXP() {
        return recompensaXP;
    }

    public void concluirMissao(Player jogador) {
        if (!concluida) {
            concluida = true;
            jogador.aumentarXP(recompensaXP);
            System.out.println(jogador.getNome() + " completou a missão: " + nome + "!");
            System.out.println("Recompensa: " + recompensaXP + " de XP!");
        } else {
            System.out.println("Missão já foi concluída anteriormente!");
        }
    }

    @Override
    public String toString() {
        return "Missão: " + nome + "\nDescrição: " + descricao +
               "\nRecompensa: " + recompensaXP + " de XP, " +
               "\nStatus: " + (concluida ? "Concluída" : "Em andamento");
    }
}
