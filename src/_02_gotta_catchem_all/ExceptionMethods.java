package _02_gotta_catchem_all;

import javax.swing.Spring;

public class ExceptionMethods {
	double divide(double a, double b) {
		double r = (a/b);
		return r;
	}
	
	String reverseString(String s) {
		String reverse = "";
		for(int i = s.length(); i > 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse; 
	}
}
