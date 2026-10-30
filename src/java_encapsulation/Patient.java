package java_encapsulation;

public class Patient {

    // Private data members
    private int patientId;
    private String patientName;
    private int age;
    private String disease;
    private int roomNumber;
    private String treatmentStatus;
    private double medicalBill;

    // Constructor
    public Patient(int patientId, String patientName, int age,
                   String disease, int roomNumber) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
        this.roomNumber = roomNumber;
        this.treatmentStatus = "Admitted";
        this.medicalBill = 0;
    }

    // Getter methods
    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTreatmentStatus() {
        return treatmentStatus;
    }

    public double getMedicalBill() {
        return medicalBill;
    }

    // Setter methods
    public void setPatientName(String patientName) {
        if (patientName != null && !patientName.trim().isEmpty()) {
            this.patientName = patientName;
        } else {
            System.out.println("Invalid patient name");
        }
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid patient age");
        }
    }

    public void setDisease(String disease) {
        if (disease != null && !disease.trim().isEmpty()) {
            this.disease = disease;
        } else {
            System.out.println("Invalid disease");
        }
    }

    public void setRoomNumber(int roomNumber) {
        if (roomNumber > 0) {
            this.roomNumber = roomNumber;
        } else {
            System.out.println("Invalid room number");
        }
    }

    // Update treatment status
    public void updateTreatmentStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.treatmentStatus = status;
        } else {
            System.out.println("Invalid treatment status");
        }
    }

    // Add medical bill
    public void addMedicalBill(double amount) {
        if (amount > 0) {
            medicalBill += amount;
            System.out.println("Medical bill updated successfully");
        } else {
            System.out.println("Invalid bill amount");
        }
    }

    // Display patient details
    public void displayPatientDetails() {

        System.out.println("\n----- PATIENT DETAILS -----");

        System.out.println("Patient ID: " + getPatientId());
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Age: " + getAge());
        System.out.println("Disease: " + getDisease());
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Treatment Status: " + getTreatmentStatus());
        System.out.println("Medical Bill: Rs." + getMedicalBill());
    }
}