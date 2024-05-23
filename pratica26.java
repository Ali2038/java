/*Lógica: Um restaurante tem a promoção de 5% de desconto para mulheres e de 3% de desconto para homens. Desenvolver um algoritmo em Java:

Que leia para cada cliente na fila do caixa, o nome, o valor da conta do cliente e o sexo (“F” para feminino e “M” para masculino);

O algoritmo não pode passar para o cálculo do desconto caso o operador digite o sexo diferente de “F”  ou “M”, então deverá informar que está digitado errado e ler (digitar) novamente somente o sexo;

Que informe o valor do desconto e o valor final da conta a ser paga;

Que informe as opções de pagamento, somente uma entre (1 – Dinheiro, 2 – PIX, 3 – Débito, 4 – Crédito e 5 – Ticket). Se escolher uma opção diferente desta, o sistema deverá solicitar novamente até que o operador digite correto. Na opção de Crédito, também tem que informar obrigatoriamente uma opção de parcelamento (1 – Uma parcela, 2 – Duas parcelas e 3 – Três parcelas).

Para encerrar a operação o usuário deverá digitar “sair” no nome do cliente;

O algoritmo deverá informar a quantidade total de clientes atendidos, a quantidade total de clientes atendidos do sexo feminino, a quantidade total de clientes atendidos do sexo masculino, a somatório do valor da conta sem o desconto, somatória das contas pagas com desconto, cada somatória dos valores pagos por opções de pagamento, no caso da opção Crédito, também a somatória de cada opção de parcelamento.

Origem: Prática 21*/

import java.util Scanner;
public class Main

{
{

}

public static void main(String[] args)

// Declarago de variaveis
String nomeCliente, sexoCliente, opcaoPgto, opcaoParcelamento;
float virConta=0.0F, idcDesconto = 0.00f, virDesconto = 0.00f, somaContas = 0.00, somaDescontoFeminino=0.00f, somaDescontoMasculino=0.00F,
somaDinheiro =0.00f, somaPix=0.00f, somaDebito = 0.00f, somaCredito = 0.00f, somaTicket = 0.00f,
somaParcUma = 0.00f, somaParcDois = 0.00f, somaParcTres = 0.00F;
short qtdFeminino =0, qtdMasculino = 0;

// Criacao de objeto de entrada de dados
Scanner entradaContas = new Scanner(System.in }

// Estrutura de repeticao para entrada das contas dos cliente
for (;;)
{
System.out.print("Nome do cliente: ");
nomeCliente = entradaContas.nextLine();
if (nomeCliente.equals("sair"))
{
System.out.printin("1 - Quantidade de clientes atendidos.: " + (qtdMasculino + qtdFeminino));
System.out.printin("1.1 - Quantidade do sexo feminino....:" + qtdFeminino);
System.out.printin("1.1 - Quantidade do sexo masculino...: "+ qtdMasculino);
System.out.printf("2- (+) Soma das contas do diza......: %,.2A\n", somaContas);
System.out.printf("3 - (-) Soma descontos sexo feminino.: %,.2f\n", somaDescontoFeminino);
System.out.printf("4 - (-) Soma descontos sexo masculino: %,.2\n", somaDescontoMasculino);
System.out.printf("5 - (=) Soma das contas liquidas....: 9,.2f\n ", (somaContas - (somaDescontoFeminino + somaDescontoMasculino)));
System.out.printf("6 - Soma Dinheiro, 2 %,.2f\n", (somaDinheiro));
System.out.printf("7-Soma PIX. %,.2f\n", (somaPix));
System.out.printf("8- Soma Débito. %,.2f\n", (somaDebito));
System.out.printf("9- Soma Crédit %,.2f\n", (somaCredito));
System.out.printf("10- Soma Crédito 1 parcel ,.2F\n", (somaParcUma));
System.out.printf("10- Soma Crédito 2 parcelas........! %,.2f\n ", (somaParcDois));
System.out.printf("10- Soma Crédito 3 parcelas. 2A\n", (somaParcTres));
System.out.printf("5 - Soma Ticket. %,.2f\n", (somaTicket));
break;
}
System.out.print("Valor da conta: ");
virConta = entradaContas.nextFloat();
entradaContas.nextLine();
do
{
System.out.print("Sexo do cliente F/M:");
sexoCliente = entradaContas.nextLine();
if (sexoCliente.equals("E"))

{
idcDesconto =0.05F;
break;
}
else
{
if (sexoCliente.equals("M"))
{
ideDesconto = 0.03f;
break;
}
else
{
System.out.printin("Digitaco incorreta! Favor digitar somente “F” ou “M”");
}
}
}

while ( true);
virDesconto = virConta * idcDesconto;
dof
System.out.print("Oções de pagamento (1 Dinheiro, 2—PIX, 3— Débito, 4 — Crédito e 5 —Ticket):");
opcaoPgto = entradaContas.nextLine();
switch(opcaoPgto)
{
case "1":
somaDinheiro += ( virConta-virDesconto);
break;
case "2":
somaPix += ( virConta - virDesconto);
break;
case "3":
somaDebito += ( virConta -virDesconto);
break;
case "4":
somaCredito +=( virConta - virDesconto);
do
{
System.out.print("Informe o parcelamento: 1 —Uma parcela, 2 —Duas parcelas e 3 —Tres parcela:
opcaoParcelamento = entradaContas.nextLine();
switch(opcaoParcelamento) {

case "1":
somaParcUma +=( virConta - virDesconto);
break;
case "2":
somaParcDois += ( virConta - virDesconto);
break;
case "3":
somaParcTres += ( virConta-virDesconto};
break;
default:
System.out.printin(" opção de parcelamento invalida");
break;
}
}
while (!(opcaoParcelamento.equals(""1")) && (opcaoParcelamento.equals("2")) && !(opcaoParcelamento.equals("3")));
break;
case "5":
somalicket += ( virConta - virDesconto);
break;
default:
System.out.printin("opçãos de pagamento invdlida");
break;

}
} while ( !(opcaoPgto.equals("1")) && !(opcaoPgto.equals("2")) && !(opcaoPgto.equals("3")) && !(opcaoPgto.equals("4")) && !(opcaoPgto.equals("5")));

// visualização da conta do cliente
System.out.printIn("Conta do cliente:");
System.out.printf("(+) Conta RS: %,.2f\n", virConta);
System.out.printf("(-) Desconto RS: %,.2f\n", virDesconto);
System.out.printf("(=) A pagar RS: %,.2f\n", (virConta -virDesconto));

// Acumuladores geral e por sexo
somaContas += virConta;
if (sexoCliente.equals("F"))

{
qtdFeminino++;
somaDescontoFeminino += virDesconto;
}
else
{
qtdMasculino++;
somaDescontoMasculino += virDesconto;
}
}
}