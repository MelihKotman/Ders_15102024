package ufakOrnekler;

import java.util.Scanner;

public class testDers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int toplam_not = 0,ogrenci_sayisi,sayac = 1;
		
		System.out.println("Lutfen kac tane ogrenci gireceginizi yaziniz...");
		ogrenci_sayisi = input.nextInt();
		
		while( sayac <= ogrenci_sayisi) {
			
			System.out.println("Lutfen "+ sayac +  ".ogrencinin notunu giriniz...");
			int not = input.nextInt();
			
			if(not < 0 || not > 100) {
				System.out.println("Lutfen 100 ile 0 arasinda puan giriniz...");
				break;
			}
			else {
				
			toplam_not += not;
			sayac++;
			
			}
		}
		float ortalama = (float) toplam_not / ogrenci_sayisi;
		
		System.out.println("Ogrencilerin ortalamasi = " + ortalama);
	}

}
