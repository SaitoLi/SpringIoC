package com.lzz.dao;

import org.springframework.stereotype.Component;

import com.lzz.entity.Student;

//���������IOC�������������ļ�������ɨ����
//�൱�ڣ�
//<bean id="student" class="com.lzz.dao.StudentImpl">
@Component("studentDao")

/*
 * ����ע�⣺
 * 1��Component��ȫ�֣�
 * 2��Repository��DAO�㣩
 * 3��Service��service�㣩
 * 4��Controller����������
 */
public class StudentDaoImpl {
	public void addStudent(Student student) {
		System.out.println("����ѧ��");
	}
}
