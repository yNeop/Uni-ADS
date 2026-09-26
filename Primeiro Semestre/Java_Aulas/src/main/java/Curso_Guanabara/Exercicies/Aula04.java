// Hora do Sistema, Idioma e Resolução de Tela
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class Aula04 {
    public static void main(String[] args) {
        Scanner Exercicio04 = new Scanner(System.in);
        Exercicies04.executar(Exercicio04);
        ExerciciesPratics04.main(args);
        Exercicio04.close();
    }
}
class Exercicies04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void executar(Scanner Exercicio04) {
        
        System.out.println("(EAGS-SIN) - 01. Indique a opção que contém o valor final da variável"
        + " X, após a execução do trecho de programa em Português Estruturado mostrado abaixo."
        + " considere os seguintes valores para as variáveis: A=3; B=2; C=8; D=7.");

        System.out.println("se.não.(A>3).e. .não.(B<5) então");
        System.out.println("    X<-10");
        System.out.println("senão");
        System.out.println("    se(A>=2).ou.(C<=1) então");
        System.out.println("        X<-(A+D)/2");
        System.out.println("    senão");
        System.out.println("        se(A=2).ou.(B<7) então");
        System.out.println("            X<-(A+2)*(B-2)");
        System.out.println("        senão");
        System.out.println("            X<-((A+C)/B*(C+D)");
        System.out.println("        fim_se");
        System.out.println("    fim_se");
        System.out.println("fim_se");

        System.out.println();
        System.out.println("a. 10");
        System.out.println("b. 5");
        System.out.println("c. ZERO");
        System.out.println("d. 82,5");

        String RespostaScann01 = Exercicio04.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("b");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio04.nextLine();

        System.out.println("(EAGS-SIN) - 02. Indique a alternativa que tem a representação na"
        + " forma da expressão aritmetica abaixo:");

        System.out.println("Z=5² / (32-13)+8*2");

        System.out.println();
        System.out.println("a. Z=5*5/(32-13)+8x2");
        System.out.println("b. Z=<-(5*5/(32-13)+(8*2)");
        System.out.println("c. Z=5^2/(32-13)+8x2");
        System.out.println("d. Z<-((5^2)/(32-13)+(8*2))");

        String RespostaScann02 = Exercicio04.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("d");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: d");
        }
        System.out.println("Fim das Questões, aperte ENTER para Exercicios Praticos.");
        Exercicio04.nextLine();
        Exercicio04.close();
    }
    public static void main(String[] args) {
        Scanner Exercicio04 = new Scanner(System.in);
        Exercicies04.executar(Exercicio04);
        Exercicio04.close();
    }
}
class ExerciciesPratics04 {
    public static void main(String[] args) {
        // Date "nome" = NovoObjeto Date();
        Date relogio = new Date();
        // "nome".toString());
        System.out.println("A Hora do Sistema é:");
        System.out.println(relogio.toString());

        System.out.println();

        // Locale "nome" = Locale.getDefault();
        Locale Brasil = Locale.getDefault();
        // Brasil.getDisplayLanguage()
        System.out.println("O Idioma do Sistema está em " + Brasil.getDisplayLanguage());

        System.out.println();

        // Obtém a instância padrão do Toolkit
        Toolkit resolucaoTela = Toolkit.getDefaultToolkit();
        // Obtém o tamanho da tela e retorna um objeto Dimension
        Dimension dimensaoTela = resolucaoTela.getScreenSize();
        // Obtém a largura e a altura do objeto Dimension
        int largura = dimensaoTela.width;
        int altura = dimensaoTela.height;
        // Imprime a resolução da tela no console
        System.out.println("A Resolução da Tela é: " + largura + " x " + altura);
    }
}
