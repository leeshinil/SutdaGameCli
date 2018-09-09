package View;

import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class LoginView {
	
	public LoginView() {
		JFrame frame = new JFrame();
		frame.setPreferredSize(new Dimension(500, 500));
		
		Container contentPane = frame.getContentPane();
		
		JTextField text1 = new JTextField(6);
		JTextField text2 = new JTextField(6);
		JButton login = new JButton("login");
		JPanel panel = new JPanel();
		
		panel.add(new JLabel("ID"));
		panel.add(text1);
		panel.add(new JLabel("PASSWORD"));
		panel.add(text2);
		panel.add(login);
		contentPane.add(panel);
		login.addActionListener(new LoginActionListner(text1, text2, frame, contentPane));
		//new FrameView().displayGameView(frame, contentPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);	
	}
}
