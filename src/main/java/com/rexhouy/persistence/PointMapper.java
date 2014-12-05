package com.rexhouy.persistence;

import java.util.List;

import com.rexhouy.model.Point;

public interface PointMapper {

	public Point getPointByX(String x);
	
	public Point getPointByY(String y);
	
	public void updatePoint(Point p);
	
	public void insertPoint(Point p);
	
	public List<Point> getPoints();
	
}
