package boban.pesic;

public class Surgeon extends Doctor {

	public Surgeon(String name, int yearOfExperience, int numberLicense, int age) {
		super(name, yearOfExperience, numberLicense, age);
	}

	void performSurgery() {
		System.out.println("Surgeon sad: when you wake up from anesthesia you're better.");
	}

	void examinationPatients() {
		System.out.println("Surgeon sad: does this hurt you?");
	}
	
	void shakesTheWounds ()
	
	{
		System.out.println("Surgeon sad : be brave!");
	}

}
