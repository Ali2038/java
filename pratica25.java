/*Lógica: Desenvolver um algoritmo em Java para declarar as constantes e as variáveis necessárias para obter o valor do IRRF de qualquer pessoa. Informar o nome e o salário de Base de Cálculo do IRRF das pessoas até terminar a quantidade de pessoas que necessitam desse cálculo. Os dados da tabela de IRRF devem ser atribuídos à variáveis.
A fórmula básica para calcular o IRRF sobre o salário é: IRRF = (Base de cálculo * Alíquota) – Dedução Onde:
Base de cálculo é o valor sobre o qual será aplicada a alíquota do imposto.
Alíquota é a porcentagem a ser aplicada sobre a base de cálculo. As alíquotas variam de acordo com a faixa de renda e o tipo de rendimento.
Dedução é um valor fixo que pode ser deduzido do imposto devido, também determinado de acordo com a legislação vigente.*/

import java.util.Scanner;

‌

public class Main {

public static void main(String[] args) {
// Declaração de variáveis e constantes

    String nomePessoa;

    float vlrSalarioPessoa, vlrSalarioPessoaComIrff, vlrSalarioFaixaCinco = 4664.68f, resultadoIrrf;

    float vlrSalarioFaixaUm = 2112f, vlrMaximoFaixaDois = 2826.65f,vlrMaximoFaixaTres = 3751.05f,

            vlrSalarioFaixaDois = 2112.01f,vlrSalarioFaixaQuatro = 3751.06f;

    final float VLR\_ALIQUOTA\_DOIS = 0.075f, VLR\_ALIQUOTA\_TRES = 0.15f, VLR\_ALIQUOTA\_QUATRO = 0.225f, VLR\_ALIQUOTA\_CINCO = 0.275f;

    final float VLR\_DEDUCAO\_FAIXA\_DOIS = 158.40f, VLR\_DEDUCAO\_FAIXA\_TRES = 370.40f, VLR\_DEDUCAO\_FAIXA\_QUATRO = 651.73f, VLR\_DEDUCAO\_FAIXA\_CINCO = 884.96f;
‌

    // Criação do objeto

    Scanner entradaDados = new Scanner([http://System.in](http://System.in "smartCard-inline") );
‌

    // Leitura de dados

    System.out.print("Qual é o nome da pessoa? ");

    nomePessoa = entradaDados.nextLine();
‌

    System.out.print("Qual é o valor do salário? ");

    vlrSalarioPessoa = entradaDados.nextFloat();
‌

    // Resolução

    if (vlrSalarioPessoa <= vlrSalarioFaixaUm)

    {

        System.out.print("Você está insento de irrf");

    }

    else if (vlrSalarioPessoa >= vlrSalarioFaixaDois && (vlrSalarioPessoa <= vlrMaximoFaixaDois))

    {

            resultadoIrrf = (vlrSalarioPessoa * VLR\_ALIQUOTA\_DOIS) - VLR\_DEDUCAO\_FAIXA_DOIS;

            System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);

    }

    else if (vlrSalarioPessoa >= vlrMaximoFaixaDois && (vlrSalarioPessoa <= vlrMaximoFaixaDois))

    {

            resultadoIrrf =(vlrSalarioPessoa * VLR\_ALIQUOTA\_TRES) - VLR\_DEDUCAO\_FAIXA_TRES;

            System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);

    }

    else if (vlrSalarioPessoa >= vlrSalarioFaixaQuatro && (vlrSalarioPessoa <= vlrSalarioFaixaCinco))

    {

            resultadoIrrf = (vlrSalarioPessoa * VLR\_ALIQUOTA\_QUATRO) - VLR\_DEDUCAO\_FAIXA_QUATRO;

            System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);

    }

    else (vlrSalarioPessoa > vlrSalarioFaixaCinco)

    {

        resultadoIrrf = (vlrSalarioPessoa * VLR\_ALIQUOTA\_CINCO) - VLR\_DEDUCAO\_FAIXA_CINCO;

        System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);

    }

}
}