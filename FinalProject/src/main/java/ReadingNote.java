/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valeria Aybar
 */
public class ReadingNote extends javax.swing.JFrame {

    /**
     * Creates new form ReadingNote
     */
    public ReadingNote() {
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

        jLabelReadLn2 = new javax.swing.JLabel();
        jLabelReadLn3 = new javax.swing.JLabel();
        jLabelReadLn4 = new javax.swing.JLabel();
        jButtonReadNext = new javax.swing.JButton();
        jLabelReadimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(797, 530));
        setPreferredSize(new java.awt.Dimension(797, 530));
        getContentPane().setLayout(null);

        jLabelReadLn2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabelReadLn2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReadLn2.setText("A box with a dial that takes 3 inputs for numbers and a symbol.");
        getContentPane().add(jLabelReadLn2);
        jLabelReadLn2.setBounds(100, 60, 730, 50);

        jLabelReadLn3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabelReadLn3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReadLn3.setText("And a note under a pillow that reads:");
        getContentPane().add(jLabelReadLn3);
        jLabelReadLn3.setBounds(120, 120, 470, 40);

        jLabelReadLn4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabelReadLn4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReadLn4.setText("The code to open the box is hidden within these 3 riddles…");
        getContentPane().add(jLabelReadLn4);
        jLabelReadLn4.setBounds(200, 180, 450, 22);

        jButtonReadNext.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jButtonReadNext.setText("Next");
        jButtonReadNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReadNextMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonReadNext);
        jButtonReadNext.setBounds(310, 350, 100, 50);

        jLabelReadimage.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeria Aybar\\Documents\\NetBeansProjects\\FinalProject\\Background Room Image.jpg")); // NOI18N
        getContentPane().add(jLabelReadimage);
        jLabelReadimage.setBounds(0, -10, 820, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReadNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReadNextMouseClicked
       Question1 q1 = new Question1();
        q1.show ();
        dispose();
    }//GEN-LAST:event_jButtonReadNextMouseClicked

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
            java.util.logging.Logger.getLogger(ReadingNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadingNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadingNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadingNote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadingNote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReadNext;
    private javax.swing.JLabel jLabelReadLn2;
    private javax.swing.JLabel jLabelReadLn3;
    private javax.swing.JLabel jLabelReadLn4;
    private javax.swing.JLabel jLabelReadimage;
    // End of variables declaration//GEN-END:variables
}
