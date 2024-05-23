/*O Departamento de Pessoal da empresa Xpto Ltda necessita simular o reajuste do salário e o cálculo do
salário líquido. 
Entrar com: nome do empregado, salário contratual do empregado e taxa percentual do reajuste.
Após o reajuste do salário do empregado,  a empresa deverá calcular o salário líquido do empregado da seguinte forma:
1) acréscimo de 5% de gratificação no salário contratual; 
2) desconto de INSS, sendo o valor do INSS 10% sobre o salário reajustado mais a gratificação; 
3) desconto de taxa fixa de seguro em grupo, sendo o valor de  R$ 12,89; 
4) desconto da associação sindical, sendo 1 dia do salário reajustado. */
import java.util.Scanner;
public class Main
{	
	public static void main(String[] args)
 	{        
	   //Declaração de constantes e variáveis
	   final float VLR_SEGURO = 12.89f;
	   final byte DIAS_MES = 30;
	   String nomeEmpregado;
	   float vlrSalario, idcReajusteSalarial;
	   float idcGratificacao = 0.05f;
	   float vlrGratificacao = 0.00f;
	   float vlrSalarioReajustado = 0.00f;
	   float taxaINSS = 10.00f;
	   float vlrINSS = 0.00f;
	   float vlrAssociacaoSindical = 0.00f;
	   
	   //Criação objeto de entrada de dados
	   Scanner entradaDados = new Scanner(System.in);
	   
	   //Entrada de dados
	   System.out.print("Nome do empregado: ");
	   nomeEmpregado = entradaDados.nextLine();
	   System.out.print("Salário atual: ");
	   vlrSalario = entradaDados.nextFloat();
	   System.out.print("Taxa de reajuste em %: ");
	   idcReajusteSalarial = entradaDados.nextFloat()/100;
	   
	   //Operações
	   vlrSalarioReajustado = ( vlrSalario * idcReajusteSalarial ) + vlrSalario;
	   vlrGratificacao = vlrSalario * idcGratificacao;
	   vlrINSS = (vlrSalarioReajustado + vlrGratificacao) * (taxaINSS / 100) ;
	   vlrAssociacaoSindical = vlrSalarioReajustado / DIAS_MES;
	   
	   //Visualização     
	   System.out.printf("Valor do salário R$ %,.2f\n", vlrSalario);
	   System.out.printf("Valor simulado do salário reajustado R$ %,.2f\n", vlrSalarioReajustado);
	   System.out.printf("(+) Valor da gratificação R$ %,.2f\n", vlrGratificacao);
	   System.out.printf("(-) Valor da INSS R$ %,.2f\n", vlrINSS);
	   System.out.printf("(-) Valor da Seguro R$ %,.2f\n", VLR_SEGURO);
	   System.out.printf("(-) Valor da Associação sindical R$ %,.2f\n", vlrAssociacaoSindical);
	   System.out.printf("(=) Salário líquido simulado R$ %,.2f\n", vlrSalarioReajustado + vlrGratificacao - vlrINSS - VLR_SEGURO - vlrAssociacaoSindical);
	}
}
