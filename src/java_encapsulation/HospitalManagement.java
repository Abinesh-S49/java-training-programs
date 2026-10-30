package java_encapsulation;

public class HospitalManagement {

    public static void main(String[] args) {

        // Creating patient object
        Patient p = new Patient(
                501, "Aji", 22,
                "Fever", 204
        );

        // Display initial details
        System.out.println("INITIAL PATIENT RECORD");
        p.displayPatientDetails();

        // Updating patient details
        System.out.println("\nUPDATING PATIENT INFORMATION");

        p.setAge(23);
        p.setDisease("Viral Fever");
        p.setRoomNumber(305);

        // Adding medical charges
        p.addMedicalBill(1500);
        p.addMedicalBill(2500);

        // Updating treatment status
        p.updateTreatmentStatus("Under Treatment");

        // Trying invalid values
        System.out.println("\nVALIDATION CHECK");

        p.setAge(-5);
        p.addMedicalBill(-1000);

        // Display final details
        System.out.println("\nFINAL PATIENT RECORD");
        p.displayPatientDetails();
    }
}