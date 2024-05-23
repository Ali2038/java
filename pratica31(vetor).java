import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
// Declaração de variáveis e vetores
        int[] nroVetor = new int[100];
        int opcaoMenu;
        boolean autorizaOpcaoMenu = false, localizado = false;
        int maiorNumeroVetor = 0;
        int nroPesquisado;
        // Criação objeto de entrada de dados
        Scanner entradaMenu = new Scanner(System.in);
        Random nroAleatorio = new Random();
        do {
            System.out.println("MENU SISTEMA PRÁTICA Vetor – Menu de opções ");
            System.out.println("1 – Gerar 100 números inteiros aleatório de 0 a 50");
            System.out.println("2 – Imprimir todos os números gerados na opção 1");
            System.out.println("3 – Imprimir todos os números gerados na opção 1 em ordem inversa");
            System.out.println("4 – Imprimir os números gerados intercalados em 2 em 2");
            System.out.println("5 – Pesquisar um determinado número entre os números gerados");
            System.out.println("6 – Imprimir qual foi o maior número gerado");
            System.out.println("7 – Sair do sistema");
            System.out.println("Entre com a opção desejada: ");
            opcaoMenu = entradaMenu.nextInt();
            switch (opcaoMenu){
                case 1:
                    for (int idcVetor = 0; idcVetor < nroVetor.length; idcVetor++) {
                        nroVetor[idcVetor] = nroAleatorio.nextInt(201);
                    }
                    System.out.println("Vetor gerado com sucesso. Tamanho: " + nroVetor.length);
                    autorizaOpcaoMenu = true;
                    break;
                case 2:
                    if (autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    }
                    else {
                        System.out.println("**** Início Opção 2 ***");
                        for (int idcVetor = 0; idcVetor < nroVetor.length; idcVetor++) {
                            System.out.println(nroVetor[idcVetor]);
                        }
                    }
                    break;
                case 3:
                    if (! autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    }
                    else {
                        System.out.println("**** Início Opção 3 ***");
                        for (int idcVetor = (nroVetor.length -1); idcVetor >= 0; idcVetor--) {
                            System.out.println(nroVetor[idcVetor]);
                        }
                    }
                    break;
                case 4:
                    if (! autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    }
                    else {
                        System.out.println("**** Início Opção 4 ***");
                        for (int idcVetor = 0; idcVetor < nroVetor.length; idcVetor = idcVetor + 2) {
                            System.out.println(nroVetor[idcVetor]);
                        }
                    }
                    break;
                case 5:
                    if (! autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    }
                    else {
                        localizado = false;
                        System.out.print("Entre com o número a ser pesquisado: ");
                        nroPesquisado = entradaMenu.nextInt();
                        for (int idcVetor = 0; idcVetor < nroVetor.length; idcVetor++) {
                            if (nroVetor[idcVetor] == nroPesquisado) {
                                localizado = true;
                                break;
                            }
                        }
                        if (localizado) {
                            System.out.println("Número localizado");
                        }
                        else
                        {
                            System.out.println("Número não localizado");
                        }
                    }
                    break;
                case 6:
                    if (! autorizaOpcaoMenu) {
                        System.out.println("Não autorizado, favor realizar opção 1 primeiro.");
                    }
                    else {
                        System.out.println("**** Início Opção 6 ***");
                        maiorNumeroVetor = nroVetor[0];
                        for (int idcVetor = 1; idcVetor < nroVetor.length; idcVetor++) {
                            if (nroVetor[idcVetor] > maiorNumeroVetor){
                                maiorNumeroVetor = nroVetor[idcVetor];
                            }
                        }
                        System.out.println("O maior número é : " + maiorNumeroVetor);
                    }
                    break;

            }
        }
        while(opcaoMenu != 7);
    }
}