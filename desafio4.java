/*Lógica: Desenvolver um algoritmo em Java para selecionar uma em quatro opções do menu de seleção do Sistema de Estoque, conforme abaixo:

1 – Cadastro de produtos
2 – Entradas e Saídas de itens no estoque
3 – Relatório de saldo de estoque
4 – Inventário de estoque
5 – Sair do sistema

Para cada seleção correspondente mostrar, se 1, “Cadastro de produtos selecionado.”, se 2, “Entradas e Saídas de itens no estoque selecionado”, se 3, “Relatório de saldo de estoque selecionado”, se 4, “Inventário de estoque selecionado”, e se 5, “Sistema fechado”.

Se selecionar 5 o sistema de ser fechado (finalizado), se selecionar de 1 a 4 o sistema deve mostrar as mensagens acimas e voltar a exibir o menu.  Se digitar diferente de 1 a 5, o sistema deverá mostra a mensagem “Opção invalida!“ e voltar a mostrar o menu.*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        // Declaração de variável
        int opcao;
        // Cria objeto para entrada da opção do cardápio
        Scanner opcaoMenu = new Scanner(System.in);
        do {
            //Apresenta o menu do Sistema de Estoque
            System.out.println("\n MENU SELEÇÃO DO SISTEMA DE ESTOQUE \n");
            System.out.println("1 – Cadastro de produtos \n");
            System.out.println("2 – Entradas e Saídas de itens no estoque \n");
            System.out.println("3 – Relatório de saldo de estoque \n");
            System.out.println("4 – Inventário de estoque \n");
            System.out.println("5 – Sair do sistema \n");
            // Entrada da opção do menu
            System.out.print("Selecione a opção desejado: ");
            opcao = opcaoMenu.nextInt();
            //Seleção da opção
            switch (opcao) {
                case 1:
                    System.out.println("Cadastro de produtos selecionado.");
                    break;
                case 2:
                    System.out.println("Entradas e Saídas de itens no estoque selecionado.");
                    break;
                case 3:
                    System.out.println("Relatório de saldo de estoque selecionado.");
                    break;
                case 4:
                    System.out.println("Inventário de estoque selecionado.");
                    break;
                case 5:
                    System.out.println("Sistema fechado.");
                    break;
                default:
                    System.out.println(" Opção inválida.");
                    break;
            }
        } while (opcao != 5);
    }
}