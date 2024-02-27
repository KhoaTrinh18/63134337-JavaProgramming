package th_bai2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhuongTrinhBac2 frame = new PhuongTrinhBac2();
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
	public PhuongTrinhBac2() {
		setTitle("Giải phương trình bậc ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 64, 0));
		panel.setBounds(0, 0, 557, 77);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("GIẢI PHƯƠNG TRÌNH BẬC 2\r\n");
		panel.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(128, 64, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0)), "Nh\u1EADp a, b, c", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(0, 81, 557, 191);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lba = new JLabel("a:");
		lba.setHorizontalAlignment(SwingConstants.CENTER);
		lba.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lba.setBounds(187, 35, 48, 14);
		panel_1.add(lba);
		
		JLabel lbb = new JLabel("b:");
		lbb.setHorizontalAlignment(SwingConstants.CENTER);
		lbb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbb.setBounds(187, 63, 48, 14);
		panel_1.add(lbb);
		
		JLabel lbc = new JLabel("c:");
		lbc.setHorizontalAlignment(SwingConstants.CENTER);
		lbc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbc.setBounds(187, 90, 48, 14);
		panel_1.add(lbc);
		
		txta = new JTextField();
		txta.setBounds(227, 33, 137, 20);
		panel_1.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(227, 61, 137, 20);
		panel_1.add(txtb);
		
		txtc = new JTextField();
		txtc.setColumns(10);
		txtc.setBounds(227, 88, 137, 20);
		panel_1.add(txtc);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setHorizontalAlignment(SwingConstants.CENTER);
		lblKtQu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKtQu.setBounds(132, 137, 74, 14);
		panel_1.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEnabled(false);
		txtKetQua.setForeground(new Color(0, 0, 0));
		txtKetQua.setBackground(new Color(240, 240, 240));
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(20);
		txtKetQua.setBounds(202, 127, 244, 36);
		panel_1.add(txtKetQua);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 128, 192)), "Ch\u1ECDn thao t\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(0, 277, 557, 82);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giaiPTBac2();
			}
		});
		btnGiai.setBounds(136, 34, 89, 23);
		panel_2.add(btnGiai);
		
		JButton btnXoa = new JButton("Xóa hết");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoa();
			}
		});
		btnXoa.setBounds(235, 34, 89, 23);
		panel_2.add(btnXoa);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thoat();
			}
		});
		btnThoat.setBounds(334, 34, 89, 23);
		panel_2.add(btnThoat);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, panel, panel_1, lba, lbb, lbc, txta, txtb, txtc, lblKtQu, txtKetQua, panel_2, btnGiai, btnXoa, btnThoat}));
	}
	
	void giaiPTBac1(float a, float b) {
		if(a != 0) {
			txtKetQua.setText("x = " + -b / a);
		} else if(b == 0) {
			txtKetQua.setText("Phương trình vô số nghiệm");
		} else {
			txtKetQua.setText("Phương trình vô nghiệm");
		}
	}
	
	void giaiPTBac2() {
		float a, b, c;
		try {
			a = Float.parseFloat(txta.getText());
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "a nhập sai định dạng");
			txta.selectAll();
			txta.requestFocus();
			return;
		}
		try {
			b = Float.parseFloat(txtb.getText());
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "b nhập sai định dạng");
			txtb.selectAll();
			txtb.requestFocus();
			return;
		}
		try {
			c = Float.parseFloat(txtc.getText());
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "c nhập sai định dạng");
			txtc .selectAll();
			txtc.requestFocus();
			return;
		}
		float delta = b * b - 4 * a * c;
		if(a == 0) giaiPTBac1(b, c);
		else {
			if(delta < 0) {
				txtKetQua.setText("Phương trình vô nghiệm");
			} else if(delta == 0) {
				txtKetQua.setText("x1 = x2 = " + (-b / (2 * a)));
			} else {
				float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
				txtKetQua.setText("x1 = " + x1 + ", x2 = " + x2);
			}
		}
	}
	
	void xoa() {
		txta.setText("");
		txtb.setText("");
		txtc.setText("");
		txtKetQua.setText("");
	}
	
	void thoat() {
		System.exit(0);
	}
}
