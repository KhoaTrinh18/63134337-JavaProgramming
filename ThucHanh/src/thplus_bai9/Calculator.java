package thplus_bai9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							// TODO Auto-generated method stub
							System.exit(0);
						}
					});
					frame.setLocationByPlatform(isDefaultLookAndFeelDecorated());
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
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 213, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0};
		gbl_contentPane.rowHeights = new int[] {0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(2, 2, 2, 2);
		gbc_textField.gridwidth = 4;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton(".");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("/");
		
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 1;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("*");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_3.gridx = 3;
		gbc_btnNewButton_3.gridy = 1;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 2;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 2;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("9");
		GridBagConstraints gbc_btnNewButton_5_1 = new GridBagConstraints();
		gbc_btnNewButton_5_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_1.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_1.gridx = 2;
		gbc_btnNewButton_5_1.gridy = 2;
		contentPane.add(btnNewButton_5_1, gbc_btnNewButton_5_1);
		
		JButton btnNewButton_5_14 = new JButton("-");
		GridBagConstraints gbc_btnNewButton_5_14 = new GridBagConstraints();
		gbc_btnNewButton_5_14.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_14.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_14.gridx = 3;
		gbc_btnNewButton_5_14.gridy = 2;
		contentPane.add(btnNewButton_5_14, gbc_btnNewButton_5_14);
		
		JButton btnNewButton_5_2 = new JButton("6");
		GridBagConstraints gbc_btnNewButton_5_2 = new GridBagConstraints();
		gbc_btnNewButton_5_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_2.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_2.gridx = 0;
		gbc_btnNewButton_5_2.gridy = 3;
		contentPane.add(btnNewButton_5_2, gbc_btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("5");
		GridBagConstraints gbc_btnNewButton_5_3 = new GridBagConstraints();
		gbc_btnNewButton_5_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_3.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_3.gridx = 1;
		gbc_btnNewButton_5_3.gridy = 3;
		contentPane.add(btnNewButton_5_3, gbc_btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("4");
		GridBagConstraints gbc_btnNewButton_5_4 = new GridBagConstraints();
		gbc_btnNewButton_5_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_4.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_4.gridx = 2;
		gbc_btnNewButton_5_4.gridy = 3;
		contentPane.add(btnNewButton_5_4, gbc_btnNewButton_5_4);
		
		JButton btnNewButton_5_13 = new JButton("+");
		GridBagConstraints gbc_btnNewButton_5_13 = new GridBagConstraints();
		gbc_btnNewButton_5_13.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_13.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_13.gridx = 3;
		gbc_btnNewButton_5_13.gridy = 3;
		contentPane.add(btnNewButton_5_13, gbc_btnNewButton_5_13);
		
		JButton btnNewButton_5_5 = new JButton("3");
		GridBagConstraints gbc_btnNewButton_5_5 = new GridBagConstraints();
		gbc_btnNewButton_5_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_5.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_5.gridx = 0;
		gbc_btnNewButton_5_5.gridy = 4;
		contentPane.add(btnNewButton_5_5, gbc_btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("2");
		GridBagConstraints gbc_btnNewButton_5_6 = new GridBagConstraints();
		gbc_btnNewButton_5_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_6.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_6.gridx = 1;
		gbc_btnNewButton_5_6.gridy = 4;
		contentPane.add(btnNewButton_5_6, gbc_btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("1");
		GridBagConstraints gbc_btnNewButton_5_7 = new GridBagConstraints();
		gbc_btnNewButton_5_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_7.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_7.gridx = 2;
		gbc_btnNewButton_5_7.gridy = 4;
		contentPane.add(btnNewButton_5_7, gbc_btnNewButton_5_7);
		
		JButton btnNewButton_5_12 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_5_12 = new GridBagConstraints();
		gbc_btnNewButton_5_12.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_12.gridheight = 2;
		gbc_btnNewButton_5_12.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_12.gridx = 3;
		gbc_btnNewButton_5_12.gridy = 4;
		contentPane.add(btnNewButton_5_12, gbc_btnNewButton_5_12);
		
		JButton btnNewButton_5_8 = new JButton("0");
		GridBagConstraints gbc_btnNewButton_5_8 = new GridBagConstraints();
		gbc_btnNewButton_5_8.gridwidth = 2;
		gbc_btnNewButton_5_8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_8.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_8.gridx = 0;
		gbc_btnNewButton_5_8.gridy = 5;
		contentPane.add(btnNewButton_5_8, gbc_btnNewButton_5_8);
		
		JButton btnNewButton_5_9 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_5_9 = new GridBagConstraints();
		gbc_btnNewButton_5_9.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_9.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_9.gridx = 1;
		gbc_btnNewButton_5_9.gridy = 5;
		contentPane.add(btnNewButton_5_9, gbc_btnNewButton_5_9);
		
		JButton btnNewButton_5_10 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_5_10 = new GridBagConstraints();
		gbc_btnNewButton_5_10.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5_10.insets = new Insets(2, 2, 2, 2);
		gbc_btnNewButton_5_10.gridx = 2;
		gbc_btnNewButton_5_10.gridy = 5;
		contentPane.add(btnNewButton_5_10, gbc_btnNewButton_5_10);

	}

}
