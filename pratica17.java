/*Lógica: Desenvolver um algoritmo em Java que entre com um número inteiro qualquer e que imprima na tela a soma acumulativa deste mesmo número 10 vezes.

Por exemplo, suponha que foi informado (digitado) o número 8,
então teríamos:

Acumulação 1 : 8
Acumulação 2 : 16
Acumulação 3 : 32
Acumulação 4 : 64
Acumulação 5 : 128
Acumulação 6 : 256
Acumulação 7 : 512
Acumulação 8 : 1024
Acumulação 9 : 2048
Acumulação 10 : 4096*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
// Declaração de variáveis
int nroDigitado;

// Criação do objeto de entrada de dados
Scanner entradaDados = new Scanner(System.in );

// Entrada de dados
System.out.print("Informe um número inteiro: ");
nroDigitado = entradaDados.nextInt();

// Estrutura de repetição
for (int ctd = 1; ctd <= 10; ctd++)
{
System.out.println("Acumulação " + ctd + " : " + nroDigitado);
nroDigitado = nroDigitado + nroDigitado;
}
}
}