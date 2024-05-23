/*Lógica: Desenvolver um algoritmo em Java que identifique se um determinado número inteiro digitado pelo usuário é Par ou Impar.

Se o número for Par visualizar a mensagem “O número X digitado é Par”, caso contrário, ou seja, se for Impar, visualizar a mensagem “O número X digitado é Impar”.

Atenção: não utilize os operadores lógicos, somente operadores de condições lógicas.*/

import java.util.Scanner;
public class Main {
public static void main(String[] args) {

// Declaração de variáveis
int nroDigitado;
String parImpar = "Par";
// Criaçao de objeto para entrada de dados
Scanner entradaDados = new Scanner(System.in );

// Entrada de dados
System.out.print("Digite um número inteiro: ");
nroDigitado = entradaDados.nextInt();

// Estrutura de decisão sobre número Par ou Impar
	if ( nroDigitado % 2 != 0 )
{
parImpar = "Impar";
}
System.out.println("O número " +  nroDigitado + " é " + parImpar + ".");
}
}