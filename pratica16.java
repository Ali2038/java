/*Lógica: Desenvolver um algoritmo em Java para determinar se um aluno foi aprovado ou reprovado no curso de Lógica de Programação.

Entrar com o nome do aluno, a nota da Prova, a nota do Trabalho, quantidade de faltas em horas/aulas e a nota da prova de recuperação, caso tenha.

O aluno estará aprovado se sua média normal for superior ou igual a sete e se tiver frequentado entre 80% a 100% das 80 horas/aulas do curso.

Caso o aluno não obtenha a aprovação, mas sua média normal foi superior ou igual a 50% e sua frequência superior ou igual a 80%, ele poderá realizar a Prova de Recuperação. No caso de recuperação a média final de aprovação deverá considerar a nota da Prova de Recuperação.

As notas das provas e do trabalho deverão ser na escala de 0 a 10, permitindo frações no número.

Média Normal =  ( nota da Prova x 70% ) + ( nota do Trabalho  x  30%)

Média Final = Média Normal + ((  nota da Prova de Recuperação  x 70% ) / 2 )

Atenção: não utilize os operadores lógicos, 
somente operadores de condições lógicas .*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
//Declaração de variáveis
String nomeAluno;
int qtdFaltas;
float notaProva, notaTrabalho, notaRecuperacao, mediaNormal, mediaFinal;

//Criação de objeto de entrada de dados
Scanner entradaDados = new Scanner(System.in );

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
mediaNormal = (notaProva \ 0.70f) + (notaTrabalho 0.30f);
if (mediaNormal >= 7)
{
System.out.printf("Aluno aprovado com a média de %,.2f\n .", mediaNormal);
}
else
{
if (mediaNormal >= 5)
{
System.out.printf("Aluno deverá realizar a prova de recuperação. Sua média foi %,.2f\n .", mediaNormal);
System.out.print("Nota de recuperação: ");
notaRecuperacao = entradaDados.nextFloat();
mediaFinal = (mediaNormal + (notaRecuperacao 0.70f)) / 2;
if (mediaFinal >= 7)
{
System.out.printf("Aluno aprovado com a média final de %,.2f\n .", mediaFinal);
}
else
{
System.out.printf("Aluno reaprovado com a média final de %,.2f\n .", mediaFinal);
}
}
}
}
}
}