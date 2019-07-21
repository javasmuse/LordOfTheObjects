package com.skilldistillery.lordoftheobjects;

public class GoodGuys extends Characters {
	private String saying;

	public GoodGuys() {

	}

	public GoodGuys (String name, int expPoints, int healPoints, String saying) {
		super(name, expPoints, healPoints);
		this.saying = saying;
	}

	public String getSaying() {
		return saying;
	}

	public void setSaying(String saying) {
		this.saying = saying;
	}

	public String getInfo() {
		return "Meet " + getName() + ", his Health Points are: " + getHealPoints() + " and his Experience Points are: "
				+ getExpPoints() + "\n " + saying;
	}

}
