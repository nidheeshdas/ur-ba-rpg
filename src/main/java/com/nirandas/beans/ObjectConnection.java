package com.nirandas.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tblObjectConnection")
public class ObjectConnection {
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@OneToOne
	public Object getObject1() {
		return object1;
	}

	public void setObject1(Object objectId) {
		this.object1 = objectId;
	}

	@OneToOne()
	public Object getObject2() {
		return object2;
	}

	public void setObject2(Object objectId) {
		this.object2 = objectId;
	}
	
	@Column
	public long getPointId() {
		return pointId;
	}

	public void setPointId(long pointId) {
		this.pointId = pointId;
	}

	private long id;
	private Object object1;
	private Object object2;
	private long pointId;
}
