package com.rexhouy.model;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
public class Point implements Serializable {

	@NotNull
	@Pattern(regexp="\\d{1,10}")
	private String x;

	@NotNull
	@Pattern(regexp="\\d{1,10}")
	private String y;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

}
