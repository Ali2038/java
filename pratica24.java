/*Lógica: Desenvolver um algoritmo em Java para determinar se um aluno foi aprovado ou reprovado no curso de Lógica de Programação.
Entrar com o nome do aluno, a nota da Prova, a nota do Trabalho, a quantidade de faltas em horas/aulas e a nota da prova de recuperação, caso tenha.
O aluno estará aprovado se sua média normal for superior ou igual a sete e se tiver frequentado entre 80% a 100% das 80 horas/aulas do curso.
Caso o aluno não obtenha a aprovação, mas sua média normal foi superior ou igual a 50% e sua frequência superior ou igual a 80%, ele poderá realizar a Prova de Recuperação. No caso de recuperação a média final de aprovação deverá considerar a nota da Prova de Recuperação.
As notas das provas e do trabalho deverão ser na escala de 0 a 10, permitindo frações no número.

Média Normal = ( nota da Prova x 70% ) + ( nota do Trabalho x 30%)

Média Final = (Média Normal + ( nota da Prova de Recuperação x 70% )) / 2

Usar obrigatoriamente a estrutura de decisão if com else if e um ou mais operadores lógicos de condições compostas, conforme apresentado em sala de aula, também de ser considerado o uso dos métodos Strings e dos métodos Matemáticos que foram apresentados.*/

import java.lang.Math;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//Declaração de variáveis
String nomeAluno;
int qtdFaltas;
float notaProva, notaTrabalho, notaRecuperacao, mediaNormal, mediaFinal;

//Criação de objeto de entrada de dados
Scanner entradaDados = new Scanner(System.in);

//Entrada de dados
System.out.print("Nome do aluno: ");
nomeAluno = entradaDados.nextLine();
System.out.print("Nota prova: ");
notaProva = entradaDados.nextFloat();
System.out.print("Nota trabalho: ");
notaTrabalho = entradaDados.nextFloat();
System.out.print("Faltas: ");
qtdFaltas = entradaDados.nextInt();

//Estruturas de decisão e operações
if ((80 - qtdFaltas) < (80 0.80))
{
System.out.println("Aluno reprovado por falta!");
}
else
{
mediaNormal = (notaProva \ 0.70f) + (notaTrabalho * 0.30f);
if (mediaNormal >= 7)
{
System.out.println("Aluno aprovado com a média de " + String.format("%,.2f", mediaNormal));
}
else if (mediaNormal >= Math.abs(5))
{
System.out.print("Nota de recuperação: ");
notaRecuperacao = entradaDados.nextFloat();
mediaFinal = (mediaNormal + (notaRecuperacao * 0.70f)) / 2;
if (mediaFinal >= 7)
{
System.out.println("Aluno" + nomeAluno + "aprovado com a média final de " + String.format("%,.2f", mediaFinal));
}
else
{
//uso do metodo String

System.out.println("nome do aluno:" + nomeAluno.toLowerCase());
System.out.println("Aluno reaprovado com a média final de " + String.format("%,.2f", mediaFinal));
}
}
else
{
//uso do metodo String

System.out.println("nome do aluno:" + nomeAluno.toLowerCase());
System.out.println("Aluno reprovado com a média de " + String.format("%,.2f", mediaNormal));
}
}
}
}