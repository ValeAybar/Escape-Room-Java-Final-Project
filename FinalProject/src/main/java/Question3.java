
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valeria Aybar
 */
public class Question3 extends javax.swing.JFrame {

    /**
     * Creates new form Question3
     */
    
    int counter = 50;
    Timer timer = new Timer ();
    
    
    public Question3() {
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

        jLabelQuest3Title = new javax.swing.JLabel();
        jLabelLn = new javax.swing.JLabel();
        jSliderQuest3 = new javax.swing.JSlider();
        jButtonQuest3Answer = new javax.swing.JButton();
        jLabelTimerTitle = new javax.swing.JLabel();
        jLabelTimer = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(797, 520));
        setPreferredSize(new java.awt.Dimension(797, 520));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelQuest3Title.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabelQuest3Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuest3Title.setText("Riddle 3:");
        getContentPane().add(jLabelQuest3Title);
        jLabelQuest3Title.setBounds(60, 66, 120, 40);

        jLabelLn.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabelLn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLn.setText("I am an odd number. Take away a letter and I become even. What number am I?");
        getContentPane().add(jLabelLn);
        jLabelLn.setBounds(60, 125, 670, 20);

        jSliderQuest3.setForeground(new java.awt.Color(222, 222, 222));
        jSliderQuest3.setMajorTickSpacing(1);
        jSliderQuest3.setMaximum(10);
        jSliderQuest3.setPaintLabels(true);
        jSliderQuest3.setPaintTicks(true);
        jSliderQuest3.setSnapToTicks(true);
        getContentPane().add(jSliderQuest3);
        jSliderQuest3.setBounds(100, 190, 570, 120);

        jButtonQuest3Answer.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jButtonQuest3Answer.setText("Answer");
        jButtonQuest3Answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonQuest3AnswerMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonQuest3Answer);
        jButtonQuest3Answer.setBounds(350, 350, 120, 50);

        jLabelTimerTitle.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        jLabelTimerTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTimerTitle.setText("Timer:");
        getContentPane().add(jLabelTimerTitle);
        jLabelTimerTitle.setBounds(414, 40, 60, 20);

        jLabelTimer.setFont(new java.awt.Font("OCR A Extended", 0, 13)); // NOI18N
        jLabelTimer.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelTimer);
        jLabelTimer.setBounds(470, 20, 100, 60);

        jLabelBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valeria Aybar\\Documents\\NetBeansProjects\\FinalProject\\Grey Background.jpg")); // NOI18N
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(-6, 5, 810, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuest3AnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonQuest3AnswerMouseClicked

        int ans = jSliderQuest3.getValue();
        
        if (ans == 7)
        {
             JOptionPane.showMessageDialog (null,"Correct! Take the S from seven and it's even.");
            timer.cancel();
              YouWin yw = new YouWin();
                yw.show ();
                dispose();
        }
        else
        {
             JOptionPane.showMessageDialog (null,"Wrong, Try again");
             counter = (counter - 5);
        }
    }//GEN-LAST:event_jButtonQuest3AnswerMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
       counter = 50;
        TimerTask task;
        task = new TimerTask()
        {
            @Override
            public void run()
            {
                jLabelTimer.setText (Integer.toString(counter));
                counter--;
                if (counter <= 0)
                {
                    JOptionPane.showMessageDialog (null,"Time is Up!");
                    timer.cancel();
                      YouLose lose = new YouLose();
                       lose.show ();
                       dispose();
                }
            }
        };
        timer.scheduleAtFixedRate (task, 1000,1000);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonQuest3Answer;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelLn;
    private javax.swing.JLabel jLabelQuest3Title;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JLabel jLabelTimerTitle;
    private javax.swing.JSlider jSliderQuest3;
    // End of variables declaration//GEN-END:variables
}