package com.zeta.util;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrListExample {

	public static void main(String[] args) {
		ArrayList ls1 = new ArrayList();
		
		ls1.add(new Integer(0));
		ls1.add(new Integer(1));
		ArrayList ls = new ArrayList();
		ls.add(new Integer(34));
		ls.add(new Integer(44));
		ls.add(new Integer(54));
		ls.add(new Integer(34));
		ls.add(new String("Zeta"));
		System.out.println(ls);
		System.out.println(ls.size());
		System.out.println(ls.get(4));
		ls.addAll(ls1);
		ListIterator lt=ls.listIterator();
		while(lt.hasNext()){
			System.out.println(lt.next());
		}
		System.out.println(ls);

		



	}

}
