/*Lógica: Desenvolver um algoritmo em Java com o seguinte menu, cadastro de alunos (matrícula, nome do aluno e resultado), relatório de todos alunos e relatório de alunos aprovado.  Deve ser usado no mínimo três vetores.

1 – Cadastro de Alunos

2 – Relatório de todos alunos

3 – Relatório de alunos aprovados

4 – Sair do sistema

O cadastro do  aluno deve ter os campos: matrícula, nome e resultado.

O campo resultado dever ser: “A” para aprovado e “R” para reprovado.

Os relatórios devem ter o seguinte layout:/*

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//declaracao de vetores
String escolhaMenu;
String[] nomeAlunos = new String[30];
String[] matriculaAlunos = new String[30];
String[] resultadoAlunos = new String[30];

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

        switch (escolhaMenu)
        {
            case "1":
                for (int idcAluno = 0; idcAluno < matriculaAlunos.length; idcAluno++)
                {
                    System.out.println("Digite o nome do aluno ou enter: ");
                    nomeAlunos[idcAluno] = entradaMenu.nextLine();
                    if (nomeAlunos[idcAluno].equals(""))
                    {
                        break;
                    }
                    System.out.println("Digite a matrícula do aluno: ");
                    matriculaAlunos[idcAluno] = entradaMenu.nextLine();
                    System.out.println("Digite o resultado do aluno (A - Aprovado / R - Reprovado): ");
                    resultadoAlunos[idcAluno] = entradaMenu.nextLine();
                }
                break;

            case "2":
                System.out.println("==================================== \\n");
                System.out.println("MATRÍCULA  NOME DO ALUNO  RESULTADO");
                System.out.println("==================================== \\n");
                for (int i = 0; i < nomeAlunos.length; i++)
                {
                    if (nomeAlunos[i].isEmpty())
                    {
                        break;
                    }

                    else
                    {
                    System.out.printf("%-11s %-16s %-10s\\n", matriculaAlunos[i], nomeAlunos[i], resultadoAlunos[i]);
                    }


                }
                System.out.println("==================================== \\n");
                break;

            case "3":
                System.out.println("==================================== \\n");
                System.out.println("MATRÍCULA  NOME DO ALUNO  RESULTADO");
                System.out.println("==================================== \\n");
                for (int i = 0; i < nomeAlunos.length; i++)
                {
                    if (nomeAlunos[i].isEmpty())
                    {
                        break;
                    }
                    if (resultadoAlunos[i].equals("A"))
                    {
                        System.out.printf("%-11s %-16s %-10s\\n", matriculaAlunos[i], nomeAlunos[i], resultadoAlunos[i]);

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
    }
    while (!escolhaMenu.equals("4"));

}
}