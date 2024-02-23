package com.vayana.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		List<String> list= new ArrayList<String>();
		list.add("NPSB");
		list.add("RTGS");
		list.add("BEFTN");
		list.add("NPSB");
		
		List<String> newList=new ArrayList<String>();
		
		list.stream().distinct().forEach(newList::add);
        
		System.out.println("Before");
		list.stream().forEach(x-> System.out.println(x));
		
		System.out.println("After");
		
		newList.stream().forEach(x-> System.out.println(x));
	}

}
