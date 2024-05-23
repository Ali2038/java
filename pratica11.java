/*Lógica: No Brasil uma pessoa é maior de idade se tem 18 anos ou mais. Desenvolver um algoritmo que entre com o nome da pessoa e sua idade em anos, que verifique se a pessoa é maior ou não de idade e que mostre “Maior de idade”, se a pessoa é maior de idade, ou “Menor de idade” se a pessoa é menor de idade.

Atenção: não utilize os operadores lógicos, 
somente operadores de condições lógicas.*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
//declaração e atribuição de variavéis
String nomePessoa;
byte idadePessoa;

    //criação do objeto
    Scanner entradaDados = new Scanner (System.in);

    //entrada de entradaDados
    System.out.print("Qual é o seu nome? ");
    nomePessoa = entradaDados.nextLine();

    System.out.print("Qual é a sua idade? ");
    idadePessoa = entradaDados.nextByte();
    if (idadePessoa >= 18)
    {
        System.out.print("Maior de idade");
    }
    else
    {
        System.out.print("Menor de idade");
    }

}
}