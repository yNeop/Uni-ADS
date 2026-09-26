// Lista 01, referente à Aula 01.
package Algoritmo_Logica.Lists;
// @author Cauã Sousa
import java.util.Scanner;
public class Lista01 {
    public static void main(String[] args) {
        Lista01Exercicio01.main(args);
        Lista01Exercicio02.main(args);
        Lista01Exercicio03.main(args);
        Lista01Exercicio04.main(args);
        Lista01Exercicio05.main(args);
    }
}
// Área de um Retângulo
class Lista01Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista01 = new Scanner(System.in);
        int base, altura;
		float area;

        base = 60; altura = 25;
        area = base * altura;

		System.out.println("A Área de um retângulo, cujo a base vale 60cm e sua altura 25cm é = " 
        + area + " cm²");

        System.out.println("ENTER para o próximo Exercico.");
        scLista01.nextLine();
    }
}
// Perimetro de um Quadrado
class Lista01Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista01 = new Scanner(System.in);
        int base, lados;
		float perimetro;

        base = 40; lados = 4;
        perimetro = base * lados;

		System.out.println("O Perímetro de um quadrado, cujo um lado vale 40cm é = " + perimetro + "cm");

        System.out.println("ENTER para o próximo Exercico.");
        scLista01.nextLine();
    }

}
// Conversão de Temperatura
class Lista01Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista01 = new Scanner(System.in);
        float Celcius = 22; // Temperatura em Celsius
        float Fahrenheit = (Celcius * 9 / 5) + 32; // Fórmula de conversão para Fahrenheit

        System.out.println("Temperatura em Celsius: " + Celcius);
        System.out.println("Temperatura em Fahrenheit: " + Fahrenheit);

        System.out.println("ENTER para o próximo Exercico.");
        scLista01.nextLine();
    }

}
// Média 3 notas
class Lista01Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista01 = new Scanner(System.in);
        int nota1, nota2, nota3;
        double media;

        nota1 = 6; nota2 = 4; nota3 = 8;
        media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("A média das notas 6.0, 4.0 e 8.0 é = " + media);

        System.out.println("ENTER para o próximo Exercico.");
        scLista01.nextLine();
    }
}
// Idade Diff
class Lista01Exercicio05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scLista01 = new Scanner(System.in);
        int idade1, idade2;
        int dif_idade;

        idade1 = 21; idade2 = 54;
        dif_idade = idade1 - idade2;

        System.out.println("A diferença de idade entre Cauã e Salvador é = " + dif_idade + " anos");

        scLista01.nextLine();
        scLista01.close();
    }
}