package com.test.cat.test;

import java.util.Date;
import java.util.List;

import com.test.cat.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class OrmRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("applicationContext.xml"));
		
		ICatDao catDao = (ICatDao)factory.getBean("catDao"); // Use CatDao		
		//ICatService catDao = (ICatService)factory.getBean("catService"); // Use CatService
		Cat cat = new Cat();
		
		cat.setName("Hello Kitty");
		cat.setCreateDate(new Date());
		
		catDao.createCat(cat);
		
		List<Cat> catList = catDao.listCats();
		for (Cat c : catList) {
			System.out.println("Name: " + c.getName() + ", Created on: " + c.getCreateDate());
		}
	}

}
