package com.lzz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzz.dao.StudentDaoImpl;
import com.lzz.entity.Student;

public class Test {
	public static void main(String[] args) {
		//ͨ���Ĵ�������ķ���
//		Student stu = new Student();
//		stu.setStuName("zs");
//		stu.setStuNum("123");
//		stu.setStuAge(18);
//		System.out.println(stu);
		
		//Spring�����Ķ���
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Student student = (Student) context.getBean("student");
//		student.learn("htmlCourse");
		//1��ʡ����new
		//2��ʡ���˶������Եĸ�ֵ
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Course course = (Course) context.getBean("course");
//		System.out.println(course.toString());
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		AllCollectionType course = (AllCollectionType) context.getBean("collectionDemo");
//		System.out.println(course.toString());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDaoImpl studentDaoImpl = (StudentDaoImpl) context.getBean("studentDao");
//		studentDaoImpl.addStudent();
	}
}
