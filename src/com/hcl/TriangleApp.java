package com.hcl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TriangleApp {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Spring.xml") );
		Triangle triangle = (Triangle)beanFactory.getBean("triangle");
		triangle.draw();
	}
}
