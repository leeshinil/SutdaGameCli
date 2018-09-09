package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Model.GameData;
import Model.SocketService;
import Model.UserData;
import Model.UserInfo;

public class CallActionListener implements ActionListener {
	DrawBoard drawBoard = null;
	UserData userData = null;
	GameData gameData = null;
	public CallActionListener (DrawBoard drawBoard) {
		this.drawBoard = drawBoard;
		this.userData = UserData.getInstance();
		this.gameData = GameData.getInstance();
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		UserInfo userInfo = userData.getUserList().get(0);
		if(userInfo.isTurn()){
			userInfo.setType("call");
			int money = Integer.parseInt(userInfo.getMoney());
			userInfo.setMoney(String.valueOf(money - userInfo.getCallMoney()));
			int totalMoney = Integer.parseInt(userInfo.getTotalMoney()) + userInfo.getCallMoney();
			userInfo.setTotalMoney(String.valueOf(totalMoney));
			userInfo.setTurn(false);
			userData.setUser(0, userInfo);
			drawBoard.repaint();
			try {
				SocketService.writer.reset();
				SocketService.writer.writeObject(userInfo);
				SocketService.writer.flush();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}		
	}
}
