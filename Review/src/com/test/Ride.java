package com.test;

import java.util.Scanner;

public class Ride {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double cost = 0;//�����Ǯ;
		System.out.println("������ʱ��");
		int time = input.nextInt();
		System.out.println("���������");
		int distance = input.nextInt();
		input.close();
		if(time>=6&&time<=21) {
			if(distance == 2) {
				cost = 6+1;
			}else {
				cost = 6+1+(distance-2)*1.5;
			}
			
			
		}
		System.out.println("����"+cost);

	}

}
