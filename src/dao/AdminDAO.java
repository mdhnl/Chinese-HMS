package dao;

import java.sql.*;
import database.DBConnection;
import javax.swing.JOptionPane;
import model.AdminDTO;



public class AdminDAO {

    public static void saveAllUsers(AdminDTO user) {
        if (user.getFirstname() == null || user.getFirstname().isEmpty()) {
        return;
        }
        
        String sql = "INSERT INTO adminusers (firstname, lastname, email, role) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getInstance().getDBConnection();
            PreparedStatement pst = conn.prepareStatement(sql)) {
            
            pst.setString(1, user.getFirstname());
            pst.setString(2, user.getLastname());
            pst.setString(3, user.getEmail());
            pst.setString(4, user.getRole());
            
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data has been saved!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    /*
    public static void listUserData(AdminDTO user) {
        
        String sql = "INSERT INTO adminusers (firstname, lastname, email, role) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = DBConnection.getInstance().getDBConnection();
            PreparedStatement pst = conn.prepareStatement("SELECT* FROM adminusers");
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel tableModel = (DefaultModel)adminUserTable.getModel();
            tableModel.setRowCount(0);
            while(rs.next()) {
                Object 
            }
        }
        }
    }
    */
}