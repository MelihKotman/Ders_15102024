package Akademik_uml;

public class Memur extends Calisan implements Devlet {
	protected String department;
	protected String mesai;
	protected int sicilNo;
	public Memur(String adSoyad, int telefon, String email, String department, String mesai) {
		super(adSoyad, telefon, email);
		this.department = department;
		this.mesai = mesai;
	}
	protected void Calis() {
		System.out.println(getDepartment() + " " + getAdSoyad() + " " + getMesai() + " calisiyor...");
	}
	protected String getDepartment() {
		return department;
	}
	protected void setDepartment(String department) {
		this.department = department;
	}
	protected String getMesai() {
		return mesai;
	}
	protected void setMesai(String mesai) {
		this.mesai = mesai;
	}
	public int getSicilNo() {
		return sicilNo;
	}
	protected void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}
}
