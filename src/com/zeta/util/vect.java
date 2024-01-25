package com.zeta.util;

import java.util.ListIterator;
import java.util.Vector;

public class vect {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(new Integer(5));
		v.add(new Integer(10));
		v.add(new Integer(15));
		ListIterator lt=v.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		Vector v1=new Vector();
		
		v1.add(new Integer(5));
		v1.add(new Integer(1));
		v1.add(new Integer(15));
		v.retainAll(v1);
		System.out.println(v);
		
		
		
	}

}
