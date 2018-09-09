package Model;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class DatabasesInfo {
	String name, money;
	JTextField id, password;
	Connection conn = null;
	JFrame frame;
	Container contentPane;
	GameData gameData = null;
	UserInfo userInfo = null;

	public DatabasesInfo(JTextField id, JTextField password) {
		this.id = id;
		this.password = password;
	}

	public DatabasesInfo() {

	}

	public void Databases() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studa?useSSL=false", "root", "1234");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public boolean CheckLogin() {
		String text1 = id.getText();
		String text2 = password.getText();
		String idtext = null;
		String pwdtext = null;
		String idQuery = "SELECT id from sutdainfo where id= '" + text1 + "'";
		String passwordQuery = "SELECT password from sutdainfo where password= '" + text2 + "'";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(idQuery);
			while (rs.next()) {
				idtext = rs.getString("id");
			}
			rs = stmt.executeQuery(passwordQuery);
			while (rs.next()) {
				pwdtext = rs.getString("password");
			}

			System.out.println(idtext);
			System.out.println(pwdtext);

			if (text1.equals(idtext) && text2.equals(pwdtext)) {
				System.out.println("로그인");
				return true;
			} else {
				System.out.println("로그인안됨");
				return false;
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	public void selectUserData() {
		String text1 = id.getText();
		String nameQuery = "SELECT name, money from sutdainfo where id= '" + text1 + "'";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(nameQuery);
			while (rs.next()) {
				name = rs.getString("name");
				money = rs.getString("money");
			}
			System.out.println(name);
			stmt.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public UserInfo getUserInfo() {
		return new UserInfo(id.getText(), name, money, gameData);
	}

	public void setWinMoney(UserInfo userInfo) {
		String money = userInfo.getMoney();
		System.out.println(money);
		Statement stmt1 = null;
		try {
			System.out.println("update");
			stmt1 = conn.createStatement();
			int u = stmt1
					.executeUpdate("update sutdainfo set money:='" + money + "' where id='" + userInfo.getId() + "'");
			System.out.println(u + "수정");
			stmt1.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void setLoserMoney(UserInfo userInfo) {
		String money = userInfo.getMoney();
		System.out.println(money);
		Statement stmt1 = null;
		try {
			System.out.println("update");
			stmt1 = conn.createStatement();
			int u = stmt1
					.executeUpdate("update sutdainfo set money:='" + money + "' where id='" + userInfo.getId() + "'");
			System.out.println(u + "수정");
			stmt1.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
