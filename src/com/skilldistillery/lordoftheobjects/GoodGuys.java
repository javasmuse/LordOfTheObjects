package com.skilldistillery.lordoftheobjects;

public class GoodGuys extends Characters {
	
	private String saying; 

	public GoodGuys() {

		
	}
	
	public GoodGuys (String nm, int xP, int hP, int lP, String say ) {
		
		saying = say; 
		
				
	}
	
	
	
	public String getSaying() {
		return saying;
	}

	public void setSaying(String saying) {
		this.saying = saying;
	}

}
