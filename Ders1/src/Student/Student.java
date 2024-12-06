package Student;

public class Student {
	private String name; // Object
	private String surname;
	private int point;
	
	Student(String name, String surname, int point){
		this.name = name;
		this.surname = surname;
		this.point = point;
	}	
	
	public void setName(String name) {
			this.name = name;
	}
	public String getName() {
			return name;
	}
	public void setsurName(String surname) {
			this.surname = surname;
	}
	public String getsurName() {
			return surname;
	}
	public void setPoint(int point) {
			if(point >= 0 && point <= 100 ) {
				this.point = point;
			}
			else {
				System.out.println("lutfen gecerli not giriniz...");
			}
	}
	public int getPuan() {
		return point;
	}
	String harfNotu;
	public void getHarfNotu(int point) {
		if(point >= 0 && point <= 44) {
			harfNotu = "FF";
		}
		else if(point >= 45 && point <= 49) {
			harfNotu = "DD";
			
		}
		else if(point >= 50 && point <= 59) {
			harfNotu = "DC";
		}
		else if(point >=60 && point <= 69) {
			harfNotu = "CC";
		}
		else if(point >= 70 && point <= 79) {
			harfNotu = "BC";
		}
		else if(point >= 80 && point <= 89) {
			harfNotu = "BB";
		}
		else if(point >=90 && point <= 84) {
			harfNotu = "BA";
		}
		else if(point >=85 && point <= 100) {
			harfNotu = "AA";
		}
	
	}
	
	public void show() {
		System.out.println(getName() + "\n" + getsurName() + "\n" + getPuan() + "\n" + harfNotu);
	}
}
