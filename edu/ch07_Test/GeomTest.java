package edu.ch07_Test;

import java.awt.Rectangle;

// 점, 선, 삼각형, 사각형

public class GeomTest {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.addPoint(10, 20);		
		p.printPoint();
		System.out.println("길이 : " + p.getLength());
		System.out.println("면적 : " + p.getArea());
		
		Line line = new Line();
		Line.addPoint(11, 21);
		Line.addPoint(22, 32);
		line.printPoint();
		System.out.println("길이 : " + p.getLength());
		System.out.println("면적 : " + p.getArea());
		
//		Rectangle rect = new Rectangle();
//		rect.addPoint(0, 0);
//		rect.addPoint(10, 0);
//		rect.addPoint(10, 10);
//		rect.addPoint(0, 10);
//		rect.printPoint();
//		System.out.println("길이 : " + rect.getLength());
//		System.out.println("면적 : " + rect.getArea());
		

	}

}
