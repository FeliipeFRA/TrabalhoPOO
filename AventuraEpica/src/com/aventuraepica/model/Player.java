// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

package com.aventuraepica.model;

import com.aventuraepica.model.Armadura;

public class Player extends Personagem {
    private int nivel;
    private Mochila mochila;
    private int xp = 0;
    private int xpNecessario = 100;
    private Armadura armadura_player;

    public Player(String nome, String raca, String classe){
        super(nome, raca, classe, 20); // Chama o construtor da superclasse (Personagem)
        nivel = 1;
        mochila = new Mochila(10);
        armadura_player = new Armadura("?", "?", 0);
    }

    public Player(){
        super("?", "?", "?", 20);
        nivel = 1;
        mochila = new Mochila(10);
        armadura_player = new Armadura("?", "?", 0);
    }
    
    public int getDefesa() {
        return armadura_player.getDefesa();
    }

    public Armadura getArmadura() {
        return armadura_player;
    }

    public void setArmadura(Armadura nova_Armadura) {
        this.armadura_player = nova_Armadura;
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
   


    public void aumentarXP(int quantidade) {
        xp += quantidade;
        System.out.println(getNome() + " ganhou " + quantidade + " XP! XP atual: " + xp + "/" + xpNecessario);
    if (xp >= xpNecessario) {
        subirDeNivel();
    }
    }

    private void subirDeNivel() {
    nivel++;
    xp -= xpNecessario;
    xpNecessario *= 1.5;
    setVida(getVida() + 5);
    System.out.println("🎉 " + getNome() + " subiu para o nível " + nivel + "! Vida aumentada para " +  getVida());
    }

    private int moedas = 0;

    public void aumentarMoedas(int quantidade) {
        moedas += quantidade;
        System.out.println("Agora você tem " + moedas + " moedas.");
    }

}
