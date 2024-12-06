package Anket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
public class anket_lab_tekrar {
	public static void  main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		HashMap<String, ArrayList<Integer>> sorunlarMap = new HashMap<String,ArrayList<Integer>>();
		
		String[] sorunlar = {"Yolsuzluk","Ekonomi","Saglik","Egitim","Tarim"};
		
		for(String sorun : sorunlar) {
			sorunlarMap.put(sorun, new ArrayList<>());
		}
		
		boolean devam = true;
		
			while(devam) {
				System.out.println("Lutfen anketimizi oylayiniz(1-10'a kadar ve 0 yaparsaniz anket kapanir)");
				
				for(String sorun : sorunlar) {
					try {
					int cevap = -1;
					
					while(cevap < 0) {
					System.out.println(sorun + " sorunu icin oyunuz nedir?");
					cevap = input.nextInt();
					
					if(cevap == 0) {
						devam = false;
						break;
					}
					
					else if (cevap < 1 || cevap > 10) {
	                    System.out.println("Lütfen 1 ile 10 arasında bir puan girin");
	                    cevap = -1;
					}
					
					else {
						sorunlarMap.get(sorun).add(cevap);
					}
					
					}
					if(!devam) {
						break;
						}
			}
				    catch(InputMismatchException e){
						System.out.println("Lutfen duzgun degerler giriniz");
						input.next();
						
			}
			
			}
				System.out.println("Anketiniz bitmiştir... Teşekkürler.");
	}
			for (String sorun : sorunlar) {
	            ArrayList<Integer> puanlar = sorunlarMap.get(sorun);
	            double toplam = 0;
	            for (int puan : puanlar) {
	                toplam += puan;
	            }
	            double ortalama = toplam / puanlar.size();
	            System.out.printf("%s sorununun ortalama puanı: %.2f\n", sorun, ortalama);
	        }

		}
}
