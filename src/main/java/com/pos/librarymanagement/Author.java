/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pos.librarymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author saajan
 */
public class Author extends javax.swing.JFrame {

    /**
     * Creates new form Author
     */
    public Author() {
        initComponents();
        refreshTable();
    }

    private void refreshTable() {
        try (Connection con = SqlConnect.connect()) {

            PreparedStatement ps = con.prepareStatement("Select * from authors");
            ResultSet rs = ps.executeQuery();
            jAuthorTable.setModel(DbUtils.resultSetToTableModel(rs));
            jAuthorTable.getColumnModel().getColumn(0).setHeaderValue("ID");
            jAuthorTable.getColumnModel().getColumn(1).setHeaderValue("Author Name");
        } catch (Exception e) {

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        authorNameLabel = new javax.swing.JLabel();
        authName = new javax.swing.JTextField();
        addAuthor = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAuthorTable = new javax.swing.JTable();
        authorID = new javax.swing.JTextField();
        authorNameLabel1 = new javax.swing.JLabel();
        deleteAuthor = new javax.swing.JButton();
        updateAuthor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Author", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        authorNameLabel.setText("Name");

        addAuthor.setText("Add Author");
        addAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorActionPerformed(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jAuthorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        jAuthorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAuthorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jAuthorTable);

        authorID.setEditable(false);
        authorID.setToolTipText("");

        authorNameLabel1.setText("ID");

        deleteAuthor.setText("Delete Author");
        deleteAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAuthorActionPerformed(evt);
            }
        });

        updateAuthor.setText("Update Author");
        updateAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAuthorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(authorNameLabel)
                                .addComponent(authorNameLabel1))
                            .addComponent(addAuthor))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(updateAuthor)
                                .addGap(30, 30, 30)
                                .addComponent(deleteAuthor)
                                .addGap(57, 57, 57)
                                .addComponent(close))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(authName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authorID, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorNameLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorNameLabel))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAuthor)
                    .addComponent(close)
                    .addComponent(deleteAuthor)
                    .addComponent(updateAuthor))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void addAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorActionPerformed
        // TODO add your handling code here:
        String name = authName.getText();

        try (Connection con = SqlConnect.connect()) {

            PreparedStatement smt
                    = con.prepareStatement("INSERT INTO authors"
                            + "(`name`)  VALUES (?)");
            smt.setString(1, name);
            smt.executeUpdate();
            authName.setText("");

            con.close();

            JOptionPane.showMessageDialog(null, "Author Created Successfully");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.WARNING_MESSAGE);
        }
        refreshTable();
    }//GEN-LAST:event_addAuthorActionPerformed

    private void jAuthorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAuthorTableMouseClicked
        // TODO add your handling code here:
        int i = jAuthorTable.getSelectedRow();
        TableModel model = jAuthorTable.getModel();
        authorID.setText(model.getValueAt(i, 0).toString());
        authName.setText(model.getValueAt(i, 1).toString());
    }//GEN-LAST:event_jAuthorTableMouseClicked

    private void deleteAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAuthorActionPerformed
        // TODO add your handling code here:

        try (Connection con = SqlConnect.connect()) {

            PreparedStatement ps = con.prepareStatement("Delete from authors where id=?");

            ps.setString(1, authorID.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Author Is Deleted");
            authName.setText("");
            authorID.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Author is not deleted", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        refreshTable();
    }//GEN-LAST:event_deleteAuthorActionPerformed

    private void updateAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAuthorActionPerformed
        // TODO add your handling code here:

        try (Connection con = SqlConnect.connect()) {

            PreparedStatement ps = con.prepareStatement("UPDATE authors set name=? where id=? ");

            ps.setString(1, authName.getText());
            ps.setString(2, authorID.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Author Is Updated");
            authName.setText("");
            authorID.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record Not Updated", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        refreshTable();
    }//GEN-LAST:event_updateAuthorActionPerformed

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
            java.util.logging.Logger.getLogger(Author.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Author.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Author.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Author.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Author().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuthor;
    private javax.swing.JTextField authName;
    private javax.swing.JTextField authorID;
    private javax.swing.JLabel authorNameLabel;
    private javax.swing.JLabel authorNameLabel1;
    private javax.swing.JButton close;
    private javax.swing.JButton deleteAuthor;
    private javax.swing.JTable jAuthorTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateAuthor;
    // End of variables declaration//GEN-END:variables
}
