/*Lógica: Desenvolver um algoritmo em Java que que leia dois números e imprima todos os números inteiros entre eles.*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
// Declaração de variáveis
int nroInicial, nroFinal;

// Criação objeto de entrada de dados
Scanner entradaDados = new Scanner(System.in);

//Entrada de dados
System.out.print("Número inicial: ");
nroInicial = entradaDados.nextInt();
System.out.print("Número final: ");
nroFinal = entradaDados.nextInt();

// Operação números entre número incial e número final
while (nroInicial < nroFinal - 1)
{
nroInicial++;
System.out.println(nroInicial);
}
}
}