package com.lixinxin.maven.pojo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	@SuppressWarnings("resource")
	@Test
	public void test1() {
		ClassPathXmlApplicationContext cpxc = new ClassPathXmlApplicationContext("spring.xml");
		Student student = cpxc.getBean("student", Student.class);
		System.out.println(student);
//		Student student2 = (Student) cpxc.getBean("studentFactory");
//		System.out.println(student2);
	}
}
