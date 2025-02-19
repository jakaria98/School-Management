/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author JAKARIA
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize =  (int) tk.getScreenSize().getWidth();
        int ysize= (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lower_pnl = new javax.swing.JPanel();
        upper_pnl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        home_pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        student_pnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        setting_pnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user_pnl = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lower_pnl.setBackground(new java.awt.Color(153, 255, 153));

        upper_pnl.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/jk .png"))); // NOI18N

        javax.swing.GroupLayout upper_pnlLayout = new javax.swing.GroupLayout(upper_pnl);
        upper_pnl.setLayout(upper_pnlLayout);
        upper_pnlLayout.setHorizontalGroup(
            upper_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upper_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(371, 371, 371))
        );
        upper_pnlLayout.setVerticalGroup(
            upper_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upper_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        home_pnl.setBackground(new java.awt.Color(102, 204, 255));
        home_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_pnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                home_pnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                home_pnlMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_Photo_Gallery_100px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gallery");

        javax.swing.GroupLayout home_pnlLayout = new javax.swing.GroupLayout(home_pnl);
        home_pnl.setLayout(home_pnlLayout);
        home_pnlLayout.setHorizontalGroup(
            home_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_pnlLayout.createSequentialGroup()
                .addGroup(home_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(home_pnlLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(home_pnlLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        home_pnlLayout.setVerticalGroup(
            home_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_pnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        student_pnl.setBackground(new java.awt.Color(102, 204, 255));
        student_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_pnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                student_pnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                student_pnlMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/ic_supervisor_account_black_48dp.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Student");

        javax.swing.GroupLayout student_pnlLayout = new javax.swing.GroupLayout(student_pnl);
        student_pnl.setLayout(student_pnlLayout);
        student_pnlLayout.setHorizontalGroup(
            student_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_pnlLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(student_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(student_pnlLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4))
                    .addComponent(jLabel3))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        student_pnlLayout.setVerticalGroup(
            student_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(student_pnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setting_pnl.setBackground(new java.awt.Color(102, 204, 255));
        setting_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_pnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setting_pnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setting_pnlMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/ic_settings_black_48dp.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Setting");

        javax.swing.GroupLayout setting_pnlLayout = new javax.swing.GroupLayout(setting_pnl);
        setting_pnl.setLayout(setting_pnlLayout);
        setting_pnlLayout.setHorizontalGroup(
            setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_pnlLayout.createSequentialGroup()
                .addGroup(setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setting_pnlLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6))
                    .addGroup(setting_pnlLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        setting_pnlLayout.setVerticalGroup(
            setting_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_pnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        user_pnl.setBackground(new java.awt.Color(102, 204, 255));
        user_pnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_pnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_pnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_pnlMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_User_Groups_100px.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("User Panel");

        javax.swing.GroupLayout user_pnlLayout = new javax.swing.GroupLayout(user_pnl);
        user_pnl.setLayout(user_pnlLayout);
        user_pnlLayout.setHorizontalGroup(
            user_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_pnlLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(user_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        user_pnlLayout.setVerticalGroup(
            user_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_pnlLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout lower_pnlLayout = new javax.swing.GroupLayout(lower_pnl);
        lower_pnl.setLayout(lower_pnlLayout);
        lower_pnlLayout.setHorizontalGroup(
            lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lower_pnlLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(home_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208)
                .addComponent(student_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195)
                .addComponent(user_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207)
                .addComponent(setting_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addComponent(upper_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        lower_pnlLayout.setVerticalGroup(
            lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lower_pnlLayout.createSequentialGroup()
                .addGroup(lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(student_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lower_pnlLayout.createSequentialGroup()
                        .addComponent(upper_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addGroup(lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(user_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(setting_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(home_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(313, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lower_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lower_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_pnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_pnlMouseEntered
        // TODO add your handling code here:
        setColor(home_pnl);
    }//GEN-LAST:event_home_pnlMouseEntered

    private void home_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_pnlMouseExited
        // TODO add your handling code here:
        resetColor(home_pnl);
    }//GEN-LAST:event_home_pnlMouseExited

    private void setting_pnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_pnlMouseEntered
        // TODO add your handling code here:
        setColor(setting_pnl);
    }//GEN-LAST:event_setting_pnlMouseEntered

    private void setting_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_pnlMouseExited
        // TODO add your handling code here:
        resetColor(setting_pnl);
    }//GEN-LAST:event_setting_pnlMouseExited

    private void student_pnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_pnlMouseEntered
        // TODO add your handling code here:
        setColor(student_pnl);
    }//GEN-LAST:event_student_pnlMouseEntered

    private void student_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_pnlMouseExited
        // TODO add your handling code here:
        resetColor(student_pnl);
    }//GEN-LAST:event_student_pnlMouseExited

    private void home_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_pnlMouseClicked
        // TODO add your handling code here:
        Home hm = new Home();
        hm.show();
        this.dispose();
    }//GEN-LAST:event_home_pnlMouseClicked

    private void student_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_pnlMouseClicked
        // TODO add your handling code here:
        Student std = new Student();
        
        std.show();
        this.dispose();
    }//GEN-LAST:event_student_pnlMouseClicked

    private void setting_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting_pnlMouseClicked
        // TODO add your handling code here:
        Setting st = new Setting();
        
        st.show();
        this.dispose();
    }//GEN-LAST:event_setting_pnlMouseClicked

    private void user_pnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_pnlMouseEntered
        // TODO add your handling code here:
        setColor(user_pnl);
    }//GEN-LAST:event_user_pnlMouseEntered

    private void user_pnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_pnlMouseExited
        // TODO add your handling code here:
        resetColor(user_pnl);
    }//GEN-LAST:event_user_pnlMouseExited

    private void user_pnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_pnlMouseClicked
        // TODO add your handling code here:
        
        User_pnl up = new User_pnl();
        up.show();
        this.dispose();
    }//GEN-LAST:event_user_pnlMouseClicked
    void setColor(JPanel pnl){
        pnl.setBackground(new Color(115,163,239));
    }
    void resetColor(JPanel pnl){
        pnl.setBackground(new Color(102,204,255));
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel home_pnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel lower_pnl;
    private javax.swing.JPanel setting_pnl;
    private javax.swing.JPanel student_pnl;
    private javax.swing.JPanel upper_pnl;
    private javax.swing.JPanel user_pnl;
    // End of variables declaration//GEN-END:variables
}
