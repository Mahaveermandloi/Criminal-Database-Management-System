package CDBMS;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;

public class Login_page {

    JFrame frmCriminalDatabaseManagement;
    private JTextField textField;
    private JTextField textField_1;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/new_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";
    private JLabel lblAdminLogin;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login_page window = new Login_page();
                    window.frmCriminalDatabaseManagement.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Login_page() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    void initialize() {
        frmCriminalDatabaseManagement = new JFrame();
        frmCriminalDatabaseManagement.getContentPane().setBackground(new Color(0, 0, 51));
        frmCriminalDatabaseManagement.setTitle("Criminal Database Management System");
        frmCriminalDatabaseManagement.setBounds(100, 100, 644, 446);
        frmCriminalDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCriminalDatabaseManagement.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(250, 127, 243, 37);
        frmCriminalDatabaseManagement.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Enter Admin ID");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 24));
        lblNewLabel.setBounds(30, 127, 213, 37);
        frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel);

        JLabel lblEnterPassword = new JLabel("Enter Password");
        lblEnterPassword.setForeground(new Color(255, 255, 255));
        lblEnterPassword.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
        lblEnterPassword.setBounds(30, 243, 213, 37);
        frmCriminalDatabaseManagement.getContentPane().add(lblEnterPassword);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(250, 243, 243, 37);
        frmCriminalDatabaseManagement.getContentPane().add(textField_1);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.setForeground(new Color(255, 0, 0));
        btnNewButton.setBackground(new Color(0, 0, 51));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
       
        btnNewButton.addActionListener(new ActionListener() {
            private Object frame;
			private Window frmLoginPage;
			public void actionPerformed(ActionEvent e) {
			    String id = textField.getText();
			    String password = textField_1.getText();

			    if (authenticate(id, password)) {
			        JOptionPane.showMessageDialog(null, "Login successful", "Login Status", JOptionPane.INFORMATION_MESSAGE);
			        Main_page mainPage = new Main_page();
			        mainPage.initialize();
			        ((Window) mainPage.frmMainPage).setVisible(true);
			        frmCriminalDatabaseManagement.setVisible(false); // hide the Login_page frame
			    } else {
			        JOptionPane.showMessageDialog(null, "Invalid credentials", "Login Error", JOptionPane.ERROR_MESSAGE);
			    }
			}


        });
        
        
        btnNewButton.setBounds(200, 331, 183, 50);
        frmCriminalDatabaseManagement.getContentPane().add(btnNewButton);
        
        lblAdminLogin = new JLabel("Admin Login");
        lblAdminLogin.setForeground(new Color(255, 255, 255));
        lblAdminLogin.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblAdminLogin.setBounds(186, 11, 183, 37);
        frmCriminalDatabaseManagement.getContentPane().add(lblAdminLogin);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 59, 608, 2);
        frmCriminalDatabaseManagement.getContentPane().add(separator);
    }

    private boolean authenticate(String id, String password) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db"
, "root","1234");
            String query = "SELECT * FROM admin_details WHERE id = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, id);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
