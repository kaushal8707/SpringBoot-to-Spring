package com.spring.basics.app.basics;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration
@ComponentScan("com.spring.basics.app.basics")
public class BasicApplication
{
	public static void main(String[] args)
	{
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BasicApplication.class);//SpringApplication.run(BasicApplication.class, args);
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
//		BinarySearchImpl binarySearch1=applicationContext.getBean(BinarySearchImpl.class);
//		System.out.println(binarySearch1);
		int result=binarySearch.binarySearch(new int[]{2,4,1},3);
		System.out.println(result);

	}
}
