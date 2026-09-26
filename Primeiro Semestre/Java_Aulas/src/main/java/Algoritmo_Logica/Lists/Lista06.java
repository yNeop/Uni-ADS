// Lista 06, referente à Aula 04.
package Algoritmo_Logica.Lists;
// @author Cauã Sousa
import java.util.Scanner;
public class Lista06 {
    public static void main(String[] args) {
        Lista06Exercicio01.main(args);
        Lista06Exercicio02.main(args);
        Lista06Exercicio03.main(args);
        Lista06Exercicio04.main(args);
        Lista06Exercicio05.main(args);
        Lista06Exercicio06Extra.main(args);
    }
}
// Maior de idade?
class Lista06Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista06 = new Scanner(System.in);
        int idadeUser;

        System.out.println("Digite sua idade por segurança:");
        idadeUser = scLista06.nextInt();

        if (idadeUser >= 18) {
            System.out.println("Você é maior de idade, prossiga!");
        } else {
            System.out.println("Você é menor de idade e não pode prosseguir.");
        }
        scLista06.nextLine();
        scLista06.nextLine();
    }
}
// Iguais?
class Lista06Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista06 = new Scanner(System.in);
        int n1, n2;

        System.out.println("Os números são iguais?");
        System.out.println("Digite o primeiro número:");
        n1 = scLista06.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = scLista06.nextInt();

        if (n1 == n2) {
            System.out.println("Sim, eles são iguais!");
        } else {
            System.out.println("Não, eles são diferentes");
        }
        scLista06.nextLine();
        scLista06.nextLine();
    }
}
// Iguais?
class Lista06Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista06 = new Scanner(System.in);
        int n1, n2;

        System.out.println("Qual é maior?");
        System.out.println("Digite o primeiro número:");
        n1 = scLista06.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = scLista06.nextInt();

        if (n1 > n2) {
            System.out.println("O Número " + n1 + " é MAIOR que " + n2);
        } else if (n1 < n2) {
            System.out.println("O Número " + n2 + " é MAIOR que " + n1);
        } else {
            System.out.println("Esses númerios são iguais!");
        }
        scLista06.nextLine();
        scLista06.nextLine();
    }
}
// Média de Notas
class Lista06Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista06 = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;
        String nome;

        System.out.println("Media das Notas!");
        System.out.println("Digite o nome do Aluno: ");
        nome = scLista06.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = scLista06.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scLista06.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scLista06.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = scLista06.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é = " + media);
        if (media >= 6) {
            System.out.println("Aluno " + nome + " foi aprovado!");
        } else {
            System.out.println("Aluno " + nome + " está reprovado!");
        }
        scLista06.nextLine();
        scLista06.nextLine();
    }
}
// IMC
class Lista06Exercicio05 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista06 = new Scanner(System.in);
        double altura, pesomasc, pesofem;
        int sexo;

        System.out.println("Seu Peso Ideal!");
        System.out.println("Considerando que Homem tenha o ID 1 e Mulher o ID 2, qual é o seu sexo?");
        sexo = scLista06.nextInt();
        System.out.println("Qual sua altura (m)?");
        altura = scLista06.nextDouble();

        switch (sexo) {
            case 1 -> {
                System.out.println("(72.7 * " + altura + ") - 58.0");
                pesomasc = (72.7 * altura) - 58;
                System.out.println("Seu peso Ideal é = " + pesomasc);
            }
            case 2 -> {
                System.out.println("(62.1 * " + altura + ") - 44.7");
                pesofem = (62.1 * altura) - 44.7;
                System.out.println("Seu peso Ideal é = " + pesofem);
            }
            default -> {
                System.out.println("Você digitou um ID incorretamente, não poderá saber seu peso ideal");
            }
        }
        scLista06.nextLine();
        scLista06.nextLine();
    }
}
// IMC2
class Lista06Exercicio06Extra {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scLista06 = new Scanner(System.in);
        double altura, peso, seuimc, imcmasc, imcfem;
        int sexo;

        System.out.println("Seu IMC.");
        System.out.println("Considerando que Homem tenha o ID 1 e Mulher o ID 2, qual é o seu sexo?");
        sexo = scLista06.nextInt();
        System.out.println("Qual sua altura (m)?");
        altura = scLista06.nextDouble();
        System.out.println("Qual seu peso (kg)?");
        peso = scLista06.nextDouble();

        seuimc = peso / (altura * altura);

        System.out.println("Seu IMC é = " + seuimc + "Kg/m2");

        switch (sexo) {
            case 1 -> {
                System.out.println("Peso ideal = (72.7 * Altura) - 58.0");
                imcmasc = (72.7 * altura) - 58;
                System.out.println("Por sua altura, seu peso Ideal é = " + imcmasc + "Kg");
            }
            case 2 -> {
                System.out.println("Peso ideal = (62.1 * Altura) - 44.7");
                imcfem = (62.1 * altura) - 44.7;
                System.out.println("Por sua altura, seu peso Ideal é = " + imcfem + "Kg");
            }
            default -> {
                System.out.println("Você digitou um ID incorretamente, não poderá saber seu peso ideal");
            }
        }
        scLista06.nextLine();
        scLista06.nextLine();
        scLista06.close();
    }
}
