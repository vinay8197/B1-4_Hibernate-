package com.tns.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="college")

public class College implements Serializable{
	private static final long serialVersionUID=1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="ID")
	private long id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="User_Id")
	private User collegeAdmin;
	private String collegeName;
	private String location;
	public College() {
		super();
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getCollegeAdmin() {
		return collegeAdmin;
	}
	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + "]";
	}
	

}
