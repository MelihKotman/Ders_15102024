package Akademik_uml;

public class Asistan extends Akademisyen{
	protected String yuksekOgr;
	
	public Asistan(String adSoyad, int telefon, String email, String bolum, String gorev, String dersler,
			String yuksekOgr) {
		super(adSoyad, telefon, email, bolum, gorev, dersler);
		this.yuksekOgr = yuksekOgr;
	}
	public void LabaGir() {
		System.out.println(getYuksekOgr() + " " + getAdSoyad() + " laba girdi...");
	}
	protected String getYuksekOgr() {
		return yuksekOgr;
	}

	protected void setYuksekOgr(String yuksekOgr) {
		this.yuksekOgr = yuksekOgr;
	}

}
