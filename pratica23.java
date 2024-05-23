/*Lógica: Desenvolver um algoritmo em Java para ler um número e imprimir qual dia da semana de acordo com o número lido, sendo (1-Domingo,2-Segunda,3-Terça,4-Quarta, 5-Quinta,6-Sexta,7-Sábado). Teclando Enter sem nada informado, o sistema deverá ser encerrado, se informar uma opção qualquer diferente de 1 a 7, o sistema deverá apresentar a mensagem de opção inválida.

Usar obrigatoriamente a estrutura de decisão switch.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaração de variável
        String opcao;

        // Cria objeto para entrada da opção do cardápio
        Scanner leitoropcao = new Scanner(System.in);

        // Entrada da opção do cardápio
        System.out.print("Escolha uma opção: ");
        opcao = leitoropcao.nextLine();

        // Verifica se a opção está vazia e sai do sistema se estiver
        if (opcao.isEmpty()) {
            return;
        }

        // Seleção da opção
        if (opcao.equals("1")) {
            System.out.println(" Domingo");
        } else if (opcao.equals("2")) {
            System.out.println(" segunda");
        } else if (opcao.equals("3")) {
            System.out.println(" terça");
        } else if (opcao.equals("4")) {
            System.out.println(" quarta");
        } else if (opcao.equals("5")) {
            System.out.println(" quinta");
        } else if (opcao.equals("6")) {
            System.out.println(" sexta");
        } else {
            System.out.println(" Opção inválida.");
        }
    }
}
