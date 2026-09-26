// Aula 11 - Arrow
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Random;
import java.util.Scanner;
public class Aprendizados11 {
	public static void main(String[] args) {
		/* Arrow = Vetor. Armazena mais de uma informação do mesmo tipo
		 * Declaração de Vetor:
		 * 01. double[] nota = new double[5]
		 * 02. double[] nota = {6.5, 7.3, 8.0, 5.5, 5.0} */
		Aprendizado01Aula11.main(args);
		Aprendizado02Aula11.main(args);
		Aprendizado03Aula11.main(args);
		Aprendizado04Aula11.main(args);
	}
}
// Gerar 50 números aleatorios entre 0 e 99, mostrando cada um
class Aprendizado01Aula11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scAula11 = new Scanner(System.in);
		int[] num = new int[50];
		Random random = new Random();
		
		for (int i = 0; i < 50; i++) {
			num[i] = random.nextInt(100);
			System.out.printf("%d, ", num[i]);
		}
		System.out.println("Fim.");
		scAula11.nextLine();
	}
}
// Gerar 30 números aleatorios entre 0 e 999, mostrando valores nas posições 1, 15, 29.
class Aprendizado02Aula11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scAula11 = new Scanner(System.in);
		int[] num = new int[30];
		Random random = new Random();
		
		for (int i = 0; i < 30; i++) {
			num[i] = random.nextInt(1000);
		}
		System.out.println("Posição 01: " + num[1]);
		System.out.println("Posição 15: " + num[15]);
		System.out.println("Posição 29: " + num[29]);
		scAula11.nextLine();
	}
}
/* Crie um vetor com 100 posições e armazenar valores aleatórios. Mostre todos os valores armazenados usando a tabulação ( \t ). 
 * Identifique e mostre o maior valor gerado e sua posição no vetor. Dica: inicialize uma variável com um valor muito pequeno 
 * e teste se cada elemento do vetor é maior que esse valor, se for a variável passará a assumir o maior valor. */
class Aprendizado03Aula11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scAula11 = new Scanner(System.in);
		int[] num = new int[100];
		int maior, posicaoMaior;
		Random random = new Random();
		
		maior = 0;
		posicaoMaior = 0;
		
		for (int i = 0; i < 100; i++) {
			num[i] = random.nextInt();
			System.out.println("num[" + i + "] = " + num[i]);
			
			if (num[i] > maior) {
				maior = num[i];
				posicaoMaior = i;
			}
		}
		System.out.println("Maior Número Gerado: " + maior + " na posição: " + posicaoMaior);
		scAula11.nextLine();
	}
}
/* Gere um vetor com 10 posições de memória. O valor armazenado em cada posição do vetor deve ser igual ao índice da respectiva 
 * posição vezes 2. Exemplo: Posição do vetor 0 1 2 3 4 5 6 7 8 9 Valor armazenado 0 2 4 6 8 10 12 14 16 18  */
class Aprendizado04Aula11 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scAula11 = new Scanner(System.in);
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = i * 2;
			System.out.printf("%d, ", num[i]);
		}
		System.out.println("Fim.");
		scAula11.nextLine();
	}
}