package com.zeta.conditions;

import org.apache.log4j.Logger;

public class Log4jTest {
	static Logger lg = Logger.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
			lg.info("firstmessage");
	}

}
