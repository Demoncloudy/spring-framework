package com.spring.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yunfeng Sun
 * @date 2021/12/29 23:35
 */
@Slf4j
public class TestSpring {

	@Test
	public void test() {
		AnnotationConfigApplicationContext
				context = new AnnotationConfigApplicationContext();
		context.refresh();
		log.info("test");
	}
}
