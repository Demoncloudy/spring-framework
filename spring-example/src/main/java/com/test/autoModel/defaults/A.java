package com.test.autoModel.defaults;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@Component("aa")
@Slf4j(topic = "e")
public class A  implements ExampleAware{

	ExampleBean exampleBean;

	public A(){
		log.debug("default Constructor a");

	}



	public A(C c,B b,ExampleBean exampleBean){
		log.debug("Constructor from c b,exampleBean");
		//this.exampleBean =exampleBean;
	}

	public A(C c) {
		log.debug("default Constructor c");
	}

	public A(B b) {
		log.debug("default Constructor b");
	}
	@Override
	public void setExampleBean(ExampleBean exampleBean) {
		//this.exampleBean=exampleBean;
	}

	public ExampleBean getExampleBean() {
		return exampleBean;
	}
}
