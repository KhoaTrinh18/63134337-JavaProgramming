import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setTitle("Vi du JFrame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setLayout(new FlowLayout());
		JButton btnOK = new JButton("Nhấn tôi đi");
		BoLangNgheOK ngheOK = new BoLangNgheOK();
		btnOK.addActionListener(ngheOK);
		JButton btnKhac = new JButton("Nhấn em đi");
		f.add(btnOK);
		f.add(btnKhac);
		f.setVisible(true);
	}
	
}

class BoLangNgheOK implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JDialog dialog = new JDialog();
		dialog.setTitle("Thông báo");
		dialog.setVisible(true);
	}
}
