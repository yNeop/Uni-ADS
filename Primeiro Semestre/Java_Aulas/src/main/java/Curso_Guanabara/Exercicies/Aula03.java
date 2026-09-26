// Instalando JDK
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula03 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner Exercicio03 = new Scanner(System.in);
        System.out.println();
        System.out.println("(EAGS-SIN) - 01. Assinale a alternativa que contém a uma expressão"
        + " lógica com resultado VERDADE. Considere X = 7 e Y = 4.");

        System.out.println("a. (X>5).E.(.NÃO.(Y<3))");
        System.out.println("b. (X=5).OU.(Y>8)");
        System.out.println("c. (Y>10).E.(X=7)");
        System.out.println("d. .NÃO.(X=7)");

        String RespostaScann01 = Exercicio03.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("a");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: a");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio03.nextLine();

        System.out.println("(EAGS-SIN) - 02. Assinale a alternativa que contém o valor final"
        + " da variavel X após a execução do trecho de programa em Português estruturado a baixo."
        + " Considerando os valores iniciais A=6, B=2, C=4, D=3.");

        System.out.println("se .não.(A>6).e. .não.(B<3)então");
        System.out.println("    X <- A/D");
        System.out.println("senão");
        System.out.println("    X <- C*A");
        System.out.println("fim_se");

        System.out.println();
        System.out.println("a. 2");
        System.out.println("b. 12");
        System.out.println("c. 24");
        System.out.println("d. 48");

        String RespostaScann02 = Exercicio03.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("c");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: c");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio03.nextLine();

        System.out.println("(EAGS-SIN) - 03. Considerando os tipos de dados, relacione as colunas"
        + " e, a seguir, assinale a alternativa com a sequência correta.");

        System.out.println("(1) Inteiros        ( ) 35; 0; -56");
        System.out.println("(2) Reais           ( ) .F.; .V.");
        System.out.println("(3) Caracteres      ( ) \"Rua Brigadeiro Lyra\"");
        System.out.println("(4) Lógicos         ( ) -0,5; 1,8; -4");

        System.out.println();
        System.out.println("a. 3, 1, 4, 2");
        System.out.println("b. 2, 4, 3, 1");
        System.out.println("c. 1, 2, 3, 4");
        System.out.println("d. 1, 4, 3, 2");

        String RespostaScann03 = Exercicio03.nextLine();
        System.out.println();

        boolean Resposta03 = RespostaScann03.equals("d");

        if (Resposta03 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: d");
        }
        Exercicio03.nextLine();
        Exercicio03.close();
    }
}
