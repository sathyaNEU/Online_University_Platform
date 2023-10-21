/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.login.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.AdminPkg.Student;
import model.AdminPkg.StudentDirectory;

/**
 *
 * @author Sathya
 */
public class ManageStudent extends javax.swing.JPanel {

    JPanel userProcessContainer;
    StudentDirectory studentDir;
    Student student;

    /**
     * Creates new form ManageStudent
     */
    public ManageStudent(JPanel userProcessContainer, StudentDirectory studentDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.studentDir = studentDir;
        this.hideInOutPanel.setVisible(false);
        this.isAccDisabled.setEnabled(false);
        this.isAuthToUpdateInfo.setEnabled(false);
        this.saveBtn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchBtn = new javax.swing.JButton();
        hideInOutPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pwdTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        studentIdTextArea = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        isAccDisabled = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        isAuthToUpdateInfo = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        createStudentBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        hideInOutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hideInOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Student ID :");
        hideInOutPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 72, -1));

        pwdTextArea.setEditable(false);
        pwdTextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdTextAreaActionPerformed(evt);
            }
        });
        hideInOutPanel.add(pwdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 55, 125, -1));

        jLabel5.setText("Password :");
        hideInOutPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, 102, -1));

        studentIdTextArea.setEditable(false);
        hideInOutPanel.add(studentIdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 15, 125, -1));

        jLabel6.setText("Disable Account :");
        hideInOutPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 102, 102, -1));
        hideInOutPanel.add(isAccDisabled, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel7.setText("Disable to edit info :");
        hideInOutPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 133, 114, -1));
        hideInOutPanel.add(isAuthToUpdateInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        hideInOutPanel.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        hideInOutPanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        add(hideInOutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 430, 210));

        createStudentBtn.setText("Create  a Student Profile");
        createStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStudentBtnActionPerformed(evt);
            }
        });
        add(createStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));
        add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 196, -1));

        jLabel1.setText("or");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel2.setText("Edit a Student Profile");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 22));

        jLabel3.setText("Student ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void pwdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTextAreaActionPerformed

    private void createStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStudentBtnActionPerformed
        // TODO add your handling code here:
        CreateStudentCredentials createUserCredential = new CreateStudentCredentials(userProcessContainer, studentDir);
        this.userProcessContainer.add("createUserCredential", createUserCredential);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

    }//GEN-LAST:event_createStudentBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);

    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String id = idTextField.getText();
        if (id == null) {
            JOptionPane.showMessageDialog(this, "Id cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Student student = studentDir.getStudentByUserId(id);
            if (student == null) {
                JOptionPane.showMessageDialog(this, "Student ID NOT FOUND", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                this.student = student;
                this.isAccDisabled.setEnabled(false);
                this.isAuthToUpdateInfo.setEnabled(false);
                this.isAccDisabled.setSelected(!this.student.getIsAccActive());
                this.isAuthToUpdateInfo.setSelected(this.student.getIsAuthToUpdateInfo());
                this.studentIdTextArea.setText(id);
                this.pwdTextArea.setText(student.getPwd());
                hideInOutPanel.setVisible(true);
            }
        }

    }//GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setEnabled(false);
        saveBtn.setEnabled(true);
        studentIdTextArea.setEditable(true);
        pwdTextArea.setEditable(true);
        isAccDisabled.setEnabled(true);
        isAuthToUpdateInfo.setEnabled(true);

    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String student_id = studentIdTextArea.getText();
        String pwd = pwdTextArea.getText();
        Boolean isAccountDisabled = isAccDisabled.isSelected();
        Boolean isAuthToUpdateInfo = this.isAuthToUpdateInfo.isSelected();      
        if (student_id.isBlank() || pwd.isBlank()) {
            JOptionPane.showMessageDialog(this, "Credentials cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            System.out.println(student_id + pwd);
            this.student.setUser_id(student_id);
            this.student.setPwd(pwd);
            this.student.setIsAccActive(!isAccountDisabled);
            this.student.setIsAuthToUpdateInfo(isAuthToUpdateInfo);
            JOptionPane.showMessageDialog(this, "Information Saved Successfully");
            hideInOutPanel.setVisible(false);
            studentIdTextArea.setEditable(false);
            pwdTextArea.setEditable(false);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
            idTextField.setText("");
            studentIdTextArea.setText("");
            pwdTextArea.setText("");

        }
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createStudentBtn;
    private javax.swing.JPanel hideInOutPanel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JRadioButton isAccDisabled;
    private javax.swing.JRadioButton isAuthToUpdateInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pwdTextArea;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField studentIdTextArea;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private int validateCredentials(String student_id, String pwd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
