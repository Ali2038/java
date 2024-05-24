/*Lógica: Desenvolver um algoritmo em Java que leia (digite) um texto qualquer e informe a quantidade de caracteres totais deste texto, incluindo os espações, e a quantidade de cada vogais (a, e, i, o, u) neste texto:

Texto para testar este algoritmo. Leia  ele antes de construir o algoritmo:

Uma String em Java é um objeto que contém operações (métodos) que podem realizar certas operações. A String contém uma coleção de caracteres (Unicode) entre aspas duplas, ou seja, Strings são usadas para armazenar texto.

Dois métodos comuns em Strings são length() e charAt().

O length() é um método do objeto String que retorna a quantidade de caracteres (comprimento ou tamanho) que contém uma constante ou variável do tipo String. O comprimento de uma String vazia é 0 (zero).

O charAt() é o método do objeto String que retorna o caractere na posição (índice) especificada em uma constante ou variável do tipo String. O índice do primeiro caractere é 0 (zero), o segundo caractere é 1 e assim por diante.

Atenção: Quando for incluir no algoritmo, coloque tudo em um único texto entre “”, não utilize a quebra de linha./*

import java.util.Scanner;
public class Main {

public static void main(String[] args) {
Scanner entradaDados = new Scanner(http://System.in );
//declaracao de variaveis
String texto;
char caracter;
int totalCaracteres = 0;
int vogalA = 0, vogalE = 0, vogalI = 0, vogalO = 0, vogalU = 0;
int ctd = 0;

// Leitura de dados
System.out.print("texto: ");
texto = entradaDados.nextLine();

// Contar os caracteres do texto
totalCaracteres = texto.length();

// Loop e decisões
while (ctd < totalCaracteres)
{
caracter = texto.charAt(ctd++);

if (caracter == 'A')
{
vogalA++;
}
if(caracter == 'a')
{
vogalA++;
}

if (caracter == 'E')
{
vogalE++;
}
if (caracter == 'e')
{
vogalE++;
}

if (caracter == 'I')
{
vogalI++;

}
if (caracter == 'i')
{
vogalI++;
}

if (caracter == 'O')
{
vogalO++;
}
if (caracter == 'o')
{
vogalO++;
}

if (caracter == 'U')
{
vogalU++;
}
if(caracter == 'u')
{
vogalU++;
}

}

// Visualizar
System.out.println("O texto possui: " + totalCaracteres + " caracteres.");
System.out.println("Total de vogais A: " + vogalA);
System.out.println("Total de vogais E: " + vogalE);
System.out.println("Total de vogais I: " + vogalI);
System.out.println("Total de vogais O: " + vogalO);
System.out.println("Total de vogais U: " + vogalU);
}
}