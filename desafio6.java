/*Lógica: Complementar (melhorar) o algoritmo da prática 34 incluindo a opção 4 para “Ordenar por Matricula” e alterar a opção “Sair do sistema” para opção “5”, conforme abaixo. Manter as demais opções sem alteração.

1 – Cadastro de Alunos
2 – Relatório de todos alunos
3 – Relatório de alunos aprovados
4 – Ordenar por Matrícula
5 – Sair do sistema



Dica: Usar o método parseInt.

Este método retorna o tipo de dado primitivo número inteiro de uma determinada String.

Exemplo:

String codTxt = “5696”;
Int codNro;
// Converter o valor texto (codTxt) para número inteiro (codNro).
codNro = Integer.parseInt(codTxt);*/


import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args) {

//Declaracao das variaveis e matrizes
int capacidade = 100;
String[][] alunos = new String[capacidade][3];
int qtdAlunos = 0;

//Criacao do objeto
Scanner scanner = new Scanner(System.in);
int opcao;
do {
System.out.println("\n----- Menu -----");
System.out.println("1 – Cadastro de Alunos");
System.out.println("2 – Relatório de todos alunos");
System.out.println("3 – Relatório de alunos aprovados");
System.out.println("4 – Ordenar por matricula");
System.out.println("5 – Sair do sistema");
System.out.print("Digite a opção desejada: ");
opcao = scanner.nextInt();

//Entrada de dados
switch (opcao) {
case 1:
System.out.print("Digite a matrícula do aluno: ");
alunos[qtdAlunos][0] = scanner.next();
scanner.nextLine();
System.out.print("Digite o nome do aluno: ");
alunos[qtdAlunos][1] = scanner.nextLine();
System.out.print("Digite o resultado (A para aprovado, R para reprovado): ");
String resultado = scanner.next();
alunos[qtdAlunos][2] = resultado;
System.out.println("Aluno cadastrado com sucesso!");
qtdAlunos++;
break;
case 2:
System.out.println("\n==========================================================");
System.out.printf("%-20s%-30s%-10s\n", "MATRICULA", "NOME ALUNO", "RESULTADO");
System.out.println("==========================================================");
for (int ctd = 0; ctd < qtdAlunos; ctd++) {
System.out.printf("%-20s%-30s%-10s\n", alunos[ctd][0], alunos[ctd][1], alunos[ctd][2]);
}
System.out.println("==========================================================");
break;
case 3:
System.out.println("\n==========================================================");
System.out.printf("%-20s%-30s%-10s\n", "MATRICULA", "NOME ALUNO", "RESULTADO");
System.out.println("==========================================================");
for (int ctd = 0; ctd < qtdAlunos; ctd++) {
if (alunos[ctd][2].equals("A")) {
System.out.printf("%-20s%-30s%-10s\n", alunos[ctd][0], alunos[ctd][1], "Aprovado");
}
}
System.out.println("==========================================================");
break;
case 4:
for (int i = 0; i < qtdAlunos - 1; i++) {
for (int j = 0; j < qtdAlunos - i - 1; j++) {
if (Integer.parseInt(alunos[j][0]) > Integer.parseInt(alunos[j + 1][0])) {
String[] temp = alunos[j];
alunos[j] = alunos[j + 1];
alunos[j + 1] = temp;
}
}
}
System.out.println("\n==========================================================");
System.out.printf("%-20s%-30s%-10s\n", "MATRICULA", "NOME ALUNO", "RESULTADO");
System.out.println("==========================================================");
for (int ctd = 0; ctd < qtdAlunos; ctd++) {
System.out.printf("%-20s%-30s%-10s\n", alunos[ctd][0], alunos[ctd][1], alunos[ctd][2]);
}
System.out.println("==========================================================");
break;
case 5:
System.out.println("Saindo do sistema.");
break;
default:
System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
}
} while (opcao != 5);
}
}