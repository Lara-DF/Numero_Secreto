/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.planeta;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Random;
import java.util.Scanner;

public class Planeta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int planetaSecreto = random.nextInt(1, 11); // planeta de 1 a 10
        int palpite = -1; // começa com valor inválido para entrar no laço
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo do Planeta Secreto!");
        System.out.println("Um planeta misterioso entre 1 e 10 foi escondido no espaço...");

        do {
            System.out.print("Digite o número do planeta: ");
            try {
                palpite = scanner.nextInt();
                tentativas++;

                if (palpite < planetaSecreto) {
                    System.out.println("O planeta secreto é um número maior!");
                } else if (palpite > planetaSecreto) {
                    System.out.println("O planeta secreto é um número menor!");
                } else {
                    System.out.println("Parabéns, você encontrou o Planeta Secreto!");
                    if (tentativas == 1) {
                        System.out.println("Você descobriu em " + tentativas + " tentativa!");
                    } else {
                        System.out.println("Você descobriu em " + tentativas + " tentativas!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Digite apenas números.");
                scanner.next(); // descarta entrada inválida
            }
        } while (palpite != planetaSecreto);

        scanner.close();
    }
}