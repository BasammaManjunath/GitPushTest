package com.vayana.Java8Features;

public interface DefaultDemo {
	
	void printName();
	 default void test() {
		 System.out.println("Default Method");
	}

}
