package com.zinute.lucille.data.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name= "testtable")  
public class TestTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name", nullable=false, columnDefinition="char(255)")
	private String name = "my default name";
	
	@Column(name="roll", nullable=true, columnDefinition="integer")
	private int roll;
	
	@Column(name="created_at", nullable=false, columnDefinition="timestamp with time zone default now()")
	@Temporal(TemporalType.TIMESTAMP)
	private Date created_at;

	public TestTable(String name, int roll, Date created_at) {
		super();
		this.name = name;
		this.roll = roll;
		this.created_at = created_at;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	

}
