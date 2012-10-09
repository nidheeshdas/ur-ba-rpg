package com.nirandas.beans;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblPoint")
public class Point {

	private long id;
	private long x;

	public Point() {

	}

	public Point(long _id, long _x, long _y) {
		id = _id;
		x = _x;
		y = _y;
	}

	@Id
	@GeneratedValue()
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column
	public long getX() {
		return x;
	}

	public void setX(long x) {
		this.x = x;
	}

	@Column
	public long getY() {
		return y;
	}

	public void setY(long y) {
		this.y = y;
	}

	private long y;
}
