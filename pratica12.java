/*Lógica: Sem a explicação verbal do professor, desenvolver um algoritmo em Java para entrada (leitura) de dois textos e cinco números inteiros.

Informe se os dois textos são iguais ou se são diferentes;

Informe apenas se o primeiro número é igual ao quinto número;

Informe se o segundo número é maior que o primeiro número. Sendo maior, somar o terceiro e quarto números e se esta soma for maior que quinto número, informar a soma do terceiro e quarto números, caso contrário informar somente o terceiro número;

Informe se o terceiro é diferente da subtração entre o segundo e terceiro números.

Atenção: não utilize os operadores lógicos, 
somente operadores de condições lógicas.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Declaração de constantes e variáveis
        String textoUm, textoDois;
        int nroUm, nroDois, nroTres, nroQuatro, nroCinco, somaNrotresNroquatro = 0;
        // Criação objeto de entrada de dados
        Scanner entradaDados = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Primeiro texto: ");
        textoUm = entradaDados.nextLine();
        System.out.print("Segundo texto: ");
        textoDois = entradaDados.nextLine();
        System.out.print("Primeiro número: ");
        nroUm = entradaDados.nextInt();
        entradaDados.nextLine();
        System.out.print("Segundo número: ");
        nroDois = entradaDados.nextInt();
        entradaDados.nextLine();
        System.out.print("Terceiro número: ");
        nroTres = entradaDados.nextInt();
        entradaDados.nextLine();
        System.out.print("Quarto número: ");
        nroQuatro = entradaDados.nextInt();
        entradaDados.nextLine();
        System.out.print("Quinto número: ");
        nroCinco = entradaDados.nextInt();
        entradaDados.nextLine();
        //Estrutura de decisão simples
        if (textoUm.equals(textoDois)) {
            System.out.println("Textos iguais");
        } else {
            System.out.println("Textos diferentes");
        }
        if (nroUm == nroCinco) {
            System.out.println("Primeiro número é igual ao quinto número.");
        }
        if (nroDois > nroUm) {
            System.out.println("Segundo número é maior que primeiro número.");
            somaNrotresNroquatro = nroTres + nroQuatro;
            if (somaNrotresNroquatro > nroCinco) {
                System.out.println("Soma do Terceiro e Quarto números: " + somaNrotresNroquatro);
            } else {
                System.out.println("Terceiro número: " + nroTres);
            }
        }
        if (nroTres != (nroDois - nroTres)) {
            System.out.printf("Terceiro número é diferente da subtração do segundo e terceiro.");
        }
    }
}