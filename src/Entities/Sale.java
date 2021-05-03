package Entities;

import Abstract.IEntity;

public class Sale implements IEntity{
	
	int id;
	String gameName;
	String gamerName;
	
	public Sale(int id, String gameName, String gamerName) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gamerName = gamerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

}
