/*Prática 04: Declaração e operações matemáticas utilizando a lógica.

Lógica: Desenvolver um algoritmo em Java para declarar as variáveis necessárias para as operações abaixo. Atribua e visualize os valores compatíveis com esta lógica.

Utilizando variáveis:
Deduzir 120 de 268;
Somar o resultado do item “a)” mais 125;
Multiplicar 9.876.987 pelo resultado do item “b)”;
Dividir 1.000 por 3;
Multiplicar o resultado do item “d)” por 3;
Soma os resultados dos itens “a)”, “b)”, “c)”, “d)” e “e)”*/

public class Main
{
public static void main(String[] args)
{
//Declaração de variáveis e/ou constantes
final byte VLR_NUMERO = 3;
// Opção a)
byte vlrOperador1 = 120;
short vlrOperador2 = 268;
float vlrResultadoA = 0f;
// Opção b)
byte vlrOperador3 = 125;
float vlrResultadoB = 0f;
// Opção c)
int vlrOperador4 = 9876987;
float vlrResultadoC = 0f;
// Opção d)
short vlrOperador5 = 1000;
float vlrResultadoD = 0f;
// Opção e)
float vlrResultadoE = 0f;
// Opção f)
float vlrResultadoF = 0f;

    //Operações matemáticas
    vlrResultadoA = vlrOperador2 - vlrOperador1;    // Opção a)
    vlrResultadoB = vlrResultadoA + vlrOperador3;   // Opção b)
    vlrResultadoC = vlrOperador4 * vlrResultadoB;   // Opção c)
    vlrResultadoD = vlrOperador5 / VLR_NUMERO;      // Opção d)
    vlrResultadoE = vlrResultadoD * VLR_NUMERO;     // Opção e)
    vlrResultadoF = vlrResultadoA + vlrResultadoB + vlrResultadoC +
                    vlrResultadoD +vlrResultadoE;

    //Visualização dos resultados
    System.out.println("Resultado opção a) " + vlrResultadoA);
    System.out.printf("Resultado opção b) %,.2f\\n", vlrResultadoB);
    System.out.printf("Resultado opção c) %,.2f\\n", vlrResultadoC);
    System.out.printf("Resultado opção d) %,.2f\\n", vlrResultadoD);
    System.out.printf("Resultado opção e) %,.2f\\n", vlrResultadoE);
    System.out.printf("Resultado opção f) %,.2f\\n", vlrResultadoF);
}