package com.teorico;
import com.dev_monitoria.Main;
import java.util.Scanner;
public class Revisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        executar(sc);
        sc.close();
    }

    public static void executar(Scanner sc) {
        NotasRevisao.historia();
        Main.transition(sc);
        NotasRevisao.tiposVar();
    }
}

class NotasRevisao {
    public static void historia() {
        System.out.print("""
        A Aula se inicia com a historia do Java. JVM é uma maquina virtual que vai rodar seu programa em java. 
        Foi criada pela Sun Microsystems, que aparentemente não existe mais nos dias atuais. Temos linguagem Compilada 
        e Interpretada. Seu código passa pelo compilador antes de ser interpretado pelo computador.
        """);
    }

    public static void tiposVar() {
        System.out.print("""
        String, int, double, float, char, boolean e etc. Quando utilizamos "[]", estamos dizendo que é um vetor ou Array!
        """);
    }
}