import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

public class ProtonPurchase extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProtonPurchase frame = new ProtonPurchase();
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
	public ProtonPurchase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1210, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 204, 255)));
		panel.setBounds(0, 0, 1194, 613);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(23, 22, 1147, 89);
		panel.add(panel_2);
		panel_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 204, 255)));
		panel_2.setBackground(new Color(255, 255, 204));
		
		JLabel lblNewLabel = new JLabel("COSTUMER PROTON REGISTRATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 50));
		panel_2.add(lblNewLabel);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 204, 255)));
		panel_2_1.setBackground(new Color(255, 255, 204));
		panel_2_1.setBounds(22, 119, 481, 384);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Parcitipant No ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(28, 21, 150, 20);
		panel_2_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Full Name        ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(28, 52, 132, 20);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Telephone");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(28, 114, 132, 20);
		panel_2_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(28, 83, 132, 20);
		panel_2_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(28, 174, 132, 20);
		panel_2_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Post Code       ");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(28, 294, 132, 20);
		panel_2_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Proton Model");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(28, 325, 132, 20);
		panel_2_1.add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField.setBounds(180, 24, 275, 20);
		panel_2_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(180, 55, 275, 20);
		panel_2_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(180, 83, 275, 20);
		panel_2_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(180, 114, 275, 20);
		panel_2_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(180, 294, 275, 20);
		panel_2_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(180, 174, 275, 109);
		panel_2_1.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Proton Pesona", "Proton Saga", "Proton X50", "Proton X70"}));
		comboBox.setBounds(180, 328, 275, 20);
		panel_2_1.add(comboBox);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Date Registered");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(28, 145, 150, 20);
		panel_2_1.add(lblNewLabel_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(180, 145, 275, 20);
		panel_2_1.add(textField_6);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 204, 255)));
		panel_2_1_1.setBackground(new Color(255, 255, 204));
		panel_2_1_1.setBounds(513, 119, 657, 384);
		panel.add(panel_2_1_1);
		panel_2_1_1.setLayout(new BoxLayout(panel_2_1_1, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Participant No", "Name", "Email", "Telephone", "Proton Model", "Date"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBounds(22, 512, 1148, 78);
		panel.add(panel_2_1_2);
		panel_2_1_2.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(153, 204, 255)));
		panel_2_1_2.setBackground(new Color(255, 255, 204));
		panel_2_1_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						comboBox.getSelectedItem(),
						textField_6.getText()
				});
				
				if (table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Registration Update Confirmed", "Costumer Proton Registration", 
								JOptionPane.OK_OPTION);
					}
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(22, 23, 159, 33);
		panel_2_1_2.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				comboBox.setSelectedItem("Make a Selection");					
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.setBounds(258, 23, 159, 33);
		panel_2_1_2.add(btnReset);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						
						JOptionPane.showMessageDialog(null, "No Data to Delete",
								"Costumer Proton Registration",JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete",
								"Costumer Proton Registration",JOptionPane.OK_OPTION);
					}
					
				}else {
					model.removeRow(table.getSelectedRow());
				}
				
			}
		});
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnDelete.setBounds(735, 23, 159, 33);
		panel_2_1_2.add(btnDelete);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame exitframe = new JFrame();
				if (JOptionPane.showConfirmDialog(exitframe, "Confirm if you want to exit?", "Costumer Proton Register",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(966, 23, 159, 33);
		panel_2_1_2.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					table.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("No Printer Found", e.getMessage());
				}
				
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPrint.setBounds(490, 23, 159, 33);
		panel_2_1_2.add(btnPrint);
	}
}
