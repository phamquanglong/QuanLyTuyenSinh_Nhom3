/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLySinhVienUI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamquanglong51
 */
public class DangNhapUI extends javax.swing.JFrame {

    PreparedStatement pst = null;

    /**
     * Creates new form LoginUI
     */
    public DangNhapUI() {
        initComponents();

        Colors colors = new Colors();
        this.getContentPane().setBackground(colors.getBackColor());
        btnDangKy.setBackground(colors.getPrimaryColor());
        btnDangNhap.setBackground(colors.getPrimaryColor());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhóm 3 - Quản lý tuyển sinh");
        setBackground(new java.awt.Color(51, 204, 0));
        setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Đăng nhập");

        jLabel2.setText("Tên tài khoản:");

        jLabel3.setText("Mật khẩu:");

        txtUserName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtUserNameInputMethodTextChanged(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jLabel4.setText("Tạo tài khoản mới");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnDangNhap))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnDangKy))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtUserName))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnDangNhap)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JFrame frame = new JFrame();
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        if (txtUserName.getText().isEmpty())
            JOptionPane.showMessageDialog(frame, "Tên người dùng không được để trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        else if (txtPassword.getPassword().length == 0)
            JOptionPane.showMessageDialog(frame, "Mật khẩu không được để trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        else {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader("user.txt");
                br = new BufferedReader(fr);

                String userName = txtUserName.getText();
                String passWord = String.valueOf(txtPassword.getPassword());
                String check = null;
                while ((check = br.readLine()) != null) {
                    byte[] decodedBytes = Base64.getDecoder().decode(check);
                    String decodedString = new String(decodedBytes);
                    String obj[] = decodedString.split("\\$");
                    if ((obj[1].equals(userName)) && (obj[2].equals(passWord))) {
                        QLTS_Nhom3 Cur = new QLTS_Nhom3(obj);
                        if (obj[0].equals("admin")) {
                            JOptionPane.showMessageDialog(frame, "Đăng nhập admin thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            Cur.setLocationRelativeTo(null);
                            Cur.setVisible(true);
                            break;
                        } else {
                            JOptionPane.showMessageDialog(frame, "Đăng nhập user thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            Cur.setLocationRelativeTo(null);
                            Cur.setVisible(true);
                            break;
                        }

                    }
                }
                if (check == null) {
                    JOptionPane.showMessageDialog(frame, "Tên đăng nhập hoặc mật khẩu không chính xác", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    br.close();
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(DangNhapUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        // TODO add your handling code here:
        DangKyUI signinUI = new DangKyUI();
        signinUI.setLocationRelativeTo(null);
        signinUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtUserNameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {

            DangNhapUI loginUI = new DangNhapUI();
            loginUI.setLocationRelativeTo(null);
            loginUI.setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
