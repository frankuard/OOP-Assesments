package week10;

import java.awt.CardLayout;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class userInput extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	CardLayout cardLayout;
	JPanel mainPanel;
	
	JTextField firstNameField, lastNameField, addressField,contactField, semesterField;
	
	JTable table;
	DefaultTableModel model;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userInput frame = new userInput();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public userInput() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Student Management System");
		setSize(700,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);
		
		
		// INPUT PANEL
		
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(7,2,10,10));
		
		JLabel label = new JLabel("First Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		inputPanel.add(label);
		firstNameField = new JTextField();
		inputPanel.add(firstNameField);
		
		
		JLabel label2 = new JLabel("Last Name");
		label2.setFont(new Font("Tahoma", Font.BOLD, 14));
		inputPanel.add(label2);
		lastNameField = new JTextField();
		inputPanel.add(lastNameField);
		
		JLabel label3 = new JLabel("Address");
		label3.setFont(new Font("Tahoma", Font.BOLD, 14));
		inputPanel.add(label3);
		addressField = new JTextField();
		inputPanel.add(addressField);
		
		JLabel label4 = new JLabel("Contact Number");
		label4.setFont(new Font("Tahoma", Font.BOLD, 14));
		inputPanel.add(label4);
		contactField = new JTextField();
		inputPanel.add(contactField);
		
		JLabel label5 = new JLabel("Semester");
		label5.setFont(new Font("Tahoma", Font.BOLD, 14));
		inputPanel.add(label5);
		semesterField = new JTextField();
		inputPanel.add(semesterField);
		
		JButton saveButton = new JButton("Save");
		
		
		inputPanel.add(saveButton);
		
		mainPanel.add(inputPanel);
		add(mainPanel);
		
		
		// ADDING SAVE BUTTON
		
		saveButton.addActionListener(e ->{
			try {
				BufferedWriter bw  = new BufferedWriter(new FileWriter("students.csv",true));
				
				String data = firstNameField.getText()+","+lastNameField.getText()+","+addressField.getText()+","+contactField.getText()+","+semesterField.getText();
				
				bw.write(data);
				bw.newLine();
				bw.close();
				
				
				JOptionPane.showMessageDialog(null, "Data is saved!");
				firstNameField.setText("");
				lastNameField.setText("");
				addressField.setText("");
				contactField.setText("");
				semesterField.setText("");
			}

			catch (Exception ex) {
				System.out.println("There has been an error: ");
				ex.printStackTrace();
			}
			
		});
	}

}
