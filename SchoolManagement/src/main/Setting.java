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
public class Setting extends javax.swing.JFrame {

    /**
     * Creates new form Setting
     */
    public Setting() {
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
        jPanel1 = new javax.swing.JPanel();
        goback = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        crt_user = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        add_std = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lgt = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updt_pass = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 800));

        lower_pnl.setBackground(new java.awt.Color(153, 255, 153));

        upper_pnl.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        goback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_Go_Back_40px_1.png"))); // NOI18N
        goback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobackMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Go Back");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/ic_settings_black_48dp.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Setting");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goback, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goback)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(37, 37, 37))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/jk .png"))); // NOI18N

        javax.swing.GroupLayout upper_pnlLayout = new javax.swing.GroupLayout(upper_pnl);
        upper_pnl.setLayout(upper_pnlLayout);
        upper_pnlLayout.setHorizontalGroup(
            upper_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upper_pnlLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        upper_pnlLayout.setVerticalGroup(
            upper_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel13)
        );

        crt_user.setBackground(new java.awt.Color(102, 204, 255));
        crt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crt_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crt_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crt_userMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_Add_User_Male_100px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Creat User");

        javax.swing.GroupLayout crt_userLayout = new javax.swing.GroupLayout(crt_user);
        crt_user.setLayout(crt_userLayout);
        crt_userLayout.setHorizontalGroup(
            crt_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crt_userLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(crt_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        crt_userLayout.setVerticalGroup(
            crt_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crt_userLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_std.setBackground(new java.awt.Color(102, 204, 255));
        add_std.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_stdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_stdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_stdMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_Add_User_Group_Woman_Man_100px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Add Student");

        javax.swing.GroupLayout add_stdLayout = new javax.swing.GroupLayout(add_std);
        add_std.setLayout(add_stdLayout);
        add_stdLayout.setHorizontalGroup(
            add_stdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_stdLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(add_stdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        add_stdLayout.setVerticalGroup(
            add_stdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_stdLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lgt.setBackground(new java.awt.Color(102, 204, 255));
        lgt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lgtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lgtMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_Sign_Out_100px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Logout");

        javax.swing.GroupLayout lgtLayout = new javax.swing.GroupLayout(lgt);
        lgt.setLayout(lgtLayout);
        lgtLayout.setHorizontalGroup(
            lgtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lgtLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(58, 58, 58))
            .addGroup(lgtLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lgtLayout.setVerticalGroup(
            lgtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lgtLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updt_pass.setBackground(new java.awt.Color(102, 204, 255));
        updt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updt_passMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updt_passMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updt_passMouseExited(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/image/icons8_Password_Reset_100px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Update Password ");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("& Username");

        javax.swing.GroupLayout updt_passLayout = new javax.swing.GroupLayout(updt_pass);
        updt_pass.setLayout(updt_passLayout);
        updt_passLayout.setHorizontalGroup(
            updt_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updt_passLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updt_passLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(updt_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updt_passLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updt_passLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(60, 60, 60))))
        );
        updt_passLayout.setVerticalGroup(
            updt_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updt_passLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel10)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lower_pnlLayout = new javax.swing.GroupLayout(lower_pnl);
        lower_pnl.setLayout(lower_pnlLayout);
        lower_pnlLayout.setHorizontalGroup(
            lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upper_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(lower_pnlLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(crt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(add_std, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(updt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(lgt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        lower_pnlLayout.setVerticalGroup(
            lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lower_pnlLayout.createSequentialGroup()
                .addComponent(upper_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140)
                .addGroup(lower_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_std, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lgt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(crt_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 148, Short.MAX_VALUE))
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

    private void gobackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobackMouseClicked
        // TODO add your handling code here:
        Menu mn = new Menu();
        
        mn.show();
        this.dispose();
    }//GEN-LAST:event_gobackMouseClicked

    private void crt_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crt_userMouseEntered
        // TODO add your handling code here:
        setColor(crt_user);
    }//GEN-LAST:event_crt_userMouseEntered

    private void crt_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crt_userMouseExited
        // TODO add your handling code here:
        resetColor(crt_user);
    }//GEN-LAST:event_crt_userMouseExited

    private void add_stdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stdMouseEntered
        // TODO add your handling code here:
        setColor(add_std);
    }//GEN-LAST:event_add_stdMouseEntered

    private void add_stdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stdMouseExited
        // TODO add your handling code here:
        resetColor(add_std);
    }//GEN-LAST:event_add_stdMouseExited

    private void lgtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgtMouseExited
        // TODO add your handling code here:
        resetColor(lgt);
    }//GEN-LAST:event_lgtMouseExited

    private void lgtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgtMouseEntered
        // TODO add your handling code here:
        setColor(lgt);
    }//GEN-LAST:event_lgtMouseEntered

    private void crt_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crt_userMouseClicked
        // TODO add your handling code here:
        User user = new User();
        
        user.show();
        this.dispose();
    }//GEN-LAST:event_crt_userMouseClicked

    private void updt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updt_passMouseClicked
        // TODO add your handling code here:
        Update_pass up = new Update_pass();
        
        up.show();
        this.dispose();
    }//GEN-LAST:event_updt_passMouseClicked

    private void updt_passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updt_passMouseEntered
        // TODO add your handling code here:
        setColor(updt_pass);
    }//GEN-LAST:event_updt_passMouseEntered

    private void updt_passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updt_passMouseExited
        // TODO add your handling code here:
        resetColor(updt_pass);
    }//GEN-LAST:event_updt_passMouseExited

    private void add_stdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_stdMouseClicked
        // TODO add your handling code here:
        Admission ad = new Admission();
        ad.show();
        this.dispose();
    }//GEN-LAST:event_add_stdMouseClicked

    private void lgtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgtMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login lg = new Login();
        lg.show();
    }//GEN-LAST:event_lgtMouseClicked
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
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Setting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_std;
    private javax.swing.JPanel crt_user;
    private javax.swing.JLabel goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel lgt;
    private javax.swing.JPanel lower_pnl;
    private javax.swing.JPanel updt_pass;
    private javax.swing.JPanel upper_pnl;
    // End of variables declaration//GEN-END:variables
}
