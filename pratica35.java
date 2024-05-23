/*Lógica: Desenvolver um algoritmo em Java que leia (digite) todos os valores da tabela do IRRF abaixo em uma matriz e imprima o resultado da tabela do IRRF digitada.*/
import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {        
        // Declaração de variáveis
        Float[][] tabIrrf = new Float[5][3];
        short nroFaixa = 0;
        // Criação objeto de entrada de dados
        Scanner entradaDados = new Scanner(System.in);
        // Operação entrada de dados da tabela IRRF
        for (int i = 0; i < tabIrrf.length; i++)       
        {            
            System.out.print("Valor base de cálculo limite da faixa " + ++nroFaixa + ": ");
            tabIrrf[i][0] = entradaDados.nextFloat();
            System.out.print("Percentualda faixa " + nroFaixa + ": ");
            tabIrrf[i][1] = (entradaDados.nextFloat())/100;
            entradaDados.nextLine();
            System.out.print("Valor dedução da faixa " + nroFaixa + ": ");
            tabIrrf[i][2] = entradaDados.nextFloat();
            entradaDados.nextLine();
        }
        // Operação saída de dados da tabela IRRF
        System.out.println("====================================================");
        System.out.println("Base de Cálculo R$       Alíquota %      Deducão R$");
        System.out.println("====================================================");
        for (int i = 0; i < tabIrrf.length; i++) 
        {   
            if(i == 0) {
             System.out.printf("0.00 até %,.2f             %,.2f            %,.2f\n", tabIrrf[i][0], tabIrrf[i][1]*100, tabIrrf[i][2]);
            }
            else if( (i > 0) && (i < (tabIrrf.length - 1)) ) {
             System.out.printf("%,.2f a  %,.2f          %,.2f            %,.2f\n", tabIrrf[i-1][0]+0.01, tabIrrf[i][0], tabIrrf[i][1]*100, tabIrrf[i][2]);
            } 
            else {
             System.out.printf("Acima de %,.2f             %,.2f            %,.2f\n", tabIrrf[i][0], tabIrrf[i][1]*100, tabIrrf[i][2]);
            }
            System.out.println("____________________________________________________");           
        }
        System.out.println("====================================================");
    }
}
