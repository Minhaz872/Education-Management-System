package com.ems.data;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ems.data.dao.DataDao;

public class emsdb {

	public emsdb() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(dbconfig.class);
	
	DataDao dd=context.getBean("datadao", DataDao.class);
	//insert
	studentdata sd=new studentdata();
	sd.setId(3);
	sd.setName("Minhaz");
	sd.setBirthdate("2000-03-06");
	sd.setShreni(10);
	sd.setEmail("minhazuddin872@gmail.com");
	sd.setPassword("abcd");
	sd.setInstituion("BRACU");
	sd.setAddress("dhaka");
	
	
	int result=dd.insert(sd);
	System.out.println(result+" student added");
	

	}

}
