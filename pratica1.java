/*Necessidade: Desenvolver uma estrutura de sequência. Utilize uma necessidade própria (livre). Comente o código.*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {

    int qtdProduzidos,qtdPerdidos,vlrProdutosFinal,basePrejuizo;//declar as variaveis necessarias

    Scanner entradaDados = new Scanner(System.in);  //criacao do objeto para receber os dados
    for(;;)
    {

    System.out.print("Digite a quantidade total de produtos produzidos no dia ou Digite '0' para fechar o sistema.: "); //entrada de dados do total de produtos produzidos
    qtdProduzidos = entradaDados.nextInt();
    if (qtdProduzidos == 0) //se digitar zero,vai sair do loop
    {
        System.out.print("Encerrando...");
        break;
    }

    System.out.print("Digite a quantidade  total de  produtos perdidos em transporte: "); //entrada de dados do total de produtos perdidos

    qtdPerdidos = entradaDados.nextInt();
    vlrProdutosFinal = qtdProduzidos - qtdPerdidos; //subtracao para o total de produtos restantes

    System.out.print("Digite a base do prejuizo: "); //entrada de dados do total de produtos produzidos
    basePrejuizo = entradaDados.nextInt();

    System.out.println("Total de produtos restantes: " + vlrProdutosFinal); //apresentacao do total de produtos restantes

    if (vlrProdutosFinal > basePrejuizo) //verificar se a loja está em prejuizo,sendo o produto final maior do que a base do prejuizo
    {
        System.out.print("A loja nao está em prejuizo.");
    }
    else
    {
        System.out.print("A loja está em prejuizo.");
    }
    }
}
}
