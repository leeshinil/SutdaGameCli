package Model;

import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import View.DrawBoard;

public class Receiver implements Runnable {

	ObjectInputStream reader;
	UserInfo userInfo;
	UserData userData = null;
	private DrawBoard drawBoard = null;
	GameData gameData = null;
	JButton startButton = null;
	
	public Receiver(ObjectInputStream reader, UserInfo userInfo, DrawBoard drawBoard, JButton startButton) {
		this.userData = UserData.getInstance();
		this.reader = reader;
		this.userInfo = userInfo;
		this.drawBoard = drawBoard;
		this.startButton = startButton;
		this.gameData = GameData.getInstance();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		UserInfo player2Info;
		try {
			player2Info = (UserInfo) reader.readObject();
			if (player2Info.getType().equals("VisibleStartButton")) { // 방장
				startButton.setVisible(true);
			}
			userData.addUser(player2Info);
			drawBoard.repaint();
		} catch (ClassNotFoundException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (true) {
			try {
				UserInfo userInfo = new UserInfo();
				userInfo = (UserInfo) reader.readObject();
				if (userInfo.getType().equals("GameStart")) {
					int money = Integer.parseInt(userInfo.getMoney());
					money -= 1000;
					userInfo.setMoney(String.valueOf(money));
					userData.setUser(0, userInfo);

					String cardStr = userInfo.getCard1();
					System.out.println("card : " + cardStr);
					cardStr = cardStr.replace(".", " ");

					String card[] = cardStr.split(" ");
					gameData.setCard1_x(Integer.parseInt(card[0]));
					gameData.setCard1_y(Integer.parseInt(card[1]));
					gameData.setTurn(userInfo.isTurn());
					UserInfo user2Info = userData.getUserList().get(1);
					int user2Money = Integer.parseInt(user2Info.getMoney()) - userInfo.getCallMoney();
					user2Info.setMoney(String.valueOf(user2Money));
					drawBoard.repaint();
				} else if (userInfo.getType().equals("call")) {
					userData.setUser(1, userInfo);
					userData.getUserList().get(0).setTotalMoney(userInfo.getTotalMoney());
					System.out.println("userData get total Money  : " + userInfo.getTotalMoney());
					userData.getUserList().get(0).setTurn(true);
					drawBoard.repaint();
				} else if (userInfo.getType().equals("card2")) {
					String cardStr = userInfo.getCard2();
					System.out.println("card : " + cardStr);
					cardStr = cardStr.replace(".", " ");

					String card[] = cardStr.split(" ");
					gameData.setCard2_x(Integer.parseInt(card[0]));
					gameData.setCard2_y(Integer.parseInt(card[1]));
					gameData.setTurn(userInfo.isTurn());
					userData.setUser(0, userInfo);
					drawBoard.repaint();
				} else if (userInfo.getType().equals("finishGame")) {
					System.out.println("finish : " + userInfo.getFinishResult());
					String cardStr = userInfo.getCard3();
					cardStr = cardStr.replace(".", " ");

					String card[] = cardStr.split(" ");
					gameData.setUser2Card1X(Integer.parseInt(card[0]));
					gameData.setUser2Card1Y(Integer.parseInt(card[1]));

					cardStr = userInfo.getCard4();
					cardStr = cardStr.replace(".", " ");
					card = cardStr.split(" ");
					gameData.setUser2Card2X(Integer.parseInt(card[0]));
					gameData.setUser2Card2Y(Integer.parseInt(card[1]));
					drawBoard.repaint();
					// 이긴사람 창에 띄어주기
					drawBoard.drawWiner(userInfo);
					System.out.println(userInfo.isWinner());
					if (userInfo.isWinner() == true) {
						// 1p설정
						UserInfo user1Info = userData.getUserList().get(0);
						int setTotal1 = (Integer.parseInt(user1Info.getMoney())
								+ Integer.parseInt(user1Info.getTotalMoney()));
						user1Info.setMoney(String.valueOf(setTotal1));
						System.out.println("winer" + user1Info.getName() + " : " + user1Info.getMoney());

						UserInfo user2Info = userData.getUserList().get(1);
						int setTotal2 = Integer.parseInt(user2Info.getMoney());
						user2Info.setMoney(String.valueOf(setTotal2));
						user1Info.setTotalMoney("0000");
						System.out.println("user1InfoMoney : " + user1Info.getMoney());
						System.out.println("userInfoMoney : " + user2Info.getMoney());
						drawBoard.repaint();
						// 디비에 연결
						DatabasesInfo db = new DatabasesInfo();
						db.Databases();
						db.setWinMoney(user1Info);
						db.setLoserMoney(user2Info);
					} else {
						UserInfo user1Info = userData.getUserList().get(1);
						int setTotal1 = (Integer.parseInt(user1Info.getMoney())
								+ Integer.parseInt(user1Info.getTotalMoney()));
						user1Info.setMoney(String.valueOf(setTotal1));
						System.out.println("winer" + user1Info.getName() + " : " + user1Info.getMoney());

						UserInfo user2Info = userData.getUserList().get(0);
						int setTotal2 = Integer.parseInt(user2Info.getMoney());
						user2Info.setMoney(String.valueOf(setTotal2));
						user2Info.setTotalMoney("0000");
						drawBoard.repaint();
						// 디비에 연결
						DatabasesInfo db = new DatabasesInfo();
						db.Databases();
						db.setWinMoney(user1Info);
						db.setLoserMoney(user2Info);
					}
				} else if (userInfo.getType().equals("die")) {
					userData.setUser(1, userInfo);
					userData.getUserList().get(0).setTotalMoney(userInfo.getTotalMoney());
					userData.getUserList().get(0).setTurn(true);
					userInfo.setTotalMoney("0000");
					DatabasesInfo db = new DatabasesInfo();
					db.Databases();
					db.setLoserMoney(userInfo);
					drawBoard.repaint();
				} 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
