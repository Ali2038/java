/*Vetor – Nomes na ordem inversa de entrada*/

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    //criacao do vetor

    String[] nomes = new String[5];


    // Criação do objeto de entrada de dados

    Scanner entradaVetor = new Scanner(System.in) );


    //loop

    for (int indiceVetor = 0; indiceVetor < nomes.length; indiceVetor++)

    {

        System.out.println(" Entre com um nome : ");

        nomes[indiceVetor] = entradaVetor.nextLine();

    }


    for ( int indiceVetor = nomes.length - 1; indiceVetor >= 0; indiceVetor--)

    {

        System.out.println("o nome no indice " + indiceVetor +": "+ nomes[indiceVetor] );

    }




}


}
