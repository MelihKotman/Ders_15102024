package Animal;

public class Fish extends Animal implements Pet {
	String name;
	Fish(String name,int legs){
		super(legs);
		setLegs(0);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void play() {
		System.out.println(getName() + "balik oynamadi... olmus\n");
	}
	public void walk() {
		System.out.println("Balik yurumez...\n");
	}
	public void eat() {
		System.out.println(getName() + "yemini yedi...\n");
	}
}
