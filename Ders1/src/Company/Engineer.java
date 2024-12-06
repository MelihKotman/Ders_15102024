package Company;

public class Engineer extends Employee implements Person {
	Engineer(){
		//eger engineer sinifinda ici bos bir nesne olusturup get ve set ile yapabiliriz...
	}
	Engineer(String name,String surName){
		super(name,surName);
		setJob("Muhendis");
		setSalary(50000);
		setAnnualPermit(10);
	}
	Engineer(String name, String surName, int salary){
		super(name,surName);
		setSalary(salary);
		if(salary > 50000) {
			setJob("Kidemli Muhendis");
			setAnnualPermit(15);
		}
	}
	protected int makeRaise(int howMuch) {
		int nsalary = getSalary() + howMuch + 10000;
		return nsalary;
	}
	protected void test() {
		super.test();
		System.out.println("Engineer Sinifi...\n"); //Override yapmamak icin bu da ayni constructor gibi islevi var yani ikisini de cagirir...
	}
	protected void infoBox() {
		System.out.println("Muhendis Adı ve Soyadi = " + getName() + " " + getSurName() + "\n");
		System.out.println("Muhendisin maasi = " + getSalary() + "\n");
		System.out.println("Muhedisin yillik izni = " + getAnnualPermit() + "\n");
	}
	public void Gender(String c) {
		String cins = c;
		System.out.println("Muhendis Cinsiyeti :" + cins);
	}
	//get ve sette degisken olmadigi icin...
	// encapsul
}
