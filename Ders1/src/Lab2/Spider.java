package Lab2;

public class Spider extends Animal{
	protected Spider(int legs){
		super(legs);
		setLegs(8);
	}
	public void eat() {
		System.out.println("Orumcek sinegini yedi...\n");
	}
}
