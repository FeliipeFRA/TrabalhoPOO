// INTEGRANTES:
// FELIPE FERREIRA RANGEL DE ALMEIDA - 2208490
// IGOR LUIS DIAS - 2199713

// MAIN CLASS APENAS PARA TESTE DAS CLASSES E SUAS IMPLEMENTAÇÕES

package com.aventuraepica.controller;

import java.util.Scanner; // ler dados usuario

import com.aventuraepica.model.Habilidade;
import com.aventuraepica.model.Item;
import com.aventuraepica.model.Inimigo;
import com.aventuraepica.model.Player;
import com.aventuraepica.model.Inimigo;
import com.aventuraepica.model.Arma;
import com.aventuraepica.model.Armadura;

public class Main {
    public static void main(String[] args) throws Exception {
        Player p = new Player();
        Boolean jogando = true;

        Scanner scanner = new Scanner(System.in); // ABRE SESSAO DE LEITURA

        System.out.println("\n\n\n\n");
        System.out.println("--------------------------------");
        System.out.println("AVENTURA EPICA\n");

        while (jogando) {
            System.out.println("Com quem deseja jogar:");
            System.out.println("[1] - Jogar como Jake");
            System.out.println("[2] - Jogar como Finn");
            System.out.println("[3] - Criar seu personagem");
            System.out.println("[4] - Sair do jogo");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu jogar como Jake!");
                    p.setNome("Jake");
                    p.setRaca("Cachorro");
                    p.setClasse("Corpo a Corpo");
                    break;
                case 2:
                    System.out.println("Você escolheu jogar como Finn!");
                    p.setNome("Finn");
                    p.setRaca("Humano");
                    p.setClasse("Guerreiro Espadachim");
                    break;
                case 3:
                    System.out.println("Criando seu personagem...\n");
                    System.out.print("Digite o nome do seu personagem: ");
                    String nome = scanner.nextLine();
                    
                    System.out.println("Escolha uma raça:");
                    System.out.println("[1] - Humano");
                    System.out.println("[2] - Cachorro");
                    System.out.println("[3] - Rainicorn");
                    System.out.println("[4] - Elemental");
                    System.out.println("[5] - Doce");
                    System.out.print("Digite o número da raça escolhida: ");
                    int racaEscolha = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    
                    String raca = switch (racaEscolha) {
                        case 1 -> "Humano";
                        case 2 -> "Cachorro";
                        case 3 -> "Rainicorn";
                        case 4 -> "Elemental";
                        case 5 -> "Doce";
                        default -> "Humano"; // Valor padrão
                    };
                    
                    System.out.println("Escolha uma classe:");
                    System.out.println("[1] - Corpo a Corpo");
                    System.out.println("[2] - Guerreiro Espadachim");
                    System.out.println("[3] - Arqueiro");
                    System.out.println("[4] - Magia Elemental");
                    System.out.print("Digite o número da classe escolhida: ");
                    int classeEscolha = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    
                    String classe = switch (classeEscolha) {
                        case 1 -> "Corpo a Corpo";
                        case 2 -> "Guerreiro Espadachim";
                        case 3 -> "Arqueiro";
                        case 4 -> "Magia Elemental";
                        default -> "Corpo a Corpo"; // Valor padrão
                    };
                    
                    p.setNome(nome);
                    p.setRaca(raca);
                    p.setClasse(classe);
                    System.out.println("\nPersonagem criado com sucesso!\n");
                    break;
                case 4:
                    System.out.println("Saindo do jogo...\n");
                    
                    jogando = false;
                default:
                    System.out.println("Opção inválida! Tente novamente.\n"); 
            }

            // PERSONAGEM

            System.out.println("\n--------------------------------");
            System.out.println("SEU PERSONAGEM:");
            System.out.println("Nome: " + p.getNome());
            System.out.println("Raça: " + p.getRaca());
            System.out.println("Classe: " + p.getClasse());
            System.out.println("Nivel: " + p.getNivel());
            System.out.println("--------------------------------\n");


            // HABILIDADES
            
            System.out.println("--------------------------------");
            System.out.println("HABILIDADES DE " + p.getNome() + "\n");

            for (Habilidade habilidade : p.getHabilidades()) {
                System.out.println(habilidade); // O método toString() será chamado automaticamente
            }
            System.out.println("--------------------------------");

            // CRIANDO UMA ARMA
            System.out.println("\n--------------------------------");
            Arma arma_atual = new Arma("Espada Grama","Muito Raro", 6);
            System.out.print("Arma: " + arma_atual.getNome() + "\n");
            System.out.print("Raridade da arma: " + arma_atual.getRaridade() + "\n");
            System.out.println("--------------------------------");

            // ARMADURA PLAYER
        
            System.out.println("\n--------------------------------");
            System.out.println(p.getArmadura());
            System.out.println("--------------------------------");

            
            Armadura armadura_comprada = new Armadura("Armadura Doce", "Raro", 10);
    
            p.setArmadura(armadura_comprada);
            System.out.println(p.getNome() + " comprou " + armadura_comprada.getNome() + "e ganhou " + p.getDefesa() + " de defesa!");

            System.out.println("\n--------------------------------");
            System.out.println(p.getArmadura());
            System.out.println("--------------------------------");


            // INIMIGO
            Inimigo i1 = new Inimigo("Starchy Zumbi", "Doce Zumbi", "Corpo a Corpo", 15);
            Inimigo i2 = new Inimigo("O Lich", "Entidade Cosmica", "Magia Elemental", 300);

            System.out.println("\n--------------------------------");
            System.out.println("HABILIDADES DE " + i1.getNome() + "\n");

            // HABILIDADES DO STARCHY ZUMBI
            for (Habilidade habilidade : i1.getHabilidades()) {
                System.out.println(habilidade); // O método toString() será chamado automaticamente
            }

            // HABILIDADES DO LICH
            System.out.println("--------------------------------");
            System.out.println("\nHABILIDADES DE " + i2.getNome() + "\n");

            for (Habilidade habilidade : i2.getHabilidades()) {
                System.out.println(habilidade); // O método toString() será chamado automaticamente
            }
            System.out.println("--------------------------------\n");

            // FIM DO "JOGO"
            scanner.close(); // FECHA SESSAO DE LEITURA
            jogando = false;
        }
        
    }
}