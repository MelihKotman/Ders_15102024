package ufakOrnekler;

import java.math.*;

public class bilesikFaiz {

	public static void main(String[] args) {
		double principal = 1000;
		double rate = 0.05;
		
		System.out.printf("%s%20s%n"," Year"," Amonut on deposit");
		
		for(int i = 1; i <= 10; i++) {
			
			double amount = principal* Math.pow(1 + rate, i);
			System.out.print(i + "           " + amount + "\n");
		}
	}

}
