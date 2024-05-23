/*Lógica: Desenvolver um algoritmo em Java para digitar os nomes dos alunos de uma determinada turma.

Se o operador teclar “Enter” sem nada digitado no nome, o sistema deverá  listar todos os nomes digitados e depois finalizar.



Orientações sobre ArrayList:

Importar a biblioteca:  import java.util.ArrayList;

ArryList<tipo> – Tipo
add(valor) – Adiciona novo valor
get(índice) – Pega valor no índice
size() – Tamanho a lista
clear() – Limpa a lista*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
// criação do Array List
ArrayList<String> listaAlunos = new ArrayList<>();

    // criação do loop
    Scanner leitorAlunos = new Scanner(System.in);
    while (true)
    {
        // entrada de dados no Array
        System.out.print("Digite o nome do aluno ou enter para sair: ");
        String nomeAluno = leitorAlunos.nextLine();

        // verifica se a entrada está vazia
        if (nomeAluno.isEmpty())
        {
            break;
        }

        // adiciona o nome do aluno à lista
        listaAlunos.add(nomeAluno);
    }

    // imprime a lista de alunos
    System.out.println("Lista de alunos:");
    for (int i = 0;i < listaAlunos.size();i++)
    {
        System.out.println("- " + listaAlunos.get(i));
    }
}
}