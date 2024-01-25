package com.zeta.conditions;

public class Lenovo {

	public static void main(String[] args) {
		String s="lenovo";
		char[] c=new char[s.length()];
		for (int i=0;i<s.length();i++){
			if(i%2==0){
			c[i]=s.sub(i).toUpperCase();
			}
		}
		System.out.println(c);
		
	}

}
