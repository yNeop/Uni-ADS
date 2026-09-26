package com.pratico;
import java.util.Scanner;
import com.dev_monitoria.Main;
public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        executar(sc);
        sc.close();
    }

    public static void executar(Scanner sc) {
        Soma.main(null);
        Main.transition(sc);
        Pessoa.main(null);
    }
}

class Soma {
    public static void main(String[] args) {
        System.out.println("A soma de 1 e 2 é " + soma(1, 2));
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}

class Pessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome("Arnaldo");
        pessoa.setIdade(45);
        pessoa.setPeso(89.7);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
    }

    // Declarando variaveis
    private String nome;
    private int idade;
    private double peso;

    // Constructor vazio
    public Pessoa() {}

    // Constructor com argumentos
    public Pessoa(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Métodos GET
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    // Métodos SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}