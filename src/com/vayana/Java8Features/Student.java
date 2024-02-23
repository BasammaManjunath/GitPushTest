package com.vayana.Java8Features;

@Entity
public class Student {

	@Id
	@Colum(name="STUDENT_NAME")
	private String name;
	
	private int rollnum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	
	
}

