// Estruturas condicionais parte 2
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula11 {
    public static void main(String[] args) {
        // Define o visual das Janelas!
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
        
        // Inicia a Execução do Terminal
        Scanner Exercicio11 = new Scanner(System.in);

        Exercicies11.executar(Exercicio11);

        // Inicia Primeira Janela no fim do Terminal
        ExerciciesPratics11 tela1 = new ExerciciesPratics11();
        tela1.setVisible(true);

        tela1.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                // Força a Segunda Janela aparecer ao fim da Primeira Janela
                ExerciciesPratics11Proposta tela2 = new ExerciciesPratics11Proposta();
                tela2.setVisible(true);
            }
        });

        Exercicio11.close();
    }
}
class Exercicies11 {
    public static void executar(Scanner Exercicio11) {
        System.out.println("01. Analise as seguintes variaveis em JAVA.\n");

        System.out.println("char c = 'c';");
        System.out.println("int i = 10;");
        System.out.println("double d = 10;");
        System.out.println("long l = 1;");
        System.out.println("String s = \"Hello\";\n");

        System.out.println("De acordo com as váriaveis acima, qual das intruções abaixo compila sem erro?\n");

        System.out.println("a. c = c + i;");
        System.out.println("b. s += i;");
        System.out.println("c. i += s;");
        System.out.println("d. c += s;");
        System.out.println("e. i += l;");

        String RespostaScann01 = Exercicio11.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("b") || RespostaScann01.equals("e");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta! Mas existe outra alternatica também correta!");
        } else {
            System.out.println("As Respostas corretas eram: b / e");
            System.out.println("Ou uma, ou outra ;)");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio11.nextLine();

        // NEXT

        System.out.println("02. Qual das afirmações a seguir é verdadeira?\n");

        System.out.println("a. O comando break dentro de um loop while faz com que o controle seja passado para a " + 
        "próxima interação do loop.");
        System.out.println("b. O comando continue dentro de um loop while faz com que o controle seja passado " +
        "para o próximo bloco de código após o loop.");
        System.out.println("c. O comando return não pode ser utilizado dentro de loops.");
        System.out.println("d. Todas as alternativas acima são verdadeiras.");
        System.out.println("e. Todas as alternativas acima são falsas.");

        String RespostaScann02 = Exercicio11.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("e");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: e");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio11.nextLine();

        // NEXT
        
        System.out.println("03. Analise o código em JAVA a seguir.\n");

        System.out.println("package Prova;");
        System.out.println("public class main {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        int i = 1;");
        System.out.println("        int a = 0;");
        System.out.println("        while (i < 10) {");
        System.out.println("            ++a;");
        System.out.println("            i = i + 1;");
        System.out.println("            if (a > 6) ++i;");
        System.out.println("        }");
        System.out.println("        System.out.println(i);");
        System.out.println("        System.out.println(a);");
        System.out.println("    }");
        System.out.println("}");

        System.out.println("Sabendo-se que o código acima foi escrito e executado usando a IDE Netbeans 6.0.1. assinale a " +
        "opção correta referente aos valores impressos de i e de a, respectivamente.\n");

        System.out.println("a. 11 e 8");
        System.out.println("b. 11 e 7");
        System.out.println("c. 10 e 6");
        System.out.println("d. 10 e 7");
        System.out.println("e. 11 e 7");

        String RespostaScann03 = Exercicio11.nextLine();
        System.out.println();

        boolean Resposta03 = RespostaScann03.equals("a");

        if (Resposta03 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: a");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio11.nextLine();
    }
    public static void main(String[] args) {
        Scanner Exercicio11 = new Scanner(System.in);
        Exercicies11.executar(Exercicio11);
    }
}
class ExerciciesPratics11 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExerciciesPratics11.class.getName());

    /**
     * Creates new form ExerciciesPratics11
     */
    public ExerciciesPratics11() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        spinN = new javax.swing.JSpinner();
        lblResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        spinN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinN.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spinN.addChangeListener(this::spinNStateChanged);

        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 0, 0));
        lblResultado.setText("1");
        lblResultado.setMaximumSize(new java.awt.Dimension(72, 20));
        lblResultado.setMinimumSize(new java.awt.Dimension(72, 20));
        lblResultado.setPreferredSize(new java.awt.Dimension(72, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Curso_Guanabara/Exercicies/Imagens/fatorial.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Fatorial    =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(spinN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void spinNStateChanged(javax.swing.event.ChangeEvent evt) {                                   
        int n, f, c;

        n = Integer.parseInt(spinN.getValue().toString());
        f = 1;
        c = n;

        while (c >= 1) {
            f *= c; 
            c--;
        }

        lblResultado.setText(Integer.toString(f));
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
        java.awt.EventQueue.invokeLater(() -> new ExerciciesPratics11().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSpinner spinN;
    // End of variables declaration                   
}
class ExerciciesPratics11Proposta extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExerciciesPratics11Proposta.class.getName());

    /**
     * Creates new form ExerciciesPratics11Proposta
     */
    public ExerciciesPratics11Proposta() {
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
        jLabel1 = new javax.swing.JLabel();
        lblForm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblResults = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spinNum.setModel(new javax.swing.SpinnerNumberModel(0, 0, 12, 1));
        spinNum.addChangeListener(this::spinNumStateChanged);

        jLabel1.setText("Formula");

        lblForm.setText("0");
        lblForm.setMaximumSize(new java.awt.Dimension(250, 16));
        lblForm.setMinimumSize(new java.awt.Dimension(250, 16));
        lblForm.setPreferredSize(new java.awt.Dimension(250, 16));

        jLabel2.setText("Resultado =");

        lblResults.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResults))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spinNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblResults))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void spinNumStateChanged(javax.swing.event.ChangeEvent evt) {                                     
        int numero, fatorial, i;
        String formula;

        numero = Integer.parseInt(spinNum.getValue().toString());
        fatorial = 1;
        i = numero;

        formula = numero + "! = ";

        while (i >= 1) {
            fatorial *= i;
            formula += i;
            
            if (i > 1) {
                formula += " * ";
            }

            i--;
        }

        lblResults.setText(Integer.toString(fatorial));
        lblForm.setText(formula);
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
        java.awt.EventQueue.invokeLater(() -> new ExerciciesPratics11Proposta().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblResults;
    private javax.swing.JSpinner spinNum;
    // End of variables declaration                   
}