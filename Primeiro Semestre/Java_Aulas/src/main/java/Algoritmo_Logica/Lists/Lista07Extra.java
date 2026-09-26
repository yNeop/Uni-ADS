// Lista 06, referente à Aula 04.
package Algoritmo_Logica.Lists;
// @author Cauã Sousa
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Lista07Extra {
    public static void main(String[] args) {
        Lista07Exercicio01.main(args);
        Lista07Exercicio02.main(args);
        Lista07Exercicio03.main(args);
        Lista07Exercicio04.main(args);
    }
}
// Aréa do Triangulo Heron
class Lista07Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista07 = new Scanner(System.in);
        double a, b, c, s, A;

        System.out.println("Digite o Valor de 'a': ");
        a = scLista07.nextDouble();
        System.out.println("Digite o Valor de 'b': ");
        b = scLista07.nextDouble();
        System.out.println("Digite o Valor de 'c': ");
        c = scLista07.nextDouble();

        s = (a + b + c) / 2;
        A = s * (s - a) * (s - b) * (s - c);

        System.out.println();
        System.out.println("s = (" + a + " + " + b + " + " + c + " / 2.0");
        System.out.println("s = " + s);
        System.out.println();

        System.out.println("A = Raiz de: " + s + "(" + s + " - " + a + ")(" + s + " - " + b + ")(" + s + " - " + c + ")");
        
        if (A > 0.0) {
            System.out.println("A = " + Math.sqrt(A));
        } else {
            System.out.println("Tente  com uma raiz positiva.");
        }
        scLista07.nextLine();
        scLista07.nextLine();
    }
}
// Indice poluição
class Lista07Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista07 = new Scanner(System.in);
        double indice;

        System.out.println("Por favor, digite o índice de poluição (Minimo 0,05): ");
        indice = scLista07.nextDouble();
        System.out.println();

        if (indice >= 0.05 && indice <= 0.29) {
            System.out.println("O índice de poluição está aceitavel!");
        } else if (indice >= 0.3 && indice <= 0.39) {
            System.out.println("O Grupo 01 está suspenso!");
        } else if (indice >= 0.4 && indice <= 0.49) {
            System.out.println("O Grupo 01 e Grupo 02 estão suspensos!");
        } else if (indice >= 0.5) {
            System.out.println("O Grupo 01, Grupo 02 e Grupo 03 estão suspensos!");
        } else {
            System.out.println("Não vale mentir...");
        }
        scLista07.nextLine();
        scLista07.nextLine();
    }
}
// Credito Extra
class Lista07Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista07 = new Scanner(System.in);
        Locale Brasil = Locale.of("pt", "BR");
        NumberFormat Real = NumberFormat.getCurrencyInstance(Brasil);

        String nome, medioReal, creditoReal;
        double medio, credito;

        System.out.println("Digite o nome completo do cliente.");
        nome = scLista07.nextLine();
        System.out.println("Digite o saldo médio do cliente");
        medio = scLista07.nextDouble();

        medioReal = Real.format(medio);
        System.out.println();

        if (medio >= 0.00 && medio <= 200.99) {
            System.out.println(nome + ":");
            System.out.println("Nenhum Crédito Extra.");
            System.out.println("Saldo Médio: " + medioReal);
            System.out.println("Crédito Extra = R$ 0,00");
        } else if (medio >= 201.00 && medio <= 400.99) {
            credito = medio * 0.2;
            creditoReal = Real.format(credito);

            System.out.println(nome + ":");
            System.out.println("Você recebeu 20% do seu saldo em Crédito Extra");
            System.out.println("Saldo Médio: " + medioReal);
            System.out.println("Crédito Extra = " + creditoReal);
        } else if (medio >= 401.00 && medio <= 600.99) {
            credito = medio * 0.3;
            creditoReal = Real.format(credito);

            System.out.println(nome + ":");
            System.out.println("Você recebeu 30% do seu saldo em Crédito Extra");
            System.out.println("Saldo Médio: " + medioReal);
            System.out.println("Crédito Extra = " + creditoReal);
        } else if (medio >= 601.00) {
            credito = medio * 0.4;
            creditoReal = Real.format(credito);

            System.out.println(nome + ":");
            System.out.println("Você recebeu 40% do seu saldo em Crédito Extra");
            System.out.println("Saldo Médio: " + medioReal);
            System.out.println("Crédito Extra = " + creditoReal);
        } else {
            System.out.println(nome + ":");
            System.out.println("Seu saldo está negativo");
            System.out.println("Saldo Médio: " + medioReal);
            System.out.println("Crédito Extra = R$ 0,00");
        }
        scLista07.nextLine();
        scLista07.nextLine();
    }
}
// Coordenadas
class Lista07Exercicio04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scLista07 = new Scanner(System.in);
        double x, y;

        System.out.print("Digite o valor de x: ");
        x = scLista07.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = scLista07.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("A coordenada está no Primeiro Quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("A coordenada está no Segundo Quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("A coordenada está no Terceiro Quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("A coordenada está no Quarto Quadrante.");
        } else if (x == 0 && y == 0) {
            System.out.println("A coordenada está na origem.");
        } else if (x == 0) {
            System.out.println("A coordenada está sobre o eixo Y.");
        } else {
            System.out.println("A coordenada está sobre o eixo X.");
        }
        scLista07.nextLine();
        scLista07.nextLine();
        scLista07.close();
    }
}