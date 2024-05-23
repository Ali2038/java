/*Necessidade: Desenvolver uma estrutura de sequência. Utilize uma necessidade própria (livre). Comente o código.*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {

    int qtdProduzidos,qtdPerdidos,vlrProdutosFinal;//declar as variaveis necessarias

    Scanner entradaDados = new Scanner(System.in);  //criacao do objeto para receber os dados

    System.out.print("Digite a quantidade total de produtos produzidos: "); //entrada de dados do total de produtos produzidos
    qtdProduzidos = entradaDados.nextInt();

    System.out.print("Digite a quantidade  total de  produtos perdidos em transporte: "); //entrada de dados do total de produtos perdidos

    qtdPerdidos = entradaDados.nextInt();
    vlrProdutosFinal = qtdProduzidos - qtdPerdidos; //subtracao para o total de produtos restantes

    System.out.println("Total de produtos restantes: " + vlrProdutosFinal); //apresentacao do total de produtos restantes

}
}