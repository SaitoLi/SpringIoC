package com.lzz.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzz.course.ICourse;

public class Student {
	private String stuName;
	private int stuAge;
	private String stuNum;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuNum() {
		return stuNum;
	}
	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}
	
	public String toString() {
		return this.stuNum + "," + this.stuName;
	}
	/**
	 * 学生学习课程 
	 */
	public void learn(String name) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICourse course = (ICourse) context.getBean(name);
		course.learn();
	}
}
