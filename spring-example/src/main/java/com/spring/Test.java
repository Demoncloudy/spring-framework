package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yunfeng Sun
 * @date 2021/12/27 1:18
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext();
		context.register(Bean.class);
		context.refresh();
		System.out.println(context.getBean(Bean.class));
	}
}
