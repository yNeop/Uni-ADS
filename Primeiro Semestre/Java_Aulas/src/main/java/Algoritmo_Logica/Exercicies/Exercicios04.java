//Exercicios da Aula 04
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Exercicios04 {
    public static void main(String[] args) {
        Exercicio01Aula04.main(args);
        Exercicio02Aula04.main(args);
        Exercicio03Aula04.main(args);
        Exercicio04Aula04.main(args);
        Exercicio05Aula04.main(args);
        Exercicio06Aula04.main(args);
    }
}
// Maior de Idade?
class Exercicio01Aula04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04Ex = new Scanner(System.in);
        int idadeUser;

        System.out.println("Digite sua idade por segurança:");
        idadeUser = scAula04Ex.nextInt();
        	
        if (idadeUser >= 18) {
            System.out.println("Você é maior de idade, prossiga!");
        } else {
            System.out.println("Você é menor de idade e não pode prosseguir.");
        }
        scAula04Ex.nextLine();
        scAula04Ex.nextLine();
    }
}
// Iguais
class Exercicio02Aula04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04Ex = new Scanner(System.in);
        int n1, n2;

        System.out.println("Os números são iguais?");
        System.out.println("Digite o primeiro número:");
        n1 = scAula04Ex.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = scAula04Ex.nextInt();
        	
        if (n1 == n2) {
            System.out.println("Sim, eles são iguais!");
        } else {
            System.out.println("Não, eles são diferentes");
        }
        scAula04Ex.nextLine();
        scAula04Ex.nextLine();
    }
}
// Qual é Maior?
class Exercicio03Aula04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04Ex = new Scanner(System.in);
        int n1, n2;

        System.out.println("Qual é maior?");
        System.out.println("Digite o primeiro número:");
        n1 = scAula04Ex.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = scAula04Ex.nextInt();
        	
        if (n1 > n2) {
            System.out.println("O Número " + n1 + " é MAIOR que " + n2);
        } else if (n1 < n2) {
            System.out.println("O Número " + n2 + " é MAIOR que " + n1);
        } else {
        	System.out.println("Esses númerios são iguais!");
        }
        scAula04Ex.nextLine();
        scAula04Ex.nextLine();
    }
}
// Media de Notas
class Exercicio04Aula04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04Ex = new Scanner(System.in);
        double nota1, nota2, nota3, nota4;
        double media;
        String nome;

        System.out.println("Media das Notas!");
        System.out.println("Digite o nome do Aluno: ");
        nome = scAula04Ex.nextLine();
        System.out.println("Digite a primeira nota: ");
        nota1 = scAula04Ex.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scAula04Ex.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scAula04Ex.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = scAula04Ex.nextDouble();
        	
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média é = " + media);

        if (media >= 6) {
            System.out.println("Aluno " + nome + " foi aprovado!");
        } else {
            System.out.println("Aluno " + nome + " está reprovado!");
        }
        scAula04Ex.nextLine();
        scAula04Ex.nextLine();
    }
}
// Peso Ideal
class Exercicio05Aula04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula04Ex = new Scanner(System.in);
        double altura, pesomasc, pesofem;
        int sexo;

        System.out.println("Seu Peso Ideal!");
        System.out.println("Considerando que Homem tenha o ID 1 e Mulher o ID 2, qual é o seu sexo?");
        sexo = scAula04Ex.nextInt();
        System.out.println("Qual sua altura (m)?");
        altura = scAula04Ex.nextDouble();
        
        switch (sexo) {
            case 1 -> {
                System.out.println("(72.7 * " + altura + ") - 58.0");
                pesomasc = (72.7 * altura) - 58;
                System.out.println("Seu peso Ideal é = " + pesomasc);
            } case 2 -> {
                System.out.println("(62.1 * " + altura + ") - 44.7");
                pesofem = (62.1 * altura) - 44.7;
                System.out.println("Seu peso Ideal é = " + pesofem);
            } default -> {
                System.out.println("Você digitou um ID incorretamente");
            }
        }
        scAula04Ex.nextLine();
        scAula04Ex.nextLine();
    }
}
// Impar ou Par?
class Exercicio06Aula04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula04Ex = new Scanner(System.in);
        double numero, tipo;

        System.out.println("Par ou Impar?!?");
        System.out.println("Digite um número: ");
        numero = scAula04Ex.nextDouble();
        	
        tipo = numero % 2;

        if (tipo == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Número Impar");
        }
        scAula04Ex.nextLine();
        scAula04Ex.nextLine();
        scAula04Ex.close();
    }
}