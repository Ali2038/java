/*Lógica: Analise o algoritmo abaixo do método de seleção (selection sort) para ordenação de vetores em ordem crescente e desenvolva um algoritmo em Java que entre (digitação) com 15 números (inteiros) em um vetor, coloque este vetor em ordem decrescente e imprima todo o vetor ordenado decrescentemente.*/

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in );

    //declaracao de variaveis
    int[] vetor = new int[15];
    int tamanhoVetor = vetor.length;

    //preenche o vetor
    for (int i = 0; i < tamanhoVetor; i++)
    {
        System.out.print("Digite o " + (i + 1) + "º valor: ");
        vetor[i] = scanner.nextInt();
    }

    //ordena o vetor pelo metodo de selecao
    for (int idcVetor = 0; idcVetor < tamanhoVetor - 1; idcVetor++)
    {
        int idcMaiorValor = idcVetor; //considera o valor atual como o maior valor (com base no indice)

        //varre o vetor a partir do próximo valor do for externo (for interno)
        for (int j = idcVetor + 1; j < tamanhoVetor; j++)
        {

            //compara se o valor do for externo é menor que o valor que o valor deste for interno
            if (vetor[j] > vetor[idcMaiorValor])
            {

                idcMaiorValor = j; // sendo menor iguala os indices do for interno com o for externo

            }

        }

        //após varrer o for interno,verifica se os indices sao diferentes para troca de posicao
        if (idcVetor != idcMaiorValor)
        {

            //sendo indice diferente,troca de posicao
            int aux = vetor[idcVetor]; //valor atribuido na auxiliar
            vetor[idcVetor] = vetor[idcMaiorValor]; //atribui o vetor ao indice maior valor
            vetor[idcMaiorValor] = aux; // atribui a variavel auxiliar ao vetor do indice maior

        }

    }

    //imprime o vetor ordenado pelo metodo de selecao
    System.out.println("\nVetor ordenado:");
    for (int idcVetor = 0; idcVetor < tamanhoVetor; idcVetor++)
    {
        System.out.println(vetor[idcVetor]);
    }


}
}