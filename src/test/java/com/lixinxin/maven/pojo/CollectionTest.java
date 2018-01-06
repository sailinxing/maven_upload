package com.lixinxin.maven.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTest {
	@Test
	 public  void  test4(){
	        //TODO ∏¥‘”¿‡–Õ◊¢»Î¡∑œ∞
	     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-collection.xml");

	     TestCollection textColl = context.getBean("testColl", TestCollection.class);

	     System.out.println("testColl = " + textColl);

	   }
}
