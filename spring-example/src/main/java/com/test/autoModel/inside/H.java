package com.test.autoModel.inside;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 内部类的实例化现象
 * bean ---java对象
 * 1、java常识
 * 2、spring
 */
public class H {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(J.class);
		context.refresh();
		context.getBean(J.class);
	}

	static class J {
		public J(H h) {

		}
	}
}
