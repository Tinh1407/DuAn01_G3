/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ebooks.main;

import com.ebooks.model.ThucUong;
import java.awt.Color;
import com.ebooks.helper.UtilityHelper;
import com.ebooks.dao.ThucUongDAO;
import com.ebooks.helper.DialogHelper;

public class DrinksDiaLog extends javax.swing.JDialog {

    /**
     * Creates new form SettingDiaLog
     */
    public DrinksDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    public DrinksDiaLog(java.awt.Frame parent, boolean modal, ThucUong thucUong) {
        super(parent, modal);
        initComponents();
        setForm(thucUong);
        setBackground(new Color(0, 0, 0, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelRadius2 = new com.ebooks.Compoment.PanelRadius();
        lblLogo1 = new javax.swing.JLabel();
        pnlExit1 = new com.ebooks.Compoment.PanelRound();
        lblExit1 = new javax.swing.JLabel();
        txtTenThucUong = new javax.swing.JTextField();
        txtMaThucUong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        lblMaThucUong = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        btnLuu = new com.ebooks.Compoment.MyButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRadius2.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius2.setRadius(25);
        panelRadius2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/nerds.png"))); // NOI18N
        panelRadius2.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        pnlExit1.setBackground(new java.awt.Color(253, 127, 127));
        pnlExit1.setRoundBottomLeft(25);
        pnlExit1.setRoundTopRight(25);
        pnlExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlExit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlExit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlExit1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlExit1MousePressed(evt);
            }
        });
        pnlExit1.setLayout(new java.awt.GridBagLayout());

        lblExit1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblExit1.setForeground(new java.awt.Color(255, 255, 255));
        lblExit1.setText("X");
        lblExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblExit1MousePressed(evt);
            }
        });
        pnlExit1.add(lblExit1, new java.awt.GridBagConstraints());

        panelRadius2.add(pnlExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 50));

        txtTenThucUong.setBackground(new java.awt.Color(222, 247, 227));
        panelRadius2.add(txtTenThucUong, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 220, 40));

        txtMaThucUong.setBackground(new java.awt.Color(222, 247, 227));
        panelRadius2.add(txtMaThucUong, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, 40));

        jLabel6.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel6.setText("Mô Tả");
        panelRadius2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel2.setText("Tên Thức Uống");
        panelRadius2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel19.setFont(new java.awt.Font("Inter ExtraBold", 0, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 76));
        jLabel19.setText("Thông Tin Thức Uống");
        panelRadius2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 290, -1));

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        panelRadius2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 710, 220));

        lblMaThucUong.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        lblMaThucUong.setText("Mã Thức Uống");
        panelRadius2.add(lblMaThucUong, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel5.setText("Giá Tiền");
        panelRadius2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        txtGiaTien.setBackground(new java.awt.Color(222, 247, 227));
        txtGiaTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiaTienActionPerformed(evt);
            }
        });
        panelRadius2.add(txtGiaTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, 40));

        btnLuu.setBackground(new java.awt.Color(87, 190, 110));
        btnLuu.setForeground(new java.awt.Color(255, 255, 255));
        btnLuu.setText("Lưu Thông Tin");
        btnLuu.setBoderColor(new java.awt.Color(87, 190, 110));
        btnLuu.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        btnLuu.setRadius(10);
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        panelRadius2.add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 270, 50));

        jLabel32.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("N E R D S");
        panelRadius2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 50));

        jLabel33.setFont(new java.awt.Font("Adobe Myungjo Std M", 2, 10)); // NOI18N
        jLabel33.setText("Learning is the eye of the mind");
        panelRadius2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 160, -1));

        getContentPane().add(panelRadius2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblExit1MouseClicked

    private void pnlExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlExit1MouseClicked

    private void pnlExit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlExit1MouseEntered

    private void pnlExit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlExit1MouseExited

    private void pnlExit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlExit1MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_pnlExit1MousePressed

    private void lblExit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit1MousePressed
        // TODO add your handling code here:
//        System.exit(0);
        this.dispose();
    }//GEN-LAST:event_lblExit1MousePressed

    private void txtGiaTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiaTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiaTienActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnLuuActionPerformed

    /*tbdSetting args the command line arguments
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
            java.util.logging.Logger.getLogger(DrinksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrinksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrinksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrinksDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DrinksDiaLog dialog = new DrinksDiaLog(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.ebooks.Compoment.MyButton btnLuu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExit1;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblMaThucUong;
    private com.ebooks.Compoment.PanelRadius panelRadius2;
    private com.ebooks.Compoment.PanelRound pnlExit1;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaThucUong;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenThucUong;
    // End of variables declaration//GEN-END:variables

    ThucUongDAO DaoTU = new ThucUongDAO();

    public void setForm(ThucUong thucUong) {
        txtMaThucUong.setText(thucUong.getMaThucUong());
        txtTenThucUong.setText(thucUong.getTenThucUong());
        txtGiaTien.setText(String.valueOf(thucUong.getGia()));
    }

    public void insert() {
        if (UtilityHelper.checkNullText(txtMaThucUong) && UtilityHelper.checkMa(lblMaThucUong,txtMaThucUong)) {
            if (UtilityHelper.checkNullText(txtTenThucUong) && UtilityHelper.checkName(txtTenThucUong)) {
                if (UtilityHelper.checkNullText(txtGiaTien) && UtilityHelper.checkGia(txtGiaTien)) {
                    try {
                        ThucUong TU = getForm();
                        DaoTU.insert(TU);
//                                this.fillTable();
                        DialogHelper.alert(this, "Thêm mới Thành công");
                    } catch (Exception e) {
                        DialogHelper.alert(this, "Thêm Mới Thất Bại!");
                    }
                }
            }
        }
    }

    public ThucUong getForm() {
        ThucUong tu = new ThucUong();
        tu.setMaThucUong(txtMaThucUong.getText());
        tu.setTenThucUong(txtTenThucUong.getText());
        tu.setGia(Double.parseDouble(txtGiaTien.getText()));
        return tu;
    }
}

/*
về form main
- thay sửa thông tin bằng nút refresh
về form Drinks
thêm nút sửa
 */
