package Operator2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DistanceCalculator {

	private JFrame frame;
	private JTextField pa;
	private JTextField dp;
    private JTextArea ta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DistanceCalculator window = new DistanceCalculator();
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
	public DistanceCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 604, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Discount Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(185, 47, 157, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Principal Amount");
		lblNewLabel_1.setBounds(127, 103, 103, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Discount Percentage");
		lblNewLabel_2.setBounds(127, 169, 103, 14);
		panel.add(lblNewLabel_2);
		
		pa = new JTextField();
		pa.setBounds(281, 100, 86, 20);
		panel.add(pa);
		pa.setColumns(10);
		
		dp = new JTextField();
		dp.setBounds(281, 166, 86, 20);
		panel.add(dp);
		dp.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(pa.getText());
				int b= Integer.parseInt(dp.getText());
				float c = 0.01F;
				int d =(int)( a-(a*(b*c)));
				ta.setText(String.valueOf(d));
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(207, 225, 135, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Net Price");
		lblNewLabel_3.setBounds(127, 287, 46, 14);
		panel.add(lblNewLabel_3);
		
		ta = new JTextArea();
		ta.setBounds(281, 282, 103, 22);
		panel.add(ta);
		
		JLabel lblNewLabel_4 = new JLabel("RS");
		lblNewLabel_4.setBounds(377, 103, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(377, 169, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS");
		lblNewLabel_6.setBounds(389, 287, 46, 14);
		panel.add(lblNewLabel_6);
	}
}
