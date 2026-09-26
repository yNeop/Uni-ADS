// Instalando JDK
package Curso_Guanabara.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula03 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner Aula03 = new Scanner(System.in);
        String JDK_SE, JDK_EE, JDK_ME;

        JDK_SE = "Standard Edition"; // Padrão
        JDK_EE = "Enterprise Edition"; // Empresarial
        JDK_ME = "Micro Edition"; // Pequenininha
        
        System.out.println();
        System.out.println("Para desenvolver uma Aplicação que precisa de Janelas, Ambientes,"
        + " Controles Padrões de Sistemas Operacionais de Interface Gráfica:");
        System.out.println("JDK SE (" + JDK_SE + ")"); // Minha versão atual

        System.out.println();
        System.out.println("Para desenvolver uma Aplicação em Janelas, mas que você queira"
        + " usar Acesso Remoto, Acesso à Bancos de Dados Enormes e coisas maiores utilizadas em"
        + " Grandes Empresas:");
        System.out.println("JDK EE (" + JDK_EE + ")"); // Para Ambientes de Trabalho Real

        System.out.println();
        System.out.println("Para desenvolver uma Coisa Menor, como um Controle de um Despositivo"
        + "Portatil ou Aplicações para Celulares:");
        System.out.println("JDK ME (" + JDK_ME + ")"); // Para Ambientes de Trabalho Real
            
        Aula03.nextLine();
        Aula03.close();
    }
}