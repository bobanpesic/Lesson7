package boban.pesic;

import java.util.List;

public class Doctor {

	private String name;
	private int yearOfExperience;
	private int numberLicense;
	private int age;

	public Doctor(String name, int yearOfExperience, int numberLicense, int age) {
		super();
		this.name = name;
		this.yearOfExperience = yearOfExperience;
		this.numberLicense = numberLicense;
		this.age = age;
	}

	void doMedicine()

	{
		System.out.println("Doctors helps peoples.");
	}

	void encouragesPatients()

	{
		System.out.println("You must be strong.");

	}

	void visitsPatients()

	{
		System.out.println("I am here!");

	}

	void performSurgery() {
		System.out.println("I'll do the surgery.");
	}

	void examinationPatients() {
		System.out.println("I will examination you");
	}

	void shakesTheWounds()

	{
		System.out.println("Are you ready?");
	}

	void makeHouseCalls() {
		System.out.println("Hello doctor pesic here, can i help you?");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public int getNumberLicense() {
		return numberLicense;
	}

	public void setNumberLicense(int numberLicense) {
		this.numberLicense = numberLicense;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
