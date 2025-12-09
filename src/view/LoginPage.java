package view;

import admins.Admin;
import view.WelcomePage;
import database.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginEmailLabel = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        loginUserLabel = new javax.swing.JLabel();
        loginUserField = new javax.swing.JTextField();
        loginRoleLabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        loginPassField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        loginRoleCombo = new javax.swing.JComboBox<>();
        loginPassLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/CGHMC_Logo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("WELCOME TO CHINESE");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HOSPITAL AND MEDICAL CENTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(360, 0, 440, 500);

        loginEmailLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginEmailLabel.setText("EMAIL:");
        jPanel1.add(loginEmailLabel);
        loginEmailLabel.setBounds(50, 230, 60, 17);

        loginEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEmailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginEmailField);
        loginEmailField.setBounds(50, 250, 250, 30);

        loginUserLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginUserLabel.setText("USERNAME:");
        jPanel1.add(loginUserLabel);
        loginUserLabel.setBounds(50, 170, 90, 17);

        loginUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUserFieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginUserField);
        loginUserField.setBounds(50, 190, 250, 30);

        loginRoleLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginRoleLabel.setText("ROLE:");
        jPanel1.add(loginRoleLabel);
        loginRoleLabel.setBounds(50, 100, 90, 17);

        loginBtn.setBackground(new java.awt.Color(255, 0, 51));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOG IN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn);
        loginBtn.setBounds(130, 350, 90, 27);

        loginPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPassFieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginPassField);
        loginPassField.setBounds(50, 310, 250, 30);

        backBtn.setBackground(new java.awt.Color(0, 0, 153));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(10, 10, 50, 30);

        loginRoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Doctor" }));
        loginRoleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRoleComboActionPerformed(evt);
            }
        });
        jPanel1.add(loginRoleCombo);
        loginRoleCombo.setBounds(50, 120, 250, 30);

        loginPassLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginPassLabel.setText("PASSWORD:");
        jPanel1.add(loginPassLabel);
        loginPassLabel.setBounds(50, 290, 90, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Login");
        jPanel1.getAccessibleContext().setAccessibleDescription("Login");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmailFieldActionPerformed
        
    }//GEN-LAST:event_loginEmailFieldActionPerformed

    private void loginUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUserFieldActionPerformed
        
    }//GEN-LAST:event_loginUserFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String username = loginUserField.getText();
        String password = String.valueOf(loginPassField.getPassword());
        String role = loginRoleCombo.getSelectedItem().toString();

        try {
            Connection conn = DBConnection.getInstance().getDBConnection();
            String sql = "SELECT * FROM users WHERE username=? AND password=? AND role=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, role);
            
            ResultSet rs = pst.executeQuery();

            if(rs.next()) {
            JOptionPane.showMessageDialog(this, "Login Successful as " + role);

            if(role.equals("Admin")) {
                new Admin().setVisible(true);
            } else if(role.equals("Doctor")) {
                new Doctor().setVisible(true);
            } 
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials or role!");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        WelcomePage WelcomeFrame = new WelcomePage();
        WelcomeFrame.setVisible(true);
        WelcomeFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void loginRoleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRoleComboActionPerformed
        
    }//GEN-LAST:event_loginRoleComboActionPerformed

    private void loginPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPassFieldActionPerformed
        
    }//GEN-LAST:event_loginPassFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField loginEmailField;
    private javax.swing.JLabel loginEmailLabel;
    private javax.swing.JPasswordField loginPassField;
    private javax.swing.JLabel loginPassLabel;
    private javax.swing.JComboBox<String> loginRoleCombo;
    private javax.swing.JLabel loginRoleLabel;
    private javax.swing.JTextField loginUserField;
    private javax.swing.JLabel loginUserLabel;
    // End of variables declaration//GEN-END:variables
}
