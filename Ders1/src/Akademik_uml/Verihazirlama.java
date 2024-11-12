package Akademik_uml;

public class Verihazirlama extends Memur{
	protected String gorev;

	public Verihazirlama(String adSoyad, int telefon, String email, String department, String mesai, String gorev) {
		super(adSoyad, telefon, email, department, mesai);
		this.gorev = gorev;
	}
	protected void yazisma() {
		System.out.println(getDepartment() + " " +getGorev() + " " + getAdSoyad() + " yazisma yapti...");
	}
	protected String getGorev() {
		return gorev;
	}

	protected void setGorev(String gorev) {
		this.gorev = gorev;
	}
	
}
