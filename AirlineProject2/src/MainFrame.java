import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{

	//private static final long serialVersionUID = 1L;
	JPanel contentPane,ticketPane;
	JTextField fnField;
	JTextField lnField;
	JTextField dateField;
	
	JComboBox classBox;
	JComboBox destBox;
	JComboBox originBox;
	
	JButton resButton;
	
	String fName,lName,date,origin,dest,airClass; 
	
	JLabel lblNewLabel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
    /**
     * create actionListener
     */
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==resButton){
			fName = fnField.getText();
			lName = lnField.getText();
			date = dateField.getText();
			
			origin = (String) originBox.getSelectedItem();
			dest = (String) destBox.getSelectedItem();
			airClass = (String) classBox.getSelectedItem();
			
			//create new Panel to display ticket information
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			ticketPane = new JPanel();
			ticketPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(ticketPane);
			ticketPane.setLayout(null);
		}
	}
	
	
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*
		 *LABELS
		 */
		JLabel gsoLbl = new JLabel("Greensboro Airlines (GSO)");
		gsoLbl.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		gsoLbl.setBounds(102, 0, 247, 34);
		contentPane.add(gsoLbl);
		
		JLabel fnLbl = new JLabel("First Name:");
		fnLbl.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		fnLbl.setBounds(10, 61, 91, 12);
		contentPane.add(fnLbl);
		
		JLabel lnLbl = new JLabel("Last Name:");
		lnLbl.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		lnLbl.setBounds(10, 93, 91, 12);
		contentPane.add(lnLbl);
		
		JLabel dateLbl = new JLabel("Departure Date:");
		dateLbl.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		dateLbl.setBounds(10, 128, 91, 12);
		contentPane.add(dateLbl);
		
		JLabel originLbl = new JLabel("Origin:");
		originLbl.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		originLbl.setBounds(10, 160, 91, 17);
		contentPane.add(originLbl);
		
		JLabel destLbl = new JLabel("Destination:");
		destLbl.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		destLbl.setBounds(10, 193, 91, 17);
		contentPane.add(destLbl);
		
		JLabel classLbl = new JLabel("Class:");
		classLbl.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		classLbl.setBounds(10, 221, 91, 17);
		contentPane.add(classLbl);
		
		/*
		 *TEXT FIELDS
		 */
		fnField = new JTextField();
		fnField.setBackground(SystemColor.inactiveCaptionBorder);
		fnField.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		fnField.setBounds(94, 58, 118, 20);
		contentPane.add(fnField);
		fnField.setColumns(10);
		
		lnField = new JTextField();
		lnField.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		lnField.setColumns(10);
		lnField.setBackground(SystemColor.inactiveCaptionBorder);
		lnField.setBounds(94, 90, 118, 20);
		contentPane.add(lnField);
		
		dateField = new JTextField();
		dateField.setCaretColor(SystemColor.controlDkShadow);
		dateField.setText("MM/DD/YYYY");
		dateField.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		dateField.setColumns(10);
		dateField.setBackground(SystemColor.inactiveCaptionBorder);
		dateField.setBounds(94, 124, 118, 20);
		contentPane.add(dateField);
		
		/*
		 *COMBO BOXES
		 */
		originBox = new JComboBox();
		originBox.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		originBox.setModel(new DefaultComboBoxModel(new String[] {"", "Greensboro at 7:00 AM", "Newark at 5:30 PM"}));
		originBox.setForeground(SystemColor.activeCaptionText);
		originBox.setBackground(SystemColor.inactiveCaptionBorder);
		originBox.setBounds(94, 155, 118, 22);
		originBox.addActionListener(this);
		contentPane.add(originBox);
		
		destBox = new JComboBox();
		destBox.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		destBox.setModel(new DefaultComboBoxModel(new String[] {"", "Greensboro at 7:00 PM", "Newark at 9:00 AM"}));
		destBox.setForeground(SystemColor.activeCaptionText);
		destBox.setBackground(SystemColor.inactiveCaptionBorder);
		destBox.setBounds(94, 188, 118, 22);
		destBox.addActionListener(this);
		contentPane.add(destBox);
		
		classBox = new JComboBox();
		classBox.setModel(new DefaultComboBoxModel(new String[] {"", "Economy Class", "Business Class"}));
		classBox.setForeground(SystemColor.activeCaptionText);
		classBox.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		classBox.setBackground(SystemColor.inactiveCaptionBorder);
		classBox.setBounds(94, 221, 118, 22);
		classBox.addActionListener(this);
		contentPane.add(classBox);
		
		/*
		 * BUTTON
		 */
		resButton = new JButton("RESERVE");
		resButton.setBackground(SystemColor.inactiveCaptionBorder);
		resButton.setFont(new Font("Segoe UI Historic", Font.BOLD, 11));
		resButton.setBounds(276, 195, 108, 48);
		resButton.addActionListener(this);
		contentPane.add(resButton);
		
	}
}
