/*Lógica: Desenvolver um algoritmo em Java que leia (digite) todos os valores da tabela do IRRF abaixo./*

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
// Declaração de variáveis
int qtdFaixa = 0;
float vlrBaseCalculo = 1, percentualAliquota, vlrDeducao;

// Criação do objeto de entrada de dados
Scanner entradaDados = new Scanner(System.in );

// Estrutura de repetição, entrada de dados e decisão de saída
while ( true )
{
qtdFaixa++;
System.out.println("Faixa: " + qtdFaixa);
System.out.print("Valor base de cálculo: ");
vlrBaseCalculo = entradaDados.nextFloat();
if (vlrBaseCalculo < 0)
{
break;
}
System.out.print("Alíquota: ");
percentualAliquota = (entradaDados.nextFloat())/100;
System.out.print("Dedução : ");
vlrDeducao = entradaDados.nextFloat();
System.out.println("=======================================");
}
}
}