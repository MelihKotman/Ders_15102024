package Salesman;

import java.util.Scanner;

public class salerPeopleTest {

	public static void main(String[] args) {
		
		Scanner i = new Scanner(System.in);
		
		System.out.println("Lutfen ad giriniz..." + "\n");
		String ad = i.nextLine();
		
		
		System.out.println("Lutfen soyad giriniz..." + "\n");
		String soyad = i.nextLine();
		
		System.out.println("Lutfen kac urunA satildi giriniz..." + "\n");
		int urunA = i.nextInt();
		
		System.out.println("Lutfen kac urunB satildi giriniz..." + "\n");
		int urunB= i.nextInt();
		
		salerPeople s1 = new salerPeople(ad,soyad,urunA,urunB);
		
		s1.setAd(ad);
		s1.setSoyad(soyad);
		s1.setUrunA_satisMiktari(urunA);
		s1.setUrunB_satisMiktari(urunB);
		
		s1.urunSatisCount(urunA,urunB);
		s1.komisyonHesabi(urunA, urunB);
		s1.maashesabi(urunA, urunB);
		s1.show();
	}

}
