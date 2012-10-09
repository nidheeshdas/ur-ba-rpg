package com.nirandas.beans;

import com.nirandas.beans.Object;
import com.nirandas.beans.Point;
import com.nirandas.beans.StreetDirection;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity()
@Table(name = "tblStreet")
@PrimaryKeyJoinColumn
public class Street extends Object {

	private String name;


	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Column
	public StreetDirection getIsOneWay() {
		return isOneWay;
	}

	public void setIsOneWay(StreetDirection isOneWay) {
		this.isOneWay = isOneWay;
	}

	private List<Point> points;
	private StreetDirection isOneWay;

}
