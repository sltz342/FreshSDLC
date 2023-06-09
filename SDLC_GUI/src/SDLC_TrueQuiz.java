/*  Dina M.
    May 15th, 2023
    The quiz portion of the GUI, using the Questions Class already made.
 */

import classclass.Question;
import java.util.Scanner;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author semel9291
 */
public class SDLC_TrueQuiz extends javax.swing.JFrame {

    private SDLC_GUI MainMenu;
    private static ArrayList<String> TestQ = new ArrayList();
    private static ArrayList<Question> questions = new ArrayList();
    private static ArrayList<String> temp = new ArrayList();
    int qCount = 0;
    int score = 0;
    int k = 0;
    boolean goMenu = false;

    /**
     * Creates new form SDLC_TrueQuiz
     */
    public SDLC_TrueQuiz() {
        initComponents();
        fillData();
        fillQuestions();
        nextQuestion(0);
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
        lblTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblQNum = new javax.swing.JLabel();
        lblQText = new javax.swing.JLabel();
        btnQ1 = new javax.swing.JRadioButton();
        btnQ2 = new javax.swing.JRadioButton();
        btnQ3 = new javax.swing.JRadioButton();
        btnQ4 = new javax.swing.JRadioButton();
        btnProceed = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Quiz Begin");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblQNum.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblQNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQNum.setText("Question #X");

        lblQText.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblQText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQText.setText("Question Text");
        lblQText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MultipleChoice.add(btnQ1);
        btnQ1.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQ1.setSelected(true);
        btnQ1.setText("A");
        btnQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ1ActionPerformed(evt);
            }
        });

        MultipleChoice.add(btnQ2);
        btnQ2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQ2.setText("B");
        btnQ2.setToolTipText("");
        btnQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQ2ActionPerformed(evt);
            }
        });

        MultipleChoice.add(btnQ3);
        btnQ3.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQ3.setText("C");

        MultipleChoice.add(btnQ4);
        btnQ4.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnQ4.setText("D");

        btnProceed.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnProceed.setText("Submit Answer");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSubmit.setText("Submit Score");
        btnSubmit.setEnabled(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblQNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnQ1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(btnQ3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnQ4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(btnQ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(312, Short.MAX_VALUE)
                        .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblQNum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQText, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ1)
                    .addComponent(btnQ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ3)
                    .addComponent(btnQ4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed

        // log answer
        // Ensuring questions don't go past 10
        if (qCount < 9) {
            if (questions.get(qCount).isCorrect(btnCheck()) == true) {
                score++;
            }
            qCount++;
            System.out.println(score);
            nextQuestion(qCount);

        } else {
            lblQNum.setText("Finished");
            lblQText.setText("You're all done! Click \"Submit Score\" to check your score.");
            btnProceed.setEnabled(false);
            btnSubmit.setEnabled(true);
        }

    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ1ActionPerformed

    }//GEN-LAST:event_btnQ1ActionPerformed

    private void btnQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQ2ActionPerformed

    }//GEN-LAST:event_btnQ2ActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (goMenu) {

            if (MainMenu == null) {
                MainMenu = new SDLC_GUI();
            }
            MainMenu.setVisible(true);
            this.setVisible(false);

        } else {
            k++;
            if (score > 5) {
                lblQNum.setText("Congrats! Passed!");
            } else {
                lblQNum.setText("Study harder...");
            }
            lblQText.setText("Score: " + score + "\n Click Submit again to return to main menu and reset the test.");
        }
        
        if ( k == 1 ) {
            goMenu = true;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
                fillData();
            }
        });
    }

    /**
     * Setting all buttons and texts to the corresponding Strings stored in the
     * arrays
     */
    public void nextQuestion(int i) {
        lblQNum.setText("Question #" + (i + 1));
        lblQText.setText((questions.get(i).getText()));
        btnQ1.setText(questions.get(i).getDiffAns().get(0));
        btnQ2.setText(questions.get(i).getDiffAns().get(1));
        btnQ3.setText(questions.get(i).getDiffAns().get(2));
        btnQ4.setText(questions.get(i).getDiffAns().get(3));

    }

    /**
     * Assigns an integer to a corresponding button clicked. Used to check for
     * correct answers
     *
     * @return the number respective to the button #
     */
    public int btnCheck() {
        if (btnQ1.isSelected()) {
            return 0;
        } else if (btnQ2.isSelected()) {
            return 1;
        } else if (btnQ3.isSelected()) {
            return 2;
        } else if (btnQ4.isSelected()) {
            return 3;
        }
        return -1;
    }

    /**
     * public void fillData() { File f = new
     * File("src/dataFiles/TestQuestions.txt"); try { Scanner s = new
     * Scanner(f); while(s.hasNextLine()){ //Suck my cock n balls ig? }
     *
     * } catch (FileNotFoundException e) { System.out.println("ERROR: " + e); }
     *
     * }
     * *
     */
    public static void fillData() {
        int i = 0;

        try {
            InputStream in = SDLC_TrueQuiz.class.getResourceAsStream("TestQuestions.txt");
            Scanner s = new Scanner(in);
            // Filling a temporary array to feed through to a question array
            while (s.hasNextLine()) {
                temp.add(i, s.nextLine());
                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error reading file! ");
        }
    }

    /**
     * Fills the questions array to be utilized by the test
     */
    public static void fillQuestions() {
        Question q;
        ArrayList<String> diffAns;
        // setting an initial size for the array

        int j = 0;
        // Looping for the size of the temporary array previously filled when reading the data file
        for (int i = 0; i < temp.size(); i++) {
            q = new Question();
            diffAns = new ArrayList();
            q.setText(temp.get(i));
            i++;
            // Adding the different answers
            diffAns.add(temp.get(i));
            i++;
            diffAns.add(temp.get(i));
            i++;
            diffAns.add(temp.get(i));
            i++;
            diffAns.add(temp.get(i));
            i++;
            // Adding different answers ArrayList to question object
            q.setDiffAns(diffAns);
            // Marking the correct answer as an integer
            q.setCorrectAns(Integer.valueOf(temp.get(i)));
            // Add question object to arrayList
            questions.add(j, q);
            j++;

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup MultipleChoice;
    private javax.swing.JButton btnProceed;
    private javax.swing.JRadioButton btnQ1;
    private javax.swing.JRadioButton btnQ2;
    private javax.swing.JRadioButton btnQ3;
    private javax.swing.JRadioButton btnQ4;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQNum;
    private javax.swing.JLabel lblQText;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
