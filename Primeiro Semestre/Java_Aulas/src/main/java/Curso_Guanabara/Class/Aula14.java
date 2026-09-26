// Vetores
package Curso_Guanabara.Class;
// @author Cauã Sousa
import java.util.Scanner;
import java.time.Year;
import java.util.Arrays;
    public class Aula14 {
        public static void main(String[] args) {
            Scanner scAula14 = new Scanner(System.in);
            AulaTeorica14pt1.executar1(scAula14);
            AulaTeorica14pt2.executar2(scAula14);
            AulaTeorica14pt3.executar3(scAula14);
            scAula14.close();
        }
    }
class AulaTeorica14pt1 {
    public static void executar1(Scanner scAula14) {
        System.out.print("A aula é sobre uma variavel em forma de objeto que carregue mais de uma informação.\n" + 
        "\nPor exemplo: int x = 1;\n\nEssa varivel carrega apenas um valor, o número 1. Faremos um objeto que " +
        "carregue mais!\nJá sabe, né? Aperte ENTER para prosseguir: ");
        scAula14.nextLine();

        int[] exemplo01 = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("\nDigite o valor da caixa " + i + ": ");
            exemplo01[i] = scAula14.nextInt();
        }
        scAula14.nextLine(); 
        
        System.out.println("\nVocê escolheu: " 
        + exemplo01[0] + ", "
        + exemplo01[1] + ", "
        + exemplo01[2] + " e "
        + exemplo01[3]);

        System.out.print("A soma desses números é = ");
        System.out.print(exemplo01[0] + exemplo01[1] + exemplo01[2] + exemplo01[3] + "\n");

        System.out.println("\nENTER para novo exemplo:");
        scAula14.nextLine();

        // NEXT

        int[] exemplo02 = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de Casas do exemplo02 = " + exemplo02.length + "\n");
        for (int c = 0; c <= 5; c++) {
            if (c == 5) {
                System.out.print("e " + exemplo02[c] + "\n");
            } else {
                System.out.print(exemplo02[c] + ", ");
            }
        }

        System.out.println("\nOu:\n");

        for (int c = 0; c <= exemplo02.length - 1; c++) {
            System.out.print("Na posição " + c + " temos o valor " + exemplo02[c] + "\n");
        }

        System.out.println("\nENTER para continuar:");
        scAula14.nextLine();
    }
    public static void main(String[] args) {
        Scanner scAula14 = new Scanner(System.in);
        executar1(scAula14);
        scAula14.close();
    }
}
class AulaTeorica14pt2 {
    public static void executar2(Scanner scAula14) {
        System.out.println("Vetor com String!");

        String[] propMes = {
            "Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
            "Jul", "Ago", "Set", "Out", "Nov", "Dez"
        };

        int[] propTot = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // pega o ano atual
        int anoAtual = Year.now().getValue();

        // verifica se é bissexto
        if (Year.isLeap(anoAtual)) {
            propTot[1] = 29; // fevereiro
        }

        System.out.println("Ano: " + anoAtual);
        System.out.println();

        for (int i = 0; i < propMes.length; i++) {
            System.out.println(propMes[i] + " tem " + propTot[i] + " dias!");
        }

        System.out.println("\nENTER para continuar:");
        scAula14.nextLine();
    }
    public static void main(String[] args) {
        Scanner scAula14 = new Scanner(System.in);
        executar2(scAula14);
        scAula14.close();
    }
}
class AulaTeorica14pt3 {
    public static void executar3(Scanner scAula14) {
        System.out.println("FOR \"cada\"");
        System.out.println("Imagem de número 03 da Aula 14!");

        int i = 0;
        int[] num = {3, 5, 1, 8, 4};
        for (int valor: num){
            i++;

            if (i == num.length) {
                System.out.println("e " + valor);
                
            } else {
                System.out.print(valor + ", ");
            }
        }

        System.out.println("\nPode se usar \"Arrays.sort(num)\" para colocar os números em ordem.");
        System.out.println("ENTER para continuar:");
        scAula14.nextLine();

        // NEXT

        Arrays.sort(num);
        i = 0;
        for (int valor: num){
            i++;
            if (i == num.length) {
                System.out.println("e " + valor);
                
            } else {
                System.out.print(valor + ", ");
            }
        }

        System.out.println("\nPode se usar \"Arrays.binarySearch(num, 1)\" para buscar um valor.");
        System.out.println("ENTER para continuar:");
        scAula14.nextLine();

        // NEXT

        num = new int[] {3, 7, 6, 1, 9, 4, 2};
        Arrays.sort(num);
        int buscaSc;
        boolean valido = false;

        while (!valido) {
            System.out.println("Digite um valor entre {3, 7, 6, 1, 9, 4, 2}:");
            buscaSc = scAula14.nextInt();

            valido = buscaSc == 1 || buscaSc == 2 || buscaSc == 3 || buscaSc == 4 || buscaSc == 6 || buscaSc == 7 || buscaSc == 9;

            if (valido) {
                int buscar = Arrays.binarySearch(num, buscaSc);
                System.out.println("O valor " + buscaSc + " foi encontrado na casa: " + buscar);
            } else {
                System.out.println("Valor inválido, tente novamente.");
            }
        }
        scAula14.nextLine();

        System.out.println("\nArrays.binarySearch só funciona se o vetor estiver em ordem com Arrays.sort");
        System.out.println("Agora veremos Arrays.fill, que preenche todo o vetor com um valor!");
        System.out.println("ENTER para continuar:");
        scAula14.nextLine();

        // NEXT

        Arrays.fill(num, 0);
        for (int valor: num) {
            System.out.print(valor + ", ");
        }
        System.out.println("\nENTER para finalizar a aula:");
        scAula14.nextLine();
    }
    public static void main(String[] args) {
        Scanner scAula14 = new Scanner(System.in);
        executar3(scAula14);
        scAula14.close();
    }
}