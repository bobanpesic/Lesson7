package boban.pesic;

import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
    Surgeon surgeon = new Surgeon (null, 0, 0, 0);
    GeneralPractitioner  generalPractitioner = new GeneralPractitioner(null, 0, 0, 0);
    
    
   /* surgeon.doMedicine();
    surgeon.performSurgery();
    surgeon.examinationPatients();
    surgeon.shakesTheWounds();
    
    generalPractitioner.doMedicine();
    generalPractitioner.makeHouseCalls();
    generalPractitioner.encouragesPatients();
    generalPractitioner.visitsPatients();*/  //another way
    
    	ArrayList<Doctor> doctorS = new ArrayList<Doctor>();
		doctorS.add(surgeon);
		
		for (Doctor doctor : doctorS) {
			doctor.doMedicine();
			doctor.performSurgery();
			doctor.examinationPatients();
			doctor.shakesTheWounds();
   
	   ArrayList<Doctor> doctorG = new ArrayList<Doctor>();
	   doctorG.add(generalPractitioner);
		
		for (Doctor doctorg : doctorG)
		doctor.doMedicine();
        doctor.makeHouseCalls();
		doctor.encouragesPatients();
		doctor.visitsPatients();
		}
    
	}

}
