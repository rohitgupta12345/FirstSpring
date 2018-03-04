package com.atos.pojo;

public class LoginPojo {

	private String name;
	private int age;
	private int rollNo;

	public LoginPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "LoginPojo [name=" + name + ", age=" + age + ", rollNo=" + rollNo + "]";
	}
	
	
	
}
