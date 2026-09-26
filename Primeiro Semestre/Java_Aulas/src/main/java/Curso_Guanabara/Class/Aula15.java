// Métodos
package Curso_Guanabara.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula15 {
    public static void main(String[] args) {
        Scanner scAula15 = new Scanner(System.in);
        inicio(scAula15);                  // Introdução da aula
        AulaTeorica15.executar(scAula15);  // Método executar da classe teórica
        next(scAula15);                    // Prossegue
        AulaPratica15.executar(scAula15);  // Método executar da classe prática
        fim(scAula15);                     // Finaliza
        scAula15.close();
    }

    private static void inicio(Scanner scAula15) {
        /*
         * Text Block pode ser feito com 3 aspas para quebrar linhas facilmente.
         * Esse é o método início.
         */
        System.out.print("""
        \nEssa aula começaremos com "Rotina". Era ideal que se tenha um breve conhecimento
        sobre o assunto (Algo que eu não tinha até esse aula).

        De qualquer forma, o Java costuma chamar rotina de "Método".

        !!AVISO - Essa aula contém prints importantes na pasta de Prints das Class!!
        Como de costume, tecle ENTER para prosseguir:
        """);

        scAula15.nextLine();
    }

    private static void next(Scanner scAula15) {
        System.out.print("""
        \nIniciando próxima parte!
        Tecle ENTER para prosseguir:
        """);

        scAula15.nextLine();
    }

    private static void fim(Scanner scAula15) {
        System.out.print("""
        \nVocê chegou ao fim!
        Agora, tecle ENTER para finalizar a ultima aula de Java Basico:
        """);

        scAula15.nextLine();
    }
}
class AulaTeorica15 {
    public static void main(String[] args) {
        Scanner scAula15 = new Scanner(System.in);
        executar(scAula15);
    }

    static void executar(Scanner scAula15) {
        // O Scanner vem da classe principal
        prosegueExemplo01(scAula15);
        prosegueExemplo02(scAula15);
    }

    private static void prosegueExemplo01(Scanner scAula15) {
        /*
         * Métodos podem ser private.
         * Dessa forma, só podem ser usados dentro da própria classe.
         */
        System.out.print("""
        Pode-se perceber no código da aula que o início é um void
        e que também este texto se encontra em outro void separado.

        Ambos são static void porque pertencem à classe.

        Farei um Exemplo 2 como um Método de soma,
        e puxarei para o método seguinte!

        Para continuar, tecle ENTER:
        """);

        scAula15.nextLine();
    }

    private static int soma(int a, int b) {
        return a + b; // Primeiro exemplo de método com retorno
    }

    private static void prosegueExemplo02(Scanner scAula15) {
        System.out.print("Digite o valor de a: ");
        int a = scAula15.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scAula15.nextInt();

        int resultado = soma(a, b);

        System.out.printf(
        "A soma de %d e %d é igual a: %d%n",
        a, b, resultado
        );

        scAula15.nextLine(); // Limpa buffer do Enter
    }
}
class AulaPratica15 {
    public static void main(String[] args) {
        Scanner scAula15 = new Scanner(System.in);
        executar(scAula15);
    }

    static void executar(Scanner scAula15) {
        inicio(scAula15);   // Reutiliza o mesmo Scanner da classe principal
    }

    private static String contador(int inicio, int fim) {
        StringBuilder contador = new StringBuilder();

        for (int c = inicio; c <= fim; c++) {
            contador.append(c).append(" ");
        }

        return contador.toString();
    }

    private static void inicio(Scanner scAula15) {
        System.out.println(contador(1, 5));
    }
}