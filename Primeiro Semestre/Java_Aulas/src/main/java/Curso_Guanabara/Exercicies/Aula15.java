// Estruturas condicionais parte 2
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula15 {
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner Exercicio15 = new Scanner(System.in);
        Exercicies15.executar(Exercicio15);
        ExerciciesPratics15Funcao.executar();

        ExerciciesPratics15 tela1 = new ExerciciesPratics15();
        tela1.setVisible(true);
        Exercicio15.close();
    }

    // Código da Questão 02 - Inicio
    public static int f1(int n) {
        return n % 2;
    }

    public static int f2(int n) {
        return n * 2;
    }

    public static int f3(int a, int b) {
        return a + b;
    }
    // Código da Questão 02 - Fim
}

// QUESTÕES DE VESTIBULAR - Inicio

class Exercicies15 {
    public static void main(String[] args) {
        Scanner Exercicio15 = new Scanner(System.in);
        executar(Exercicio15);
    }

    static void executar(Scanner Exercicio15){
        questao01(Exercicio15);
        questao02(Exercicio15);
    }

    private static void questao01(Scanner Exercicio15) {
        String RespostaScann;
    
        System.out.print("""
        01. Em relação ao uso do modificador static antes do cabeçalho de um método Java, podemos afirmar que:

        a. Static serve para indicar que os valores dos parâmetros são estáticos, isso é, não se modificam.
        b. Static serve para dizer que o método pertence à classe em que foi declarada, não a uma instância dela.
        c. O uso da palavra static é obrigatório, já que sem ela, não criamos métodos.
        d. Não é permitido definir um método como static.
        """);

        do {
            RespostaScann = Exercicio15.nextLine().toLowerCase().trim();
        } while (
            !RespostaScann.equals("a") &&
            !RespostaScann.equals("b") &&
            !RespostaScann.equals("c") &&
            !RespostaScann.equals("d")
        );

        boolean Resposta = RespostaScann.equals("b");

        if (Resposta) {
            System.out.println("\nCerta Resposta!");
        } else {
            System.out.println("\nA resposta correta era: b");
        }

        System.out.println("Aperte ENTER para continuar");
        Exercicio15.nextLine();
    }

    // NEXT QUESTION

    private static void questao02(Scanner Exercicio15) {
        String RespostaScann;
    
        System.out.print("""
        02. Execute o trecho Java a seguir e marque a opção que contém o valor que será exibido na tela:

        static int f1(int n) {
            return n % 2;
        }

        static int f2(int n) {
            return n * 2;
        }

        static int f3(int a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            System.out.println(f3(f1(3), f2(5)));
        }

        !!DESEJA EXIBIR O ALGORITMO [s/n]??!!
        """);

        char exibirAlgoritmo;

        do {
            exibirAlgoritmo = Exercicio15.next().toLowerCase().charAt(0);
        } while (exibirAlgoritmo != 's' && exibirAlgoritmo != 'n');

        if (exibirAlgoritmo == 's') {
            System.out.println(Aula15.f3(Aula15.f1(3), Aula15.f2(5)));
        }
    
        System.out.println("\na. 16\nb. 11.5\nc. 8\nd. 11");

        do {
            RespostaScann = Exercicio15.nextLine().toLowerCase().trim();
        } while (
            !RespostaScann.equals("a") &&
            !RespostaScann.equals("b") &&
            !RespostaScann.equals("c") &&
            !RespostaScann.equals("d")
        );

        boolean Resposta = RespostaScann.equals("d");

        if (Resposta) {
            System.out.println("\nCerta Resposta!");
        } else {
            System.out.println("\nA resposta correta era: d");
        }
    }
}

/*
 * QUESTÕES DE VESTIBULAR - Fim
 * EXERCICIO PRATICO 01 - Inicio
 * 
 * Era preferivel que a Main e a Funcao fossem public class.
 * mas pelo padrão desse enorme projeto, ambos ficaram aqui!
 */

class ExerciciesPratics15Funcao {
    static void executar() {
        ExerciciesPratics15Fatorial f = new ExerciciesPratics15Fatorial();

        f.setValor(5);

        System.out.print(f.getFormula());
        System.out.print(f.getFatorial());
    }
    public static void main(String[] args) {
        executar();
    }
}

// "Public" class Fatorial abaixo. E acima, "Public" class Funcao01

class ExerciciesPratics15Fatorial {
    private static String formula = "";
    private static int fatorial = 1;

    public void setValor(int n) {
        String sequencia = "";
        int resultado = 1;

        for (int i = n; i > 1; i--) {
            resultado *= i;
            sequencia += i + " * ";
        }

        sequencia += "1 = ";
        fatorial = resultado;
        formula = sequencia;
    }

    public int getFatorial() {
        return fatorial;
    }

    public String getFormula() {
        return formula;
    }
}

/*
 * EXERCICIO PRATICO 01 - Fim
 * EXERCICIO PRATICO 02 - Janela
 */

class ExerciciesPratics15 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExerciciesPratics15.class.getName());

    /**
     * Creates new form ExerciciesPratics15
     */
    public ExerciciesPratics15() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        spinNum = new javax.swing.JSpinner();
        btnFatorial = new javax.swing.JButton();
        lblFormula = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spinNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        btnFatorial.setText("Fatorial!");
        btnFatorial.addActionListener(this::btnFatorialActionPerformed);

        lblFormula.setForeground(new java.awt.Color(51, 0, 255));
        lblFormula.setText("Formula");

        lblResultado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultado.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFormula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinNum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFatorial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormula)
                    .addComponent(lblResultado))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int n = Integer.parseInt(spinNum.getValue().toString());
        ExerciciesPratics15Fatorial f = new ExerciciesPratics15Fatorial();

        f.setValor(n);

        lblFormula.setText(f.getFormula());
        lblResultado.setText(Integer.toString(f.getFatorial()));
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ExerciciesPratics15().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnFatorial;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSpinner spinNum;
    // End of variables declaration                   
}