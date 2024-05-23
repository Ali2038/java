/*Prática 08: Declaração de constante e variáveis com operações matemáticas utilizando a lógica.

Lógica: Desenvolver um algoritmo em Java para declarar para o cálculo da área de um círculo que apresenta um determinado número em centímetros de raio.

Atribua, leia e visualize os valores compatíveis com esta lógica.
Usar somente os operadores básicos*/

import java.util.Scanner;

public class Main
{
public static void main(String[] args) {
//constante e variáveis
final float VLR_PI = 3.14f;
float vlrRaioCirculo = 0f;
float vlrResultadoCentimetros = 0f;

//criação do objeto
Scanner entradaDados = new Scanner(http://System.in );

//entrada de dados via teclado
System.out.print("Qual é o raio do circulo? ");
vlrRaioCirculo = entradaDados.nextFloat();

//cálculos matemáticos

vlrResultadoCentimetros = VLR_PI * (vlrRaioCirculo * vlrRaioCirculo);

//visualizar
System.out.printf("Resultado da área do círculo é de: %,.2f cm² \n", vlrResultadoCentimetros);
}
}