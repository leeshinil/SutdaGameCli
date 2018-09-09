package Model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameData extends JPanel{
	private static GameData gameData= null;
	public static GameData getInstance() {
		if (gameData == null) {
			gameData = new GameData();
		}
		return gameData;
	}
	Toolkit toolkit = getToolkit(); // 이미지를 그리기 위해 Toolkit Class사용
	Image icon[][] = new Image[11][3];
	int card1_x, card2_x, card1_y, card2_y;
	int user2Card1X, user2Card1Y, user2Card2X, user2Card2Y;
	boolean turn = false;
	
	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public void setInitIcon() {
		icon[0][0] = toolkit.getImage("0.0.png");
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 3; j++) {
				icon[i][j] =toolkit.getImage(i + "." + j + ".png");
			}
		}
	}
	public Image getIcon(int x, int y) {
		return icon[x][y];
	}
	
	public int getCard1_x() {
		return card1_x;
	}

	public void setCard1_x(int card1_x) {
		this.card1_x = card1_x;
	}

	public int getCard2_x() {
		return card2_x;
	}

	public void setCard2_x(int card2_x) {
		this.card2_x = card2_x;
	}

	public int getCard1_y() {
		return card1_y;
	}

	public void setCard1_y(int card1_y) {
		this.card1_y = card1_y;
	}

	public int getCard2_y() {
		return card2_y;
	}

	public void setCard2_y(int card2_y) {
		this.card2_y = card2_y;
	}

	public int getUser2Card1X() {
		return user2Card1X;
	}

	public void setUser2Card1X(int user2Card1X) {
		this.user2Card1X = user2Card1X;
	}

	public int getUser2Card1Y() {
		return user2Card1Y;
	}

	public void setUser2Card1Y(int user2Card1Y) {
		this.user2Card1Y = user2Card1Y;
	}

	public int getUser2Card2X() {
		return user2Card2X;
	}

	public void setUser2Card2X(int user2Card2X) {
		this.user2Card2X = user2Card2X;
	}

	public int getUser2Card2Y() {
		return user2Card2Y;
	}

	public void setUser2Card2Y(int user2Card2Y) {
		this.user2Card2Y = user2Card2Y;
	}
	
}
