package ders1;

import java.util.Scanner;


public class Accounttest {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		Account k1 = new Account("Ahmet",500);
		Account k2 = new Account("Mehmet", 1200);
		
		System.out.println("Kullanicilar : ");
		
		System.out.print("1. Kullanici :  "  + k1.getName() + "     ");
		System.out.print("Bakiye :  "  + k1.getMoney() + "\n");
		
		System.out.print("2. Kullanici :  "  + k2.getName() + "     ");
		System.out.print("Bakiye :  "  + k2.getMoney() + "\n");
		
		System.out.println("Lutfen girilecek para degerini giriniz...");
		int para = i.nextInt();
		
		k1.depositMoney(para);
		
		System.out.println("Paraniz yatirilmistir...");
		System.out.print("1. Kullanici :  "  + k1.getName() + "     ");
		System.out.print("Bakiye :  "  + k1.getMoney() + "\n");
		
		System.out.print("2. Kullanici :  "  + k2.getName() + "     ");
		System.out.print("Bakiye :  "  + k2.getMoney() + "\n");
		

	}

}
