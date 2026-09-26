// Lista 05, referente à Aula 04.
package Algoritmo_Logica.Lists;
// @author Cauã Sousa
import java.util.Scanner;
public class Lista05 {
    public static void main(String[] args) {
        Lista05Exercicio01.main(args);
        Lista05Exercicio02.main(args);
        Lista05Exercicio03.main(args);
        Lista05Exercicio04.main(args);
        Lista05Exercicio05.main(args);
    }
}
// Sistema de Login
class Lista05Exercicio01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista05 = new Scanner(System.in);
        String user, senha, userScan, senhaScan;

        user = "Mordekaiser";
        senha = "Renascido456";

        System.out.println("Digite o Nome de Usuario: ");
        userScan = scLista05.nextLine();
        System.out.println("Digite Sua Senha:");
        senhaScan = scLista05.nextLine();

        boolean usercerto = user.equals(userScan) && senha.equals(senhaScan);

        if (usercerto == true) {
            System.out.println("Logado Com Sucesso, " + user);
        } else {
            System.out.println("Nome de Usuario ou Senha incorretos");
        }
        scLista05.nextLine();
    }
}
// Sistema de Login
class Lista05Exercicio02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista05 = new Scanner(System.in);
        String replyUser, greet1, goodbye2;

        greet1 = "ola"; goodbye2 = "tchau";

        System.out.println("Olá ou Tchau?");
        replyUser = scLista05.nextLine().trim();

        boolean replySystem1 = greet1.equals(replyUser);
        boolean replySystem2 = goodbye2.equals(replyUser);

        if (replySystem1 == true) {
            System.out.println("Olá, como você está?");
        } else if (replySystem2 == true) {
            System.out.println("Até logo!");
        }
        scLista05.nextLine();
    }
}
// Comandos de "Ajuda", "Versão" e "Sair"
class Lista05Exercicio03 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista05 = new Scanner(System.in);
        String comandUser, ajuda, versao, sair;

        ajuda = "Help"; versao = "Version"; sair = "Exit";

        System.out.println("Olá! Neste programa você pode executar os seguintes comandos:");
        System.out.println("'Help' para Ajuda 'Version' para Versão 'Exit' para Sair");
        comandUser = scLista05.nextLine().trim();

        boolean replySystem1 = ajuda.equals(comandUser);
        boolean replySystem2 = versao.equals(comandUser);
        boolean replySystem3 = sair.equals(comandUser);

        if (replySystem1 == true) {
            System.out.println("Ainda não existem muitas opções de ajuda no momento");
        } else if (replySystem2 == true) {
            System.out.println("Versão Alpha 1.0.1");
        } else if (replySystem3 == true) {
            System.out.println("Closing...");
        } else {
            System.out.println("Comando digitado é desconhecido. Por favor, digite exatamente igual as opções iniciais");
        }
        scLista05.nextLine();
    }
}
// Digite a senha duas vezes
class Lista05Exercicio04 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scLista05 = new Scanner(System.in);
        String senhaUser, senhaConfirm;

        System.out.println("Crie sua Senha:");
        senhaUser = scLista05.nextLine().trim();
        System.out.println("Digite a Senha novamente:");
        senhaConfirm = scLista05.nextLine().trim();

        if (senhaUser.equals(senhaConfirm)) {
            System.out.println("Você pode prosseguir.");
        } else {
            System.out.println("A senha digitada é diferente da que você criou.");
        }
        scLista05.nextLine();
    }
}
// Adivinhe minha senha
class Lista05Exercicio05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scLista05 = new Scanner(System.in);
        String senhaUser, senha;

        senha = "Mordekaiser69";
        
        System.out.println("Adivinhe minha senha...");
        senhaUser = scLista05.nextLine();

        if (senhaUser.equals(senha)) {
            System.out.println("Você acertou!!");
        } else {
            System.out.println("Senha incorreta.");
        }
        scLista05.nextLine();
        scLista05.close();
    }
}