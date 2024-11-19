package Lab2;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a1 = new Animal(4);
		a1.eat();
		a1.walk();
		Spider s1 = new Spider(8);
		s1.eat();
		Fish f1 = new Fish("Osman",0);
		f1.setName("Osman");
		f1.setLegs(4);
		f1.play();
		f1.walk();
		f1.eat();
		Cat c1 = new Cat("Safiye",4);
		c1.setName("Safiye");
		c1.setLegs(4);
		c1.eat();
		c1.play();
	}

}
