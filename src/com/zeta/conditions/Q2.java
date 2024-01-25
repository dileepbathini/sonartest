package com.zeta.conditions;

public class Q2 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);

			System.out.println("it is a number");
		} catch (Exception err) {
			System.out.println("it is a char");
		}
		// TODO Auto-generated method stub

	}

}
