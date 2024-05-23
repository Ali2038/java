/*Lógica: Um restaurante tem a promoção de 5% de desconto para mulheres e de 3% de desconto para homens. Desenvolver um algoritmo em Java:

Usar o seguinte menu:
1 – Gerar conta do cliente
2 – Imprimir conta de um cliente
3 – Imprimir contas de todos cliente

Ao gerar a conta do cliente o algoritmo deverá ler (digitação) para cada cliente na fila do caixa, o nome, o valor da conta do cliente e o sexo (“F” para feminino e “M” para masculino). O algoritmo não pode passar para o cálculo do desconto caso o operador digite o sexo diferente de “F”  ou “M”, então deverá informar que está digitado errado e ler (digitar) novamente somente o sexo. Deverá mostrar o valor do desconto e o valor final da conta a ser paga para cada cliente;

Para imprimir a conta de um cliente o algoritmo deverá pesquisar pelo nome do cliente e imprimir o nome do cliente, o valor da conta, o valor do desconto e o valor final da conta paga;

Para imprimir a conta de todos cliente o algoritmo deverá imprimir o nome do cliente, o valor da conta, o valor do desconto e o valor final da conta paga de todos os clientes;

O operador poderá sair da opção 1 e retornar a mesma. Neste caso os dados digitados anteriormente devem ser mantidos;

As opções 2 e 3 não podem ser realizadas sem não existir pelo menos uma conta gerada.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Declarações de variáveis e matriz
        String [][] cadClientes = new String[100][4]; // 100 Linhas por 3 Colunas (Nome, Valor, Sexo, Desconto)
        String nomeClientePesquisa;
        Double vlrDesconto = 0.0;
        boolean clienteLocalizado;
        short opcaoMenu;
        int limiteCliente = 0;  // Controle do limite cadastrado de contas do Clientes na opção 1, não pode ultrapassar ao tamanho o vetor
        // Criação do objeto de entrada de dados
        Scanner entradaDados = new Scanner(System.in);
        do {
            System.out.println("=====================================================");
            System.out.println("                 CAIXA RESTAURANTE");
            System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            System.out.println("1 - Gerar conta do cliente");
            System.out.println("2 - Imprimir conta de um cliente");
            System.out.println("3 - Imprimir contas de todos cliente");
            System.out.println("4 - Sair do Sistema");
            System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
            System.out.print("Entre com a opção desejada: ");
            opcaoMenu = entradaDados.nextShort();
            entradaDados.nextLine();
            System.out.println("=====================================================");
            switch (opcaoMenu) {
                case 1:
                    // Cadastro dos Clientes
                    // O usuário pode cadastrar vários Clientes, sair de opção e voltar novamente para continuar
                    // cadastro. Porém o sistema controla o limite de Clientes cadastrados.
                    if (limiteCliente < cadClientes.length){
                        for (int idcCliente = limiteCliente; idcCliente < cadClientes.length; idcCliente++){
                            System.out.print("Nome: ");
                            cadClientes[idcCliente][0] = entradaDados.nextLine();
                            if (cadClientes[idcCliente][0].isEmpty()){
                                break;
                            }
                            System.out.print("Valor conta: ");
                            cadClientes[idcCliente][1] = entradaDados.nextLine();
                            do {
                                System.out.print("Sexo (F ou M): ");
                                cadClientes[idcCliente][2] = entradaDados.nextLine();
                                if ( (cadClientes[idcCliente][2].equals("F") ) || (cadClientes[idcCliente][2].equals("M") ) ){
                                    break;
                                }
                                else {
                                    System.out.println("Digitação incorreta! Digite somente F ou M.");
                                }
                            }
                            while (true);
                            if (cadClientes[idcCliente][2].equals("F")) {
                                vlrDesconto = Double.parseDouble(cadClientes[idcCliente][1]) * 0.05;
                            }
                            else {
                                vlrDesconto = Double.parseDouble(cadClientes[idcCliente][1]) * 0.03;
                            }
                            cadClientes[idcCliente][3] = Double.toString(vlrDesconto);

                                
                            limiteCliente++;
                        }
                    }
                    else {
                        System.out.println("Atingiu o limite de Clientes no cadastro.\nTecle Enter para continuar.");
                        entradaDados.nextLine();
                    }
                    break;
                case 2:
                    if (limiteCliente == 0 ){
                        System.out.println("Opção negada! Não existe Conta de Cliente registrada.\nTecle Enter para continuar.");
                        entradaDados.nextLine();
                    }
                    else {
                        System.out.print("Digite o nome do cliente:");
                        nomeClientePesquisa = entradaDados.nextLine();
                        clienteLocalizado = false;
    	                for (int idcCliente = 0; idcCliente < limiteCliente; idcCliente++) {
                            if(nomeClientePesquisa.equals(cadClientes[idcCliente][0])) {
                                clienteLocalizado = true;
                                System.out.println("/n 2 - Relatório de todos Clientes");
                                System.out.println("============================================================================");
                                System.out.println("NOME                     VALOR CONTA        VALOR DESCONTO       VALOR PAGO");
                                System.out.println("============================================================================");
                                System.out.printf("%s                        %s                 %s                 %s", 
                                            cadClientes[idcCliente][0],
                                            cadClientes[idcCliente][1],
                                            cadClientes[idcCliente][3],
                                            Double.parseDouble(cadClientes[idcCliente][1]) - Double.parseDouble(cadClientes[idcCliente][3]));
                                System.out.println("============================================================================");
                            }    
                        }
                        if ( !clienteLocalizado ){
                            System.out.println("Não tem conta deste cliente!");
                        }

                    }
                    break;
                case 3:
                    if (limiteCliente == 0 ){
                        System.out.println("Opção negada! Não existe Conta de Cliente registrada.\nTecle Enter para continuar.");
                        entradaDados.nextLine();
                    }
                    else {
    	                for (int idcCliente = 0; idcCliente < limiteCliente; idcCliente++) {
                            System.out.println("/n 2 - Relatório de todos Clientes");
                            System.out.println("============================================================================");
                            System.out.println("NOME                     VALOR CONTA        VALOR DESCONTO       VALOR PAGO");
                            System.out.println("============================================================================");
                            System.out.printf("%s                        %s                 %s                 %s", 
                                        cadClientes[idcCliente][0],
                                        cadClientes[idcCliente][1],
                                        cadClientes[idcCliente][3],
                                        Double.parseDouble(cadClientes[idcCliente][1]) - Double.parseDouble(cadClientes[idcCliente][3]));
                            System.out.println("============================================================================");
                        }
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Inválida!\nTecle Enter para continuar.");
                    entradaDados.nextLine();
            }
        } while (opcaoMenu !=4 );
    }
}


