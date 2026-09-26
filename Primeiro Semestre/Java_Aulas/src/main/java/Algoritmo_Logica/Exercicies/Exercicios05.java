// Exercicios da Aula 05
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Exercicios05 {
    public static void main(String[] args) {
        Exercicio01Aula05.main(args);
    }
}
/* Criando um programa que: Leia o Nome de um Produto; Quantidade Comprada e Preço;
 * Valor total a pagar; Se a compra for mais que R$ 100,00 é frete grátis; Frete = R$ 19,00 
 * e ao final exibir relatorio com Nota Fiscal informando o nome do produto, preço unitario
 * quantidade, valor da compra, valor do frete e total a pagar */
class Exercicio01Aula05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula05Ex = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);
        String nome, precoValor, precoCompra, precoFrete, precoTotal;
        double valor, valorCompra, valorTotal, frete = 19.00;
        int quantidade;

        System.out.println("Digite o nome do produto:");
        nome = scAula05Ex.nextLine();
        System.out.println("Digite o valor do produto (R$):");
        valor = scAula05Ex.nextDouble();
        System.out.println("Digite a quantidade de compra:");
        quantidade = scAula05Ex.nextInt();

        valorCompra = valor * quantidade;
        valorTotal = valorCompra + frete;

        precoValor = Real.format(valor);
        precoCompra = Real.format(valorCompra);
        precoFrete = Real.format(frete);
        precoTotal = Real.format(valorTotal);

        if (valorCompra > 100) {
            System.out.println("======RELATORIO DE COMPRA======");
            System.out.println("Produto..........." + nome);
            System.out.println("Preço unitario...." + precoValor);
            System.out.println("Quantidade........" + quantidade);
            System.out.println("Valor da compra..." + precoCompra);
            System.out.println("Frete.............Grátis");
            System.out.println("Total a pagar....." + precoCompra);
        } else {
            System.out.println("======RELATORIO DE COMPRA======");
            System.out.println("Produto..........." + nome);
            System.out.println("Preço unitario...." + precoValor);
            System.out.println("Quantidade........" + quantidade);
            System.out.println("Valor da compra..." + precoCompra);
            System.out.println("Frete............." + precoFrete);
            System.out.println("Total a pagar....." + precoTotal);
        }
        scAula05Ex.nextLine();
        scAula05Ex.nextLine();
        scAula05Ex.close();
    }
}
