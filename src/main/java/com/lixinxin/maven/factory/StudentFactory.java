package com.lixinxin.maven.factory;

import com.lixinxin.maven.pojo.Student;

public class StudentFactory {
public static Student createStudent(){
	System.out.println("静态工厂创建");
	return new Student();
} 
}
