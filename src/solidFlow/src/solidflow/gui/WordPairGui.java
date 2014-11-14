/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solidflow.gui;

import solidflow.logic.WordPairControl;

/**
 *
 * @author rolf
 */
public class WordPairGui extends javax.swing.JFrame {

    /**
     * Creates new form WordPairGui
     */
    WordPairControl wpc = new WordPairControl();
    private String filename = "WordPair.csv";
    
    public WordPairGui() {
        initComponents();
        wpc.load(filename);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHeadline = new javax.swing.JLabel();
        jLabelQuestion = new javax.swing.JLabel();
        jLabelAnswer = new javax.swing.JLabel();
        jTexQuestion = new javax.swing.JTextField();
        jTextAnswer = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jButtonGuess = new javax.swing.JButton();
        jButtonLookUp = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jLabelRightWrong = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHeadline.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelHeadline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeadline.setText("Language Trainer");

        jLabelQuestion.setText("Question");

        jLabelAnswer.setText("Answer");

        jButtonNext.setText("Next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonGuess.setText("Guess");
        jButtonGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuessActionPerformed(evt);
            }
        });

        jButtonLookUp.setText("Look Up");
        jButtonLookUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLookUpActionPerformed(evt);
            }
        });

        jButtonNew.setText("New");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jLabelRightWrong.setText("Guess a word or look up a word");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHeadline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRightWrong, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTexQuestion)
                            .addComponent(jTextAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSave)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLookUp)
                            .addComponent(jButtonNext)
                            .addComponent(jButtonGuess))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonGuess, jButtonLookUp, jButtonNew, jButtonNext, jButtonSave});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQuestion)
                    .addComponent(jTexQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonLookUp)
                    .addComponent(jButtonSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabelRightWrong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabelAnswer, jLabelQuestion, jTexQuestion, jTextAnswer});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonGuess, jButtonLookUp, jButtonNew, jButtonSave});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        jTexQuestion.setText(wpc.getRandomQuestion());
        jTextAnswer.setText("");
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jButtonGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuessActionPerformed
        // TODO add your handling code here:
        
        boolean isCorrect = wpc.checkGuess(jTexQuestion.getText(), jTextAnswer.getText());
        
        if (isCorrect) {
            jLabelRightWrong.setText("Correct!");
        } else {
            jLabelRightWrong.setText("Wrong!");
        }
        
    }//GEN-LAST:event_jButtonGuessActionPerformed

    private void jButtonLookUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLookUpActionPerformed
        // TODO add your handling code here:
        jTextAnswer.setText(wpc.lookup(jTexQuestion.getText()));
    }//GEN-LAST:event_jButtonLookUpActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        // TODO add your handling code here:
        wpc.add(jTexQuestion.getText(), jTextAnswer.getText());
        jTextAnswer.setText("");
        jTexQuestion.setText("");
        jLabelRightWrong.setText("New word pair added!");
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        wpc.save(filename);
        jLabelRightWrong.setText("Collection added!");
    }//GEN-LAST:event_jButtonSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuess;
    private javax.swing.JButton jButtonLookUp;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabelAnswer;
    private javax.swing.JLabel jLabelHeadline;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelRightWrong;
    private javax.swing.JTextField jTexQuestion;
    private javax.swing.JTextField jTextAnswer;
    // End of variables declaration//GEN-END:variables
}
