package com.test.batis.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "e")
//@Component
public class F implements IAware {
	K k;

	public K getK() {
		return k;
	}

	/**
	 * 1、是不是提供给我来完成依赖注入的
	 * 2、正常的java语法
	 *
	 * @param k 不希望setK被spring调用
	 */
	public void setK(K k) {
		log.debug("Fk:{}", k);
		this.k = k;
	}
}
