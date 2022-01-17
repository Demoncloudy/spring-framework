package com.test.autoModel.defaults;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class M {

		//@Autowired
//	@Resource
	private N n;

	public M() {
		log.debug("default constructor m");
	}

	// Autowired手动注入, 破环注入模型
	@Autowired
	public M(N n) {
		log.debug("constructor N:{}", n);
	}

	// 根据set后面的找,是byname, 根据n的类型找是bytype
	public void setN(N n) {
		log.debug("setter N:{}", n);
		//this.n = n;
	}


//	setX(X x){
//		xdskfs;kfl;
//	}


//	public N getN() {
//		return n;
//	}
}
