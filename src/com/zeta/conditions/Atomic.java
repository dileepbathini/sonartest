package com.zeta.conditions;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

	public static void main(String[] args) {
		AtomicInteger a=new AtomicInteger(0);
		System.err.println(a.incrementAndGet());
		System.err.println(a.incrementAndGet());

	}

}
