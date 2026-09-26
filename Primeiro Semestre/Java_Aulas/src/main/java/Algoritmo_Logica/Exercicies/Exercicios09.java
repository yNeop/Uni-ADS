// Exercicios da Aula 09
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Exercicios09 {
    public static void main(String[] args) {
        Exercicio01Aula09.main(args);
        Exercicio02Aula09.main(args);
        Exercicio03Aula09.main(args);
    }
}
/* Escrever um programa em java que leia um numero inteiro e informe se o numero lido é primo 
 * ou não é primo. */
class Exercicio01Aula09 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula09Ex = new Scanner(System.in);
        boolean isPrimo = true;
        int numScanner, i;

        System.out.println("Digite um número inteiro:");
        numScanner = scAula09Ex.nextInt();

        if (numScanner <= 1) {
            isPrimo = false; // Números menores ou iguais a 1 não são primos
        } else {
            for (i = 2; i < numScanner; i++) {
                if (numScanner % i == 0) {
                    isPrimo = false; // Encontrou um divisor, não é primo
                    break; // Sai do loop, não precisa verificar mais
                }
            }
        }
        if (isPrimo) {
            System.out.println(numScanner + " é um número primo.");
        } else {
            System.out.println(numScanner + " não é um número primo.");
        }
        scAula09Ex.nextLine();
        scAula09Ex.nextLine();
    }
}
// Escrever um programa em java que exiba o resultado da soma de todos os números de 1 até 15.
class Exercicio02Aula09 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula09Ex = new Scanner(System.in);
        int soma;

        soma = 0;

        for (int i = 1; i <= 15; i++) {
            soma += i;
        }
        System.out.println("A Soma dos números de 1 à 15 é = " + soma);
        scAula09Ex.nextLine();
    }
}
/* Crie um programa em java que simule um jogo de adivinhação,
 * gerando um número aleatório entre 1 e 100 e permitindo que o
 * usuário adivinhe até que acerte usando um loop. */
class Exercicio03Aula09 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula09Ex = new Scanner(System.in);
        int numSorteado = (int) (Math.random() * 100) + 1;
        boolean acerto = false;
        int numUser;
        /* 
		 * Existe outra maneira de fazer random, usando import. 
		 * É melhor 
         */
        while (!acerto) {
            System.out.println("Digite um número e veja se acerta o sorteado:");
            numUser = scAula09Ex.nextInt();
            /* Esse algoritmo não pode ser realizado com o "For".
			 * Iria ser necessario um codígo muito extenso e manual */
            if (numSorteado == numUser) {
                acerto = true;
                System.out.println("Parabéns, você acertou!");
            } else if (numSorteado > numUser) {
                System.out.println("Número Sorteado é maior.");
            } else {
                System.out.println("Número Sorteado é menor.");
            }
        }
        scAula09Ex.nextLine();
        scAula09Ex.nextLine();
        scAula09Ex.close();
    }
}