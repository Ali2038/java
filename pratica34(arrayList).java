/*Cadastro e Relatório de Alunos*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//declaracao de vetores
String[][] alunos = new String[100][3]; // matriz para armazenar os alunos
int contadorAlunos = 0; // contador para armazenar a quantidade de alunos cadastrados
String escolhaMenu;

    //criacao do objeto
    Scanner entradaMenu = new Scanner(System.in);

    //loop
    do {
        System.out.println("1 – Cadastro de Alunos \\n");
        System.out.println("2 – Relatório de todos alunos \\n");
        System.out.println("3 – Relatório de alunos aprovados \\n");
        System.out.println("4 – Sair do sistema \\n");
        System.out.println("Escolha uma opção: ");
        escolhaMenu = entradaMenu.nextLine();

        switch (escolhaMenu) {
            case "1":
                System.out.println("Digite o nome do aluno ou enter: ");
                String nomeAluno = entradaMenu.nextLine();
                    System.out.println("Digite a matrícula do aluno: ");
                    String matriculaAluno = entradaMenu.nextLine();
                    System.out.println("Digite o resultado do aluno (A - Aprovado / R - Reprovado): ");
                    String resultadoAluno = entradaMenu.nextLine();
                    alunos[contadorAlunos][0] = matriculaAluno;
                    alunos[contadorAlunos][1] = nomeAluno;
                    alunos[contadorAlunos][2] = resultadoAluno;
                    contadorAlunos++;
                    if (!nomeAluno.equals(""))
                    {
                        break;
                    }

            case "2":
                System.out.println("==================================== \\n");
                System.out.println("MATRÍCULA  NOME DO ALUNO  RESULTADO");
                System.out.println("==================================== \\n");
                for (int i = 0; i < contadorAlunos; i++) {
                    System.out.printf("%-11s %-16s %-10s\\n", alunos[i][0], alunos[i][1], alunos[i][2]);
                }
                System.out.println("==================================== \\n");
                break;

            case "3":
                System.out.println("==================================== \\n");
                System.out.println("MATRÍCULA  NOME DO ALUNO  RESULTADO");
                System.out.println("==================================== \\n");
                for (int i = 0; i < contadorAlunos; i++) {
                    if (alunos[i][2].equals("A")) {
                        System.out.printf("%-11s %-16s %-10s\\n", alunos[i][0], alunos[i][1], alunos[i][2]);
                    }
                }
                System.out.println("==================================== \\n");
                break;

            case "4":
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    } while (!escolhaMenu.equals("4"));
}
}
