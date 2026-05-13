package week10;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class number4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JTable table;
	DefaultTableModel model;
	
	String filename = "no4csv.csv";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					number4 frame = new number4();
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
	public number4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		model = new DefaultTableModel();
		
		model.addColumn("FIRST NAME");
		model.addColumn("LAST NAME");
		model.addColumn("ADDRESS");
		model.addColumn("CONTACT NUMBER");
		model.addColumn("SEMESTER");
		
		table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			String line;
			
			br.readLine();
			
			while((line = br.readLine()) !=null) {
				
			String[] data = line.split(",");
			
			model.addRow(data);
			
			
			}
			
			br.close();
		}
		
		catch (Exception e) {
			System.out.println("There has been an error");
			e.printStackTrace();
		}
		
	}

}
