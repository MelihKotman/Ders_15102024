package ders1;

import java.util.Scanner;

public class Studenttest {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Lutfen ad giriniz..." + "\n");
		String name = i.nextLine();
		
		
		System.out.println("Lutfen soyad giriniz..." + "\n");
		String surname = i.nextLine();
		
		System.out.println("Lutfen puan giriniz...");
		int point = i.nextInt();
		
		Student o1 = new Student(name, surname, point);
		
		o1.getHarfNotu(point);
		
		
		 i.nextLine();
		System.out.println("Lutfen ad giriniz..." + "\n");
		String name2 = i.nextLine();
		
		
		System.out.println("Lutfen soyad giriniz..." + "\n");
		String surname2 = i.nextLine();
		
		System.out.println("Lutfen puan giriniz...");
		int point2 = i.nextInt();
		
		Student o2 = new Student(name2, surname2, point2);
		
		o2.getHarfNotu(point2);
		
		o1.show();
		o2.show();
	}

}
