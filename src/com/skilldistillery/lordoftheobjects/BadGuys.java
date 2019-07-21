package com.skilldistillery.lordoftheobjects;

public class BadGuys extends Characters {
	private int evilFactor;
	
	public BadGuys() {
	}
	
	public BadGuys (String name, int expPoints, int healPoints, int evilFactor) {
		super(name, expPoints, healPoints);
		this.evilFactor = evilFactor;
	}

	public int getEvilFactor() {
		return evilFactor;
	}

	public void setSaying(int evilFactor) {
		this.evilFactor = evilFactor;
	}

	public String getInfo() {
		return "Meet " + getName() + ", his Health Points are: " + getHealPoints() + " and his Experience Points are: "
				+ getExpPoints() + "\n And his Evil Factor is " + evilFactor;
	}


}
