/*Desafio 02: Declaração de constante e/ou variáveis com operações matemáticas utilizando a lógica.

Lógica: Desenvolver um algoritmo em Java para declarar e ler as constantes e as variáveis necessárias apurar o EBTIDA, a Margem de Lucro e o Lucro Líquido de uma empresa, conforme segue.

O EBITDA ("Earnings Before Interest, Taxes, Depreciation, and Amortization", em português, Lucros Antes de Juros, Impostos, Depreciação e Amortização) é um indicador financeiro utilizado para avaliar a saúde operacional e a performance de uma empresa, medindo a sua capacidade de gerar lucro por meio das operações principais, sem considerar alguns itens não operacionais.
Fórmula básica:

EBITDA = Receita Total - Custos Variáveis - Despesas Operacionais



A Margem de Lucro mostra a eficiência da empresa em transformar suas vendas em lucro líquido.
Fórmula básica:

Margem de Lucro = Lucro Líquido ÷ Receita Total x 100



O Lucro Líquido é usado para avaliar a lucratividade de uma empresa após deduzir todas as despesas, impostos e demais custos.
Fórmula básica:

Lucro Líquido = Receita Total − Custos Totais − Despesas Totais − Impostos*/

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {

    // Declaração de constantes e varíaveis
    float receitaTotal = 0f, custosVariaveis = 0f, despesasOperacionais = 0f, custosTotais = 0f, despesasTotais =  0f, impostos = 0f;
    float ebitda = 0f, lucroLiquido = 0f,margemLucro = 0f;

//Criação do objeto "entradaDados"
Scanner entradaDados = new Scanner(http://System.in );

//Entrada de dados via teclado
 System.out.print("Qual é o valor da receita total? ");
  receitaTotal = entradaDados.nextFloat();
 System.out.print("Qual é o valor dos custos das variaveis? ");
  custosVariaveis = entradaDados.nextFloat();
 System.out.print("Qual é o valor das despesas operacionais? ");
  despesasOperacionais = entradaDados.nextFloat();
 System.out.print("Qual é o custo total? ");
  custosTotais = entradaDados.nextFloat();
 System.out.print("Qual é o valor das despesas totais? ");
  despesasTotais = entradaDados.nextFloat();
 System.out.print("Qual é o valor dos impostos? ");
   impostos = entradaDados.nextFloat();

// Calculos matemáticos
ebitda = receitaTotal - custosVariaveis - despesasOperacionais;
lucroLiquido = receitaTotal - custosTotais - despesasTotais - impostos;
margemLucro = (lucroLiquido / receitaTotal) * 100;

//Visualização de dados digitados
System.out.printf("EBITDA: R$ %,.2f\n " + ebitda);
System.out.printf("Lucro Líquido: R$ %,.2f\n " + lucroLiquido);
System.out.printf("Margem de Lucro: R$ %,.2f\n" + margemLucro + " %");
}
}