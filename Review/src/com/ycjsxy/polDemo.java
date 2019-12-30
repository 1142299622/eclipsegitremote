package com.ycjsxy;


class A{
	public void tell1() {
		System.out.println("A -- tell1");	
	}	
	public void tell2() {
		System.out.println("A -- tell2");
}
}
class B extends A{
	public void tell1() {
		System.out.println("B -- tell1");
	}
	public void tell3() {
		System.out.println("B -- tell3");
		
	}
	}

public class polDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b = new B();
//		A a = b;
//		a.tell1(); //tell1重写的,调用的时被复写之后的方法;
//		a.tell2();
		
		A a = new B();
		B b = (B)a;
		b.tell1();
		b.tell2();
		b.tell3();
	
		

	}

}
