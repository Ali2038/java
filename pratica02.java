/*Necessidade: Desenvolver uma estrutura de decisão. Utilize uma necessidade própria (livre). Comente o código.*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
//Declarando variavéis
String nomeAluno;
String idadeAluno;
int nroMatricula;
int qtdFalta = 0;

//Criando  objeto
Scanner entradaDados = new Scanner (System.in);

//Entrada de Dados
System.out.println("Digite o nome do aluno: ");
nomeAluno = entradaDados.nextLine();

System.out.println("Digite a idade do aluno: ");
idadeAluno = entradaDados.nextLine();

System.out.println("Digite o número da matrícula: ");
nroMatricula = entradaDados.nextInt();

System.out.println("Quantidade de faltas: ");
qtdFalta = entradaDados.nextInt();


//Estrutura de decisao

if (qtdFalta >= 130){
    System.out.println("|REPROVADO POR FALTA|");
}
   else
   { System.out.println ("|APROVADO|");

   }

}
}