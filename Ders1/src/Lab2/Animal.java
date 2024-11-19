package Lab2;

public class Animal {
	protected int legs;
	Animal(int legs){
		this.legs = legs;
	}
	protected void walk() {
		System.out.println("Hayvan yurudu...\n");
	}
	protected void eat() {
		System.out.println("Hayvan yemegini yedi...\n");
	}
	protected int getLegs() {
		return legs;
	}
	protected void setLegs(int legs) {
		this.legs = legs;
	}
}
