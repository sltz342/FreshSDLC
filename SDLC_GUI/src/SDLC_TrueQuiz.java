/*  Sean M.
    May 15th, 2023
    The Actual Quiz Code, this is going to suck to fix
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author semel9291
 */
public class SDLC_TrueQuiz extends javax.swing.JFrame {

    /**
     * Creates new form SDLC_TrueQuiz
     */
    public SDLC_TrueQuiz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MultipleChoice = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        lblQuestionText = new javax.swing.JLabel();
        btnQuestion1 = new javax.swing.JRadioButton();
        btnQuestion2 = new javax.swing.JRadioButton();
        btnQuestion3 = new javax.swing.JRadioButton();
        btnQuestion4 = new javax.swing.JRadioButton();
        btnCheckAndProceed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quiz Begin");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblQuestion.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Question #X");

        lblQuestionText.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblQuestionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestionText.setText("Why do I look this fire all the time, hot damn?");

        MultipleChoice.add(btnQuestion1);
        btnQuestion1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQuestion1.setText("Cause I'm too hot");
        btnQuestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestion1ActionPerformed(evt);
            }
        });

        MultipleChoice.add(btnQuestion2);
        btnQuestion2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQuestion2.setText("Hot damn");

        MultipleChoice.add(btnQuestion3);
        btnQuestion3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQuestion3.setText("call the police");

        MultipleChoice.add(btnQuestion4);
        btnQuestion4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQuestion4.setText("or the fireman");

        btnCheckAndProceed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCheckAndProceed.setText("funky town ig");
        btnCheckAndProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckAndProceedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuestionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuestion1)
                    .addComponent(btnQuestion3))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuestion4)
                    .addComponent(btnQuestion2))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnCheckAndProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuestionText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuestion2)
                    .addComponent(btnQuestion1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuestion3)
                    .addComponent(btnQuestion4))
                .addGap(18, 18, 18)
                .addComponent(btnCheckAndProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckAndProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckAndProceedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckAndProceedActionPerformed

    private void btnQuestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuestion1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SDLC_TrueQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SDLC_TrueQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SDLC_TrueQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SDLC_TrueQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SDLC_TrueQuiz().setVisible(true);
            }
        });
    }
    
    public void nextQuestion(){
        
    }
    
    public void fillData() {
        File f = new File("src/dataFiles/TestQuestions.txt");
        try {
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                //Suck my cock n balls ig?
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MultipleChoice;
    private javax.swing.JButton btnCheckAndProceed;
    private javax.swing.JRadioButton btnQuestion1;
    private javax.swing.JRadioButton btnQuestion2;
    private javax.swing.JRadioButton btnQuestion3;
    private javax.swing.JRadioButton btnQuestion4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuestionText;
    // End of variables declaration//GEN-END:variables
}
