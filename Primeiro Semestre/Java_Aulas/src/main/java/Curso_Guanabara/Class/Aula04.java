// Olá Mundo
package Curso_Guanabara.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula04 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner Aula04 = new Scanner(System.in);
        String Package, Class, Main, Print, RespostaScanner;

        Package = "Pacote";
        Class = "Classe";
        Main = "Principal";

        System.out.println();
        System.out.println("Começamos com Método " + Main + " (main) dentro de uma " + Class + " (Aula04)"
        +" que faz parte de um " + Package + " (Curso_Guanabara.Class)");

        Print = "System.out.print(\"Olá, Mundo\");";

        System.out.println();
        System.out.println("Para darmos um Print em Java de \"Olá, Mundo\", usamos:");
        System.out.println(Print);

        System.out.println();
        System.out.println("Digite o comando para Print, deixando os Parênteses vazios:");
        RespostaScanner = Aula04.nextLine();

        boolean Resposta = RespostaScanner.equals("System.out.print();");

        if (Resposta == true) {
            PrimeiroPrograma.main(new String[0]);
        } else {
            System.out.println("Todos os caracteres devem estar corretos.");
        }
        System.out.println("Para dar continuidade à aula, aperte ENTER.");
        Aula04.nextLine();

        Atalhos.main(new String[0]);
        System.out.println("Para dar continuidade à aula, aperte ENTER.");
        Aula04.nextLine();

        System.out.println("Java costuma ter algumas regras de formatação.");
        System.out.println("Geralmente, quando a primeira letra for MAIUSCULO, ela indica uma Classe"
        +" ou Interface.");
        System.out.println("Ex: MinhaClasse         AlunoCursoEmVideo");
        System.out.println();
        System.out.println("Em casos onde só depois temos a letra MAIUSCULA, ela pode indicar"
        +" Atributo, Variavel, Metodo.");
        System.out.println("Ex: meuAtributo,        nomeAluno");
        System.out.println("    minhaVariavel,      mediaPrimeiroBimestre");
        System.out.println("    meuMetodo,          lancarNotaAluno");
        System.out.println("");
        System.out.println("Apenas letras MINUSCULAS, indica um provavel Pacote.");
        System.out.println("Ex: meu_pacote          alunocursoemvideo");
        System.out.println("");
        System.out.println("Tudo em MAIUSCULO costuma indicar uma constante.");
        System.out.println("MINHA_CONSTANTE         VALOR_DE_PI");

        Aula04.nextLine();
        Aula04.close();
    }
}
// Camel Mothod em Java
class PrimeiroPrograma { // PrimeiroPrograma = Classe
    public static void main(String[] args) { // main = Metodo (Se fossem 2 palavras. Ex: mainMethod)
        System.out.println("Olá, Mundo"); // System = Classe
    }
}
class Atalhos {
    public static void main(String[] args) {
        String psvm = "Public Static Void Main(String[] args) {}";
        String sout = "System.out.println(\"\");";

        System.out.println("Você pode digitar \"psvm\" e dar tab para que a IDE complete com:");
        System.out.println(psvm);

        System.out.print("\n");
        System.out.println("Você pode digitar \"sout\" e dar tab para que a IDE complete com:");
        System.out.println(sout);
    }
}