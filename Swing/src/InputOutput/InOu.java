package InputOutput;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class InOu {

	private JFrame frame;
	private JTextField fir;
	private JTextField las;
	private JTextField db;
	private JTextField mn;
	private JTextField email;
	private final ButtonGroup buttonGroup = new ButtonGroup();
    private JTextArea ta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InOu window = new InOu();
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
	public InOu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 613, 482);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel em = new JPanel();
		frame.getContentPane().add(em, BorderLayout.CENTER);
		em.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Application Form");
		lblNewLabel.setBounds(221, 26, 130, 14);
		em.add(lblNewLabel);
		
		JLabel fn = new JLabel("FirstName");
		fn.setBounds(115, 80, 92, 14);
		em.add(fn);
		
		JLabel ln = new JLabel("LastName");
		ln.setBounds(115, 118, 92, 14);
		em.add(ln);
		
		JLabel dob = new JLabel("Date Of Birth");
		dob.setBounds(115, 152, 92, 14);
		em.add(dob);
		
		JLabel mb = new JLabel("Mobile Number");
		mb.setBounds(115, 193, 92, 14);
		em.add(mb);
		
		JLabel g = new JLabel("Gender");
		g.setBounds(115, 236, 92, 14);
		em.add(g);
		
		JLabel ei = new JLabel("Email Id");
		ei.setBounds(115, 274, 92, 14);
		em.add(ei);
		
		fir = new JTextField();
		fir.setBounds(274, 74, 86, 20);
		em.add(fir);
		fir.setColumns(10);
		
		las = new JTextField();
		las.setColumns(10);
		las.setBounds(274, 115, 86, 20);
		em.add(las);
		
		db = new JTextField();
		db.setColumns(10);
		db.setBounds(274, 149, 86, 20);
		em.add(db);
		
		mn = new JTextField();
		mn.setColumns(10);
		mn.setBounds(274, 190, 86, 20);
		em.add(mn);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(274, 271, 86, 20);
		em.add(email);
		
		JRadioButton m = new JRadioButton("M");
		buttonGroup.add(m);
		m.setSelected(true);
		m.setBounds(274, 232, 39, 23);
		em.add(m);
		
		JRadioButton f = new JRadioButton("F");
		buttonGroup.add(f);
		f.setSelected(true);
		f.setBounds(327, 232, 32, 23);
		em.add(f);
		
		JButton sub = new JButton("SUBMIT");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = fir.getText(); 
				String b = las.getText();
				String c = db.getText();
				String d = mn.getText();
				String g;
				if(m.isSelected())
				{
					g="male";
				}
				else
				{
					g="female";
				}
				
				String em = email.getText();
				ta.setText("Registration Succesful!! Your Details are:"+"\n"+"First Name"+"\t"+a+"\n"+"Last Name"+"\t"+b+"\n"+"Date Of Birth"+"\t"+c+"\n"+"Mobile NO."+"\t"+d+"\n"+"Gender"+"\t"+g+"\n"+"Email Id"+"\t"+em);
			}
		});
		sub.setBounds(180, 299, 89, 23);
		em.add(sub);
		
	     ta = new JTextArea();
		ta.setBounds(53, 335, 491, 97);
		em.add(ta);
	}
}
