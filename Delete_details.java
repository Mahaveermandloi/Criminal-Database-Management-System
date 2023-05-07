package CDBMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Delete_details {

	JFrame frmCriminalDatabaseManagement;
	private JTextField delete_name;
	private JTextField delete_id;
	private JTextField delete_nic;
	private JTextField delete_fingerprint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_details window = new Delete_details();
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
	public Delete_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmCriminalDatabaseManagement = new JFrame();
		frmCriminalDatabaseManagement.getContentPane().setBackground(new Color(0, 0, 51));
		frmCriminalDatabaseManagement.setTitle("Criminal Database Management System");
		frmCriminalDatabaseManagement.setBounds(100, 100, 653, 464);
		frmCriminalDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCriminalDatabaseManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Record");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 26));
		lblNewLabel.setBounds(250, 11, 174, 47);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 51, 617, 2);
		frmCriminalDatabaseManagement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(44, 81, 131, 42);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1);
		
		delete_name = new JTextField();
		delete_name.setBounds(239, 87, 208, 28);
		frmCriminalDatabaseManagement.getContentPane().add(delete_name);
		delete_name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter ID:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(44, 134, 131, 42);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1);
		
		delete_id = new JTextField();
		delete_id.setColumns(10);
		delete_id.setBounds(239, 136, 208, 28);
		frmCriminalDatabaseManagement.getContentPane().add(delete_id);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter NIC:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(44, 180, 131, 42);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1);
		
		delete_nic = new JTextField();
		delete_nic.setColumns(10);
		delete_nic.setBounds(239, 185, 208, 28);
		frmCriminalDatabaseManagement.getContentPane().add(delete_nic);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Enter Fingerprint :");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(44, 227, 161, 42);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1_1);
		
		delete_fingerprint = new JTextField();
		delete_fingerprint.setColumns(10);
		delete_fingerprint.setBounds(239, 234, 208, 28);
		frmCriminalDatabaseManagement.getContentPane().add(delete_fingerprint);
		
	 
		
		
		
		JButton btnNewButton = new JButton("Go back");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Main_page mainPage = new Main_page();
			        mainPage.initialize();
			        ((Window) mainPage.frmMainPage).setVisible(true);
			        frmCriminalDatabaseManagement.setVisible(false);
			}
		});
		btnNewButton.setBounds(61, 302, 208, 47);
		frmCriminalDatabaseManagement.getContentPane().add(btnNewButton);
		
		JButton delete_record_ = new JButton("Delete record");
		delete_record_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = delete_name.getText();
		        String id = delete_id.getText();
		        String nic = delete_nic.getText();
		        String fingerprint = delete_fingerprint.getText();
				if(name.equals("") || id.equals("") || nic.equals("") || fingerprint.equals("")) {
				    JOptionPane.showMessageDialog(null, "Please fill all the fields");
				} 
				else {
			

		        // Connect to the database and execute the delete statement
		        try {
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db", "root", "1234");
		            PreparedStatement pstmt = conn.prepareStatement("DELETE FROM accused_details WHERE accused_name=? AND accused_id=? AND nic=? AND fingerprint=?");
		            pstmt.setString(1, name);
		            pstmt.setString(2, id);
		            pstmt.setString(3, nic);
		            pstmt.setString(4, fingerprint);
		            pstmt.executeUpdate();
		            conn.close();
		            JOptionPane.showMessageDialog(null, "Record deleted successfully!");
		            
		            Main_page mainPage = new Main_page();
		            mainPage.setVisible(true);
		            dispose();
		        } catch (SQLException ex) {
		            JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage());
		        }
				
			}}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		
		delete_record_.setFont(new Font("Tahoma", Font.PLAIN, 23));
		delete_record_.setBounds(347, 302, 208, 47);
		frmCriminalDatabaseManagement.getContentPane().add(delete_record_);
		 
			
		
	
	}
	
}
