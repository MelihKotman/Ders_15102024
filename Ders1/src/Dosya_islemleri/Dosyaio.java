package Dosya_islemleri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dosyaio {
// throw bize try catch yerine kullanma sansi veriyor...
// throw direkt yazdirir ama try catchte bir getaway vardir
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\melih\\Desktop\\deneme1.txt");
		
		if(!f.exists()) {
			f.createNewFile();
		}
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Hasan Hüseyin ");
		a.add("30"); //Dosyaya her elemani koyarken string sekilde koyariz ve onu cekerken de turunu degistirebiliriz
		String q = " \nMerhaba";
		
		FileWriter fWriter = new FileWriter(f,true); //file ve boolean degeri koyuyoruz... Bu bool degeri okuma yazma yaptirtmayi denetliyor
		BufferedWriter bWriter = new BufferedWriter(fWriter); //Bir nesneyi objeyi degiskeni buffer olusturarak guvenli sekilde atariz dosyaya
		for(String d : a){		
			bWriter.write(d);
		}
		bWriter.write(q);
		
		FileReader fReader = new FileReader(f);
		BufferedReader bReader = new BufferedReader(fReader);
		
	
	
		 //Farkli okuma sekilleri vardir burada misal bir satiri okuyoruz
		String line = bReader.readLine();
		System.out.println(line);
		
		
		bWriter.close();
		fWriter.close();
		fReader.close();
		bReader.close();
		
		
		
	}

}
