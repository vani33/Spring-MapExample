package com.hcl;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Triangle {

	private Map<Integer,Point> points;
	public Triangle() {
		
	}
	public Triangle(Map<Integer, Point> points) {
		this.points= points;
		
	}
	
	
	public Map<Integer, Point> getPoints() {
		return points;
	}
	public void setPoints(Map<Integer, Point> points) {
		this.points = points;
	}
	public void draw() {
		Iterator<Entry<Integer, Point>> iter = points.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry map = (Map.Entry)iter.next();
			System.out.println(map.getKey() + " " + map.getValue());
		}
		/*for(Point point:points) {
			System.out.println(point.getX() + "." + point.getY());
		}*/
	}
}
