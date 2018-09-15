package com.lzz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzz.entity.Student;

public class Test {
	public static void main(String[] args) {
		//通常的创建对象的方法
//		Student stu = new Student();
//		stu.setStuName("zs");
//		stu.setStuNum("123");
//		stu.setStuAge(18);
//		System.out.println(stu);
		
		//Spring上下文对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		student.learn("htmlCourse");
		//1、省略了new
		//2、省略了对象属性的赋值
	}
}
