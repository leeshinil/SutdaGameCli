package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.GameData;
import Model.UserData;
import Model.UserInfo;

public class DrawBoard extends JPanel {
	Toolkit toolkit = getToolkit(); // 이미지를 그리기 위해 Toolkit Class사용
	Image image = toolkit.getImage("back2.png");
	
	private Font f1;
	Image icon = toolkit.getImage("0.0.png");
	
	UserInfo myInfo = null;
	UserInfo player2Info = null;
	GameData gameData = null;
	private UserData userData;
	public DrawBoard() {
		this.userData = UserData.getInstance();
		this.gameData = GameData.getInstance();
		this.gameData.setInitIcon();
	}

	public void paint(Graphics g) {
		ArrayList<UserInfo> userList = userData.getUserList();
		myInfo = userList.get(0);
		if (userList.size() == 2) {			
			player2Info = userList.get(1);
		}
		drawBackGround(g);
		drawCard(g);
		drawPlayer1(g);
		drawPlayer2(g);
		drawTotalMoney(g);
	}

	public void drawBackGround(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}

	public void drawCard(Graphics g) {
		g.drawImage(gameData.getIcon(gameData.getCard1_x(),gameData.getCard1_y()), 150, 300, 100, 150, this);
		g.drawImage(gameData.getIcon(gameData.getCard2_x(),gameData.getCard2_y()), 270, 300, 100, 150, this);
		g.drawImage(gameData.getIcon(gameData.getUser2Card1X(),gameData.getUser2Card1Y()), 680, 300, 100, 150, this);
		g.drawImage(gameData.getIcon(gameData.getUser2Card2X(),gameData.getUser2Card2Y()), 800, 300, 100, 150, this);
	}

	public void drawPlayer1(Graphics g) {
		f1 = new Font("", 0, 30);
		g.setFont(f1);
		g.setColor(Color.WHITE);
		g.drawString(myInfo.getName(), 30, 430);
		g.setColor(Color.BLUE);
		g.drawString(myInfo.getMoney(), 220, 500);
	}

	public void drawPlayer2(Graphics g) {
		// this.add(new Label("hi"));
		f1 = new Font("", 0, 30);
		g.setFont(f1);
		g.setColor(Color.WHITE);
		g.drawString(player2Info==null? "접속 X " : player2Info.getName(), 930, 430);
		g.setColor(Color.BLUE);
		g.drawString(player2Info==null? "접속 X " : player2Info.getMoney(), 730, 500);
	}
	
	public void drawTotalMoney(Graphics g) {
		g.drawString(myInfo.getTotalMoney() == null ? "0000": myInfo.getTotalMoney(), 500, 430);
	}
	public void drawWiner(UserInfo userInfo) {
		JOptionPane.showMessageDialog(null, userInfo.getFinishResult());
	}

}