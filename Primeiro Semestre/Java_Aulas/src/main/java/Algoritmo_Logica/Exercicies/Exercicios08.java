// Exercicios da Aula 08
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Exercicios08 {
    public static void main(String[] args) {
        Exercicio01Aula08.main(args);
        Exercicio02Aula08.main(args);
        Exercicio03Aula08.main(args);
        Exercicio04Aula08.main(args);
        Exercicio05Aula08.main(args);
        Exercicio06Aula08.main(args);
    }
}
// Escrever um programa em java que exiba os números de 1 até 50
class Exercicio01Aula08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula08Ex = new Scanner(System.in);
        int contadorInt50 = 1;

		while (contadorInt50 <= 50) {
			System.out.print(contadorInt50+ ", ");
			contadorInt50++;
		}
		System.out.println("Fim!");
        scAula08Ex.nextLine();
    }
}
// Escrever um programa em java que exiba os números de 70 até 1.
class Exercicio02Aula08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula08Ex = new Scanner(System.in);
        int contadorInt = 70;

		while (contadorInt >= 1) {
			System.out.print(contadorInt+ ", ");
			contadorInt--;
		}
		System.out.println("Fim!");
        scAula08Ex.nextLine();
    }
}
// Escrever um programa em java que exiba os números pares no intervalo de 1 até 100.
class Exercicio03Aula08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula08Ex = new Scanner(System.in);
        int contador = 2;

		while (contador <= 100) {
			System.out.print(contador+ ", ");
			contador = contador+2;
		}
		System.out.println("Fim!");
        scAula08Ex.nextLine();
    }
}
// Escrever um programa em java que exiba os números múltiplos de 5 de 1 até 50.
class Exercicio04Aula08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula08Ex = new Scanner(System.in);
        int contador = 1;

		while (contador <= 50) {
			if (contador % 5 == 0) {
				System.out.print(contador+ ", ");
			}
			contador++;
		}
		System.out.println("Fim!");
        scAula08Ex.nextLine();
    }
}
// Escrever um programa em java que exiba os números múltiplos de 5 de 1 até 50.
class Exercicio05Aula08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula08Ex = new Scanner(System.in);
        int numero, tabuada;
			
		System.out.println("Digite um número (Inteiro) para ver sua tabuada:");
		numero = scAula08Ex.nextInt();

        tabuada = 1;
			
		while (tabuada <= 10) {
			int resultados = tabuada * numero;
			System.out.println(resultados);
			tabuada++;
		}
        scAula08Ex.nextLine();
        scAula08Ex.nextLine();
    }
}
// Escrever um programa em java que exiba os números múltiplos de 5 de 1 até 50.
class Exercicio06Aula08 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula08Ex = new Scanner(System.in);
        int numero, contador;

        System.out.print("Digite um número: ");
	    numero = scAula08Ex.nextInt();
	        
	    contador = 1;
	        
	    System.out.println("Divisores de " + numero + ":");

	    while (contador <= numero) {
	        if (numero % contador == 0) {
	            System.out.println(contador);
	        }
	        contador++;
	    }
        scAula08Ex.nextLine();
        scAula08Ex.nextLine();
    }
}