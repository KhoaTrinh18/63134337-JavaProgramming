package th_bai1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhDangNhap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManHinhDangNhap frame = new ManHinhDangNhap();
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
	public ManHinhDangNhap() {
		setTitle("Quản lý bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTenDangNhap = new JLabel("Tên đăng nhập");
		lbTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbTenDangNhap.setForeground(new Color(255, 255, 255));
		lbTenDangNhap.setBounds(56, 83, 96, 27);
		contentPane.add(lbTenDangNhap);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setBounds(162, 84, 224, 27);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		JLabel lbMatKhau = new JLabel("Mật khẩu");
		lbMatKhau.setForeground(Color.WHITE);
		lbMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbMatKhau.setBounds(56, 130, 96, 27);
		contentPane.add(lbMatKhau);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(162, 131, 224, 27);
		contentPane.add(txtMatKhau);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Gọi hàm đăng nhập
				XuLyDangNhap();
			}
		});
		btnNewButton.setBounds(181, 204, 134, 56);
		contentPane.add(btnNewButton);
	}
	
	void XuLyDangNhap() {
		//Code xử lý ở đây 
		String ten = txtTenDangNhap.getText().toString();
		String mk = txtMatKhau.getText().toString();
		if(ten.equals("63CNTT") && mk.equals("123")) {
			new ManHinhChinh().setVisible(true);
			//Ẩn màn hình đăng nhập
			this.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(null, "Đăng nhập thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
		}
	}
}
