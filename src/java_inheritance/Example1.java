package java_inheritance;


class Employee {

    int empid;
    String empname;
    double basicSalary;

    Employee(int empid, String empname, double basicSalary) {
        this.empid = empid;
        this.empname = empname;
        this.basicSalary = basicSalary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class Manager extends Employee {

    Manager(int empid, String empname, double basicSalary) {
        super(empid, empname, basicSalary);
    }

    void calculateSalary() {
        double bonus = basicSalary * 20 / 100;
        double totalSalary = basicSalary + bonus;

        System.out.println("\n--- Manager Details ---");
        displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class Developer extends Employee {

    Developer(int empid, String empname, double basicSalary) {
        super(empid, empname, basicSalary);
    }

    void calculateSalary() {
        double bonus = basicSalary * 15 / 100;
        double totalSalary = basicSalary + bonus;

        System.out.println("\n--- Developer Details ---");
        displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

class Intern extends Employee {

    Intern(int empid, String empname, double basicSalary) {
        super(empid, empname, basicSalary);
    }

    void calculateSalary() {
        double bonus = basicSalary * 5 / 100;
        double totalSalary = basicSalary + bonus;

        System.out.println("\n--- Intern Details ---");
        displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Example1 {

    public static void main(String[] args) {

        Manager m = new Manager(101, "Aji", 50000);
        Developer d = new Developer(102, "Khan", 40000);
        Intern i = new Intern(103, "Prijesh", 15000);

        m.calculateSalary();
        d.calculateSalary();
        i.calculateSalary();
    }
}
