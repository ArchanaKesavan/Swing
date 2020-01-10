package Operator3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MileageCalculator {

	private JFrame frame;
	private JTextField dc;
	private JTextField pc;
    private JTextArea ta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MileageCalculator window = new MileageCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MileageCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mileage Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(158, 36, 165, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Distance covered in Km");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(61, 87, 165, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblPetrolConsumedIn = new JLabel("Petrol consumed in litre");
		lblPetrolConsumedIn.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblPetrolConsumedIn.setBounds(61, 151, 165, 14);
		panel.add(lblPetrolConsumedIn);
		
		dc = new JTextField();
		dc.setBounds(301, 84, 86, 20);
		panel.add(dc);
		dc.setColumns(10);
		
		pc = new JTextField();
		pc.setBounds(301, 148, 86, 20);
		panel.add(pc);
		pc.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate Mileage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(dc.getText());
				int b = Integer.parseInt(pc.getText());
				int c = a/b;
				ta.setText(String.valueOf(c));
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(158, 219, 165, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Mileage per litre");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(102, 309, 124, 17);
		panel.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(383, 304, -39, 22);
		panel.add(textArea);
		
	    ta = new JTextArea();
		ta.setBounds(301, 304, 86, 22);
		panel.add(ta);
	}
}
