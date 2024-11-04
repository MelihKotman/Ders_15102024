package ders2;

public class salerPeople {
	
		private String ad;
		private String soyadi;
		private double haftalik_maas;
		private int urunB_satisMiktari;
		private int urunA_satisMiktari;
		
		salerPeople(String ad,String soyadi,int urunA_satisMiktari, int urunB_satisMiktari){
			this.haftalik_maas = 1500;
		}
		double urunA_fiyati = 60;
		double urunB_fiyati = 70;
		double total_maas = 0;
		double komisyon = 0;
		int urunCount = 0;
		public void setAd(String ad) {
			this.ad = ad;
		}
		public void setSoyad(String soyadi) {
			this.soyadi = soyadi;
		}
		public String getAd() {
			return ad;
		}
		public String getSoyad() {
			return soyadi;
		}
		public void setUrunA_satisMiktari(int urunA_satisMiktari) {
			this.urunA_satisMiktari = urunA_satisMiktari;
		}
		public void setUrunB_satisMiktari(int urunB_satisMiktari) {
			this.urunB_satisMiktari = urunB_satisMiktari;
		}
		public int getUrunA_satisMiktari() {
			return urunA_satisMiktari;
		}
		public int getUrunB_satisMiktari() {
			return urunB_satisMiktari;
		}
		public void urunSatisCount(int urunA_satisMiktari,int urunB_satisMiktari) {
			urunCount = urunA_satisMiktari + urunB_satisMiktari;
		}
		public int geturunSatisCount() {
			return urunCount;
		}
		public void komisyonHesabi(int urunA_satisMiktari,int urunB_satisMiktari) {
			komisyon = (double) (urunA_fiyati * 0.05 * urunA_satisMiktari) + (urunB_fiyati  * 0.05 * urunB_satisMiktari);
		}
		public void maashesabi(int urunA_satisMiktari,int urunB_satisMiktari) {
			total_maas = haftalik_maas + komisyon;
		}
		public double getMaasHesabi() {
			return total_maas;
		}
		public void show() {
			System.out.println("Ad = " + getAd());
			System.out.println("Ad = " + getSoyad());
			System.out.println("Maas = " + getMaasHesabi());
			System.out.println("UrunA satilisi = " + getUrunA_satisMiktari() + "  Fiyati " + urunA_fiyati);
			System.out.println("urunB satilisi = " + getUrunB_satisMiktari() + "  Fiyati " + urunB_fiyati);
			System.out.println("Total urun satis = " + geturunSatisCount());
		}
}
