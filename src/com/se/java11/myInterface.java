package com.se.java11;

@FunctionalInterface
public interface myInterface {
	
	int add(int i, int j);
	default int add(int i) {
		return 10;
	}
	
	static int add2(int i) {
		return 20;
	}

}
