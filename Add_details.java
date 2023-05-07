package CDBMS;

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

public class  Add_details {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_details window = new Add_details();
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
	public Add_details() {
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
		
		JLabel lblNewLabel = new JLabel("Add Details");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(277, 11, 164, 36);
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
		unmarried.setBounds(308, 369, 75, 23);
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
		
		JButton btnNewButton_1 = new JButton("Go Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  Main_page mainPage = new Main_page();
			        mainPage.initialize();
			        ((Window) mainPage.frmMainPage).setVisible(true);
			        frmCriminalDatabaseManagement.setVisible(false);
			        
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton_1.setBounds(518, 395, 184, 48);
		frmCriminalDatabaseManagement.getContentPane().add(btnNewButton_1);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            // Get the values entered by the user
		            String accusedName = accused_name.getText();
		            String accusedID = accused_id.getText();
		            String addressValue = address.getText();
		            String nicValue = nic.getText();
		            String gender = "";
		            if (male.isSelected()) {
		                gender = "Male";
		            } else if (female.isSelected()) {
		                gender = "Female";
		            }
		            String ageValue = age.getText();
		            String maritalStatus = "";
		            if (married.isSelected()) {
		                maritalStatus = "Married";
		            } else if (unmarried.isSelected()) {
		                maritalStatus = "Unmarried";
		            }
		            String contactValue = contact.getText();
		            String emailValue = email.getText();

		            String fingerprintValue = fingerprint.getText();

		            // Create a connection to the database
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db", "root", "1234");

		            // Create a prepared statement for inserting data into the table
		            PreparedStatement stmt = conn.prepareStatement("INSERT INTO accused_details (accused_name, accused_id, address, nic, gender, age, status, contact, email,fingerprint) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
		            stmt.setString(1, accusedName);
		            stmt.setString(2, accusedID);
		            stmt.setString(3, addressValue);
		            stmt.setString(4, nicValue);
		           
		            
		            if (male.isSelected() && female.isSelected()) {
		                JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Invalid Gender");
		                return;
		            } else if (male.isSelected()) {
		                stmt.setString(5, "Male");
		            } else {
		                stmt.setString(5, "Female");
		            }
		            
		            
		           
		            stmt.setString(6, ageValue);
		            
		            if (married.isSelected() && unmarried.isSelected()) {
		                JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Invalid Marital Status");
		                return;
		            } else if (married.isSelected()) {
		                stmt.setString(7, "Married");
		            } else {
		                stmt.setString(7, "Unmarried");
		            }
		            
		            stmt.setString(8, contactValue);
		            stmt.setString(9, emailValue);
		            
		            stmt.setString(10, fingerprintValue);
		            
		            // Execute the statement to insert the data
		            

		          stmt.executeUpdate();

		         
		          stmt.close();
		            conn.close();

		            // Display a success message
		            JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Accused details added successfully!");
		        } catch (Exception ex) {
		            // Display an error message if there is an exception
		            JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Error: " + ex.getMessage());
		        }
		    }
		});

		       
	 
		
	}


	
}
