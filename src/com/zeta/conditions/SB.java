package com.zeta.conditions;

public class SB {

	public static void main(String[] args) {
		StringBuffer t=new StringBuffer(18);
		t.append("dilep@gmail.com");
		if(t.length()>18||t.length()<10){
			System.out.println("Invalid");
		}
		else{
			int a=t.length();
			
			if(t.substring(a-10, a)=="@gmail.com" ||t.substring(a-9, a)=="@gmail.in"||t.substring(a-10, a)=="@gmail.biz"||t.substring(a-11, a)=="@gmail.milt" ){
				System.out.println("Valid email");
			}
			else{
				System.out.println(t);
				System.out.println("Invalid mail");
				
			}
		}
	

	}

}
