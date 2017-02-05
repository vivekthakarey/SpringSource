package com.vivek.spring.javalearning.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vivek.spring.javalearning.beans.BraveKnight;
import com.vivek.spring.javalearning.beans.Knight;

public class KnightMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Knight knight = (Knight)context.getBean("knight");
		knight.embarkOnQuest();
	}

}
