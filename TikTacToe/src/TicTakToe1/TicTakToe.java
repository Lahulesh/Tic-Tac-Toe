/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTakToe1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TicTakToe extends javax.swing.JFrame {

    private String startGame="X";
    private int xCount = 0;
    private int oCount = 0;
    /**
     * Creates new form TicTakToe
     */
    public TicTakToe() {
        initComponents();
        setSize(1100,800);
        setLocationRelativeTo(null);
                
    }

   
    private void gameScore()
    {
        playerx.setText(String.valueOf(xCount));
        playero.setText(String.valueOf(oCount));
    }

    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
            
        }
        else
        {
            startGame="X";
        }
    }
    
    private void winningGame()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();

        String b4 = jButton9.getText();
        String b5 = jButton8.getText();
        String b6 = jButton7.getText();
        
        String b7 = jButton14.getText();
        String b8 = jButton13.getText();
        String b9 = jButton10.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.ORANGE);
            jButton2.setBackground(Color.ORANGE);
            jButton3.setBackground(Color.ORANGE);
        }
        
        if(b4== ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton9.setBackground(Color.RED);
            jButton8.setBackground(Color.RED);
            jButton7.setBackground(Color.RED);
        }
        
        if(b7== ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton14.setBackground(Color.MAGENTA);
            jButton13.setBackground(Color.MAGENTA);
            jButton10.setBackground(Color.MAGENTA);
        }
        
        if(b1== ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            jButton14.setBackground(Color.ORANGE);
        }
        if(b2== ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.CYAN);
            jButton8.setBackground(Color.CYAN);
            jButton13.setBackground(Color.CYAN);
        }
        
        if(b3== ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.BLUE);
            jButton7.setBackground(Color.BLUE);
            jButton10.setBackground(Color.BLUE);
        }
        if(b1== ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.LIGHT_GRAY);
            jButton8.setBackground(Color.LIGHT_GRAY);
            jButton13.setBackground(Color.LIGHT_GRAY);
        }
        if(b3== ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Players X wins","Tik Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.PINK);
            jButton8.setBackground(Color.PINK);
            jButton13.setBackground(Color.PINK);
            
            
            
            
            
        }
        
         
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TikTacToe");

        jPanel1.setBackground(new java.awt.Color(0, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIK TAC TOE");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        jLabel2.setText("Player X:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        playerx.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPanel7.add(playerx, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 43)); // NOI18N
        jLabel4.setText("Player O:");
        jPanel8.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        playero.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPanel9.add(playero, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton14, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 95)); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        reset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel15.add(reset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        exit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel13.add(exit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        jButton1.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton1.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
        
        
   
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Conform if you want to EXIT","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION ) ==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
        
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        jButton2.setText(null);
        jButton1.setText(null);
        jButton3.setText(null);
        
        jButton9.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
       // jButton7.setText(null)
                
        jButton10.setText(null);
        jButton14.setText(null);
        jButton13.setText(null);
        //jButton10.setText(null)  
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        
        jButton9.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton14.setBackground(Color.LIGHT_GRAY);
        jButton13.setBackground(Color.LIGHT_GRAY);
        
        playero.setText(null);
        playerx.setText(null);
                
    }//GEN-LAST:event_resetActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton2.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton3.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton7.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton8.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton9.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jButton14.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton14.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton14.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jButton13.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton13.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton13.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setText(startGame);
       
        if(startGame.equalsIgnoreCase("X"))
        {
            jButton10.setForeground(Color.GREEN);
            
        }
        else
        {
            jButton10.setForeground(Color.YELLOW);
        }
       choose_a_Player();
       winningGame();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTakToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTakToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTakToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTakToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTakToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
