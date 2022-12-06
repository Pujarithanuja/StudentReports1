package com.cruddemo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
private String mobile;
private String Subjects;
private int Semisters;
private int Marks;
private int AverageMarks;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getSubjects() {
	return Subjects;
}
public void setSubject(String subjects) {
	Subjects = subjects;
}
public int getSemisters() {
	return Semisters;
}
public void setSemisters(int semisters) {
	Semisters = semisters;
}
public int getMarks() {
	return Marks;
}
public void setMarks(int marks) {
	Marks = marks;
}
public int getAverageMarks() {
	return AverageMarks;
}
public void setAverageMarks(int averageMarks) {
	AverageMarks = averageMarks;
}
 
}



