package com.lixinxin.maven.factory;

import com.lixinxin.maven.pojo.Student;

public class StudentFactory {
public static Student createStudent(){
	System.out.println("��̬��������");
	return new Student();
} 
}
