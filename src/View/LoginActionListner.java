package View;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Model.DatabasesInfo;
import Model.SocketService;
import Model.UserData;
import Model.UserInfo;

public class LoginActionListner implements ActionListener {
	JTextField id, password;
	Connection conn = null;
	JFrame frame;
	Container contentPane;
	DatabasesInfo db = null;
	UserData userData = null;
	public LoginActionListner(JTextField id, JTextField password, JFrame frame, Container contentPane) {
		this.id = id;
		this.password = password;
		this.frame = frame;
		this.contentPane = contentPane;
		db = new DatabasesInfo(id, password);
		db.Databases();
		this.userData = UserData.getInstance();
	}

	public void actionPerformed(ActionEvent arg0) {
		db.CheckLogin();
		if (db.CheckLogin() == true) {
			db.selectUserData();
			UserInfo userInfo = db.getUserInfo();
			userData.addUser(userInfo);
			DrawBoard drawBoard = new DrawBoard();
			JButton startButton = new JButton("");
			contentPane.removeAll();
			
			new FrameView().displayGameView(frame, contentPane, userInfo, drawBoard, startButton);
			new SocketService().connect(userInfo, drawBoard, startButton);
		}
	}
}
