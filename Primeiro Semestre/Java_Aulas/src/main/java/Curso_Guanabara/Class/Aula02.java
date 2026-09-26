// Como Funciona o Java
package Curso_Guanabara.Class;
// @author Cauã Sousa
public class Aula02 {
    public static void main(String[] args) {
        String CodigoFonte, Compilador, JVM;
        int Bytecode, Class;
        
        System.out.println("JRE (Java Run Environment): Roda programas Java");
        System.out.println("JDK (Java Development Kit): Desenvolve programas Java, vem com JRE junto");

        CodigoFonte = "System.out.println('Hello, World')";
        Compilador = "JavaC";
        Bytecode = 101001; // Apenas de exemplo
        JVM = "Converte Bytecode para Class";
        Class = 1010110; // Apenas de exemplo

        System.out.println();
        System.out.println("JDK:");
        System.out.println("O Compilador do Java se chama: " + Compilador);
        System.out.println("O que você programa em .java é o Código Fonte");
        System.out.println("Ex: " + CodigoFonte);
        System.out.println("O Código Fonte, após o " + Compilador + " fazer seu trabalho vira um Bytecode");
        System.out.println("(" + Bytecode + ")");

        System.out.println();
        System.out.println("JVM (Java Virtual Machine) é quem " + JVM);
        System.out.println("O .class é a versão do Código Fonte que o computador consegue ler");
        System.out.println("(" + Class + ")");

        System.out.println();
        System.out.println("Existem JVM para Windows, JVM para Linux, JVM para MAC e etc.");
        System.out.println("Seu Bytecode pode passar por qualquer um deles independente de onde"
        +" você tenha programado");
        System.out.println("Sendo assim, um Bytecode Windows pode entrar no JVM Linux e agora aquele"
        +" programa roda em Linux");
        /* Antes do Java, um código programado por uma pessoa (Código Fonte) passava
         * por um compilador diferente para cada Sistema Operacional. 
         * Depois, o que o Java fez foi que sua linguagem, após passar pelo compilador, se
         * tornava um Bytecode que diferente das outras linguagens, não podia ser lido por um
         * computador. Mas o Bytecode, era passado por um JVM (Java Virtual Machine), que era "universal"
         * para todos os Sistemas, assim, um Bytecode feito em Windows passado por um JVM Linux
         * poderia rodar no Linux, e o mesmo Bytecode passado em um JVM MAC, rodaria em um MAC. */
        System.out.println();
        System.out.println("Processo de Compilação:");
        System.out.println("Código Fonte > Compilador = Código Relocável");
        System.out.println("Código Relocável > Montador = Código Objeto (Binario)");
    }
}