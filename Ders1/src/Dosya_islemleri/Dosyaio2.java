package Dosya_islemleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Dosyaio2 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\melih\\Desktop\\deneme1.csv");
		
		if(!f.exists()) {
			f.createNewFile();
		}
		FileWriter fWriter = new FileWriter(f,true);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write("9;8;7\n");
		bWriter.write("6;5;4\n");
		bWriter.close();
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader = new BufferedReader(fReader);
		
		Scanner s = new Scanner(f);
		
		while(s.hasNextLine()) {
			String satir = s.nextLine();
			String[] split = satir.split(";"); //split bize dizi elemanlarini nasil ayirarak koyacagimizi anlatiyoruz...
			for(String d : split) {
				System.out.println("\n" + d);
			}
		}
		fReader.close();
		bReader.close();
		s.close();
	}
		//Veritabaninda her bilgiyi tek bir satirda gosteririz
}
