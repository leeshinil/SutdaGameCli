package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.UserInfo;

public class FrameView {
	public void displayGameView(JFrame frame, Container contentPane,  UserInfo userInfo, DrawBoard drawBoard, JButton startButton) {
		
		frame.setPreferredSize(new Dimension(1050, 1000));
		
		contentPane.add(drawBoard, BorderLayout.CENTER);
		JPanel p = new JPanel() {
			public void paint(Graphics g) {
				// Approach 1: Dispaly image at at full size
				Toolkit t = getToolkit();
				Image back = t.getImage("back2.png");
				g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
				setOpaque(false);
				super.paint(g);
			}
		};
		p.setVisible(true);
		p.setPreferredSize(new Dimension(1050, 100));
		JButton callButton = new JButton("");
		JButton halfButton = new JButton("");
		JButton dieButton = new JButton("");
		
		startButton.setIcon(new ImageIcon("start.jpg"));
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.setBounds(10, 50, 200, 50);
		startButton.setOpaque(false);
		startButton.setVisible(false);
		
		callButton.setIcon(new ImageIcon("call.png"));
		callButton.setBorderPainted(false);
		callButton.setContentAreaFilled(false);
		callButton.setFocusPainted(false);
		callButton.setBounds(10, 50, 200, 50);
		callButton.setOpaque(false);
		
		halfButton.setIcon(new ImageIcon("half.png"));
		halfButton.setBorderPainted(false);
		halfButton.setContentAreaFilled(false);
		halfButton.setFocusPainted(false);
		halfButton.setBounds(10, 50, 200, 50);
		halfButton.setOpaque(false);

		dieButton.setIcon(new ImageIcon("die.png"));
		dieButton.setBorderPainted(false);
		dieButton.setContentAreaFilled(false);
		dieButton.setFocusPainted(false);
		dieButton.setOpaque(false);
		dieButton.setBounds(10, 50, 200, 50);
		
		p.add(startButton);
		p.add(callButton);
		p.add(halfButton);
		p.add(dieButton);
		startButton.addActionListener(new startActionListner());
		callButton.addActionListener(new CallActionListener(drawBoard));
//		halfButton.addActionListener(new HalfActionListener());
		dieButton.addActionListener(new DieActionListener(drawBoard));
		contentPane.add(p, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
