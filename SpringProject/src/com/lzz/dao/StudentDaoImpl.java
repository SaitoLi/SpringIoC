package com.lzz.dao;

import org.springframework.stereotype.Component;

import com.lzz.entity.Student;

//将组件加入IOC容器，在配置文件里配置扫描器
//相当于：
//<bean id="student" class="com.lzz.dao.StudentImpl">
@Component("studentDao")

/*
 * 几种注解：
 * 1、Component（全局）
 * 2、Repository（DAO层）
 * 3、Service（service层）
 * 4、Controller（控制器）
 */
public class StudentDaoImpl {
	public void addStudent(Student student) {
		System.out.println("增加学生");
	}
}
