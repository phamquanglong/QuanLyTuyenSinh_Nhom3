/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLySinhVienUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author phamquanglong51
 */
public class ThemThiSinhMoiUI extends javax.swing.JFrame {

    PreparedStatement pst = null;
    public String[] data;

    /**
     * Creates new form ThemThiSinhMoiUI
     */

    public ThemThiSinhMoiUI(String[] data) {
        this.data = data;
        this.setLocationRelativeTo(null);
        initComponents();
        if (data[0].contains("user")) {
            label.setText("Đăng ký dự thi");
            btnThemThiSinh.setText("Đăng ký");
        }
    }

    public ThemThiSinhMoiUI() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        sbd = new javax.swing.JLabel();
        hoten = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoBaoDanh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        cbUuTien = new javax.swing.JComboBox<>();
        btnThemThiSinh = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbKhoi = new javax.swing.JComboBox<>();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm thí sinh mới");

        label.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label.setText("Thêm thí sinh mới");

        sbd.setText("Số báo danh:");

        hoten.setText("Họ tên:");

        jLabel3.setText("Địa chỉ:");

        jLabel4.setText("Ưu tiên:");

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        cbUuTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Người dân tộc thiểu số (2 điểm)", "Thương bệnh binh (2 điểm)", "Quân nhân (2 điểm)", "Con của người hoạt động kháng chiến bị dị dạng, dị tật do hậu quả của chất độc hóa học (2 điểm)", "Người khuyết tật (1 điểm)", "Hộ khẩu thuộc vùng dân tộc, miền núi, biên giới, các xã đặc biệt khó khăn vùng bãi ngang ven biển và hải đảo (0.75 điểm)", "Khu vực nông thôn (0.5 điểm)", "Khu vực thị xã, thành phố trực thuộc tỉnh, các thị xã, huyện ngoại thành của thành phố trực thuộc Trung ương (0.25 điểm)" }));

        btnThemThiSinh.setText("Thêm thí sinh");
        btnThemThiSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThiSinhActionPerformed(evt);
            }
        });

        jLabel5.setText("Khối:");

        cbKhoi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khối A", "Khối B", "Khối C", "Khối D" }));

        btnThoat.setText("Thoát");
        btnThoat.setActionCommand("");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(label))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnThemThiSinh)
                            .addGap(296, 296, 296)
                            .addComponent(btnThoat))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hoten)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(sbd)
                                .addComponent(jLabel5))
                            .addGap(63, 63, 63)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSoBaoDanh)
                                .addComponent(txtDiaChi)
                                .addComponent(txtHoTen)
                                .addComponent(cbUuTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbd)
                    .addComponent(txtSoBaoDanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoten)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbUuTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemThiSinh)
                    .addComponent(btnThoat))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    JFrame frame = new JFrame();
    private void btnThemThiSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThiSinhActionPerformed
        // TODO add your handling code here:
        if (txtSoBaoDanh.getText().isEmpty())
            JOptionPane.showMessageDialog(frame, "Số báo danh không được bỏ trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
//        else if (Integer.parseInt(txtSoBaoDanh.getText().toString()))
        else if (txtHoTen.getText().isEmpty())
            JOptionPane.showMessageDialog(frame, "Họ tên không được để trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        else if (txtDiaChi.getText().isEmpty())
            JOptionPane.showMessageDialog(frame, "Địa chỉ không được bỏ trống", "Thông báo", JOptionPane.ERROR_MESSAGE);
        else if (txtSoBaoDanh.getText().length() > 6)
            JOptionPane.showMessageDialog(frame, "Số báo danh phải gồm 6 chữ số", "Thông báo", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                Connection con = DBConnection.getConnection();
                String sql = "INSERT INTO `thisinh`(`SBD`, `hoTen`, `diaChi`, `uuTien`, `khoi`) VALUES (?, ?, ?, ?, ?)";
                pst = con.prepareStatement(sql);
                pst.setString(1, txtSoBaoDanh.getText());
                pst.setString(2, txtHoTen.getText());
                pst.setString(3, txtDiaChi.getText());
                pst.setString(4, cbUuTien.getSelectedItem().toString());
                pst.setString(5, cbKhoi.getSelectedItem().toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(frame, "Thêm thí sinh mới thành công!!!\n"
                        + "Số báo danh: " + txtSoBaoDanh.getText() + "\n"
                        + "Họ tên: " + txtHoTen.getText() + "\n"
                        + "Địa chỉ: " + txtDiaChi.getText() + "\n"
                        + "Ưu tiên: " + cbUuTien.getSelectedItem().toString() + "\n"
                        + "Khối: " + cbKhoi.getSelectedItem().toString() + "", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new QLTS_Nhom3(data).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ThemThiSinhMoiUI.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(frame, "Số báo danh không đúng định dạng", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnThemThiSinhActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        QLTS_Nhom3 QLTS = new QLTS_Nhom3(data);
        QLTS.setLocationRelativeTo(null);
        QLTS.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(ThemThiSinhMoiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemThiSinhMoiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemThiSinhMoiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemThiSinhMoiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemThiSinhMoiUI themThiSinhMoiUI = new ThemThiSinhMoiUI();
                themThiSinhMoiUI.setLocationRelativeTo(null);
                themThiSinhMoiUI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemThiSinh;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbKhoi;
    private javax.swing.JComboBox<String> cbUuTien;
    private javax.swing.JLabel hoten;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label;
    private javax.swing.JLabel sbd;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtSoBaoDanh;
    // End of variables declaration//GEN-END:variables
}
