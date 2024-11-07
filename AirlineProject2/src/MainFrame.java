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

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Greensboro Airlines (GSO)");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.PLAIN, 20));
		lblNewLabel.setBounds(102, 0, 247, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		lblFirstName.setBounds(10, 61, 91, 12);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		lblLastName.setBounds(10, 93, 91, 12);
		contentPane.add(lblLastName);
		
		JLabel lblFirstName_2 = new JLabel("First Name:");
		lblFirstName_2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 12));
		lblFirstName_2.setBounds(10, 128, 91, 12);
		contentPane.add(lblFirstName_2);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		textField.setBounds(94, 58, 118, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setBounds(94, 90, 118, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setBounds(94, 124, 118, 20);
		contentPane.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Greensboro", "Newark"}));
		comboBox.setForeground(SystemColor.inactiveCaptionBorder);
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.setBounds(94, 155, 118, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Greensboro", "Newark"}));
		comboBox_1.setForeground(SystemColor.inactiveCaptionBorder);
		comboBox_1.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox_1.setBounds(94, 188, 118, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"", "Economy Class", "Business Class"}));
		comboBox_1_1.setForeground(SystemColor.inactiveCaptionBorder);
		comboBox_1_1.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
		comboBox_1_1.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox_1_1.setBounds(94, 221, 118, 22);
		contentPane.add(comboBox_1_1);
	}
}
