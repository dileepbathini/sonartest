package com.zeta.conditions;

public class Sampleobject {
	int z;

	private Sampleobject(int a)
	{
		z=a;
		System.out.println(z);
		return;
	}
	static{
		System.out.println("...star");
	}
	{
		System.out.println("Unanamed class");
	}

	public static void main(String[] args) {
		Sampleobject obj = new Sampleobject(34);

	}

}
