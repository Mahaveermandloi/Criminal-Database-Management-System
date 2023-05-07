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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Check_page {
	
    public static JLabel accused_id;
    
//	protected static Object accused_id;
	JFrame frmCriminalDatabaseManagement;
	private JTextField verify_name;
	private JTextField verify_id;
	private JTextField verify_fingerprint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_page window = new Check_page();
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
	public Check_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmCriminalDatabaseManagement = new JFrame();
		frmCriminalDatabaseManagement.getContentPane().setBackground(new Color(0, 0, 51));
		frmCriminalDatabaseManagement.setTitle("Criminal Database Management System");
		frmCriminalDatabaseManagement.setBounds(100, 100, 650, 435);
		frmCriminalDatabaseManagement.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCriminalDatabaseManagement.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Verify ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setBounds(259, 11, 86, 49);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 59, 614, 2);
		frmCriminalDatabaseManagement.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(98, 98, 129, 30);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1);
		
		verify_name = new JTextField();
		verify_name.setBounds(364, 97, 145, 30);
		frmCriminalDatabaseManagement.getContentPane().add(verify_name);
		verify_name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter ID");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(98, 161, 129, 30);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1);
		
		verify_id = new JTextField();
		verify_id.setColumns(10);
		verify_id.setBounds(364, 161, 145, 30);
		frmCriminalDatabaseManagement.getContentPane().add(verify_id);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Enter fingerprint ");
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(98, 229, 168, 30);
		frmCriminalDatabaseManagement.getContentPane().add(lblNewLabel_1_1_1);
		
		verify_fingerprint = new JTextField();
		verify_fingerprint.setColumns(10);
		verify_fingerprint.setBounds(364, 229, 145, 30);
		frmCriminalDatabaseManagement.getContentPane().add(verify_fingerprint);
		
		
		
		
		JButton btnNewButton = new JButton("Verify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = verify_name.getText().trim();
				String id = verify_id.getText().trim();
				String fingerprint = verify_fingerprint.getText().trim();

				// Check if any of the text fields are empty
				if (name.isEmpty() || id.isEmpty() || fingerprint.isEmpty()) {
				    JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Please enter values for all fields.");
				    return;
				}
				 try {
					 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db", "root", "1234");
			            String query = "SELECT * FROM accused_details WHERE accused_name = ? AND accused_id = ? AND fingerprint = ?";
			            PreparedStatement stmt = conn.prepareStatement(query);
			            stmt.setString(1, name);
			            stmt.setString(2, id);
			            stmt.setString(3, fingerprint);
			            ResultSet rs = stmt.executeQuery();

			           
//			                
//					        Update mainPage = new Main_page();
//					        show_all_Details.initialize();
//					        ((Window) show_all_Details.frmCriminalDatabaseManagement).setVisible(true);
//					        frmMainPage.setVisible(false); 
//					        
			            	 if (rs.next()) {
			                     Update_details updatePage = new Update_details();
			                     updatePage.initialize();
			                     ((Window) updatePage.frmCriminalDatabaseManagement).setVisible(true);
			                     frmCriminalDatabaseManagement.setVisible(false);
			                 
					        
			            	
			            } 
				 else {
			                JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "No match found.");
			            }

			            rs.close();
			            stmt.close();
			            conn.close();
			        } catch (SQLException ex) {
			            JOptionPane.showMessageDialog(frmCriminalDatabaseManagement, "Error: " + ex.getMessage());
			        }
			    }
			});
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton.setBounds(364, 313, 145, 43);
		frmCriminalDatabaseManagement.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Go back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  {
					
					  Main_page mainPage = new Main_page();
				        mainPage.initialize();
				        ((Window) mainPage.frmMainPage).setVisible(true);
				        frmCriminalDatabaseManagement.setVisible(false);
				        
					
				}
		
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnNewButton_1.setBounds(98, 313, 177, 43);
		frmCriminalDatabaseManagement.getContentPane().add(btnNewButton_1);
	}
}
