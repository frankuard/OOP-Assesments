package week10;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class number5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	CardLayout cardLayout;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					number5 frame = new number5();
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
	public number5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setTitle("Card Layout");
		
		cardLayout = new CardLayout();
		

		contentPane = new JPanel(cardLayout);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		// FIRST PANEL
		
		JPanel panel1 = new JPanel();
		
		JButton nextButton = new JButton("Go to Second Panel");
		
		panel1.add(nextButton);
		
		// SEOCND PANELL
		
		JPanel panel2 = new JPanel();
		
		
		JButton backButton = new JButton("Go Back");
		
		panel2.add(backButton);
		

		
		// ADDING PANELS
		
		contentPane.add(panel1,"Panel1");
		
		contentPane.add(panel2,"Panel2");
		
		
		
		nextButton.addActionListener(e ->{
			cardLayout.show(contentPane,"Panel2");
			
		});
		
		backButton.addActionListener(e -> {
			cardLayout.show(contentPane,"Panel1");
			
			
		});
	}
	
	

}
