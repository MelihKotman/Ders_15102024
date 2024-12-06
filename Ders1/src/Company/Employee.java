package Company;

public class Employee {
	private String name, surName, job;
	private int salary,annualPermit;
	public Employee(){
		
	}
	public Employee(String name,String surName){
		this.name = name;
		this.surName = surName;
		this.job = "Calisan";
		this.salary = 30000;
		this.annualPermit = 10;
	}
	Employee(String name, String surName,int salary){
		this.name = name;
		this.surName = surName;
		this.salary = salary;
		if(salary > 30000) {
			this.job = "Kidemli Calisan";
			this.annualPermit += 5; //this yazmaya gerek yok...
		}
	}
	protected int makeRaise(int howMuch) {
		int nsalary = salary + howMuch;
		return nsalary;
	}
	protected void infoBox() {
		System.out.println("Calisan Adı ve Soyadi = " + getName() + " " + getSurName() + "\n");
		System.out.println("Calisanin maasi = " + getSalary() + "\n");
		System.out.println("Calisanin yillik izni = " + getAnnualPermit() + "\n");
	}
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getSurName() {
		return surName;
	}
	protected void setSurName(String surName) {
		this.surName = surName;
	}
	protected String getJob() {
		return job;
	}
	protected void setJob(String job) {
		this.job = job;
	}
	protected int getSalary() {
		return salary;
	}
	protected void setSalary(int salary) {
		this.salary = salary;
	}
	protected int getAnnualPermit() {
		return annualPermit;
	}
	protected void setAnnualPermit(int annualPermit) {
		this.annualPermit = annualPermit;
	}
	protected void test() {
		System.out.println("Employee Sinifi...\n");
	}
}
