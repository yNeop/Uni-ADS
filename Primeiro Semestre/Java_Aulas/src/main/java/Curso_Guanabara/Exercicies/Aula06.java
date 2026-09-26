// Declaração de Variavel
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula06 {
    public static void main(String[] args) {
        Scanner Exercicio06 = new Scanner(System.in);
        Exercicies06.executar(Exercicio06);
        ExerciciesPratics06.main(args);
        Exercicio06.close();
    }
}
class Exercicies06 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void executar(Scanner Exercicio06) {
        System.out.println("(CAP-PD) - 01. Em relação aos tipos básicos de dados (tipos primitivos)"
        + ", assinale a opção INCORRETA.");

        System.out.println("a. booleano (ou lógico): conjunto de valores falso ou verdadeiro.");
        System.out.println("b. vetor: estrutura que suporta NxM posições de um mesmo tipo.");
        System.out.println("c. caracter: qualquer conjunto de caracteres alfanuméricos.");
        System.out.println("d. inteiro: qualquer número inteiro, negativo, nulo ou positivo.");
        System.out.println("e. real: qualquer número real, negativo, nulo ou positivo.");

        String RespostaScann01 = Exercicio06.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("b");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio06.nextLine();

        // NEXT

        System.out.println("(EAGS-SIN) - 02. Marque 1 para dados do tipo inteiro e 2 para outros"
        + " tipos.");

        System.out.println("( ) \"582.4\"");
        System.out.println("( ) .verdadeiro.");
        System.out.println("( ) 105");
        System.out.println("( ) -102");
        System.out.println("( ) \"0\"");
        System.out.println("( ) \"informação\"");
        System.out.println("( ) 0.82");

        System.out.println("a. 2, 2, 1, 1, 1, 2, 1");
        System.out.println("b. 2, 2, 1, 1, 2, 2, 2");
        System.out.println("c. 1, 1, 1, 2, 2, 1, 2");
        System.out.println("d. 1, 2, 2, 2, 1, 1, 1");

        String RespostaScann02 = Exercicio06.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("b");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio06.nextLine();

        // NEXT

        System.out.println("(EAGS-SIN) - 03. Assinale a alternativa que conhatenha somente nomes"
        + " válidos de variáveis.");

        System.out.println("a. índice, #pagina, contexto.");
        System.out.println("b. nome1, sobrenome2, senha3.");
        System.out.println("c. 2-nome, sobrenome, endereço.");
        System.out.println("d. 1-nome, 2-sobrenome, 3-senha.");

        String RespostaScann03 = Exercicio06.nextLine();
        System.out.println();

        boolean Resposta03 = RespostaScann03.equals("b");

        if (Resposta03 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio06.nextLine();

        // NEXT

        System.out.println("(EAGS-SIN) - 04. Assinale a alternativa que completa corretamente"
        + " a lacuna da afirmativa a seguir.");
        System.out.println("São caracterizados como tipos ____ os dados numéricos positivos"
        + " ou negativos, excluindo-se destes qualquer fracionário.");

        System.out.println("a. caracteres.");
        System.out.println("b. lógicos.");
        System.out.println("c. inteiros.");
        System.out.println("d. reais.");

        String RespostaScann04 = Exercicio06.nextLine();
        System.out.println();

        boolean Resposta04 = RespostaScann04.equals("c");

        if (Resposta04 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: c");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio06.nextLine();

        // NEXT

        System.out.println("(EAGS-SIN) - 05. Considerando os tipos de dados, relacione as colunas"
        + " e, a seguir, assinale a alternativa com a sequência correta.");

        System.out.println("(1) Inteiros            ( ) 35; 0; -56");
        System.out.println("(2) Reais               ( ) .F.; .V.");
        System.out.println("(3) Caracteres          ( ) \"Rua Brigadeiro Lyra\"");
        System.out.println("(4) Lógicos             ( ) -0,5; 1,8; -4");

        System.out.println("a. 3, 1, 4, 2");
        System.out.println("b. 2, 4, 3, 1");
        System.out.println("c. 1, 2, 3, 4");
        System.out.println("d. 1, 4, 3, 2");

        String RespostaScann05 = Exercicio06.nextLine();
        System.out.println();

        boolean Resposta05 = RespostaScann05.equals("d");

        if (Resposta05 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: d");
        }
        
        System.out.println("Fim das Questões, aperte ENTER para Exercicios Praticos.");
        Exercicio06.nextLine();
        Exercicio06.close();
    }
    public static void main(String[] args) {
        Scanner Exercicio06 = new Scanner(System.in);
        Exercicies06.executar(Exercicio06);
        Exercicio06.close();
    }
}
class ExerciciesPratics06 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExerciciesPratics06.class.getName());

    /**
     * Creates new form ExerciciesPratics06
     */
    public ExerciciesPratics06() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAN = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ano de Nascimento");

        txtAN.setModel(new javax.swing.SpinnerNumberModel(1900, 1900, 2026, 1));

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(this::btnCalcActionPerformed);

        jLabel2.setText("Idade");

        lblIdade.setText("0");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Curso_Guanabara/Exercicies/Imagens/userIcon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblIdade)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int an = Integer.parseInt(txtAN.getValue().toString());
        int id = 2026 - an;
        
        lblIdade.setText(Integer.toString(id));
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
        java.awt.EventQueue.invokeLater(() -> new ExerciciesPratics06().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JSpinner txtAN;
    // End of variables declaration                   
}