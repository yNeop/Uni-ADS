// Exercicios da Aula 02
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Exercicios02 {
    public static void main(String[] args) {
        Exercicio01Aula02.main(args);
        Exercicio02Aula02.main(args);
        Exercicio03Aula02.main(args);
        Exercicio04Aula02.main(args);
        Exercicio05Aula02.main(args);
    }
}
// Informações de um Carro
class Exercicio01Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02Ex = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);
        
        String marca = "Dodge";
        String modelo = "Challenger SRT Hellcat";
        String cor = "Preto";
        int ano = 2024;

        int velocidadeMaxima = 326;  // Km/h
        double aceleracao = 3.4;    // 0-100 Km/h em segundos
        double preco = 929000;     // Em Reais: 929.000,00
        String precoReal = Real.format(preco);

        System.out.println("Carro: " + marca + " " + modelo + " (" + ano + ") " + cor);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " Km/h");
        System.out.println("Aceleração (0-100 Km/h): " + aceleracao + " segundos");
        System.out.println("Preço: " + precoReal);

        System.out.println("ENTER para o próximo Exercicio.");
        scAula02Ex.nextLine();
    }
}
// Calculo de Diferença
class Exercicio02Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02Ex = new Scanner(System.in);
        int A, B, C, D;
        double diff;

        System.out.println("Digite o valor de A: ");
        A = scAula02Ex.nextInt();
        System.out.println("Digite o valor de B: ");
        B = scAula02Ex.nextInt();
        System.out.println("Digite o valor de C: ");
        C = scAula02Ex.nextInt();
        System.out.println("Digite o valor de D: ");
        D = scAula02Ex.nextInt();

        System.out.println("Aplicando a fórmula (A * B) - (C * D), teremos: ");
        diff = (A * B) - (C * D);
        System.out.println("(" + A + " * " + B + ") - (" + C + " * " + D + ") = " + diff);

        System.out.println("ENTER para o próximo Exercicio.");
        scAula02Ex.nextLine();
        scAula02Ex.nextLine();
    }
}
// Salario vendedor
class Exercicio03Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02Ex = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);

        double salarioFixo = 2000, valorMes, comissao, salarioFinal;
        String nome, salarioReal, comissaoReal, finalReal;

        System.out.println("Digite o nome do vendedor: ");
        nome = scAula02Ex.nextLine();
        System.out.println("Digite o valor vendido no mês: ");
        valorMes = scAula02Ex.nextDouble();

        comissao = valorMes * 0.05;
        salarioFinal = salarioFixo + comissao;

        salarioReal = Real.format(salarioFixo);
        comissaoReal = Real.format(comissao);
        finalReal = Real.format(salarioFinal);

        System.out.println("O vendedor: " + nome + ", recebeu um total de " + finalReal +
        " neste mês, sendo " + salarioReal + " de salário fixo e " + comissaoReal + " de comissão");

        System.out.println("ENTER para o próximo Exercicio.");
        scAula02Ex.nextLine();
        scAula02Ex.nextLine();
    }
}
// Média de Notas
class Exercicio04Aula02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula02Ex = new Scanner(System.in);
        double n1, n2, n3, n4;
        double media;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = scAula02Ex.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = scAula02Ex.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = scAula02Ex.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = scAula02Ex.nextDouble();
        System.out.println("Digite a quarta nota: ");
        n4 = scAula02Ex.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4.0;

        System.out.println("Aluno: " + nome);
        System.out.println("Formula: " + n1 + " + " + n2 + " + " + n3 + " + " + n4 + " / 4");
        System.out.println("Média Final = " + media);

        System.out.println("ENTER para o próximo Exercicio.");
        scAula02Ex.nextLine();
        scAula02Ex.nextLine();
    }
}
// Temperatura Celsius para Fahrenheit
class Exercicio05Aula02 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula02Ex = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scAula02Ex.nextDouble();

        fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("F = (9 * " + celsius + "°C + 160) / 5");
        System.out.println("Temperatura em Fahrenheit = " + fahrenheit + "°F");
        scAula02Ex.nextLine();
        scAula02Ex.nextLine();
        scAula02Ex.close();
    }
}