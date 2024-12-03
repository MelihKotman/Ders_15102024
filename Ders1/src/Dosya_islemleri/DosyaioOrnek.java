package Dosya_islemleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DosyaioOrnek {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\melih\\Desktop\\dosya.csv");
		
		
		
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fWriter = new FileWriter(f,false);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		
		bWriter.write("Ali;Kemal\n");
		bWriter.write("Hasan;Huseyin\n");
		bWriter.write("Ahmet;Mehmet\n");
		bWriter.write("Murat;Kubat\n");
		bWriter.write("Safa;Emin\n");
		bWriter.close(); //writer'ı kapatman gerekki while icine girsin
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lutfen isim soyad giriniz...\n");
		String control = input.nextLine();
		
		Scanner s = new Scanner(f);
		while(s.hasNextLine()) {
			String satir = s.nextLine();
			String[] split = satir.split(";");
			String fullname = split[0] + " " + split[1];

			if(control.equalsIgnoreCase(fullname)) { //fullname ile control'u buyuk ya da kucuk harf ayirmaksizin kontrol ediyor ve dogruysa giriyoruz
				System.out.println("Basarili giris...\n");
				return;
			}
		}
		System.out.println("Basarisiz giris...\n");
		
		
		
		
		fWriter.close();
		input.close();
		s.close();
		input.close();
	}
}
