package Entities;

public class Games {

	public int gameId;
	public String gameName;
	public int gamePrice;
	
	public Games(int gameId, String gameName, int gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}

}
