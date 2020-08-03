package com.spring.basics.app.external;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class ExternalPropertiesApplicationApplication
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ExternalPropertiesApplicationApplication.class);
		ExternalPropertiesService externalPropertiesService=applicationContext.getBean(ExternalPropertiesService.class);
		System.out.println(externalPropertiesService.returnUrl());
	}
}
