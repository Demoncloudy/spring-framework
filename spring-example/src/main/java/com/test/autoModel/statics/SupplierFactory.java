package com.test.autoModel.statics;

import org.springframework.beans.factory.annotation.Lookup;

public class SupplierFactory {
	@Lookup
	public static Object getObject() {
		return new A(2.0f);
	}

	public Object instanceObject() {
		return new A(2.0f);
	}
}
