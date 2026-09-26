// Como Funciona o Java
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula02 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner Exercicio02 = new Scanner(System.in);
        System.out.println();
        System.out.println("(CAP-PD) - 01. Em relação a linguagem de programação Java, complete"
        + " corretamente as lacunas das sentenças abaixo, e assinale a opção correta.");

        System.out.println("I. O Comando ______ do J2SE Development Kit executa um aplicativo"
        + " Java.");
        System.out.println("II. O Comando ______ do J2SE Development Kit compila um programa"
        + " Java.");
        System.out.println("III. Um arquivo de programa Java deve terminar com a extensão de arquivo"
        + " ______");
        System.out.println("IV. Quando um programa Java é compilado, o arquivo produzido pelo"
        + " computador termina com a extensão de arquivo ______");
        System.out.println("V. O arquivo produzido pelo computador Java contém ______ que são"
        + " executados pelo Java Virtual Machine");

        System.out.println();
        System.out.println("a. java / javac / java / class / bytecodes");
        System.out.println("b. javac / java / class / java / bytecodes");
        System.out.println("c. main / javac / java / jar / class");
        System.out.println("d. java / class / rar / jar / javac");
        System.out.println("e. rar / jar / java / javac / class");

        String RespostaScann01 = Exercicio02.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("a");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: a");
        }
        // Compilado é Mais Memoria Menos Tempo
        System.out.println("Aperte ENTER para continuar");
        Exercicio02.nextLine();

        System.out.println("(EAGS-SIN) - 02. Coloque Falsas (F) ou Verdadeiras (V) e em seguida"
        + " assinale a opção que contem a sequência correta.");

        System.out.println("( ) A área de memória requerida para operar com o programa compilado"
        + " é menor que a requerida para a interpretação.");
        System.out.println("( ) Um programa interpretado requer um área de memória menor que a do"
        + " programa compilado.");
        System.out.println("( ) O tempo para execução interpretada é maior que o tempo para a"
        + " execução compilada.");
        System.out.println("( ) Um programa compilado requer um tempo de execução maior do que um"
        + " programa interpretado.");

        System.out.println();
        System.out.println("a. F - V - V - F");
        System.out.println("b. V - F - F - V");
        System.out.println("c. F - V - V - V");
        System.out.println("d. V - F - V - V");

        String RespostaScann02 = Exercicio02.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("a");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: a");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio02.nextLine();

        System.out.println("(EAGS-SIN) - 03. Na construção de um algoritmo, como seria representado"
        + " o cálculo da multiplicação da base pela altura e em seguida a divisão pela constante 2?");

        System.out.println("a. área = base . altura 2");
        System.out.println("b. área <- (base * altura) / 2");
        System.out.println("c. área <- base . altura / 2");
        System.out.println("d. área = base * altura / 2");

        String RespostaScann03 = Exercicio02.nextLine();
        System.out.println();

        boolean Resposta03 = RespostaScann03.equals("b");

        if (Resposta03 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio02.nextLine();

        System.out.println("(EAGS-SIN) - 04. Assinale a alternativa que corresponde à fórmula correta"
        + " para calcular a média aritmética entre 4 notas, representadas pelas variáveis N1, N2, N3"
        + " e N4.");

        System.out.println("a. N1+N2+N3+N4/4");
        System.out.println("b. N1+N2+N3+(N4/4)");
        System.out.println("c. N.(1+2+3+4)/4");
        System.out.println("d. (N1+N2+N3+N4)/4");

        String RespostaScann04 = Exercicio02.nextLine();
        System.out.println();

        boolean Resposta04 = RespostaScann04.equals("d");

        if (Resposta04 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: d");
        }
        Exercicio02.nextLine();
        Exercicio02.close();
    }
}
