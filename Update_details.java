 package CDBMS;
 
 import CDBMS.Check_page;
 
 
 
import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;

public class  Update_details {

	JFrame frmCriminalDatabaseManagement;
	
	protected Window frmAddDetails;
	private JTextField accused_name;
	private JTextField accused_id;
	private JTextField address;
	private JTextField nic;
	private JTextField age;
	private JTextField contact;
	private JTextField email;
	private JTextField fingerprint;

	protected Window frmMainPage;

	protected Object frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_details window = new Update_details();
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
	public Update_details() {
		initialize();
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmCriminalDatabaseManagement = new JFrame();
		frmCriminalDatabaseManagement.getContentPane().setBackground(new Color(0, 0, 51));
		frmCriminalDatabaseManagement.getContentPane().setForeground(new Color(0, 0, 51));
		frmCriminalDatabaseManagement.setTitle("Criminal Database Management System");
		frmCriminalDatabaseManagement.setBounds(100, 100, 744, 497);
		frmCriminalDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCriminalDatabaseManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Details");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(262, 11, 253, 36);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 58, 693, 2);
		frmCriminalDatabaseManagement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter accused name ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(25, 78, 184, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1);
		
		accused_name = new JTextField();
		accused_name.setBounds(219, 81, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(accused_name);
		accused_name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter accused ID");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(25, 130, 158, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1);
		
		accused_id = new JTextField();
		accused_id.setColumns(10);
		accused_id.setBounds(219, 133, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(accused_id);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter Address");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(25, 179, 158, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(219, 182, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(address);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("NIC");
		lblNewLabel_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(25, 228, 158, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1_1);
		
		nic = new JTextField();
		nic.setColumns(10);
		nic.setBounds(219, 231, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(nic);
		
		JLabel Gender_label = new JLabel("Gender");
		Gender_label.setForeground(new Color(255, 255, 255));
		Gender_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Gender_label.setBounds(25, 276, 92, 28);
		frmCriminalDatabaseManagement.getContentPane().add(Gender_label);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(219, 282, 56, 23);
		frmCriminalDatabaseManagement.getContentPane().add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(308, 282, 70, 23);
		frmCriminalDatabaseManagement.getContentPane().add(female);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Age");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(25, 315, 158, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBounds(219, 318, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(age);
		
		JLabel Gender_label_1 = new JLabel("Status");
		Gender_label_1.setForeground(new Color(255, 255, 255));
		Gender_label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Gender_label_1.setBounds(25, 363, 92, 28);
		frmCriminalDatabaseManagement.getContentPane().add(Gender_label_1);
		
		JRadioButton married = new JRadioButton("Married");
		married.setBounds(219, 369, 70, 23);
		frmCriminalDatabaseManagement.getContentPane().add(married);
		
		JRadioButton unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(308, 369, 92, 23);
		frmCriminalDatabaseManagement.getContentPane().add(unmarried);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Contact");
		lblNewLabel_1_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2.setBounds(25, 402, 158, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		contact = new JTextField();
		contact.setColumns(10);
		contact.setBounds(219, 409, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(contact);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1.setBounds(431, 78, 84, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1_1_2_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(557, 81, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(email);
		
		JLabel lblNewLabel_1_1_1_1_2_1_1 = new JLabel("Fingerprint");
		lblNewLabel_1_1_1_1_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_2_1_1.setBounds(431, 140, 92, 28);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1_1_2_1_1);
		
		fingerprint = new JTextField();
		fingerprint.setColumns(10);
		fingerprint.setBounds(557, 137, 145, 28);
		frmCriminalDatabaseManagement.getContentPane().add(fingerprint);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.setBounds(518, 315, 184, 49);
		frmCriminalDatabaseManagement.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--- Go Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  Main_page mainPage = new Main_page();
			        mainPage.initialize();
			        ((Window) mainPage.frmMainPage).setVisible(true);
			        frmCriminalDatabaseManagement.setVisible(false);
			        
				
			}
		});
		
		
		
		String accusedName = accused_name.getText();
		String accusedID = accused_id.getText();
		String addressValue = address.getText();
		String nicValue = nic.getText();
		String ageValue = age.getText();
		String contactValue = contact.getText();
		String emailValue = email.getText();
		String fingerprintValue = fingerprint.getText();
		
		
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_1.setBounds(518, 395, 184, 48);
		frmCriminalDatabaseManagement.getContentPane().add(btnNewButton_1);
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
		    	{try {
		    	    // Create a connection to the database
		    	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db", "root", "1234");

		    	    // Create the SQL update statement with placeholders for the values to be updated
		    	    String sql = "UPDATE accused_details SET name=?, address=?, nic=?, gender=?, age=?, contact=?, email=?, fingerprint=? WHERE id=?";

		    	    // Create a prepared statement object and set the values for the placeholders using the user input
		    	    PreparedStatement pstmt = conn.prepareStatement(sql);
		    	    pstmt.setString(1, accused_name.getText());
		    	    pstmt.setString(2, address.getText());
		    	    pstmt.setString(3, nic.getText());
		    	    pstmt.setString(4, male.isSelected() ? "Male" : "Female");
		    	    pstmt.setString(5, age.getText());
		    	    pstmt.setString(6, contact.getText());
		    	    pstmt.setString(7, email.getText());
		    	    pstmt.setString(8, fingerprint.getText());
//		    	    pstmt.setString(9, accused_id.getText());
		    	    JLabel accused_id = (JLabel) Check_page.accused_id;
		    	    pstmt.setString(9, accused_id.getText());
//
//		    	    pstmt.setString(9, Check_page.accused_id.getText());
		    	    // Execute the update statement
		    	    int rowsAffected = pstmt.executeUpdate();

		    	    // Check the number of rows affected by the update
		    	    if (rowsAffected > 0) {
		    	        JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Details updated successfully");
		    	    } else {
		    	        JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Failed to update details");
		    	    }

		    	    // Close the prepared statement and connection objects
		    	    pstmt.close();
		    	    conn.close();

		    	}
		    	
		    	
		    	catch (SQLException ex) {
		    	    JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Error: " + ex.getMessage());
		    	}}}
		    	
		});
		
		
	}}
	


		