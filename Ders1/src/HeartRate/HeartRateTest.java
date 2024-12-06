package HeartRate;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Lutfen ad giriniz..." + "\n");
		String ad = i.nextLine();
		
		
		System.out.println("Lutfen soyad giriniz..." + "\n");
		String soyad = i.nextLine();
		
		
		System.out.println("Lutfen dogum tarihi giriniz...");
		int dogumTarihi = i.nextInt();
		
		
		HeartRate h1 = new HeartRate(ad, soyad, dogumTarihi);
		
		h1.setName(ad);
		h1.setsurName(soyad);
		h1.setDogumTarihi(dogumTarihi);
		
		h1.yasHesabi(dogumTarihi);
		h1.maxHeartRate(dogumTarihi);
		h1.targetHeartRate(dogumTarihi);
		
		h1.show();
	}

}
