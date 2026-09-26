// Historia do Java
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula01 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner Exercicio01 = new Scanner(System.in);
        System.out.println();
        System.out.println("(EAGS-SIN) - 01. Assinale a alternativa que contém a descrição correta"
        + " de Algoritmo.");

        System.out.println("a. Algoritmo é uma coleção de livros de uma mesma matéria, normalmente"
        + " relacionada à Engenharia de Software.");
        System.out.println("b. Algoritmo é uma operação matemática usada, por exemplo, para calcular"
        + " a intensidade sonora medida em decibéis.");
        System.out.println("c. Algoritmo é uma descrição das etapas de resolução de um problema ou"
        + " a indicação ordenada de uma sequência de ações bem-definidas.");
        System.out.println("d. Algoritmo é uma definição formal da hierarquia de funcionários de uma"
        + " empresa de desenvolvimento de software de grande porte.");

        String RespostaScann01 = Exercicio01.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("c");
        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: c");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio01.nextLine();

        System.out.println("(CAP-PD) - 02. Assinale a opção que NÃO apresenta um exemplo de Linguagem"
        + " de Programação");

        System.out.println("a. Delphi.");
        System.out.println("b. De Máquina.");
        System.out.println("c. Assembly.");
        System.out.println("d. Windows XP.");
        System.out.println("e. Visual Basic.");

        String RespostaScann02 = Exercicio01.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("d");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: d");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio01.nextLine();

        System.out.println("(CAP-PD) - 03. Qual é o utilitário responsável por gerar, a partir"
        + " de um programa escrito em uma linguagem de alto nivel, um programa em linguagem de máquina"
        + " não executável chamado de módulo-objeto?");

        System.out.println("a. Interpretador.");
        System.out.println("b. Depurador.");
        System.out.println("c. Loader.");
        System.out.println("d. Linker.");
        System.out.println("e. Compilador.");

        String RespostaScann03 = Exercicio01.nextLine();
        System.out.println();

        boolean Resposta03 = RespostaScann03.equals("e");

        if (Resposta03 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: e");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio01.nextLine();

        System.out.println("(EAGS-SIN) - 04. A expressão Z = X % Y corresponde à Z igual");

        System.out.println("a. A X% do valor de Y.");
        System.out.println("b. Ao resto da divisão de Y por X.");
        System.out.println("c. Ao resto da divisão de X por Y.");
        System.out.println("d. Ao quoeciente da divisão de X por Y.");
        System.out.println("e. Ao quoeciente da divisão de Y por X.");

        String RespostaScann04 = Exercicio01.nextLine();
        System.out.println();

        boolean Resposta04 = RespostaScann04.equals("c");

        if (Resposta04 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: c");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio01.nextLine();

        System.out.println("(EAGS-SIN) - 05. Fluxograma é um tipo de");

        System.out.println("a. Representação gráfica de algoritmos.");
        System.out.println("b. Informação sobre tipos de dados.");
        System.out.println("c. Livro de analise de sistemas.");
        System.out.println("d. Analise de sistemas.");

        String RespostaScann05 = Exercicio01.nextLine();
        System.out.println();

        boolean Resposta05 = RespostaScann05.equals("a");

        if (Resposta05 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: a");
        }
        Exercicio01.nextLine();
        Exercicio01.close();
    }
}
