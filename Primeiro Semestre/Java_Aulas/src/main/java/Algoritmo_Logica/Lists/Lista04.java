// Lista 04, referente à Aula 02.
package Algoritmo_Logica.Lists;
// @author Cauã Sousa
import java.util.Scanner;
public class Lista04 {
    public static void main(String[] args) {
        Lista04Exercicio01.main(args);
        Lista04Exercicio02.main(args);
        Lista04Exercicio03.main(args);
        Lista04Exercicio04.main(args);
        Lista04Exercicio05.main(args);
        Lista04Exercicio06.main(args);
        Lista04Exercicio07.main(args);
        Lista04Exercicio08.main(args);
    }
}
// Calculadora Simples
class Lista04Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista04 = new Scanner(System.in);
        int n1, n2;
        int adicao, subtracao, multiplicacao, divisao, resto;

        System.out.println("Apenas números inteiros.");
        System.out.println("Digite o primeiro número: ");
        n1 = scLista04.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scLista04.nextInt();

        adicao = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        resto = n1 % n2;

        System.out.println("Adição: " + n1 + " + " + n2 + " = " + adicao);
        System.out.println("Subtração: " + n1 + " - " + n2 + " = " + subtracao);
        System.out.println("Multiplicação: " + n1 + " * " + n2 + " = " + multiplicacao);
        System.out.println("Divisão: " + n1 + " / " + n2 + " = " + divisao + " (Resto: " + resto + ")");
        scLista04.nextLine();
        scLista04.nextLine();
    }
}
// Temperatura Celsius para Fahrenheit
class Lista04Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista04 = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = scLista04.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("F = (" + celsius + "°C * 9 / 5) + 32");
        System.out.println("Temperatura em Fahrenheit = " + fahrenheit + "°F");
        scLista04.nextLine();
        scLista04.nextLine();
    }
}
// Media Ponderada
class Lista04Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista04 = new Scanner(System.in);
        double portugues, matematica, ciencias;
        double pesoPortugues, pesoMatematica, pesoCiencias;
        double pesoNotas, pesoSomas, mediaPonderada;

        System.out.println("Digite a Nota em Português: ");
        portugues = scLista04.nextDouble();
        System.out.println("Digite o Peso em Português: ");
        pesoPortugues = scLista04.nextDouble();

        System.out.println("Digite a Nota em Matemática: ");
        matematica = scLista04.nextDouble();
        System.out.println("Digite o Peso em Matemática: ");
        pesoMatematica = scLista04.nextDouble();

        System.out.println("Digite a Nota em Ciências: ");
        ciencias = scLista04.nextDouble();
        System.out.println("Digite o Peso em Ciências: ");
        pesoCiencias = scLista04.nextDouble();

        pesoNotas = (pesoPortugues * portugues) + (pesoMatematica * matematica) + (pesoCiencias * ciencias);
        pesoSomas = pesoPortugues + pesoMatematica + pesoCiencias;
        mediaPonderada = pesoNotas / pesoSomas;

        System.out.println("A Média Ponderada é: (" + pesoPortugues + " * " + portugues + ") + ("
        + pesoMatematica + " * " + matematica + ") + (" + pesoCiencias + " * " + ciencias + ") / ("
        + pesoPortugues + " + " + pesoMatematica + " + " + pesoCiencias + ")");
        System.out.println("A Média Ponderada é = " + mediaPonderada);
        scLista04.nextLine();
        scLista04.nextLine();
    }
}
// Calculo IMC
class Lista04Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista04 = new Scanner(System.in);
        double peso, altura, imc;

        System.out.println("Digite seu Peso (Kg): ");
        peso = scLista04.nextDouble();
        System.out.println("Digite sua Altura (m): ");
        altura = scLista04.nextDouble();

        imc = peso / (altura * altura);

        System.out.println("Classificações:");
        System.out.println("Abaixo de 18,5: Abaixo do Peso");
        System.out.println("Entre 18,5 e 24,9: Peso Normal");
        System.out.println("Entre 25,0 e 29,9: Sobrepeso");
        System.out.println("Entre 30,0 e 34,9: Obesidade Grau I");
        System.out.println("Entre 35,0 e 39,9: Obesidade Grau II");
        System.out.println("Acima de 40,0: Obesidade Grau III");
        System.out.println("Seu IMC é = " + imc);
        scLista04.nextLine();
        scLista04.nextLine();
    }
}
// Conversor de Moedas
class Lista04Exercicio05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista04 = new Scanner(System.in);
        double real, dolar;

        System.out.println("Cotação do Dólar 02/09/2025: R$ 5,46");
        System.out.println("Digite o valor em R$ (Reais): ");
        real = scLista04.nextDouble();

        dolar = real / 5.46;

        System.out.printf("O valor de R$ %.2f em Dólar é = $%.2f %n", real, dolar);
        scLista04.nextLine();
        scLista04.nextLine();
    }
}
// Calculo Desconto
class Lista04Exercicio06 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista04 = new Scanner(System.in);
        double valorProduto, valorDesconto;
        double desconto, valorFinal;

        System.out.println("Digite o Valor do Produto (R$): ");
        valorProduto = scLista04.nextDouble();
        System.out.println("Digite o Valor do Desconto (%): ");
        valorDesconto = scLista04.nextDouble();

        desconto = valorProduto * (valorDesconto / 100);
        valorFinal = valorProduto - desconto;

        System.out.printf("Você recebeu um desconto de: R$ %.2f %n", desconto);
        System.out.printf("O valor final do produto é: R$ %.2f %n", valorFinal);
        scLista04.nextLine();
        scLista04.nextLine();
    }
}
// Calculo de Juros Simples
class Lista04Exercicio07 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista04 = new Scanner(System.in);
        double capital, taxa, tempo, juros;
        int meses;

        System.out.println("Digite o Capital Inicial: ");
        capital = scLista04.nextDouble();
        System.out.println("Digite a Taxa de Juros (em %): ");
        taxa = scLista04.nextDouble() / 100;
        System.out.println("Digite o Tempo (em meses): ");
        tempo = scLista04.nextDouble();

        juros = capital * taxa * tempo;
        meses = (int) tempo;

        System.out.printf("Em %d meses você pagará R$ %.2f de juros. %n", meses, juros);
        System.out.printf("O valor total a ser pago é de R$ %.2f %n", (capital + juros));
        scLista04.nextLine();
        scLista04.nextLine();
    }
}
// Área e Perímetro Retângulo
class Lista04Exercicio08 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scLista04 = new Scanner(System.in);
        double base, altura, area, perimetro;

        System.out.println("Vamos calcular a area e o perimetro de um retangulo!!");
        System.out.println("Digite a base do retangulo (cm): ");
        base = scLista04.nextDouble();
        System.out.println("Digite a altura do retangulo (cm): ");
        altura = scLista04.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("A área de um retangulo cujo a base vale " + base + "cm e a altura vale "
        + altura + "cm é igual a: " + area + "cm²");
        System.out.println("Quanto ao seu perimetro, o mesmo é igual a: " + perimetro + "cm");
        scLista04.nextLine();
        scLista04.nextLine();
        scLista04.close();
    }
}