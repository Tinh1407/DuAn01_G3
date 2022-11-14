/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.ebooks.main;

import java.awt.Color;

/**
 *
 * @author Thinh
 */
public class PersonDiaLog extends javax.swing.JDialog {

    /**
     * Creates new form SettingDiaLog
     */
    public PersonDiaLog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0,0,0,0));
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
        panelRadius2 = new com.ebooks.Compoment.PanelRadius();
        lblLogo1 = new javax.swing.JLabel();
        pnlExit1 = new com.ebooks.Compoment.PanelRound();
        lblExit1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        myButton9 = new com.ebooks.Compoment.MyButton();
        jLabel19 = new javax.swing.JLabel();
        imageBoder1 = new com.ebooks.Compoment.ImageBoder();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRadius2.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius2.setRadius(25);
        panelRadius2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/nerds.png"))); // NOI18N
        panelRadius2.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        });
        pnlExit1.setLayout(new java.awt.GridBagLayout());

        lblExit1.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        lblExit1.setForeground(new java.awt.Color(255, 255, 255));
        lblExit1.setText("X");
        lblExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit1MouseClicked(evt);
            }
        });
        pnlExit1.add(lblExit1, new java.awt.GridBagConstraints());

        panelRadius2.add(pnlExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 50));

        jLabel18.setFont(new java.awt.Font("Inter ExtraBold", 0, 26)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(55, 149, 76));
        jLabel18.setText("người dùng");
        panelRadius2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, -1));
        jLabel18.getAccessibleContext().setAccessibleName("Hãy điền các thông tin");

        jTextField3.setBackground(new java.awt.Color(222, 247, 227));
        jTextField3.setText("jTextField1");
        panelRadius2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 220, 40));

        jLabel4.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel4.setText("Số Điện Thoại");
        panelRadius2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, -1));

        jTextField4.setBackground(new java.awt.Color(222, 247, 227));
        jTextField4.setText("jTextField1");
        panelRadius2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 210, 40));

        jLabel6.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel6.setText("Mô Tả");
        panelRadius2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel2.setText("Giới Tính");
        panelRadius2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, -1));

        jTextField2.setBackground(new java.awt.Color(222, 247, 227));
        jTextField2.setText("jTextField1");
        panelRadius2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 210, 40));

        jLabel3.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel3.setText("Địa Chỉ Email");
        panelRadius2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Nam");
        panelRadius2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nữ");
        panelRadius2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        myButton9.setBackground(new java.awt.Color(87, 190, 110));
        myButton9.setForeground(new java.awt.Color(255, 255, 255));
        myButton9.setText("Lưu Thông Tin");
        myButton9.setBoderColor(new java.awt.Color(87, 190, 110));
        myButton9.setFont(new java.awt.Font("Inter SemiBold", 0, 14)); // NOI18N
        myButton9.setRadius(10);
        panelRadius2.add(myButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 270, 50));

        jLabel19.setFont(new java.awt.Font("Inter ExtraBold", 0, 26)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(55, 149, 76));
        jLabel19.setText("Hãy điền các thông tin");
        panelRadius2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 290, -1));

        imageBoder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ebooks/Image/41b92ec3eab97e4c24b3f6e8fe75ddec.png"))); // NOI18N
        imageBoder1.setRadius(20);
        panelRadius2.add(imageBoder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, 160));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panelRadius2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 670, 100));

        jLabel7.setFont(new java.awt.Font("Inter Medium", 0, 14)); // NOI18N
        jLabel7.setText("Họ Tên Người Dùng");
        panelRadius2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

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
            java.util.logging.Logger.getLogger(PersonDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonDiaLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonDiaLog dialog = new PersonDiaLog(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private com.ebooks.Compoment.ImageBoder imageBoder1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblExit1;
    private javax.swing.JLabel lblLogo1;
    private com.ebooks.Compoment.MyButton myButton9;
    private com.ebooks.Compoment.PanelRadius panelRadius2;
    private com.ebooks.Compoment.PanelRound pnlExit1;
    // End of variables declaration//GEN-END:variables
}