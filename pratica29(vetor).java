/*Lógica: Desenvolver um algoritmo em Java para selecionar (ler) um número de 1 a 7 e imprimir qual dia da semana, do número correspondente, de acordo com os seguinte valores:
[Domingo,Segunda,Terça,Quarta,Quinta,Sexta,Sábado]

Número correspondentes seria, 1 para Domingo, 2 para Segunda e assim por diante.

Se o operador digitar o número diferente de 1 a 7 o sistema deverá informar que é uma entrada inválida e solicitar novamente a digitação do número.

O sistema deverá solicitar a digitação do número até que o operador digite o número 0 (zero) para encerrar o sistema.*/

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
//criacao do vetor
String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
int numero;

    //criacao do objeto
    Scanner entradaVetor = new Scanner(System.in);

    //criacao do loop

    while (true)
    {
        System.out.println("Digite um número de 1 a 7 ou 0 para encerrar o sistema:");
         numero = entradaVetor.nextInt();

        if (numero == 0)
        {
            System.out.println("Sistema encerrado");
            break;
        }
        else if (numero >= 1 && numero <= 7)
        {
            System.out.println("Dia da semana correspondente: " + diasSemana[numero - 1]);
        }
        else
        {
            System.out.println("Entrada inválida. Digite novamente.");
        }
    }

}
}
