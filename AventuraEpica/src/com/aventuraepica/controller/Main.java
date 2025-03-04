package com.aventuraepica.controller;

import com.aventuraepica.model.Habilidade;
import com.aventuraepica.model.Personagem;
import java.util.Scanner; // ler dados usuario


public class Main {
    public static void main(String[] args) throws Exception {
        Personagem p1 = new Personagem();

        Scanner scanner = new Scanner(System.in); // ABRE SESSAO DE LEITURA

        System.out.println("\nAventura Epica!\n");
        System.out.print("Digite seu nome: ");
        p1.setNome(scanner.nextLine());  // Lê uma linha inteira
        p1.setVida(20);

        System.out.print("\n\nNOME DO PERSONAGEM: " + p1.getNome());

        scanner.close(); // FECHA SESSAO DE LEITURA
    }
}
