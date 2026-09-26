// Exercicios da Aula 01
package Algoritmo_Logica.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Exercicios01 {
    public static void main(String[] args) {
        Exercicio01Aula01.main(args);
        Exercicio02Aula01.main(args);
        Exercicio03Aula01.main(args);
        Exercicio04Aula01.main(args);
        Exercicio05Aula01.main(args);
    }
}
// Print "O primeiro programa a gente nunca esquece!"
class Exercicio01Aula01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula01Ex = new Scanner(System.in);
        
        System.out.println("O primeiro programa a gente nunca esquece!");

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula01Ex.nextLine();
    }
}
// Dados Pessoais
class Exercicio02Aula01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula01Ex = new Scanner(System.in);
        String nome, endereco, cep, telefone;

        nome = "Cauã de Araujo Sousa";
        endereco = "Q.1 CJ.A Casa 11";
        cep = "73020-011";
        telefone = "(61) 99988-0710";

        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CEP: " + cep + ", Telefone: " + telefone);

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula01Ex.nextLine();
    }
}
// Forma Desenhada
class Exercicio03Aula01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula01Ex = new Scanner(System.in);
        
        System.out.println("XXXXX");
        System.out.println("X    X");
        System.out.println("X    X");
        System.out.println("X    X");
        System.out.println("XXXXX");

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula01Ex.nextLine();
    }
}
// Notas dos Alunos
class Exercicio04Aula01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scAula01Ex = new Scanner(System.in);
        String aluno1, aluno2, aluno3, aluno4;
        double nota1, nota3, nota4;
        String nota2;

        aluno1 = "ALINE";           nota1 = 9; 
        aluno2 = "MÁRIO";           nota2 = "DEZ"; 
        aluno3 = "SÉRGIO";          nota3 = 5.5; 
        aluno4 = "SHIRLEY";         nota4 = 7;

        System.out.println("ALUNO(A)     NOTA");
        System.out.println("=========    =====");
        System.out.println(aluno1 + "        " + nota1);
        System.out.println(aluno2 + "        " + nota2);
        System.out.println(aluno3 + "       " + nota3);
        System.out.println(aluno4 + "      " + nota4);

        System.out.println("ENTER para o próximo Aprendizado.");
        scAula01Ex.nextLine();
    }
}
// Letra de Letras
class Exercicio05Aula01 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula01Ex = new Scanner(System.in);

        System.out.println("b");
        System.out.println("b");
        System.out.println("b");
        System.out.println("bbbbb");
        System.out.println("b    b");
        System.out.println("b    b");
        System.out.println("bbbbb");

        scAula01Ex.nextLine();
        scAula01Ex.close();
    }
}