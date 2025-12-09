package Views;

import Database.DBConnection;
import javax.swing.JOptionPane;
import java.sql.*;

public class SignupPage extends javax.swing.JFrame {

    public SignupPage() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signupUserField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signupEmailField = new javax.swing.JTextField();
        signUpBtn = new javax.swing.JButton();
        loginBackBtn = new javax.swing.JButton();
        signupPassField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        signupRoleCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/CGHMC_Logo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME TO CHINESE ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOSPITAL AND MEDICAL CENTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 430, 500);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("USERNAME:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 230, 90, 17);

        signupUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupUserFieldActionPerformed(evt);
            }
        });
        jPanel1.add(signupUserField);
        signupUserField.setBounds(450, 250, 320, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ROLE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 100, 90, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("EMAIL:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 170, 80, 17);

        signupEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupEmailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(signupEmailField);
        signupEmailField.setBounds(450, 190, 320, 30);

        signUpBtn.setBackground(new java.awt.Color(255, 0, 51));
        signUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        signUpBtn.setText("Sign Up");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signUpBtn);
        signUpBtn.setBounds(570, 350, 80, 30);

        loginBackBtn.setBackground(new java.awt.Color(0, 0, 102));
        loginBackBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        loginBackBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBackBtn.setText("Log In");
        loginBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBackBtn);
        loginBackBtn.setBounds(630, 410, 72, 23);

        signupPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupPassFieldActionPerformed(evt);
            }
        });
        jPanel1.add(signupPassField);
        signupPassField.setBounds(450, 310, 320, 30);

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Already have an account?");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(630, 390, 140, 20);

        signupRoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Doctor", "Receptionist" }));
        jPanel1.add(signupRoleCombo);
        signupRoleCombo.setBounds(450, 120, 320, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("PASSWORD:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(450, 290, 90, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("SignUp");
        jPanel1.getAccessibleContext().setAccessibleDescription("SignUp");

        getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        String role = (String) signupRoleCombo.getSelectedItem();
        String email = signupEmailField.getText().trim();
        String username = signupUserField.getText().trim();
        String password  = new String(signupPassField.getPassword());
        
        if (role.equals("Select") || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields and select a valid role.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            Connection conn = DBConnection.getInstance().getDBConnection();
            String sql = "INSERT INTO users (role, email, username, password) VALUES (?, ?, ?, ?)";
            var stmt = conn.prepareStatement(sql);
            stmt.setString(1, role);
            stmt.setString(2, email);
            stmt.setString(3, username);
            stmt.setString(4, password);
            
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Signup successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Signup failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            System.getLogger(SignupPage.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void signupPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupPassFieldActionPerformed
        
    }//GEN-LAST:event_signupPassFieldActionPerformed

    private void signupUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupUserFieldActionPerformed
        
    }//GEN-LAST:event_signupUserFieldActionPerformed

    private void signupEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupEmailFieldActionPerformed
        
    }//GEN-LAST:event_signupEmailFieldActionPerformed

    private void loginBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBackBtnActionPerformed
        LoginPage LoginFrame = new LoginPage();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loginBackBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new SignupPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBackBtn;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JTextField signupEmailField;
    private javax.swing.JPasswordField signupPassField;
    private javax.swing.JComboBox<String> signupRoleCombo;
    private javax.swing.JTextField signupUserField;
    // End of variables declaration//GEN-END:variables
}
