package com.lzz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		//1��ʡ����new
		//2��ʡ���˶������Եĸ�ֵ
	}
}
