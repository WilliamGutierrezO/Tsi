/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Login.Project_Test_Login;
import clases.conexion;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Willy
 */
public class Home_Page extends javax.swing.JFrame {

    conexion con = null;

    /**
     * Creates new form Home_Page
     */
    public Home_Page() {
        initComponents();
        con = new conexion();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jsessionBtn = new javax.swing.JButton();
        añadirprodBtn = new javax.swing.JButton();
        cancelaropBtn = new javax.swing.JButton();
        añadirprodTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        nomprodLbl = new javax.swing.JLabel();
        detalleLbl = new javax.swing.JLabel();
        marcaLbl = new javax.swing.JLabel();
        valorLbl = new javax.swing.JLabel();
        cantidadLbl = new javax.swing.JLabel();
        subtotalLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        codprodLbl = new javax.swing.JLabel();
        idprodLbl = new javax.swing.JLabel();
        prov = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        testarea = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jsessionBtn.setText("CERAR SESSION");
        jsessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsessionBtnActionPerformed(evt);
            }
        });

        añadirprodBtn.setText("AÑADIR PRODUCTO");
        añadirprodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirprodBtnActionPerformed(evt);
            }
        });

        cancelaropBtn.setText("CANCELAR OPERACION");
        cancelaropBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaropBtnActionPerformed(evt);
            }
        });

        añadirprodTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        nomprodLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nomprodLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        detalleLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        detalleLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        marcaLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        marcaLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        valorLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        valorLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        cantidadLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cantidadLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cantidadLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        subtotalLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        subtotalLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        subtotalLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kapito.png"))); // NOI18N
        jLabel1.setText("FOTO REFERENCIAL");

        codprodLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        codprodLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(marcaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detalleLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomprodLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(cantidadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(subtotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codprodLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(nomprodLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(marcaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(detalleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(codprodLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(subtotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(valorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))))
        );

        idprodLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idprodLbl.setText("ID PRODUCTO:");

        prov.setForeground(new java.awt.Color(255, 204, 204));
        prov.setText("jLabel3");

        testarea.setColumns(20);
        testarea.setRows(5);
        jScrollPane1.setViewportView(testarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(cancelaropBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jsessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prov)
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(añadirprodTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(añadirprodBtn)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(idprodLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(añadirprodBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(idprodLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(añadirprodTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(prov)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelaropBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsessionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsessionBtnActionPerformed
        // TODO add your handling code here:
        con.close();
        Project_Test_Login PTL = new Project_Test_Login();
        PTL.setVisible(true);
        dispose();

    }//GEN-LAST:event_jsessionBtnActionPerformed

    private void añadirprodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirprodBtnActionPerformed
        // TODO add your handling code here:
        con = new conexion();
        ResultSet sel = null;
        StringBuilder sb = new StringBuilder();
        String añadirp = "";
        añadirp = añadirprodTxt.getText();
        String bus = "SELECT * FROM producto WHERE id_producto='" + añadirp + "'";
        sel = con.query(bus);
        try {
            while (sel.next()) {
                sb.append(sel.getString("id_producto"));
                sb.append(sel.getString("id_proveedor"));
                sb.append(sel.getString("nombre_producto"));
                sb.append(sel.getString("detalle_producto"));
                sb.append(sel.getString("marca_producto"));
                sb.append(sel.getString("valor_producto"));
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, con.getMassage(), "select", JOptionPane.INFORMATION_MESSAGE);
        }testarea.append(sb.toString());
                


    }//GEN-LAST:event_añadirprodBtnActionPerformed

    private void cancelaropBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaropBtnActionPerformed
        // TODO add your handling code here:
        codprodLbl.setText(null);
        nomprodLbl.setText(null);
        detalleLbl.setText(null);
        valorLbl.setText(null);
    }//GEN-LAST:event_cancelaropBtnActionPerformed
    /*public void buscar(ResultSet sel, String añadirp) {
        try {

            sel.next();
            StringBuilder sb = new StringBuilder();

            while (sel.next()) {
                sb.append(sel.getString("id_producto"));
                sb.append(sel.getString("id_proveedor"));
                sb.append(sel.getString("nombre_producto"));
                sb.append(sel.getString("detalle_producto"));
                sb.append(sel.getString("marca_producto"));
                sb.append(sel.getString("valor_producto"));

                codprodLbl.setText(sel.getString("id_producto"));
                prov.setText(sel.getString("id_proveedor"));
                nomprodLbl.setText(sel.getString("nombre_producto"));
                detalleLbl.setText(sel.getString("detalle_producto"));
                marcaLbl.setText(sel.getString("marca_producto"));
                valorLbl.setText('$' + sel.getString("valor_producto"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, con.getMassage(), "select", JOptionPane.INFORMATION_MESSAGE);
        }
    }*/

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirprodBtn;
    private javax.swing.JTextField añadirprodTxt;
    private javax.swing.JButton cancelaropBtn;
    private javax.swing.JLabel cantidadLbl;
    private javax.swing.JLabel codprodLbl;
    private javax.swing.JLabel detalleLbl;
    private javax.swing.JLabel idprodLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jsessionBtn;
    private javax.swing.JLabel marcaLbl;
    private javax.swing.JLabel nomprodLbl;
    private javax.swing.JLabel prov;
    private javax.swing.JLabel subtotalLbl;
    private javax.swing.JTextArea testarea;
    private javax.swing.JLabel valorLbl;
    // End of variables declaration//GEN-END:variables

}
