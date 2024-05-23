/*Prática 05: Declaração de constante e variáveis com operações matemáticas utilizando a lógica.

Lógica: Desenvolver um algoritmo em Java para declarar pelo menos uma constante e as variáveis necessárias para o cálculo da área de um círculo que apresenta um determinado número em centímetros de raio. Atribua e visualize os valores compatíveis com esta lógica. Usar somente os operadores básicos.*/

public class Main
{
public static void main (String[]args)
{
// Declaracao e atribuicao de variaveis
final float VLR_PI = 3.1415f;
float medidaRaio = 10.00f;
float areaCirculo = 0.00f;
//Calculo da area do circulo
areaCirculo = (medidaRaio * medidaRaio) * VLR_PI;
//Visualização do resultado
System.out.printf ("O valor da área do circulo é %,.2f cm2 ", areaCirculo);
}
}