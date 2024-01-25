package com.zeta.conditions;

import java.util.Collections;
import java.util.HashSet;
import java.util.Vector;

public class Hset {

	public static void main(String[] args) {
		HashSet st=new HashSet();
		st.add(67);
		st.add(70);
		st.add(67);
		st.add(70);
		/*Vector v=new Vector();
		v.add(67);
		v.add(70);
		v.add(67);
		v.add(70);
		st.addAll(v);*/
		st=Collections.unmodifiableCollection()
		System.out.println(st);
		
	}

}
