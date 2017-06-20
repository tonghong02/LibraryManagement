/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.view;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class GUIMain extends javax.swing.JFrame {

    GUIQuanLyDocGia qldg;
    GUIQuanLySach qls;
    GUIQuanLyMuonTra qlmt;
    GUIThongKeBaoCao tkbc;

    public GUIMain() {
        initComponents();
        
        qldg = new GUIQuanLyDocGia();
        qls = new GUIQuanLySach();
        qlmt = new GUIQuanLyMuonTra();
        tkbc = new GUIThongKeBaoCao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelChinh = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnQLDG = new javax.swing.JButton();
        btnQLS = new javax.swing.JButton();
        btnQLMT = new javax.swing.JButton();
        btnTKBC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ THƯ VIỆN");
        setPreferredSize(new java.awt.Dimension(1020, 780));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TRƯỜNG ĐẠI HỌC BÁCH KHOA HÀ NỘI");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THƯ VIỆN TẠ QUANG BỬU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelChinh.setLayout(new java.awt.BorderLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/tv1.jpg"))); // NOI18N
        panelChinh.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnQLDG.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnQLDG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/QLDG.png"))); // NOI18N
        btnQLDG.setText("Quản lý độc giả");
        btnQLDG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLDG.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDGActionPerformed(evt);
            }
        });
        jPanel3.add(btnQLDG);

        btnQLS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnQLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/QLS.png"))); // NOI18N
        btnQLS.setText("Quản lý sách");
        btnQLS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSActionPerformed(evt);
            }
        });
        jPanel3.add(btnQLS);

        btnQLMT.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnQLMT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/QLMT.png"))); // NOI18N
        btnQLMT.setText("Quản lý mượn trả");
        btnQLMT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLMT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMTActionPerformed(evt);
            }
        });
        jPanel3.add(btnQLMT);

        btnTKBC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnTKBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/image/BaoCao.png"))); // NOI18N
        btnTKBC.setText("Thống kê - báo cáo");
        btnTKBC.setToolTipText("");
        btnTKBC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTKBC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTKBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKBCActionPerformed(evt);
            }
        });
        jPanel3.add(btnTKBC);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelChinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDGActionPerformed
        panelChinh.removeAll();
        panelChinh.add(qldg, BorderLayout.CENTER);
        panelChinh.updateUI();
    }//GEN-LAST:event_btnQLDGActionPerformed

    private void btnQLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSActionPerformed
        panelChinh.removeAll();
        panelChinh.add(qls, BorderLayout.CENTER);
        panelChinh.updateUI();
    }//GEN-LAST:event_btnQLSActionPerformed

    private void btnQLMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMTActionPerformed
        panelChinh.removeAll();
        panelChinh.add(qlmt, BorderLayout.CENTER);
        panelChinh.updateUI();
    }//GEN-LAST:event_btnQLMTActionPerformed

    private void btnTKBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKBCActionPerformed
        panelChinh.removeAll();
        panelChinh.add(tkbc, BorderLayout.CENTER);
        panelChinh.updateUI();
    }//GEN-LAST:event_btnTKBCActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIMain main = new GUIMain();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
                main.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLDG;
    private javax.swing.JButton btnQLMT;
    private javax.swing.JButton btnQLS;
    private javax.swing.JButton btnTKBC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panelChinh;
    // End of variables declaration//GEN-END:variables
}
