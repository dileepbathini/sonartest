package com.zeta.conditions;

public class OOPS1 {

	public static void main(String[] args) {
		String t="Zeta Sodexo Zeta Sodexo Zeta Sodexo Zeta Sodexo ";
		char a='a';
		char s='S';
		int b=0;
		int c=0;
		char d=' ';
		int e=0;
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)==a){
				b=b+1;
			}
		}
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)==s){
				c=c+1;
			}
		}
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)!=d){
				e=e+1;
			}
		}
		
		
		System.out.println(b+" "+c+" "+e);
		
		
		// TODO Auto-generated method stub

	}
	

}
