package com.ycjsxy;
class people{
	private String name;
	private int age;
	
	public people(String name,int age) {
		this(); //调用本类中的构造方法;
		this.name = name;
		this.age = age;
	}
	public people() {
		System.out.println("无参构造方法");
		
		
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
	
	public void tell() {
		System.out.println("姓名:"+this.getName()+"年龄"+this.getAge());
	}
	
	
	
	
}

public class This {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			people people1 = new people();
			people1.setAge(20);
			people1.setName("陈嘉霖");
			people1.tell();
			
	
	}

}
