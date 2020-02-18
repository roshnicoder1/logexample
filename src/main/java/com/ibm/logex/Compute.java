package com.ibm.logex;

import java.util.Date;

import org.apache.log4j.Logger;

public class Compute {
	final static Logger log=Logger.getLogger(Compute.class);
	public int divideNum(int x,int y) {
		return x/y;
	}
	public void Greet() {
		System.out.println("WElcome");
	}
	public static void main(String[] args) {
		log.info("Object is going to get created for compute class");
		Compute c=new Compute();
		log.info("Object is created for compute class");
		log.info("Greet method is invoked");
		log.info(new Date());
		c.Greet();
		try {
			c.divideNum(25, 0);
		}
		catch(Exception e) {
			log.error(e.getMessage());
			
		}
		log.info(new Date());
		
		
		
	}
}
