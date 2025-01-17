/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ebooks.main;

import com.ebooks.dao.QuanTriVienDAO;
import com.ebooks.dao.TaiKhoanDAO;
import com.ebooks.helper.DialogHelper;
import java.awt.Color;
import com.ebooks.helper.UtilityHelper;
import com.ebooks.helper.ShareHelper;
import com.ebooks.model.QuanTriVien;
import com.ebooks.model.TaiKhoan;
import com.ebooks.Compoment.MyButton;
import java.awt.event.KeyEvent;

/**
 *
 * @author Thinh
 */
public class LogInDiaLog extends javax.swing.JDialog {

    TaiKhoanDAO tkDao = new TaiKhoanDAO();
    QuanTriVienDAO qtvDao = new QuanTriVienDAO();
    public static String tendangNhapApp;

    /**
     * Creates new form SignUpDiaLog
     */
    public LogInDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBorder3 = new com.ebooks.Compoment.PanelBorder();
        lblLogo = new javax.swing.JLabel();
        imageBoder2 = new com.ebooks.Compoment.ImageBoder();
        jLabel2 = new javax.swing.JLabel();
        btnDangNhap = new com.ebooks.Compoment.MyButton();
        lblTenDangNhap = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTenDangNhap = new com.ebooks.Compoment.txtFieldBoder();
        txtMatKhau = new com.ebooks.Compoment.txtFieldPassBoder();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/nerds.png"))); // NOI18N
        panelBorder3.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        imageBoder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/2d23848e893747691e26.jpg"))); // NOI18N
        imageBoder2.setRadius(25);
        panelBorder3.add(imageBoder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 340, 340));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 30)); // NOI18N
        jLabel2.setText("Đăng Nhập vào Nerds");
        panelBorder3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        btnDangNhap.setBackground(new java.awt.Color(87, 190, 110));
        btnDangNhap.setBorder(null);
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng Nhập ");
        btnDangNhap.setBoderColor(new java.awt.Color(87, 190, 110));
        btnDangNhap.setColorClick(new java.awt.Color(47, 142, 63));
        btnDangNhap.setColorOver(new java.awt.Color(52, 141, 59));
        btnDangNhap.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnDangNhap.setRadius(10);
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        panelBorder3.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 160, 40));

        lblTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenDangNhap.setText("Tên Đăng Nhập");
        panelBorder3.add(lblTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        lblMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMatKhau.setText("Mật Khẩu");
        panelBorder3.add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelBorder3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 50, 50));

        txtTenDangNhap.setBackground(new java.awt.Color(220, 250, 220));
        txtTenDangNhap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtTenDangNhap.setText("ThaoLH");
        txtTenDangNhap.setRadius(10);
        txtTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenDangNhapKeyPressed(evt);
            }
        });
        panelBorder3.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 320, 40));

        txtMatKhau.setBackground(new java.awt.Color(220, 250, 220));
        txtMatKhau.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        txtMatKhau.setText("123456798");
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });
        panelBorder3.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 320, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Bạn muốn đăng ký ?");
        panelBorder3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 190, 110));
        jLabel9.setText("Đăng Ký");
        jLabel9.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel9AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        panelBorder3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
        new SignUpDiaLog(null, true).setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded

    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel9AncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel9AncestorAdded

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        DangNhap();

    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DangNhap();
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void txtTenDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDangNhapKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DangNhap();
        }
    }//GEN-LAST:event_txtTenDangNhapKeyPressed

    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangNhapMouseEntered

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
            java.util.logging.Logger.getLogger(LogInDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogInDiaLog dialog = new LogInDiaLog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void DangNhap() {
        if (UtilityHelper.checkNullText(lblTenDangNhap, txtTenDangNhap)) {
            String tenDangNhap = txtTenDangNhap.getText();
            if (UtilityHelper.checkNullText(lblMatKhau, txtMatKhau) && UtilityHelper.checkPass(lblMatKhau, txtMatKhau)) {
                String matKhau = new String(txtMatKhau.getPassword());
                TaiKhoan taiKhoan = tkDao.findById(tenDangNhap);
                tendangNhapApp = taiKhoan.getTenDangNhap();
                QuanTriVien quanTri = qtvDao.findById(tenDangNhap);
                if (taiKhoan == null) {
                    DialogHelper.alert(this, "Sai Tên Đăng Nhập");
                    txtTenDangNhap.setText("");
                    txtTenDangNhap.requestFocus();
                    return;
                } else if (!matKhau.equals(taiKhoan.getMatKhau())) {
                    DialogHelper.alert(this, "Sai Mật Khẩu");
                    txtMatKhau.setText("");
                    txtMatKhau.requestFocus();
                    return;
                } else {
                    if (quanTri == null) {
                        ShareHelper.USER = taiKhoan;
                        ShareHelper.BOSS = null;
                        DialogHelper.alert(this, "Đăng Nhập Thành Công");
                        this.dispose();
                    } else {
                        if (taiKhoan.getTenDangNhap().equals(quanTri.getTenDangNhap())) {
                            ShareHelper.BOSS = quanTri;
                            DialogHelper.alert(this, "Quản Trị Viên Đăng Nhập Thành Công");
                            this.dispose();
                        }
                    }
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ebooks.Compoment.MyButton btnDangNhap;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.ebooks.Compoment.ImageBoder imageBoder2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private com.ebooks.Compoment.PanelBorder panelBorder3;
    private com.ebooks.Compoment.txtFieldPassBoder txtMatKhau;
    private com.ebooks.Compoment.txtFieldBoder txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
