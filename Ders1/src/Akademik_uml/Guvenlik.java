package Akademik_uml;

public class Guvenlik extends Memur {
	protected String belge;

	public Guvenlik(String adSoyad, int telefon, String email, String department, String mesai, String belge) {
		super(adSoyad, telefon, email, department, mesai);
		this.belge = belge;
	}

	protected String getBelge() {
		return belge;
	}

	protected void setBelge(String belge) {
		this.belge = belge;
	}
	
	
}
