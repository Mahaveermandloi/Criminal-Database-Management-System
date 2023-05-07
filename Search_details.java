 package CDBMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Search_details {

	JFrame frmCriminalDatabaseManagement;
	private JTextField search_name;
	private JTextField search_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_details window = new Search_details();
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
	public Search_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmCriminalDatabaseManagement = new JFrame();
		frmCriminalDatabaseManagement.getContentPane().setBackground(new Color(0, 0, 51));
		frmCriminalDatabaseManagement.setTitle("Criminal Database Management System");
		frmCriminalDatabaseManagement.setBounds(100, 100, 969, 641);
		frmCriminalDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCriminalDatabaseManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Details");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setBounds(313, 11, 188, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 57, 912, 2);
		frmCriminalDatabaseManagement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(20, 210, 148, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1);
		
		search_name = new JTextField();
		search_name.setBounds(209, 220, 210, 27);
		frmCriminalDatabaseManagement.getContentPane().add(search_name);
		search_name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter ID");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(20, 298, 148, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1);
		
		search_id = new JTextField();
		search_id.setColumns(10);
		search_id.setBounds(209, 308, 210, 27);
		frmCriminalDatabaseManagement.getContentPane().add(search_id);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnNewButton.setBounds(240, 383, 174, 57);
		frmCriminalDatabaseManagement.getContentPane().add(btnNewButton);
		
		JButton go_back = new JButton("Go Back ");
		go_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Main_page mainPage = new Main_page();
			        mainPage.initialize();
			        ((Window) mainPage.frmMainPage).setVisible(true);
			        frmCriminalDatabaseManagement.setVisible(false);
			        
			}
		});
		go_back.setFont(new Font("Tahoma", Font.PLAIN, 21));
		go_back.setBounds(10, 385, 174, 57);
		frmCriminalDatabaseManagement.getContentPane().add(go_back);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(491, 73, 88, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2);
		
		JLabel show_address = new JLabel("?");
		show_address.setForeground(new Color(255, 255, 255));
		show_address.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_address.setBounds(618, 169, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_address);
		
		JLabel lblNewLabel_2_1 = new JLabel("ID");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(491, 125, 88, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1);
		
		JLabel show_id = new JLabel("?");
		show_id.setForeground(new Color(255, 255, 255));
		show_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_id.setBounds(618, 125, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_id);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Address");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(491, 171, 88, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel show_name = new JLabel("?");
		show_name.setForeground(new Color(255, 255, 255));
		show_name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_name.setBounds(618, 75, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_name);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("NIC");
		lblNewLabel_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(491, 213, 88, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel show_nic = new JLabel("?");
		show_nic.setForeground(new Color(255, 255, 255));
		show_nic.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_nic.setBounds(618, 215, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_nic);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1.setBounds(491, 259, 88, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JLabel show_gender = new JLabel("?");
		show_gender.setForeground(new Color(255, 255, 255));
		show_gender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_gender.setBounds(618, 259, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_gender);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Age");
		lblNewLabel_2_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1_1.setBounds(491, 305, 88, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel show_age = new JLabel("?");
		show_age.setForeground(new Color(255, 255, 255));
		show_age.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_age.setBounds(618, 303, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_age);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Marital Status");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(491, 351, 107, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel show_status = new JLabel("?");
		show_status.setForeground(new Color(255, 255, 255));
		show_status.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_status.setBounds(618, 353, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_status);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Contact");
		lblNewLabel_2_1_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(491, 397, 107, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel show_contact = new JLabel("?");
		show_contact.setForeground(new Color(255, 255, 255));
		show_contact.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_contact.setBounds(618, 397, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_contact);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("Email");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(491, 443, 107, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JLabel show_email = new JLabel("?");
		show_email.setForeground(new Color(255, 255, 255));
		show_email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_email.setBounds(618, 445, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_email);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1 = new JLabel("Fingerprint ");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setBounds(491, 489, 107, 35);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_2_1_1_1_1_1_1_1_1_1);
		
		JLabel show_fingerprint = new JLabel("?");
		show_fingerprint.setForeground(new Color(255, 255, 255));
		show_fingerprint.setFont(new Font("Tahoma", Font.PLAIN, 16));
		show_fingerprint.setBounds(618, 491, 280, 33);
		frmCriminalDatabaseManagement.getContentPane().add(show_fingerprint);
		
	 
				 
		 
		
		String name = search_name.getText();
		String id = search_id.getText();

		 
		
		boolean matchFound = false;
	
	
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String name = search_name.getText();
		        String id = search_id.getText();

		        boolean matchFound = false;

		        try {
		            // 1. Load the JDBC driver
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            // 2. Establish a connection to the database
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db", "root", "1234");

		            // 3. Create a statement object
		            Statement statement = connection.createStatement();

		            // 4. Execute a SQL query to search for the name and ID in the database
		            String sql = "SELECT * FROM accused_details WHERE accused_name='" + name + "' AND accused_id='" + id + "'";
		            ResultSet resultSet = statement.executeQuery(sql);

		            // 5. Check if any results were returned
		            if (resultSet.next()) {
		                matchFound = true;
		                String s_name = resultSet.getString("accused_name");
		                show_name.setText(s_name);
		                
		                String s_id = resultSet.getString("accused_id");
		                show_id.setText(s_id);
		                
		              
		                String nic = resultSet.getString("NIC");
		                show_nic.setText(nic);

		                String address = resultSet.getString("Address");
		                show_address.setText(address);

		                String gender = resultSet.getString("Gender");
		                show_gender.setText(gender);

		                int age = resultSet.getInt("Age");
		                show_age.setText(String.valueOf(age));

		                String maritalStatus = resultSet.getString("Status");
		                show_status.setText(maritalStatus);

		                String contact = resultSet.getString("Contact");
		                show_contact.setText(contact);

		                String email = resultSet.getString("Email");
		                show_email.setText(email);

		                String fingerprint = resultSet.getString("Fingerprint");
		                show_fingerprint.setText(fingerprint);

		            }


		            // 6. Close the result set, statement, and connection
		            resultSet.close();
		            statement.close();
		            connection.close();
		        }
		        catch (ClassNotFoundException | SQLException ex) {
		            ex.printStackTrace();
		        }

		        // 7. Show an appropriate message based on whether a match was found
		        if (matchFound) {
		            JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Details match.");
		            
		            
		        } else {
		            JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "No such data exists.");
		        }
		    }
		});
		
		
		
	}	
}

