package ders1;

public class Account {

	private String name;// Object
	private int bakiye;// Object
	
	Account(String name,int bakiye)//Constructor
	{
		this.name = name;
		if(bakiye < 0) {
			System.out.println("Bakiye sifirdan kucuk olamaz");
		}
		else {
			this.bakiye = bakiye;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getMoney() {
		return bakiye;
	}
	// setMoney yapmadik cunku hesap bakiyesi degismemeli
	
	public void depositMoney(int miktar) {
		if(miktar < 0) {
			System.out.println("Eksi para yatiramazsiniz");
		}
		else {
			bakiye = bakiye + miktar;
		}
	}
}
