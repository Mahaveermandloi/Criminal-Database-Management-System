package CDBMS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;

public class Main_page {

	JFrame frmMainPage;
//	protected Object frmCriminalDatabaseManagement;
	JFrame frmCriminalDatabaseManagement;
	protected Object frame;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_page window = new Main_page();
					window.frmMainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void initialize() {
		frmMainPage = new JFrame();
		frmMainPage.setBackground(new Color(0, 0, 102));
		frmMainPage.getContentPane().setBackground(new Color(0, 0, 102));
		frmMainPage.getContentPane().setForeground(new Color(0, 0, 51));
		frmMainPage.setTitle("Main Page");
		frmMainPage.setBounds(100, 100, 737, 513);
		frmMainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Criminal Database Management System");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(119, 16, 450, 36);
		frmMainPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 63, 671, 2);
		frmMainPage.getContentPane().add(separator);
		
		JButton add_details = new JButton("Add Details");
		add_details.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add_details.setBounds(66, 152, 189, 44);
		frmMainPage.getContentPane().add(add_details);
		
		JButton search_details = new JButton("Search Details");
		search_details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		
				    	
				        // Create an instance of the Add_details class
				        Search_details searchDetails = new Search_details();
				        
				        
//				        Main_page mainPage = new Main_page();
				        searchDetails.initialize();
				        ((Window) searchDetails.frmCriminalDatabaseManagement).setVisible(true);
				        frmMainPage.setVisible(false); 
				        
				    }
				    
				
			
		});
		search_details.setFont(new Font("Tahoma", Font.PLAIN, 20));
		search_details.setBounds(66, 235, 189, 44);
		frmMainPage.getContentPane().add(search_details);
		
		JButton delete_details = new JButton("Delete Record");
		delete_details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   
				Delete_details deleteDetails = new Delete_details();
			        
			        
//			        Main_page mainPage = new Main_page();
			        deleteDetails.initialize();
			        ((Window) deleteDetails.frmCriminalDatabaseManagement).setVisible(true);
			        frmMainPage.setVisible(false); 
			        
			}
		});
		
		delete_details.setFont(new Font("Tahoma", Font.PLAIN, 20));
		delete_details.setBounds(66, 320, 189, 44);
		frmMainPage.getContentPane().add(delete_details);
		
		
		
		JButton view_all_records = new JButton("View all records");
		view_all_records.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	
     Show_all_details show_all_Details = new Show_all_details();
		        
		        
//		        Main_page mainPage = new Main_page();
		        show_all_Details.initialize();
		        ((Window) show_all_Details.frmCriminalDatabaseManagement).setVisible(true);
		        frmMainPage.setVisible(false); 
		        
		        
		    }
		});

		view_all_records.setFont(new Font("Tahoma", Font.PLAIN, 20));
		view_all_records.setBounds(407, 152, 189, 44);
		frmMainPage.getContentPane().add(view_all_records);
		
		JButton update_record = new JButton("Update records");
		update_record.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
      Check_page checkPage  = new Check_page();
		        
		        
//		        Main_page mainPage = new Main_page();
		        checkPage.initialize();
		        ((Window) checkPage.frmCriminalDatabaseManagement).setVisible(true);
		        frmMainPage.setVisible(false);
			}
		});
		update_record.setFont(new Font("Tahoma", Font.PLAIN, 20));
		update_record.setBounds(407, 235, 189, 44);
		frmMainPage.getContentPane().add(update_record);
		
		JButton logout = new JButton("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    // Create an instance of the Add_details class
		        Login_page loginpage = new Login_page();
		        
		        
//		        Main_page mainPage = new Main_page();
		        loginpage.initialize();
		        ((Window) loginpage.frmCriminalDatabaseManagement).setVisible(true);
		        frmMainPage.setVisible(false); 
		    
			}
		});
		logout.setForeground(Color.RED);
		logout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		logout.setBounds(407, 320, 189, 44);
		frmMainPage.getContentPane().add(logout);
	 
		
		add_details.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		   
		    	
		        // Create an instance of the Add_details class
		        Add_details addDetails = new Add_details();
		        
		        
//		        Main_page mainPage = new Main_page();
		        addDetails.initialize();
		        ((Window) addDetails.frmCriminalDatabaseManagement).setVisible(true);
		        frmMainPage.setVisible(false); 
		        
		    }
		    
		    
		    
		        
		    
		});

		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
