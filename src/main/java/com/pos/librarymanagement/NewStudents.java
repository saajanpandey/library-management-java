/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pos.librarymanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author saajan
 */
public class NewStudents extends javax.swing.JFrame {

    /**
     * Creates new form NewStudents
     */
    public NewStudents() {
        initComponents();
        refreshTable();
    }

    private void refreshTable() {
        try (Connection con = SqlConnect.connect()) {

            PreparedStatement ps = con.prepareStatement("Select id, first_name,last_name,email from users WHERE role=\"user\"");
            ResultSet rs = ps.executeQuery();
            jStudents.setModel(DbUtils.resultSetToTableModel(rs));
            jStudents.getColumnModel().getColumn(0).setHeaderValue("ID");
            jStudents.getColumnModel().getColumn(1).setHeaderValue("First Name");
            jStudents.getColumnModel().getColumn(2).setHeaderValue("Last Name");
            jStudents.getColumnModel().getColumn(3).setHeaderValue("Email");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        addStudent = new javax.swing.JButton();
        back = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jStudents = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Operations");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Students", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Email");

        jLabel4.setText("Password");

        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email"
            }
        ));
        jStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jStudents);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailField)
                            .addComponent(lastNameField)
                            .addComponent(firstNameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addStudent)
                        .addGap(61, 61, 61)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addStudent)
                            .addComponent(back)
                            .addComponent(updateBtn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        // TODO add your handling code here:
        if (validInput()) {

            String firstName = firstNameField.getText();

            String lastName = lastNameField.getText();

            String email = emailField.getText();

            String role = "user";

            String username = firstName + '.' + lastName;

            char[] passwordChar = passwordField.getPassword();
            String password = new String(passwordChar);

            try (Connection con = SqlConnect.connect()) {

                PreparedStatement smt
                        = con.prepareStatement("INSERT INTO users(`first_name`, `last_name`, `role`, `username`, `email`, `password`)  VALUES (?,?,?,?,?,?)");

                smt.setString(1, firstName);
                smt.setString(2, lastName);
                smt.setString(3, role);
                smt.setString(4, username);
                smt.setString(5, email);
                smt.setString(6, password);
                smt.executeUpdate();

                clear();

                con.close();

                JOptionPane.showMessageDialog(null, "User Created Successfully");
                refreshTable();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_addStudentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jStudentsMouseClicked
        // TODO add your handling code here:
        int i = jStudents.getSelectedRow();
        TableModel model = jStudents.getModel();
        firstNameField.setText(model.getValueAt(i, 1).toString());
        lastNameField.setText(model.getValueAt(i, 2).toString());
        emailField.setText(model.getValueAt(i, 3).toString());
        emailField.setEditable(false);
        passwordField.setEditable(false);
    }//GEN-LAST:event_jStudentsMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        try (Connection con = SqlConnect.connect()) {

            PreparedStatement ps = con.prepareStatement("UPDATE users set first_name=?, last_name=? where email=? ");

            ps.setString(1, firstNameField.getText());
            ps.setString(2, lastNameField.getText());
            ps.setString(3, emailField.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student Infomation is updated");
            firstNameField.setText("");
            lastNameField.setText("");
            emailField.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record Not Updated", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        refreshTable();
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudents().setVisible(true);
            }
        });
    }

    public boolean validInput() {

        System.out.print(passwordField.getPassword().length);

        if (firstNameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "First Name is required.");
            firstNameField.requestFocus();
            return false;

        } else if (lastNameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Last Name is required.");
            lastNameField.requestFocus();
            return false;

        } else if (emailField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Email is required.");
            emailField.requestFocus();
            return false;

        } else if (passwordField.getPassword().length == 0) {
            System.out.println("Here");
            JOptionPane.showMessageDialog(null, "Password field is empty.");
            return false;
        }

        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(emailField.getText());

        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
            emailField.requestFocus();
            return false;
        } else {

            try (Connection con = SqlConnect.connect()) {
                Statement stat = con.createStatement();
                String query = "SELECT email FROM users";
                ResultSet rst = stat.executeQuery(query);
                while (rst.next()) {
                    String dbEmail = rst.getString("email");

                    if (emailField.getText().equals(dbEmail)) {
                        JOptionPane.showMessageDialog(null, "The email already exists. Please use a different email.");
                        emailField.requestFocus();
                        return false;
                    }

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.WARNING_MESSAGE);
                emailField.requestFocus();
                return false;
            }

        }

        String regexPassword = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern passwordPattern = Pattern.compile(regexPassword);

        char[] password = passwordField.getPassword();

        String finalPassword = String.valueOf(password);

        Matcher passwordMatcher = passwordPattern.matcher(finalPassword);

        if (!passwordMatcher.matches()) {
            JOptionPane.showMessageDialog(null, """
                                                        Your password must be have at least
                                                         8 characters long
                                                         1 uppercase & 1 lowercase character
                                                         1 number
                                                         1 symbol""");
            passwordField.requestFocus();
            return false;
        }

        return true;
    }

    public void clear() {
        emailField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        passwordField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudent;
    private javax.swing.JButton back;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jStudents;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
