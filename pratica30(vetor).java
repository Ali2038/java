/*Lógica: Desenvolver um algoritmo em Java que leia (digite) o nome de todos alunos de uma determinada turma do curso de Lógica de Programação e conte a quantidade de alunos desta turma. Quando o usuário digitar o último nome, ele deverá teclar Enter para encerrar a digitação e imprimir todos alunos digitados e no final imprimir a quantidade de alunos na turma.

Exemplo:

=======================

NOME DO ALUNO

=======================

Francisco da Cruz

Maria Ferreira Silva
Sebastião Bartolomeu
Goianir Parente
Priscila Alencar

=======================

Quantidade de alunos: 5

=======================
*/

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    //criacao do vetor

    String[] nomeAlunos = new String [50];




    //criacao do objeto

    Scanner entradaVetor = new Scanner([http://System.in](http://System.in "smartCard-inline") );


    //criacao do loop

    for (int ctd = 0;ctd <= nomeAlunos.length;ctd ++)

    {

        System.out.println ("nome do aluno: ");

        nomeAlunos[ctd] = entradaVetor.nextLine();


        if (nomeAlunos[ctd].isEmpty())

        {

            System.out.println("=============================");

            System.out.println("NOME DO ALUNO ");

            System.out.println("=============================");

            for (int idc = 0;idc < ctd;idc ++)

            {

                System.out.println(nomeAlunos[idc]);

            }

            System.out.println("=============================");

            System.out.println("quantidade total de alunos: " + (ctd));

            System.out.println("=============================");

            break;

        }


    }

}
}