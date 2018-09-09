package Model;

import java.util.ArrayList;

public class UserData {
	private static UserData userData = null;
	public static UserData getInstance() {
		if (userData == null) {
			userData = new UserData();
		}
		return userData;
	}
	
	private ArrayList<UserInfo> userList = new ArrayList<UserInfo>();

	public ArrayList<UserInfo> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<UserInfo> userList) {
		this.userList = userList;
	}
	public void addUser(UserInfo userInfo) {
		this.userList.add(userInfo);
	}
	public void setUser(int index, UserInfo userInfo) {
		this.userList.set(index, userInfo);
	}
}