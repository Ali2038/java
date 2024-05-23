/*Lógica: Desenvolver um algoritmo em Java que leia (digite) o nome de todos alunos de uma determinada turma do curso de Lógica de Programação e conte a quantidade de alunos desta turma. Quando o usuário digitar o último nome, ele deverá teclar Enter para encerrar a digitação e informar a quantidade de alunos na turma.

Fazer o algoritmo utilizando o loop for ().*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
// Declaração de variáveis
String nomeAluno;

// Criação objeto de entrada de dados
Scanner entradaDados = new Scanner(Sytem.in );

//Entrada de dados em Loop
for (int qtdAluno = 1; qtdAluno > 0; qtdAluno++)
{
System.out.print("Nome do aluno: ");
nomeAluno = entradaDados.nextLine();
if (nomeAluno.equals(""))
{
System.out.println("Quantidade de alunos: " + (--qtdAluno));
break;
}
}
}
}