package com.vayana.Java8Features;

@FunctionalInterface
public interface FunctionalInterFaceDemo {

	void singleAbstractMethod();

	
	default void test2() {
		System.out.println("impl test2");
	}
}
