package Model;

import java.io.Serializable;

public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id, name, money, card1, card2, card3, card4;
	String finishResult;
	boolean Winner;

	public boolean isWinner() {
		return Winner;
	}

	public void setWinner(boolean winner) {
		Winner = winner;
	}

	public String getFinishResult() {
		return finishResult;
	}

	public void setFinishResult(String finishResult) {
		this.finishResult = finishResult;
	}

	public String getCard3() {
		return card3;
	}

	public void setCard3(String card3) {
		this.card3 = card3;
	}

	public String getCard4() {
		return card4;
	}

	public void setCard4(String card4) {
		this.card4 = card4;
	}

	String type;
	GameData gameData = null;
	String totalMoney;
	int callMoney, dieMoney;


	public int getDieMoney() {
		return dieMoney;
	}

	public void setDieMoney(int dieMoney) {
		this.dieMoney = dieMoney;
	}

	public UserInfo() {

	}

	public UserInfo(String id, String name, String money, GameData gameData) {
		this.id = id;
		this.name = name;
		this.money = money;
		this.gameData = gameData;
	}

	public int getCallMoney() {
		return callMoney;
	}

	public void setCallMoney(int callMoney) {
		this.callMoney = callMoney;
	}

	public String getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}

	boolean turn = false;

	public boolean isTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getCard1() {
		return card1;
	}

	public void setCard1(String card1) {
		this.card1 = card1;
	}

	public String getCard2() {
		return card2;
	}

	public void setCard2(String card2) {
		this.card2 = card2;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
