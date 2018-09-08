package com.SpringDemo;

public class Circle {
	Point centre;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public void draw() {
		System.out.println("Circle drawn at "+centre.getX()+","+centre.getY());
	}

}
