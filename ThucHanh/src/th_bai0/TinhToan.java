package th_bai0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtKetQua;
	JRadioButton btnCong = new JRadioButton("Cộng");
	JRadioButton btnNhan = new JRadioButton("Nhân");
	JRadioButton btnTru = new JRadioButton("Trừ");
	JRadioButton btnChia = new JRadioButton("Chia");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TinhToan frame = new TinhToan();
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
	public TinhToan() {
		setTitle("Tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CỘNG TRỪ NHÂN CHIA");
		lblNewLabel.setBounds(5, 5, 542, 31);
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0)), "Ch\u1ECDn t\u00E1c v\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(5, 47, 104, 263);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnGiai = new JButton("Giải");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tinhToan();
			}
		});
		btnGiai.setBounds(10, 48, 84, 31);
		panel.add(btnGiai);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoa();
			}
		});
		btnXoa.setBounds(10, 90, 84, 31);
		panel.add(btnXoa);
		
		JButton btnThoat = new JButton("Thoát");
		btnThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				thoat();
			}
		});
		btnThoat.setBounds(10, 132, 84, 31);
		panel.add(btnThoat);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0)), "Nh\u1EADp 2 s\u1ED1 a v\u00E0 b", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(112, 47, 430, 263);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lba = new JLabel("Nhập a:");
		lba.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lba.setBounds(61, 23, 56, 14);
		panel_2.add(lba);
		
		JLabel lbb = new JLabel("Nhập b:");
		lbb.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbb.setBounds(61, 58, 56, 14);
		panel_2.add(lbb);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ch\u1ECDn ph\u00E9p to\u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(130, 104, 173, 104);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		buttonGroup.add(btnCong);
		btnCong.setSelected(true);
		btnCong.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCong.setBounds(6, 28, 72, 23);
		panel_1.add(btnCong);
		
		buttonGroup.add(btnNhan);
		btnNhan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNhan.setBounds(6, 63, 72, 23);
		panel_1.add(btnNhan);
		
		buttonGroup.add(btnTru);
		btnTru.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTru.setBounds(97, 28, 56, 23);
		panel_1.add(btnTru);
		
		buttonGroup.add(btnChia);
		btnChia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnChia.setBounds(97, 63, 56, 23);
		panel_1.add(btnChia);
		
		
		txta = new JTextField();
		txta.setBounds(116, 21, 207, 20);
		panel_2.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(116, 56, 207, 20);
		panel_2.add(txtb);
		
		JLabel lbKetQua = new JLabel("Kết quả:");
		lbKetQua.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lbKetQua.setBounds(50, 225, 56, 14);
		panel_2.add(lbKetQua);
		
		txtKetQua = new JTextField();
		txtKetQua.setEnabled(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(116, 223, 207, 20);
		panel_2.add(txtKetQua);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 192));
		panel_3.setBounds(5, 310, 537, 58);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 255));
		panel_3.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 0, 0));
		panel_3.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 0));
		panel_3.add(panel_6);
	}
	
	void tinhToan() {
		double a, b, kq;
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
		
		if(btnCong.isSelected()) kq = a + b;
		else if(btnTru.isSelected()) kq = a - b;
		else if(btnNhan.isSelected()) kq = a * b;
		else kq = a / b ;
		txtKetQua.setText(Double.toString(kq));
	}
	
	void xoa() {
		txta.setText("");
		txtb.setText("");
		txtKetQua.setText("");
	}
	
	void thoat() {
		System.exit(0);
	}
}
