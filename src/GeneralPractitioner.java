package boban.pesic;

public class GeneralPractitioner extends Doctor {

	public GeneralPractitioner(String name, int yearOfExperience, int numberLicense, int age) {
		super(name, yearOfExperience, numberLicense, age);

	}

	void makeHouseCalls() {

		System.out.println("Hello,doctor Pesic here, how can i help you?");
	}

	void visitsPatients()

	{
		System.out.println("Visits patients and gives them therapy");

	}

	void encouragesPatients()

	{
		System.out.println("Doctrors says: hope dies last.");

	}

}
