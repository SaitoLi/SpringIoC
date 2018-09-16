package com.lzz.entity;

public class Course {
	private String courseName;
	private int courseHour;
	private Teacher teacher;
	
	public Course() {
		
	}
	public Course(String courseName, int courseHour, Teacher teacher) {
		super();
		this.courseName = courseName;
		this.courseHour = courseHour;
		this.teacher = teacher;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseHour() {
		return courseHour;
	}
	public void setCourseHour(int courseHour) {
		this.courseHour = courseHour;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String toString() {
		return "课程名："+this.courseName+"，课时：" +this.courseHour+"，教师："+this.teacher.getTeacherName();
	}
}
