// Introdução ao Swing e JavaFX
package Curso_Guanabara.Class;
// @author Cauã Sousa
import java.util.Scanner;
public class Aula05 {
    public static void main(String[] args) {
        AulaTeorica05.main(args);
        AulaPratica05.main(args);
    }
}
class AulaTeorica05 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scAula05Gn = new Scanner(System.in);
        String AWT, Swing;

        AWT = "Antigo Meio de Exibir Telas";
        Swing = "Meio Mais Moderno de Exibir Telas";

        System.out.println("Usavamos \"import java.awt;\" como " + AWT);
        System.out.println("Passamos a usar o Swing (Balanço) por conta do fato do AWT gerar mudanças"
        + " visuais a depender do Sistema Operacional");
        System.out.println();
        System.out.println("Agora usamos \"import javax.swing;\" como " + Swing);
        System.out.println("Pois possui interfaces mais agradaveis e não faz aquelas mudanças"
        + " mencionadas");

        scAula05Gn.nextLine();
        scAula05Gn.close();
    }
}
class AulaPratica05 extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AulaPratica05.class.getName());
    public AulaPratica05() {
        initComponents();
    }
    @SuppressWarnings("Convert2Lambda")
    private void initComponents() {
        jLabelMenssagemAqui = new javax.swing.JLabel();
        jButtonCliqueMe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMenssagemAqui.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelMenssagemAqui.setText("Menssagem Aqui!");

        jButtonCliqueMe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonCliqueMe.setText("Clique em Mim!");
        jButtonCliqueMe.addActionListener(new java.awt.event.ActionListener() {
            @SuppressWarnings("override")
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCliqueMeActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonCliqueMe)
                    .addComponent(jLabelMenssagemAqui))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelMenssagemAqui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButtonCliqueMe)
                .addGap(32, 32, 32))
        );
        pack();
    }                 
    private void jButtonCliqueMeActionPerformed(java.awt.event.ActionEvent evt) {                                                
        jLabelMenssagemAqui.setText("Hello, World!");
    }                                               
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> new AulaPratica05().setVisible(true));
    }                   
    private javax.swing.JButton jButtonCliqueMe;
    private javax.swing.JLabel jLabelMenssagemAqui;                
}