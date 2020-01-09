package Operator1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class DistanceCalculator {

	private JFrame frame;
	private JTextField sl;
	private JTextField dl;
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
		frame.setBounds(100, 100, 687, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Distance Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(216, 42, 183, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Source Location");
		lblNewLabel_1.setBounds(149, 92, 99, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblDestinationLocation = new JLabel("Destination Location");
		lblDestinationLocation.setBounds(149, 138, 99, 14);
		panel.add(lblDestinationLocation);
		
		JLabel dc = new JLabel("Distance Covered");
		dc.setBounds(197, 263, 99, 14);
		panel.add(dc);
		
		sl = new JTextField();
		sl.setBounds(351, 89, 86, 20);
		panel.add(sl);
		sl.setColumns(10);
		
		dl = new JTextField();
		dl.setColumns(10);
		dl.setBounds(351, 135, 86, 20);
		panel.add(dl);
		
		JButton cd = new JButton("Calculate Distance");
		cd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = sl.getText();
				String b = dl.getText();
				float c = 56*(float)2.3;
				ta.setText(String.valueOf(c)+"Km");
			}
		});
		cd.setBounds(232, 190, 133, 23);
		panel.add(cd);
		
		ta = new JTextArea();
		ta.setBounds(351, 258, 86, 22);
		panel.add(ta);
	}

}
