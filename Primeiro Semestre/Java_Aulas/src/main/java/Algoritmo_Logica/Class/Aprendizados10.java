// Tiramos a aula para continuar alguns exercicios
// Aula 10 - Estrutura de Repetição
package Algoritmo_Logica.Class;
// @author Cauã Sousa
import java.util.Random;
import java.util.Scanner;
public class Aprendizados10 {
    public static void main(String[] args) {
        Aprendizado01Aula10.main(args);
        Aprendizado02Aula10.main(args);
        Aprendizado03Aula10.main(args);
    }
}
/* Esse é o 16, decisão aleatoria da professora... Irei refazer em casa, mas
 * no package de Exercicios */
class Aprendizado01Aula10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula10 = new Scanner(System.in);

        int numero, maior;
        Random random;

        maior = 0;
        random = new Random();

        for (int cont = 1; cont <= 50; cont++) {
            numero = random.nextInt(500) + 1;
            System.out.println(numero);

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);

        scAula10.nextLine();
    }
}
// Estrutura de Repetição
class Aprendizado02Aula10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula10 = new Scanner(System.in);

        String nomes[] = new String[5]; // Essa String recebe 5 informações.
        nomes[0] = "Pedro";
        nomes[1] = "Ana";
        nomes[2] = "Carlos";
        nomes[3] = "Davi";
        nomes[4] = "Jose";

        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }

        scAula10.nextLine();
    }
}
//Estrutura de Repetição Pt II
class Aprendizado03Aula10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula10 = new Scanner(System.in);

        String diasPortugues[] = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
        String diasEspanhol[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        String diasingles[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Português, Espanhol, Inglês:");
        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.printf("%s, %s, %s.\n", diasPortugues[i], diasEspanhol[i], diasingles[i]);
        }

        scAula10.nextLine();
        scAula10.close();
    }
}
