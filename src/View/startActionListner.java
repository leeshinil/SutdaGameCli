package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Model.SocketService;
import Model.UserData;
import Model.UserInfo;

public class startActionListner implements ActionListener {
	UserData userData = UserData.getInstance();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		UserInfo userInfo = userData.getUserList().get(0);
		userInfo.setType("GameStart");
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
