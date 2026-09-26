// Estruturas condicionais parte 2
package Curso_Guanabara.Exercicies;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula10 {
    public static void main(String[] args) {
        Scanner Exercicio10 = new Scanner(System.in);
        Exercicies10.executar(Exercicio10);
        ExerciciesPratics10.main(args);
        Exercicio10.close();
    }
}
class Exercicies10 {
    public static void executar(Scanner Exercicio10) {
        System.out.println("01. Observe o trecho do programa.");

        System.out.println();

        System.out.println("public class Exemplo {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        System.out.println(\"Marinha do Brasil\");");
        System.out.println("    }");
        System.out.println("}");

        System.out.println();

        System.out.println("Com base na classe Java acima, assinale a opção correta.\n");

        System.out.println("a. O méotodo main necessita receber o array como parâmetro para ser executado.");
        System.out.println("b. Os modificadores public e class são desnecessários para executar o código.");
        System.out.println("c. Sua execução dependerá da versão da JVM em uso.");
        System.out.println("d. Essa classe não será executada pela JVM.");
        System.out.println("e. O método main é o primeiro a ser chamado e executado pela JVM.");

        String RespostaScann01 = Exercicio10.nextLine();
        System.out.println();

        boolean Resposta01 = RespostaScann01.equals("e");

        if (Resposta01 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: e");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio10.nextLine();

        // NEXT

        System.out.println("02. Observe o código Java abaixo:");

        System.out.println();

        System.out.println("public class Teste {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        String nome = \"João\";");
        System.out.println("        imprimeNome(\"Empty\");");
        System.out.println("    }");
        System.out.println("    public static void imprimeNome(String nome) {");
        System.out.println("        if (!nome.isEmpty()) {");
        System.out.println("            System.out.println(\"Tudo bem \" + nome + \"?\");");
        System.out.println("        } else {");
        System.out.println("            System.out.println(\"o nome é \" + nome + \"?\");");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println("}");

        System.out.println();

        System.out.println("Qual será a saída do programa acima?\n");

        System.out.println("a. Tudo bem Empty?.");
        System.out.println("b. Tudo bem João?.");
        System.out.println("c. O nome é Empty?.");
        System.out.println("d. O nome é João?.");
        System.out.println("e. Tudo bem Empty? O nome é João?.");

        String RespostaScann02 = Exercicio10.nextLine();
        System.out.println();

        boolean Resposta02 = RespostaScann02.equals("a");

        if (Resposta02 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: a");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio10.nextLine();

        // NEXT

        System.out.println("03. O que será impresso quando o seguinte programa escrito na linguagem Java for "
        + " compilado e executado?");

        System.out.println();

        System.out.println("public class Teste {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        char ch;");
        System.out.println("        String test2 = \"abcde\";");
        System.out.println("        String test = new String (\"abcde\");");
        System.out.println("        if (test.equals(test2)) {");
        System.out.println("            ch = (test == test2) ? test.charAt(0) : test.charAt(1);");
        System.out.println("        } else {");
        System.out.println("            ch = (test == test2) ? test.charAt(2) : test.charAt(3);");
        System.out.println("        }");
        System.out.println("        System.out.println(ch);");
        System.out.println("    }");
        System.out.println("}");

        System.out.println();

        System.out.println("a. a");
        System.out.println("b. b");
        System.out.println("c. c");
        System.out.println("d. d");
        System.out.println("e. e");

        String RespostaScann03 = Exercicio10.nextLine();
        System.out.println();

        boolean Resposta03 = RespostaScann03.equals("b");

        if (Resposta03 == true) {
            System.out.println("Certa Resposta!");
        } else {
            System.out.println("A Resposta correta era: b");
        }
        System.out.println("Aperte ENTER para continuar");
        Exercicio10.nextLine();

        // NEXT
    }
    public static void main(String[] args) {
        Scanner Exercicio10 = new Scanner(System.in);
        executar(Exercicio10);
        Exercicio10.close();
    }
}
class ExerciciesPratics10 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ExerciciesPratics10.class.getName());

    /**
     * Creates new form ExerciciesPratics10
     */
    public ExerciciesPratics10() {
        initComponents();
        painelResultados.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderA = new javax.swing.JSlider();
        sliderB = new javax.swing.JSlider();
        sliderC = new javax.swing.JSlider();
        lblValA = new javax.swing.JLabel();
        lblValB = new javax.swing.JLabel();
        lblValC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        painelResultados = new javax.swing.JPanel();
        lblFormaTri = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Segmento a");

        jLabel2.setText("Segmento b");

        jLabel3.setText("Segmento c");

        sliderA.setMaximum(50);
        sliderA.setValue(0);
        sliderA.addChangeListener(this::sliderAStateChanged);

        sliderB.setMaximum(50);
        sliderB.setValue(0);
        sliderB.addChangeListener(this::sliderBStateChanged);

        sliderC.setMaximum(50);
        sliderC.setValue(0);
        sliderC.addChangeListener(this::sliderCStateChanged);

        lblValA.setText("0");

        lblValB.setText("0");

        lblValC.setText("0");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Curso_Guanabara/Exercicies/Imagens/Triangle.png"))); // NOI18N

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(this::btnVerificarActionPerformed);

        lblFormaTri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblFormaTri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormaTri.setText("Forma ou não?");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo de Triângulo");

        javax.swing.GroupLayout painelResultadosLayout = new javax.swing.GroupLayout(painelResultados);
        painelResultados.setLayout(painelResultadosLayout);
        painelResultadosLayout.setHorizontalGroup(
            painelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormaTri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelResultadosLayout.setVerticalGroup(
            painelResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultadosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblFormaTri)
                .addGap(20, 20, 20)
                .addComponent(lblTipo)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(painelResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblValA))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblValC))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblValB)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)))
                        .addComponent(jLabel7)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sliderA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValA))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sliderB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValB))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sliderC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValC))
                        .addGap(18, 18, 18)
                        .addComponent(btnVerificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>                        

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int a, b, c;
        a = sliderA.getValue();
        b = sliderB.getValue();
        c = sliderC.getValue();

        if (a < b + c && b < a + c && c < a + b) {
            lblFormaTri.setText("Combinação forma um Triângulo");
            
            if (a == b && b == c) {
                lblTipo.setText("É um TRIÂNGULO EQUILÁTERO");
            } else if (a != b && b != c && a != c) {
                lblTipo.setText("É um TRIÂNGULO ESCALENO");
            } else {
                lblTipo.setText("É um TRIÂNGULO ISÓSCELES");
            }
        } else {
            lblFormaTri.setText("Combinação não forma um Triângulo");
            lblTipo.setText("-------------------------------------------");
        }
        painelResultados.setVisible(true);
    }                                            

    private void sliderAStateChanged(javax.swing.event.ChangeEvent evt) {                                     
        lblValA.setText(Integer.toString(sliderA.getValue()));
    }                                    

    private void sliderBStateChanged(javax.swing.event.ChangeEvent evt) {                                     
        lblValB.setText(Integer.toString(sliderB.getValue()));
    }                                    

    private void sliderCStateChanged(javax.swing.event.ChangeEvent evt) {                                     
        lblValC.setText(Integer.toString(sliderC.getValue()));
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
        java.awt.EventQueue.invokeLater(() -> new ExerciciesPratics10().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblFormaTri;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValA;
    private javax.swing.JLabel lblValB;
    private javax.swing.JLabel lblValC;
    private javax.swing.JPanel painelResultados;
    private javax.swing.JSlider sliderA;
    private javax.swing.JSlider sliderB;
    private javax.swing.JSlider sliderC;
    // End of variables declaration                   
}