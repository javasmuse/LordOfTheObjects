package com.skilldistillery.lordoftheobjects;

public class Characters {
	
	private String name; 
	private int expPoints;
	private int healPoints;
	private int luckPoints;
	
	public Characters () {
		
	}
	
	public Characters ( String nm, int xP, int hP, int lP ) {
		name = nm; 
		expPoints = xP;
		healPoints = hP;
		luckPoints = lP;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExpPoints() {
		return expPoints;
	}

	public void setExpPoints(int expPoints) {
		this.expPoints = expPoints;
	}

	public int getHealPoints() {
		return healPoints;
	}

	public void setHealPoints(int healPoints) {
		this.healPoints = healPoints;
	}

	public int getLuckPoints() {
		return luckPoints;
	}

	public void setLuckPoints(int luckPoints) {
		this.luckPoints = luckPoints;
	}
	
	
	 

}
