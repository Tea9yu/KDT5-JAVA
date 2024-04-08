package edu.ch07_Test;

public class Point extends Geomesty {
	public Line() {
		
	}
	public Point(int x, int y) {
		addPoint(x, y);
		
	}
	
	public double getLength() {
		int[] xArr = getXArr();
		int[] yArr = getYArr();
		
		return yArr[0] - xArr[0];
	}

	public double getArea() {
		return 0;
	}

}
