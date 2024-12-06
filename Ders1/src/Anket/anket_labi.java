package Anket;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class anket_labi {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		ArrayList<String> sorunlar = new ArrayList<String>();
		sorunlar.add("Yolsuzluk");
		sorunlar.add("Issizlik");
		sorunlar.add("Din");
		sorunlar.add("DisPolitika");
		sorunlar.add("Egitim");
		
		int size_row = sorunlar.size();
		int size_column = 10;
		int katilimci_sayisi = 0;
		int[][] cevaplar = new int[size_row][size_column];
		
		
		boolean anket = true;
		
		while(anket != false) {
			System.out.println("Lutfen anketimizi cevaplandiriniz...(1-10 arasi puan verelim)");
			for(int k = 0; k < size_row; k++) {
				System.out.print(sorunlar.get(k) + " icin puan verin: ");
				int cevap = i.nextInt();
				if(cevap == 0 || cevap < 0 || cevap > 10) {
						anket = false;
						size_column = katilimci_sayisi;
						break;
				}
				else{
				cevaplar[k][katilimci_sayisi] = cevap;
				size_column = katilimci_sayisi;
				}
			}
		System.out.println("Anketiniz bitmistir...Tesekkurler...");
		katilimci_sayisi++;	
		int kapatma = 1;
		System.out.println("Anketi kapatmak istiyorsaniz 0'a basin");
		kapatma = i.nextInt();
		if(kapatma == 0) {
			break;
		}
		}
		
		
		System.out.printf("Sorunlar : " + "%15s" + "%12s" + "%5s" + "%14s" + "%8s"+"\n",sorunlar.get(0),sorunlar.get(1),sorunlar.get(2),sorunlar.get(3),sorunlar.get(4));
		for(int k = 0; k < katilimci_sayisi ; k++) {
			System.out.printf("%d. Katilimci : ", k+1);
			for(int j = 0; j < size_row; j++) {
				System.out.printf("%9d",cevaplar[j][k]);
			}
		System.out.println("\n");
		}
		double[] toplam = new double[size_row];
		double[] ortalama = new double[size_row];
		for(int j = 0; j < size_row; j++) {
		for(int k = 0; k < katilimci_sayisi ; k++) {
			toplam[j] += cevaplar[j][k];
		}
	}
		for(int j = 0; j < size_row; j++) {
			for(int k = 0; k < katilimci_sayisi ; k++) {
				ortalama[j] =  toplam[j] / katilimci_sayisi;
		}
	}	
		for(int k = 0; k < size_row; k++) {
			System.out.printf("%s :" + "%f\n",sorunlar.get(k),ortalama[k]);
		}
	
        i.close();
	}
}	


