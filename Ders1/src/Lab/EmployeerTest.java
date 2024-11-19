package Lab;

public class EmployeerTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ahmet","Mehmet");
		//e1.infoBox();
		
		Employee e2 = new Employee("Hasan","Huseyin",40000);
		//e2.infoBox();
		
		//System.out.println("Maas Artisindan Sonra\n");
		e2.setSalary(e2.makeRaise(10000));
		//e2.infoBox();
		
		/*Engineer en1 = new Engineer();
		en1.test();//Override fonksiyon icin
		en1.setName("Ali");
		en1.setSurName("Veli");
		en1.setJob("Bas Muhendis");
		en1.setAnnualPermit(30);
		en1.setSalary(100000);
		en1.infoBox();
		*/
		//Polymorphism sinavda var
		Employee e3 = new Engineer("Yusuf","Yildiz",65000);
		e3.infoBox();
		//Bazi ozelliklerini tanimlamak istiyorsan constructor yapman lazim
		//Constructor'ı java bize tahsis edebilir ayrica	
	}

}
