package com.zeta.conditions;

import java.util.ArrayList;
import java.util.Collections;

public class Task3str {

	public static void main(String[] args) {
		String s="abcdjnmde12v2134!@#$12!@34nm";
		ArrayList l=new ArrayList();
		ArrayList m=new ArrayList();
		ArrayList n=new ArrayList();
		Collections.addAll(n, "01", "12", "23", "34","45", "56", "67", "78","89" );
		for(int i=0;i<s.length();i++){
			int k=s.charAt(i);
			
			if(k>=97 &&k<=122){
				l.add(s.charAt(i));
			}
			else{
				if(k<48 && k>=57){
					m.add(s.charAt(i));
				}
				else{
					
					
				}
			}
		}
		
		
	}

}
