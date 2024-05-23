/*Lógica: Desenvolver um algoritmo em Java que leia (digite) um texto qualquer e informe a quantidade de caracteres totais deste texto, incluindo os espaços e a quantidade de cada vogais (a, e, i, o, u) neste texto:

Atenção: nesta prática você deve usar “else if” e um ou mais operadores lógicos “&&” ou “||” em condição composta, conforme explicado em sala de aula.

Texto para testar este algoritmo. Leia  ele antes de construir o algoritmo:

Uma String em Java é um objeto que contém operações (métodos) que podem realizar certas operações. A String contém uma coleção de caracteres (Unicode) entre aspas duplas, ou seja, Strings são usadas para armazenar texto.

Dois métodos comuns em Strings são length() e charAt().

O length() é um método do objeto String que retorna a quantidade de caracteres (comprimento ou tamanho) que contém uma constante ou variável do tipo String. O comprimento de uma String vazia é 0 (zero).

O charAt() é o método do objeto String que retorna o caractere na posição (índice) especificada em uma constante ou variável do tipo String. O índice do primeiro caractere é 0 (zero), o segundo caractere é 1 e assim por diante.

Atenção: Quando for incluir no algoritmo, coloque tudo em um único texto entre “”, não utilize a quebra de linha.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        // Declaração de variáveis
        String txtDigitado;
        int qtdCaracteresTexto;
        short qtdLetraA=0, qtdLetraE=0, qtdLetraI=0, qtdLetraO=0, qtdLetraU=0;
        char letraTexto;
	//criacao entrada dados
        Scanner entradaTexto = new Scanner(System.in);
        System.out.print("Texto: ");
        txtDigitado = entradaTexto.nextLine();
        txtDigitado = txtDigitado.toLowerCase();
        qtdCaracteresTexto = txtDigitado.length();
        for (int ctdCaracteres = 0; ctdCaracteres < qtdCaracteresTexto; ctdCaracteres++)
        {
            letraTexto = txtDigitado.charAt(ctdCaracteres);
            if (letraTexto == 'a') qtdLetraA++;
            else if (letraTexto =='e') qtdLetraE++;
            else if (letraTexto == 'i') qtdLetraI++;
            else if (letraTexto =='o') qtdLetraO++;
            else if (letraTexto == 'u') qtdLetraU++;
        }
        System.out.println("Total de caracteres no texto: " + qtdCaracteresTexto);
        System.out.println("Total de vogal 'a' no texto: " + qtdLetraA);
        System.out.println("Total de vogal 'e' no texto: " + qtdLetraE);
        System.out.println("Total de vogal 'i' no texto: " + qtdLetraI);
        System.out.println("Total de vogal 'o' no texto: " + qtdLetraO);
        System.out.println("Total de vogal 'u' no texto: " + qtdLetraU);
    }
}