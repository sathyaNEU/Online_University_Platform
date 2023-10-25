/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.login.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.AdminPkg.Employer;
import model.AdminPkg.EmployerDirectory;
import model.AdminPkg.FacultyDirectory;
import model.AdminPkg.StudentDirectory;
import model.CoursePkg.CourseCatalog;

/**
 *
 * @author Sathya
 */
public class ManageEmployer extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployer
     */
    EmployerDirectory employerDir;
    JPanel userProcessContainer;
    StudentDirectory studentDir;
    FacultyDirectory facultyDir;
    CourseCatalog courseCatalog;
    Employer employer;
    
    public ManageEmployer(JPanel userProcessContainer, EmployerDirectory employerDir, StudentDirectory studentDir, FacultyDirectory facultyDir, CourseCatalog courseCatalog) {
        initComponents();
        this.employerDir = employerDir;
        this.studentDir = studentDir;
        this.facultyDir = facultyDir;
        this.courseCatalog = courseCatalog;
        this.userProcessContainer = userProcessContainer;
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
        employerIdTextArea = new javax.swing.JTextField();
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

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        hideInOutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hideInOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Employer ID :");
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

        employerIdTextArea.setEditable(false);
        hideInOutPanel.add(employerIdTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 15, 125, -1));

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

        createStudentBtn.setText("Create  a Employer Profile");
        createStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStudentBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("or");

        jLabel2.setText("Edit a Employer Profile");

        jLabel3.setText("Employer ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(createStudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(hideInOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(createStudentBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(28, 28, 28)
                .addComponent(hideInOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String id = idTextField.getText();
        if (id == null) {
            JOptionPane.showMessageDialog(this, "Id cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Employer employer = this.employerDir.getEmployerFromEmployerId(id);
           
            if (employer == null) {
                JOptionPane.showMessageDialog(this, "Student ID NOT FOUND", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                this.employer = employer;
                this.isAccDisabled.setEnabled(false);
                this.isAuthToUpdateInfo.setEnabled(false);
                this.isAccDisabled.setSelected(!employer.getIsAccActive());
                this.isAuthToUpdateInfo.setSelected(employer.getIsAuthToUpdateInfo());
                this.employerIdTextArea.setText(id);
                this.pwdTextArea.setText(employer.getPwd());
                hideInOutPanel.setVisible(true);
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void pwdTextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdTextAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdTextAreaActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        updateBtn.setEnabled(false);
        saveBtn.setEnabled(true);
        employerIdTextArea.setEditable(true);
        pwdTextArea.setEditable(true);
        isAccDisabled.setEnabled(true);
        isAuthToUpdateInfo.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String employer_id = employerIdTextArea.getText();
        String pwd = pwdTextArea.getText();
        Boolean isAccountDisabled = isAccDisabled.isSelected();
        Boolean isAuthToUpdateInfo = this.isAuthToUpdateInfo.isSelected();
        if (employer_id.isBlank() || pwd.isBlank()) {
            JOptionPane.showMessageDialog(this, "Credentials cannot be empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            this.employer.setEmp_id(employer_id);
            this.employer.setPwd(pwd);
            this.employer.setIsAccActive(!isAccountDisabled);
            this.employer.setIsAuthToUpdateInfo(isAuthToUpdateInfo);
            JOptionPane.showMessageDialog(this, "Information Saved Successfully");
            hideInOutPanel.setVisible(false);
            employerIdTextArea.setEditable(false);
            pwdTextArea.setEditable(false);
            saveBtn.setEnabled(false);
            updateBtn.setEnabled(true);
            idTextField.setText("");
            employerIdTextArea.setText("");
            pwdTextArea.setText("");

        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void createStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStudentBtnActionPerformed
        // TODO add your handling code here:
        CreateEmployerCredentials createEmployerCredentials =new CreateEmployerCredentials(userProcessContainer, employerDir);
        userProcessContainer.add("createEmployerCredentials",createEmployerCredentials);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_createStudentBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createStudentBtn;
    private javax.swing.JTextField employerIdTextArea;
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
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}