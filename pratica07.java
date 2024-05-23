/******************************************************************************

Desenvolver um algoritmo em Java para declarar as constantes e as variáveis necessárias para obter o valor do IRRF
(Imposto de Renda Retido na Fonte) da colaboradora Cleide de Almeida Paes que tem o salário de Base de Cálculo de R$
4.350,00.

*******************************************************************************/
public class Main
{
public static void main(String[] args) {
//variáveis e constantes
float salarioColaborador = 4350f;
float vlrAliquota = 0.225f;
float vlrDeducao = 651.73f;
float resultadoCalculoIrrf = 0f;

    //cálculos matemáticos
    resultadoCalculoIrrf = (salarioColaborador * vlrAliquota) - vlrDeducao;




    //visualizar
    System.out.printf("Salário do colaborador é : %,.2f\\n", salarioColaborador);
    System.out.printf("O valor do irff é de: %,.2f", resultadoCalculoIrrf);
}
}