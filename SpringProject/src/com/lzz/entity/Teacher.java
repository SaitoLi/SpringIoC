package com.lzz.entity;

public class Teacher {
	private String teacherName;
	private int teacherAge;
	public Teacher() {
		
	}
	public Teacher(String teacherName, int teacherAge) {
		super();
		this.teacherName = teacherName;
		this.teacherAge = teacherAge;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherAge() {
		return teacherAge;
	}
	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}
	
	
}
