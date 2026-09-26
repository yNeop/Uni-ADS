// Lista 03, referente à Aula 01.
package Algoritmo_Logica.Lists;
// @author Cauã Sousa
import java.util.Scanner;
public class Lista03 {
    public static void main(String[] args) {
        Lista03Exercicio01.main(args);
        Lista03Exercicio02.main(args);
        Lista03Exercicio03.main(args);
        Lista03Exercicio04.main(args);
        Lista03Exercicio05.main(args);
    }
}
// Área de um Retângulo
class Lista03Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista03 = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Vamos Calcular a Área de um Retângulo!! (Não existe tamanho Negativo)");
        System.out.println("Digite o Valor da Base: ");
        base = scLista03.nextDouble();
        	
        System.out.println("Agora, digite o Valor da Altura: ");
        altura = scLista03.nextDouble();

        area = base * altura;

        System.out.println("O Valor da Área é igual a Base * Altura:");
        System.out.println(area);
        scLista03.nextLine();
        scLista03.nextLine();
    }
}
// Perimereo de um Quadrado
class Lista03Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista03 = new Scanner(System.in);
        double lado, perimetro;

        System.out.println("Vamos Calcular o Perímetro de um Quadrado!! (Não existe tamanho Negativo)");
        System.out.println("Digite o Valor de Qualquer Lado: ");
        lado = scLista03.nextDouble();
        	
        System.out.println("O Valor da Perímetro é igual a Quantidade de Lados * Valor do Lado:");
        System.out.println("Por tanto, 4.0 * " + lado + ":");

        perimetro = 4 * lado;

        System.out.println(perimetro);
        scLista03.nextLine();
        scLista03.nextLine();
    }
}
// Temperatura Celsius para Fahrenheit
class Lista03Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista03 = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scLista03.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("F = (" + celsius + "°C * 9.0 / 5.0) + 32");
        System.out.println("Temperatura em Fahrenheit = " + fahrenheit + "°F");
        scLista03.nextLine();
        scLista03.nextLine();
    }
}
// Média de três notas
class Lista03Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista03 = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.println("Digite a primeira nota: ");
        n1 = scLista03.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = scLista03.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = scLista03.nextDouble();

        media = (n1 + n2 + n3) / 3.0;

        System.out.println("Média das Notas: " + n1 + ", " + n2 + " e " + n3 + " = " + media);
        scLista03.nextLine();
        scLista03.nextLine();
    }
}
// Diferença de Idade
class Lista03Exercicio05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scLista03 = new Scanner(System.in);
        int idade1, idade2, diff;
        double difMath;

        System.out.println("Digite a idade mais alta: ");
        idade1 = scLista03.nextInt();
        System.out.println("Digite a idade mais jovem: ");
        idade2 = scLista03.nextInt();

        difMath = (idade1 - idade2);
        diff = (int) difMath;

        System.out.printf("A Diferença das idades %d e %d é de %d anos.", idade1, idade2, diff);
        scLista03.nextLine();
        scLista03.nextLine();
        scLista03.close();
    }
}