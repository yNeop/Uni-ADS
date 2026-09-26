// Exercicios da Aula 10
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.util.Random;
import java.util.Scanner;
public class Exercicios10 {
    public static void main(String[] args) {
        Exercicio01Aula10.main(args);
        Exercicio02Aula10.main(args);
        Exercicio03Aula10.main(args);
    }
}
// Faça um programa que calcule a média de notas da turma em uma lista de estudantes de 8 alunos
class Exercicio01Aula10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula10Ex = new Scanner(System.in);
        int totalAlunos;
        double soma, media;

        totalAlunos = 8;
        soma = 0;

        String[] nomeAlunos = new String[totalAlunos];
        double[] notasAlunos = new double[totalAlunos];

        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Digite o nome do Aluno " + (i + 1) + ":");
            nomeAlunos[i] = scAula10Ex.nextLine();

            System.out.println("Digite a nota do Aluno " + (i + 1) + ":");
            notasAlunos[i] = scAula10Ex.nextDouble();
            scAula10Ex.nextLine();
        }
        for (double n : notasAlunos) soma += n;
        media = soma / totalAlunos;

        System.out.println("\nNotas dos alunos:");
        for (int i = 0; i < totalAlunos; i++) {
            System.out.printf("%s: %.2f%n", nomeAlunos[i], notasAlunos[i]);
        }
        System.out.printf("Média da turma: %.2f%n", media);
        scAula10Ex.nextLine();
    }
}
/* Crie um programa que simule o lançamento de um dado 100 vezes e conte quantas vezes o dado 
 * mostrou o valor 6 */
class Exercicio02Aula10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula10Ex = new Scanner(System.in);
        int ladosTotal, dado, countSix;
        Random random;

        countSix = 0;
        ladosTotal = 6;
        random = new Random();

        for (int i = 0; i < 100; i++) {
            dado = random.nextInt(ladosTotal) + 1;
            System.out.println(dado);

            if (dado == 6) {
                countSix++;
            }
        }
        System.out.println("O número 6 apareceu " + countSix + " vezes.");
        scAula10Ex.nextLine();
    }
}
// Escreva um programa em java que imprima os números primos de 1 a 50.
class Exercicio03Aula10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula10Ex = new Scanner(System.in);
        boolean isPrimo;

        for (int n = 2; n <= 50; n++) {
            isPrimo = true;
            int limit = (int) Math.sqrt(n);
            for (int d = 2; d <= limit; d++) {
                if (n % d == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println(n + " é um número primo.");
            }
        }
        scAula10Ex.nextLine();
    }
}