package com.ycjsxy;
class people{
	private String name;
	private int age;
	
	public people(String name,int age) {
		this(); //���ñ����еĹ��췽��;
		this.name = name;
		this.age = age;
	}
	public people() {
		System.out.println("�޲ι��췽��");
		
		
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
		System.out.println("����:"+this.getName()+"����"+this.getAge());
	}
	
	
	
	
}

public class This {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			people people1 = new people();
			people1.setAge(20);
			people1.setName("�¼���");
			people1.tell();
			
	
	}

}
