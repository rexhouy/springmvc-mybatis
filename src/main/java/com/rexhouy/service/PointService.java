package com.rexhouy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rexhouy.model.Point;
import com.rexhouy.persistence.PointMapper;

@Transactional
@Service
public class PointService {

	@Autowired
	private PointMapper pointMapper;
	
	public List<Point> listPoint() {
		return pointMapper.getPoints();
	}
	
	public Point getPoint(String x) {
		return pointMapper.getPointByX(x);
	}
	
	public void createPoint(Point p) {
		pointMapper.insertPoint(p);
	}
	
	public void updatePoint(Point p) {
		pointMapper.updatePoint(p);
	}
	
}
