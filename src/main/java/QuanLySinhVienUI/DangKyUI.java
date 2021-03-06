/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLySinhVienUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phamquanglong51
 */
public class DangKyUI extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form DangKyUI
     */
    public DangKyUI() {
        initComponents();

        this.getContentPane().setBackground(new Colors().getBackColor());
        btnDangKy.setBackground(new Colors().getPrimaryColor());
        btnTroVeDangNhap.setBackground(new Colors().getPrimaryColor());
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
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnTroVeDangNhap = new javax.swing.JButton();
        btnDangKy = new javax.swing.JButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbLoaiTK = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhóm 3 - Quản lý tuyển sinh");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Đăng ký");

        jLabel2.setText("Tên tài khoản:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Mật khẩu:");

        btnTroVeDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnTroVeDangNhap.setText("Trở về màn hình đăng nhập");
        btnTroVeDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroVeDangNhapActionPerformed(evt);
            }
        });

        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setText("Đăng ký");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        jLabel4.setText("Xác nhận mật khẩu:");

        jLabel5.setText("Loại tài khoản:");

        cbLoaiTK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản trị viên", "Người dùng" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(txtUserName)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(cbLoaiTK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnTroVeDangNhap))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnDangKy)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbLoaiTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnDangKy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTroVeDangNhap)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTroVeDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroVeDangNhapActionPerformed
        // TODO add your handling code here:
        DangNhapUI loginUI = new DangNhapUI();
        loginUI.setLocationRelativeTo(null);
        loginUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTroVeDangNhapActionPerformed

    JFrame frame = new JFrame();
    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        // TODO add your handling code here:
        if (txtUserName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Tên người dùng không được bỏ trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (txtPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(frame, "Mật khẩu không được bỏ trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else if (txtConfirmPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(frame, "Xác nhận mật khẩu không được bỏ trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        } else {
            if (txtPassword.getPassword().length < 7) {
                JOptionPane.showMessageDialog(frame, "Mật khẩu phải có tối thiểu 7 kí tự", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else if (!Arrays.equals(txtConfirmPassword.getPassword(), txtPassword.getPassword())) {
                JOptionPane.showMessageDialog(frame, "Mật khẩu và xác nhận mật khẩu không trùng khớp", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                FileWriter fw = null;
                BufferedWriter bw = null;
                FileReader fr = null;
                BufferedReader br = null;
                try {
                    fw = new FileWriter("user.txt", true);
                    bw = new BufferedWriter(fw);
                    fr = new FileReader("user.txt");
                    br = new BufferedReader(fr);
                    String userName = txtUserName.getText();
                    String check = null;
                    while ((check = br.readLine()) != null) {
                        byte[] decodedBytes = Base64.getDecoder().decode(check);
                        String decodedString = new String(decodedBytes);
                        String obj[] = decodedString.split("\\$");
                        if ((obj[1].equals(userName))) {
                            JOptionPane.showMessageDialog(frame, "Tên đăng nhập đã tồn tại", "Thông báo", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                    if (check == null) {
                        String passWord = String.valueOf(txtPassword.getPassword());
                        String type;
                        if (cbLoaiTK.getSelectedIndex() == 0) {
                            type = "admin";
                        } else {
                            type = "user";
                        }
                        String temp = type + "$" + userName + "$" + passWord;
                        String encodedString = Base64.getEncoder().encodeToString(temp.getBytes());
                        bw.append(encodedString);
                        bw.newLine();
                        JOptionPane.showMessageDialog(frame, "Đăng ký thành công!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        DangNhapUI loginUI = new DangNhapUI();
                        loginUI.setLocationRelativeTo(null);
                        loginUI.setVisible(true);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(frame, e);
                } finally {
                    try {
                        bw.close();
                        br.close();
                        fw.close();
                        fr.close();
                    } catch (IOException ex) {
                        Logger.getLogger(DangKyUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnDangKyActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(DangKyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangKyUI signinUI = new DangKyUI();
                signinUI.setLocationRelativeTo(null);
                signinUI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnTroVeDangNhap;
    private javax.swing.JComboBox<String> cbLoaiTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
