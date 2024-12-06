package Animal;

public class Cat extends Animal implements Pet {
	String name;
	Cat(String name,int legs){
		super(legs);
		setLegs(4);
	}
	Cat(int legs){
		super(legs);
		setLegs(4);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void play() {
		System.out.println(getName() + "Kedi yumakla oynadi");
	}
	public void eat() {
		System.out.println(getName() + "Kedi mamasini yedi");
	}
}
