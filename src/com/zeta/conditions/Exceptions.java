package com.zeta.conditions;

import Helper.Helper;

public class Exceptions {

	public static void main(String[] args) {
		try{
			int n=1/0;
			
		}
		catch(Exception e){
			Helper.lg.error(e);
			
		}
		

	}

}
