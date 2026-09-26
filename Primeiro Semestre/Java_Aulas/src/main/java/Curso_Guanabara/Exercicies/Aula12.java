// Estruturas condicionais parte 2
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Aula12 {
    public static void main(String[] args) {
        Scanner Exercicio12 = new Scanner(System.in);
        Exercicies12.main(args);
        ExerciciesPratics12.main(args);
        ExerciciesPratics12Proposta.main(args);
        Exercicio12.close();
    }
}
class Exercicies12 {
    public static void executar(Scanner Exercicio12) {
        System.out.println("01. Considerando o trecho do Fluxograma representado e mantendo a mesma estrutura " +
        "de lógica de programação, qual seria a sua transcrição válida para Linguagem Java?\n");

        System.out.println("Imagem na pasta Prints!\n");

        System.out.println("a. do {");
        System.out.println("       c++;");
        System.out.println("   } while (c <= 10);\n");

        System.out.println("b. do {");
        System.out.println("       c++;");
        System.out.println("   } while (c > 10);\n");

        System.out.println("c. while (c <= 10) {");
        System.out.println("       c++;");
        System.out.println("   }\n");

        System.out.println("d. while (c > 10) {");
        System.out.println("       c++;");
        System.out.println("   }\n");

        String RespostaScann01 = Exercicio12.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("b");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio12.nextLine();

        // NEXT

        System.out.println("02. Qual será o resultado impresso pelo trecho de código escrito em Linguagem JAVA?\n");

        System.out.println("int c = 1;");
        System.out.println("do {");
        System.out.println("    if (c % 5 != 0) System.out.println(c);");
        System.out.println("    else break;");
        System.out.println("    c += 1;");
        System.out.println("} while (c <= 10);\n");

        System.out.println("a. 1 2 3 4 5 6 7 8 9 10");
        System.out.println("b. 1 2 3 4 6 7 8 9");
        System.out.println("c. 1 2 3 4");
        System.out.println("d. Erro de Sintaxe");

        String RespostaScann02 = Exercicio12.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("c");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: c");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio12.nextLine();

        // NEXT
    }
    public static void main(String[] args) {
        Scanner Exercicio12 = new Scanner(System.in);
        Exercicies12.executar(Exercicio12);
    }
}
class ExerciciesPratics12 extends javax.swing.JFrame {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas!", JOptionPane.DEFAULT_OPTION);

        int n = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + n, "Resultado" ,JOptionPane.DEFAULT_OPTION);

        JOptionPane.showMessageDialog(null, "Clique em OK para iniciar o exercicio!", "Iniciando atividade", JOptionPane.DEFAULT_OPTION);

        int i, s = 0;
        do {
            i = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            s += i;
        } while (i != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final da soma de todos os números:<hr>" + s + "</html>");
    }
}
class ExerciciesPratics12Proposta {
    public static void main(String[] args) {
        int cont = 0, pares = 0, impares = 0, acimaCem = 0;
        int i, s = 0;
        double media;

        do {
            i = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>", "Calculadora", JOptionPane.DEFAULT_OPTION));
            if (i != 0) {
                s += i;
                cont++;

                if (i % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (i > 100) {
                    acimaCem++;
                }
            } 

        } while (i != 0);
        if (cont > 0) {
            media = s / cont;
        } else {
            media = 0;
        }

        JOptionPane.showMessageDialog(null, "<html>Resultado:<br>" + s + "<hr><br>Total de Valores: " + cont +
        "<br>Total de Pares: " + pares + "<br>Total de Impares: " + impares + "<br>Acima de 100: " + acimaCem +
        "<br>Media dos Valores: " + media + "</html>", "Resultado Final", JOptionPane.WARNING_MESSAGE);
    }
}