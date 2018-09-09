package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Model.GameData;
import Model.SocketService;
import Model.UserData;
import Model.UserInfo;

public class DieActionListener implements ActionListener {
	DrawBoard drawBoard = null;
	UserData userData = null;
	GameData gameData = null;

	public DieActionListener(DrawBoard drawBoard) {
		this.drawBoard = drawBoard;
		this.userData = UserData.getInstance();
		this.gameData = GameData.getInstance();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		UserInfo userInfo = userData.getUserList().get(0);
		UserInfo user2Info = userData.getUserList().get(1);
		
		if (userInfo.isTurn()) {
			userInfo.setType("die");
			int money = Integer.parseInt(userInfo.getMoney());
			int totalmoney = Integer.parseInt(userInfo.getTotalMoney());
			//µ·ÇÕ.
			user2Info.setMoney(String.valueOf(totalmoney+money));
			userInfo.setTurn(false);
			user2Info.setTurn(false);
			
			userData.setUser(1, user2Info);
			drawBoard.repaint();
		}
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
