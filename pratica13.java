/*Lógica: Sem a explicação verbal do professor, desenvolver um algoritmo em Java para entrada (leitura) de dois textos e cinco números inteiros.

Informe se os dois textos são iguais ou se são diferentes;

Informe apenas se o primeiro número é igual ao quinto número;

Informe se o segundo número é maior que o primeiro número. Sendo maior, somar o terceiro e quarto números e se esta soma for maior que quinto número, informar a soma do terceiro e quarto números, caso contrário informar somente o terceiro número;

Informe se o terceiro é diferente da subtração entre o segundo e terceiro números.

Atenção: não utilize os operadores lógicos, 
somente operadores de condições lógicas.*/

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
// Declaração de variáveis e constantes
String nomePessoa;
float vlrSalarioPessoa, vlrSalarioPessoaComIrff, vlrSalarioFaixaCinco = 4664.68f, resultadoIrrf;
float vlrSalarioFaixaUm = 2112f, vlrMaximoFaixaDois = 2826.65f,vlrMaximoFaixaTres = 3751.05f,
vlrSalarioFaixaDois = 2112.01f,vlrSalarioFaixaQuatro = 3751.06f;
final float VLR_ALIQUOTA_DOIS = 0.075f, VLR_ALIQUOTA_TRES = 0.15f, VLR_ALIQUOTA_QUATRO = 0.225f, VLR_ALIQUOTA_CINCO = 0.275f;
final float VLR_DEDUCAO_FAIXA_DOIS = 158.40f, VLR_DEDUCAO_FAIXA_TRES = 370.40f, VLR_DEDUCAO_FAIXA_QUATRO = 651.73f, VLR_DEDUCAO_FAIXA_CINCO = 884.96f;

    // Criação do objeto
    Scanner entradaDados = new Scanner(System.in);

    // Leitura de dados
    System.out.print("Qual é o nome da pessoa? ");
    nomePessoa = entradaDados.nextLine();

    System.out.print("Qual é o valor do salário? ");
    vlrSalarioPessoa = entradaDados.nextFloat();

    // Resolução
    if (vlrSalarioPessoa <= vlrSalarioFaixaUm)
        {
            System.out.print("Você está insento de irrf");
        }
         if (vlrSalarioPessoa >= vlrSalarioFaixaDois)
                {
                    if ( vlrSalarioPessoa <= vlrMaximoFaixaDois)
                        {
                        resultadoIrrf = (vlrSalarioPessoa * VLR_ALIQUOTA_DOIS) - VLR_DEDUCAO_FAIXA_DOIS;
                        System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);
                        }
                        }
        if (vlrSalarioPessoa >= vlrMaximoFaixaDois)
            {
                    if (vlrSalarioPessoa <= vlrMaximoFaixaTres)
                     {
                        resultadoIrrf =(vlrSalarioPessoa * VLR_ALIQUOTA_TRES) - VLR_DEDUCAO_FAIXA_TRES;
                        System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);
                     }
                }
        if (vlrSalarioPessoa >= vlrSalarioFaixaQuatro)
                        {
                    if (vlrSalarioPessoa <= vlrSalarioFaixaCinco)
                                {
                        resultadoIrrf = (vlrSalarioPessoa * VLR_ALIQUOTA_QUATRO) - VLR_DEDUCAO_FAIXA_QUATRO;
                        System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);
                                }
                        }
                    if (vlrSalarioPessoa > vlrSalarioFaixaCinco)
                        {
                        resultadoIrrf = (vlrSalarioPessoa * VLR_ALIQUOTA_CINCO) - VLR_DEDUCAO_FAIXA_CINCO;
                        System.out.printf("O valor do irrf será: $%,.2f", resultadoIrrf);
                        }
}
}