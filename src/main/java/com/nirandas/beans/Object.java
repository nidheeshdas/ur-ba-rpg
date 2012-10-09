package com.nirandas.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tblObject")
@Inheritance(strategy=InheritanceType.JOINED)
public class Object {

	private long id;
	private boolean isVisible;
	private List<ObjectConnection> connections;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column
	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="id" , cascade={CascadeType.REMOVE})
	public List<ObjectConnection> getConnections() {
		return connections;
	}

	public void setConnections(List<ObjectConnection> connections) {
		this.connections = connections;
	}

}
