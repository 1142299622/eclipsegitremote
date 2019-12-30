package com.ycjsxy;

public class StringBufferdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("jikexueyuan");
		tell(sb);
		System.out.println(sb.toString());
	}
	public static void tell(StringBuffer s) {
		s.append("i love jikexueyuan");
		
	}

}
