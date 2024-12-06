package HeartRate;

public class HeartRate {
	private String name;
	private String surName;
	private int dogumTarihi;
	int yas;
	int Mhr;
	float Thr;
	HeartRate(String name, String surName, int dogumTarihi){
		this.name = name;
		this.surName = surName;
		this.dogumTarihi = dogumTarihi;
	}
	public void setName(String name) {
		this.name = name;
}
	public String getName() {
		return name;
}
	public void setsurName(String surName) {
		this.surName = surName;
}
	public String getsurName() {
		return surName;
}
	public void setDogumTarihi(int dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public int getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void yasHesabi(int dogumTarihi) {
		yas = 2024 - dogumTarihi;
	}
	
	public void maxHeartRate(int dogumTarihi) {
		Mhr = 220 - yas;
	}
	
	public void targetHeartRate(int dogumtarihi) {
		Thr = (float) (Mhr * 85) / 100;
	}
	
	public void show() {
		System.out.println(getName()  + "\n" + getsurName() + "\n" + yas + "\n" + Mhr + "\n" + Thr );
	}
}
