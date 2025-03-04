package com.aventuraepica.controller;

import com.aventuraepica.model.Habilidade;
import com.aventuraepica.model.Personagem;
import com.aventuraepica.model.Item;
import java.util.Scanner; // ler dados usuario


public class Main {
    public static void main(String[] args) throws Exception {
        Personagem p1 = new Personagem();
        Item arma = new Item("Espada do Finn", "Rara");
        Scanner scanner = new Scanner(System.in); // ABRE SESSAO DE LEITURA

        System.out.println("\nAventura Epica!\n");

        System.out.print("Digite seu nome: ");
        p1.setNome(scanner.nextLine());  // Lê uma linha inteira
        p1.setVida(20);
        p1.setClasse("Herói");

        System.out.print("\nStatus do Personagem: ");
        System.out.print("\n\nNome: " + p1.getNome());
        System.out.print("\nVida: " + p1.getVida());
        System.out.print("\nClasse: " + p1.getClasse());
        System.out.print("\nArma: " + arma.getNome());
        System.out.print("\nRaridade da arma: " + arma.getRaridade());

        scanner.close(); // FECHA SESSAO DE LEITURA
    }
}
