package com.skilldistillery.lordoftheobjects;

public class Scenes {

	private String description;
	private int numEnemies;
	private int numFriends;
	private int chileBags;
	
	Scenes () {
	}
	public Scenes (String description, int numEnemies, int numFriends, int chileBags) {
		this.description = description;
		this.numEnemies = numEnemies;
		this.numFriends = numFriends;
		this.chileBags = chileBags; 
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumEnemies() {
		return numEnemies;
	}

	public void setNumEnemies(int numEnemies) {
		this.numEnemies = numEnemies;
	}

	public int getNumFriends() {
		return numFriends;
	}

	public void setNumFriends(int numFriends) {
		this.numFriends = numFriends;
	}

	public int getChileBags() {
		return chileBags;
	}

	public void setChileBags(int chileBags) {
		this.chileBags = chileBags;
	}
	
	public String getInfo() {
		return "\nWelcome to " + getDescription() + ".\nThere are " + getNumEnemies() 
		+ " Enemies here." + "\n And " + getNumFriends() 
				+ " Friends\n And " + getChileBags() + " bags of Chiles available to rescue.";
	}
	
	}
	
