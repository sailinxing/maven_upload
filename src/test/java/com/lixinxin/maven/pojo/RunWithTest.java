package com.lixinxin.maven.pojo;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-test.xml"})
public class RunWithTest {
	@Resource
	private Student student;
	@Test
	public void testCreateStudent(){
		System.out.println(student);
	}
}
