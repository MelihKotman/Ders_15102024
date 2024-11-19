package Lab;

public class Worker extends Employee {
	 String department;
	 Worker(String name, String surName){
		 super(name,surName);
		 this.department = "Bilgi Islem";
		 setJob("Teknisyen");
		 setAnnualPermit(10);
		 setSalary(45000);
	 }
	protected String getDepartment() {
		return department;
	}
	protected void setDepartment(String department) {
		this.department = department;
	}
	
}
