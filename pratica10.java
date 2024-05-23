/*Lógica: Um restaurante tem a promoção que mulheres tem desconto de 5% na refeição por quilo. Desenvolver um algoritmo em Java que identifique se a pessoa é do sexo feminino. Será necessário informar o nome da pessoa e seu sexo, sendo “F” para feminino e “M” para masculino. Após a entrada destas informações, apresentar na tela “Desconto de 5% na refeição.”, se a pessoa for do sexo feminino.

Atenção: não utilize os operadores lógicos, 
somente operadores de condições lógicas.*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
//Declaração de variáveis
String nomeCliente, sexoCliente;
//Criação do objeto de entrada de dados
Scanner entradaDados = new Scanner(System.in);
//Entrada de dados
System.out.print("Nome do cliente: ");
nomeCliente = entradaDados.nextLine();
System.out.print("Sexo do cliente (F/M): ");
sexoCliente = entradaDados.nextLine();
//Estrutura de decisão simples e visualização
if ( sexoCliente.equals("F")  )
{
System.out.println("Desconto de 5% na refeição para o sexo Feminino.");
}
}
}