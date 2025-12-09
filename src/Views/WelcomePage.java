package Views;




import Views.SignupPage;


public class WelcomePage extends javax.swing.JFrame {
    public WelcomePage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        signup = new javax.swing.JButton();
        login = new javax.swing.JButton();
        healthservice = new javax.swing.JLabel();
        PatientRegistration = new javax.swing.JLabel();
        OurDoctors = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 91, 169));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 50));

        signup.setBackground(new java.awt.Color(255, 0, 51));
        signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(255, 0, 51));
        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Log in");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        healthservice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        healthservice.setForeground(new java.awt.Color(255, 255, 255));
        healthservice.setText("Health Services");
        healthservice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                healthserviceMouseClicked(evt);
            }
        });

        PatientRegistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PatientRegistration.setForeground(new java.awt.Color(255, 255, 255));
        PatientRegistration.setText("Patient Registration");
        PatientRegistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientRegistrationMouseClicked(evt);
            }
        });

        OurDoctors.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OurDoctors.setForeground(new java.awt.Color(255, 255, 255));
        OurDoctors.setText("Our Doctors");
        OurDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OurDoctorsMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(healthservice)
                .addGap(18, 18, 18)
                .addComponent(PatientRegistration)
                .addGap(18, 18, 18)
                .addComponent(OurDoctors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 778, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(18, 18, 18)
                .addComponent(signup)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup)
                    .addComponent(login)
                    .addComponent(healthservice)
                    .addComponent(PatientRegistration)
                    .addComponent(OurDoctors)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/main.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1440, 900));
        jScrollPane1.setViewportView(jLabel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        LoginPage LoginFrame = new LoginPage();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        SignupPage SignUpFrame = new SignupPage();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signupActionPerformed

    private void healthserviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_healthserviceMouseClicked
        HealthService HealthServiceFrame = new HealthService();
        HealthServiceFrame.setVisible(true);
        HealthServiceFrame.pack();
        HealthServiceFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_healthserviceMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PatientRegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientRegistrationMouseClicked
        PatientReg PatientRegFrame = new PatientReg();
        PatientRegFrame.setVisible(true);
        PatientRegFrame.pack();
        PatientRegFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_PatientRegistrationMouseClicked

    private void OurDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OurDoctorsMouseClicked
        OurDoctors OurDoctorsFrame = new OurDoctors();
        OurDoctorsFrame.setVisible(true);
        OurDoctorsFrame.pack();
        OurDoctorsFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_OurDoctorsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new WelcomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OurDoctors;
    private javax.swing.JLabel PatientRegistration;
    private javax.swing.JLabel healthservice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton login;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
