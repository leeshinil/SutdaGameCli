package Model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;

import View.DrawBoard;

public class SocketService {

	public static Socket socket = null;
	public static ObjectInputStream reader = null;
	public static ObjectOutputStream writer = null;

	public void connect(UserInfo userInfo, DrawBoard drawBoard, JButton startButton) {
		try {
			socket = new Socket("127.0.0.1", 9001);
			reader = new ObjectInputStream(socket.getInputStream());// 스트림얻어오기)
			writer = new ObjectOutputStream(socket.getOutputStream());
			writer.reset();
			writer.writeObject(userInfo);
			writer.flush();
			Receiver receiver = new Receiver(reader, userInfo, drawBoard, startButton);
			Thread thread = new Thread(receiver);
			thread.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
