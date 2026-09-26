// Estruturas condicionais parte 1
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula09 {
    public static void main(String[] args) {
        Scanner Exercicio09 = new Scanner(System.in);
        Exercicies09.executar(Exercicio09);
        ExerciciesPratics09.main(args);
        Exercicio09.close();
    }
}
class Exercicies09 {
    public static void executar(Scanner Exercicio09) {
        System.out.println("01. Analise o algoritmo abaixo.");

        System.out.println();

        System.out.println("Linha 1     início");
        System.out.println("Linha 2         inteiro Y, X, DIV;");
        System.out.println("Linha 3         leia Y;");
        System.out.println("Linha 4         X = y % 7;");
        System.out.println("Linha 5         se X > 10");
        System.out.println("Linha 6             então DIV = verdadeiro;");
        System.out.println("Linha 7             se não DIV = 10;");
        System.out.println("Linha 8         fim se");
        System.out.println("Linha 9     fim");

        System.out.println();

        System.out.println("Assinale a opção que apresenta a linha que contém o erro na execução do algoritmo.\n");

        System.out.println("a. Linha 2      inteiro Y, X, DIV.");
        System.out.println("b. Linha 4      X = Y % 7.");
        System.out.println("c. Linha 5      se X > 10.");
        System.out.println("d. Linha 6      então DIV = verdadeiro.");
        System.out.println("e. Linha 7      senão DIV = 10.");

        String RespostaScann01 = Exercicio09.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("d");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: d");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio09.nextLine();

        // NEXT

        System.out.println("02. Indique o resultado de “x” do trecho do programa em português estruturado, mostrado abaixo. "
        + "Para as saídas, considere os seguintes valores: \nA = 2; B = 3; C = 3; D = 4");

        System.out.println();

        System.out.println("se .não. (D<5) então");
        System.out.println("    X <- (A+B) * D");
        System.out.println("senão");
        System.out.println("    X <- (C+A) * B");
        System.out.println("fimse");
        System.out.println("Escreva X");

        System.out.println();

        System.out.println("a. 15");
        System.out.println("b. 10");
        System.out.println("c. 25");
        System.out.println("d. 20");

        String RespostaScann02 = Exercicio09.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("a");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: a");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio09.nextLine();

        // NEXT

        System.out.println("03. Dada a estrutura representada abaixo:");

        System.out.println();

        System.out.println("int a = 5, b = 2;");
        System.out.println("String c;");
        System.out.println("if (a > b) {");
        System.out.println("    c = \"PRIMEIRO é maior\";");
        System.out.println("} else {");
        System.out.println("    c = \"SEGUNDO é maior\";");
        System.out.println("}");

        System.out.println("\nQue linha substituiria a condição apresentada?\n");

        System.out.println("a. c = (a < b)?\"SEGUNDO é maior\":\"PRIMEIRO é maior\";");
        System.out.println("b. c = (a <= b)?\"SEGUNDO é maior\":\"PRIMEIRO é maior\";");
        System.out.println("c. c = (a > b)?\"SEGUNDO é maior\":\"PRIMEIRO é maior\";");
        System.out.println("d. c = (a >= b)?\"PRIMEIRO é maior\":\"SEGUNDO é maior\";");

        String RespostaScann03 = Exercicio09.nextLine();
        System.out.println();

        boolean Resposta03 = RespostaScann03.equals("b");

        if (Resposta03 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio09.nextLine();
        Exercicio09.close();

        // NEXT
    }
    public static void main(String[] args) {
        Scanner Exercicio09 = new Scanner(System.in);
        Exercicies09.executar(Exercicio09);
        Exercicio09.close();
    }
}
class ExerciciesPratics09 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExerciciesPratics09.class.getName());

    /**
     * Creates new form ExerciciesPratics09
     */
    public ExerciciesPratics09() {
        initComponents();
        panResultado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtA = new javax.swing.JSpinner();
        txtB = new javax.swing.JSpinner();
        txtC = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        panResultado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();
        lblRaiz = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtA.addChangeListener(this::txtAStateChanged);

        txtB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtB.addChangeListener(this::txtBStateChanged);

        txtC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtC.addChangeListener(this::txtCStateChanged);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("X² +");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("X +");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("= 0");

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblA.setText("A");

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblB.setText("B");

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblC.setText("C");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("<html>&Delta =</html>");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("² - 4  .");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText(".");

        btnCalc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalc.setText("Calcular Delta");
        btnCalc.addActionListener(this::btnCalcActionPerformed);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("<html>Valor de &Delta</html>");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de Raízes");

        lblDelta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDelta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDelta.setText("0");

        lblRaiz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRaiz.setText("0");

        javax.swing.GroupLayout panResultadoLayout = new javax.swing.GroupLayout(panResultado);
        panResultado.setLayout(panResultadoLayout);
        panResultadoLayout.setHorizontalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(lblDelta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panResultadoLayout.setVerticalGroup(
            panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResultadoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDelta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblRaiz))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblC))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblB)
                    .addComponent(lblC)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addComponent(btnCalc)
                .addGap(18, 18, 18)
                .addComponent(panResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void txtAStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        lblA.setText(txtA.getValue().toString());
    }                                 

    private void txtBStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        lblB.setText(txtB.getValue().toString());
    }                                 

    private void txtCStateChanged(javax.swing.event.ChangeEvent evt) {                                  
        lblC.setText(txtC.getValue().toString());
    }                                 

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int a, b, c;
        double d;
        a = Integer.parseInt(txtA.getValue().toString());
        b = Integer.parseInt(txtB.getValue().toString());
        c = Integer.parseInt(txtC.getValue().toString());
        
        d = Math.pow(b, 2) - 4 * a * c;
        lblDelta.setText(String.format("%.1f", d));
        
        if (d < 0) {
            lblRaiz.setText("Não existem Raízes Reais");
        } else {
            lblRaiz.setText("Existem Raízes Reais");
        }
        
        panResultado.setVisible(true);
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
        java.awt.EventQueue.invokeLater(() -> new ExerciciesPratics09().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblRaiz;
    private javax.swing.JPanel panResultado;
    private javax.swing.JSpinner txtA;
    private javax.swing.JSpinner txtB;
    private javax.swing.JSpinner txtC;
    // End of variables declaration                   
}
