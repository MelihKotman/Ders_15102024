package ders1;

import java.util.Scanner;

public class Lab1 {

	

	public static void main(String[] args) {
		/*// 1.COZUM
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int toplama;
		int cikarma;
		int carpim;
		int bolum;
		
		System.out.print("Lutfen 1.sayiyi giriniz.");
		number1 =input.nextInt();
		
		System.out.print("Lutfen 2.sayiyi giriniz.");
		number2 =input.nextInt();
		
		toplama = number1 + number2;
		cikarma = number1 - number2;
		carpim = number1 * number2;
		bolum = number1 / number2;
		
		System.out.println(toplama);
		System.out.println(cikarma);
		System.out.println(carpim);
		System.out.println(bolum);
		
			// 2.COZUM
		Scanner input = new Scanner(System.in);
		
		int besBasamakli;
		int onBin;
		int Bin;
		int Yuzler;
		int Onlar;
		int Birler;
		
		System.out.print("Lutfen bes basamakli sayiyi giriniz.");
		besBasamakli =input.nextInt();
		
		onBin = (besBasamakli / 10000);
		Bin = (besBasamakli / 1000) % 10;
		Yuzler = (besBasamakli / 100) % 10;
		Onlar = (besBasamakli / 10) % 10;
		Birler = (besBasamakli / 1) % 10;
		
		System.out.println(onBin);
		System.out.println(Bin);
		System.out.println(Yuzler);
		System.out.println(Onlar);
		System.out.println(Birler);
		
		// 3.COZUM
		Scanner input = new Scanner(System.in);
		 	
		float kilogram;
		float boy;
		float BMI;
		System.out.print("Lutfen kilograminizi giriniz.");
		kilogram =input.nextFloat();
		
		System.out.print("Lutfen boyunuzu giriniz.");
		boy =input.nextFloat();
		
		BMI = (kilogram) / (boy * boy);
		
		if(BMI >= 30) {
			System.out.printf("Obez, BMI = %f",BMI);
		}
		if(BMI <= 29.9 && BMI >= 24.9) {
			System.out.printf("Sisman, BMI = %f",BMI);
		}
		if(BMI <= 24.8  && BMI >= 18.5) {
			System.out.printf("Normal, BMI = %f",BMI);
		}
		if(BMI <= 18.4) {
			System.out.printf("Zayif, BMI = %f",BMI);
		} 
		/*
		 	//4.COZUM
		Scanner input = new Scanner(System.in);
		
		 int yariCap;
		 float PI = (float) 3.14159;
		 float alani;
		 float cevre;
		 
		 System.out.print("Lutfen yaricapi giriniz.");
		 yariCap =input.nextInt();
		 
		 alani =(float) PI * yariCap;
		 cevre = (float) 2 * PI * yariCap;
		 System.out.printf("Yaricapi %d olan dairenin alani = %f ve cevresi = %f",yariCap,alani,cevre);
		
			//5.COZUM
		
		Scanner input = new Scanner(System.in);
		
		int deger;
		int tersDeger = 0;
		
		System.out.print("Lutfen sayi giriniz.");
		deger =input.nextInt();
		 
		if(deger < 0) {
			System.out.print("Lutfen pozitif sayi giriniz..");
		}
		else { 
			while(deger != 0) {
				int kalan = deger % 10;
				tersDeger =(tersDeger * 10 ) + kalan;
				deger /= 10;
			}
			
			}
		System.out.println(tersDeger);
		}
		*/
		
	}

}
