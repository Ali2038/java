/*Lógica: Um restaurante tem a promoção que mulheres tem desconto de 5% na refeição por quilo.

Desenvolver um algoritmo em Java que identifique se a pessoa é do sexo feminino.

Será necessário informar o nome da pessoa e seu sexo, sendo “F” para feminino e “M” para masculino.

Após a entrada destas informações, apresentar na tela “Desconto de 5% na refeição.”, se a pessoa for do sexo feminino.

O algoritmo só poderá aceitar “F” ou “M” para validação dos sexos, caso contrário deverá informar ao operador que a digitação está incorreta e deve digitar somente “F” ou “M”.

Atenção: não utilize os operadores lógicos, 
somente operadores de condições lógicas.*/

import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
//declaração de variáveis/constantes
String nomePessoa,sexoPessoa;

//criação do objeto
Scanner entradaDados = new Scanner(http://System.in );

//leitura de entradaDados
System.out.print("Qual é o seu nome? ");
nomePessoa = entradaDados.nextLine();

System.out.print("Seu sexo é F(feminino) ou M(masculino)? ");
sexoPessoa = entradaDados.nextLine();

//estrutura de decisão
if (sexoPessoa.equals("F"))
{
System.out.print("Você tem um desconto de 5%.");
}
else
{
if (sexoPessoa.equals("M"))
{
System.out.print("Você não tem desconto.");
}
else
{
System.out.println("Digitação incorreta,digite somente F ou M.");
}
}

}
}