package com.test.context.bfpp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

@Slf4j(topic = "e")
public class X {
	public X() {
		log.debug("x bd create normal");
	}

	@Bean
	public Y y() {
		log.debug("x @bean create Y");
		return new Y();
	}
}
