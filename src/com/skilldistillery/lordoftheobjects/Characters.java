package com.skilldistillery.lordoftheobjects;

public class Characters {
	
	private String name; 
	private int expPoints;
	private int healPoints;
	
	public Characters() {
		
	}
	
	
	public Characters (String name, int expPoints, int healPoints) {
		this.name = name;
		this.expPoints = expPoints;
		this.healPoints = healPoints;
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


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Characters [name=").append(name).append(", expPoints=").append(expPoints)
				.append(", healPoints=").append(healPoints).append("]");
		return builder.toString();
	}
	
	
}
	
	