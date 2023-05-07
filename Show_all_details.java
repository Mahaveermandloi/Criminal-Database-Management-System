
package CDBMS;
 import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.Font;
import java.awt.Color;

public class Show_all_details extends JFrame {
    private JTable table;
	protected Window frmCriminalDatabaseManagement;
    
    public Show_all_details() {
        super("Database Viewer");
        getContentPane().setBackground(new Color(0, 0, 51));
        
        // Create the table model
        DefaultTableModel model = new DefaultTableModel();
        getContentPane().setLayout(null);
        table = new JTable(model);
        
        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(200, 10, 900, 150);
        getContentPane().add(scrollPane);
        
      
        JLabel lblNewLabel = new JLabel("New label");
        scrollPane.setColumnHeaderView(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        scrollPane.setColumnHeaderView(lblNewLabel_1);
        
        JButton btnNewButton = new JButton(" Go Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    // Add a "Go back" button
        	 
        		 Main_page mainPage = new Main_page();
			        mainPage.initialize();
			        ((Window) mainPage.frmMainPage).setVisible(true);
			        frmCriminalDatabaseManagement.setVisible(false);
			        
        	        }
        	    });
        	
      
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(10, 10, 136, 52);
        getContentPane().add(btnNewButton);
        
        // Connect to the database and get the data
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_db", "root", "1234");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accused_details");
            
            // Add the data to the table model
            ResultSetMetaData meta = rs.getMetaData();
            int numCols = meta.getColumnCount();
            for (int i = 1; i <= numCols; i++) {
                model.addColumn(meta.getColumnName(i));
            }
            while (rs.next()) {
                Object[] rowData = new Object[numCols];
                for (int i = 1; i <= numCols; i++) {
                    rowData[i-1] = rs.getObject(i);
                }
                model.addRow(rowData);
            }
            
            // Close the database connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error getting data from database: " + ex.getMessage());
        }
        
        // Set the size and show the frame
        setSize(1128, 247);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Show_all_details();
    }

	public void initialize() {
		// TODO Auto-generated method stub
		
	}
}