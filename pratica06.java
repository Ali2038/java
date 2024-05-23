/*O Departamento de Pessoal da empresa Xpto Ltda necessita de reajustar o salário do empregado Antônio Mota Carvalho com um percentual estimulado pelo sindicato. Após o reajuste do salário do empregado, a empresa deverá calcular o salário líquido do empregado da seguinte forma:1) acréscimo de 5% de gratificação no salário contratual; 2) desconto de INSS, sendo o valor do INSS 10% sobre o salário reajustado mais a gratificação; 3) desconto de taxa fixa de seguro em grupo, sendo o valor de R$ 12,89; 4) desconto da associação sindical, sendo 1/30 somente do salário reajustado. */

public class Main
{
public static void main(String[] args)
{
//Declaração de constantes e variáveis
final float VLR_SEGURO = 12.89f;
final byte DIAS_MES = 30;
float vlrSalario = 6000.00f;
float vlrSalarioReajustado = 0.00f;
float taxaReajusteSalarial = 15.00f;
float idcGratificacao = 0.05f;
float vlrGratificacao = 0.00f;
float taxaINSS = 10.00f;
float vlrINSS = 0.00f;
float vlrAssociacaoSindical = 0.00f;
//Operações
vlrSalarioReajustado = ( vlrSalario (taxaReajusteSalarial / 100) ) + vlrSalario;
vlrGratificacao = vlrSalario idcGratificacao;
vlrINSS = (vlrSalarioReajustado + vlrGratificacao) * (taxaINSS /100);
vlrAssociacaoSindical = vlrSalarioReajustado / DIAS_MES;
//Visualização
System.out.printf("Valor do salário R$ %,.2f\n", vlrSalario);
System.out.printf("Valor do salário reajustado R$ %,.2f\n", vlrSalarioReajustado);
System.out.printf("(+) Valor da gratificação R$ %,.2f\n", vlrGratificacao);
System.out.printf("(-) Valor da INSS R$ %,.2f\n", vlrINSS);
System.out.printf("(-) Valor da Seguro R$ %,.2f\n", VLR_SEGURO);
System.out.printf("(-) Valor da Associação sindical R$ %,.2f\n", vlrAssociacaoSindical);
System.out.printf("(=) Salário líquido R$ %,.2f\n", vlrSalarioReajustado + vlrGratificacao - vlrINSS - VLR_SEGURO - vlrAssociacaoSindical);

}

}