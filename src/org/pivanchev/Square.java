package org.pivanchev;

public class Square {
	
	private String type;
	private double height;
	
	public Square(String type) {
		this.type = type;
	}
	
	public Square(double height) {
		this.height = height;
	}
	
	public Square(String type,double height) {
		this.type = type;
		this.height = height;
	}
	

	public String getType() {
		return type;
	}
	
	public double getHeight() {
		return height;
	}


	/*public void setType(String type) {
		this.type = type;
	}*/
	
	public void draw() {
		System.out.println(getType() + " drawn of height " + getHeight() + " !");
	}

	

}
