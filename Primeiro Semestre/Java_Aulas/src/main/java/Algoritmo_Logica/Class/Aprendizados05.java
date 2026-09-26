// Aula 05 - printf
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Aprendizados05 {
    public static void main(String[] args) {
        Aprendizado01Aula05.main(args);
        Aprendizado02Aula05.main(args);
    }   
}
// printf, sem a professora
class Aprendizado01Aula05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula05 = new Scanner(System.in);
        String nome; int idade; double preco;
        
        nome = "Cauã Sousa"; 
        idade = 21; 
        preco = 5000.99;
        /* %s: Para strings.
		 * %d: Para números inteiros (int, long, etc.).
		 * %f: Para números de ponto flutuante (float, double).
		 * %c: Para caracteres.
		 * %e: Para números de ponto flutuante em notação científica.
		 * %n: Para quebrar linha. */
        System.out.printf("Nome: %s, Idade: %d, Preço: %.2f %n", nome, idade, preco);
        scAula05.nextLine();
    }
}
// printf, sem a professora
class Aprendizado02Aula05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula05 = new Scanner(System.in);
        Locale localeBrasil = Locale.of("pt", "BR"); // Definindo o local para Brasil
		NumberFormat Real = NumberFormat.getCurrencyInstance(localeBrasil); // Formatando para o Real
		NumberFormat Dolar = NumberFormat.getCurrencyInstance(Locale.US); // Formatando para o Dolar

        /* Use isses imports para trazer formatção de numero e localidade:
		 * import java.text.NumberFormat;
		 * import java.util.Locale;
		 * Para o Brasil, precisamos criar o Locale, para o Dolar Americano, apenas formatar direto */

		double valor, dolarReal, realDolar; // Declarando Variaveis
        String precoReal, precoDolar, dolarpReal, realpDolar; // Declarando Strings para as Variaveis

        valor = 1234.56; // Decidindo um valor base
	    precoReal = Real.format(valor); // Transformando o double em Real
        precoDolar = Dolar.format(valor); // Transformando o double em Dolar

	    System.out.println("Em Reais: " + precoReal); // Saída: R$1.234,56
	    System.out.println("Em Dolar: " + precoDolar); // Saída: $1,234.56
		System.out.printf("\n"); // Descendo linha
        // System.out.println(); // Também funciona.

		dolarReal = valor / 5.32; // 15.09.2025 - Dolar = R$ 5,32
		dolarpReal = Dolar.format(dolarReal); // $1,234.56 após convertido em Real

        realDolar = valor * 5.32; // 15.09.2025 - Dolar = R$ 5,32
		realpDolar = Real.format(realDolar); // R$1.234,56 após convertido em Dolar

		System.out.println("Valor convertido de Real para Dolar: " + dolarpReal); // Saída: $232.06
		System.out.println("Valor convertido de Dolar para Real: " + realpDolar); // Saída: R$ 6.567,86
        scAula05.nextLine();
        scAula05.close();
    }
}