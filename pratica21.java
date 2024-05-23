/*Lógica: Um restaurante tem a promoção de 5% de desconto para mulheres e de 3% de desconto para homens. Desenvolver um algoritmo em Java:

Que leia para cada cliente na fila do caixa, o nome, o valor da conta do cliente e o sexo (“F” para feminino e “M” para masculino);

O algoritmo não pode passar para o cálculo do desconto caso o operador digite o sexo diferente de “F”  ou “M”, então deverá informar que está digitado errado e ler (digitar) novamente somente o sexo;

Que informe o valor do desconto e o valor final da conta a ser paga;

Para encerrar a operação o usuário deverá digitar “sair” no nome do cliente;

O algoritmo deverá informar a quantidade total de clientes atendidos, a quantidade total de clientes atendidos do sexo feminino, a quantidade total de clientes atendidos do sexo masculino, a somatório do valor da conta sem o desconto, a somatória do desconto para mulheres, a somatória do desconto para homens e a somatória das contas pagas com desconto./*

import java.util.Scanner;
public class Main
{	
public static void main(String[] args)
{
// Declaração de variação
String nomeCliente, sexoCliente;
float vlrConta=0.0f, idcDesconto, vlrDesconto, somaContas = 0.00f, somaDescontoFeminino=0.00f, somaDescontoMasculino=0.00f;
short qtdFeminino = 0, qtdMasculino = 0;

// Criação de objeto de entrada de dados
Scanner entradaContas = new Scanner(System.in );

// Estrutura de repetição para entrada das contas dos cliente
for ( ; ; )
{
System.out.print("Nome do cliente: ");
nomeCliente = entradaContas.nextLine();
if (nomeCliente.equals("sair"))
{
break;
}
System.out.print("Valor da conta: ");
vlrConta = entradaContas.nextFloat();
entradaContas.nextLine();
somaContas += vlrConta;
do
{
System.out.print("Sexo do cliente F/M: ");
sexoCliente = entradaContas.nextLine();
if (sexoCliente.equals("F"))
{
idcDesconto = 0.05f;
qtdFeminino++;
somaDescontoFeminino += (vlrConta * idcDesconto);
break;
}
else
{
if (sexoCliente.equals("M"))
{
idcDesconto = 0.03f;
qtdMasculino++;
somaDescontoMasculino += (vlrConta * idcDesconto);
break;
}
else
{
System.out.println("Digitação incorreta! Favor digitar somente “F” ou “M”");
}
}

        }
        while ( true );
        vlrDesconto = vlrConta * idcDesconto;
        System.out.println("Conta do cliente");
        System.out.printf("(+) Valor da conta........: %,.2f\n", vlrConta);
        System.out.printf("(-) Valor do desconto.....: %,.2f\n", vlrDesconto);
        System.out.printf("(=) Valor líquido.........: %,.2f\n", (vlrConta - vlrDesconto));
        System.out.println("============================================");
   }
    System.out.println("=====================================================");
    System.out.println("Total clientes atendimentos no dia.....: " +  (qtdFeminino + qtdMasculino) );
    System.out.println("Total clientes do sexo feminino........:" + qtdFeminino);
    System.out.println("Total clientes do sexo masculino.......:" + qtdMasculino);
    System.out.println("=====================================================");
    System.out.printf("(+) Soma das contas no dia.............: %,.2f\n", somaContas);
    System.out.printf("(-) Soma das contas sexo feminino......: %,.2f\n", somaDescontoFeminino);
    System.out.printf("(-) Soma das contas sexo masculino.....: %,.2f\n", somaDescontoMasculino);
    System.out.printf("(=) Soma das contas líquidas...........: %,.2f\n", (somaContas - (somaDescontoFeminino + somaDescontoMasculino)));
    System.out.println("=====================================================");

}
}