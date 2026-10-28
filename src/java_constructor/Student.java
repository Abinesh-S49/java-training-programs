package java_constructor;

public class Student {

	
		String name;
	    int age;
	    String department;

	    // Constructor
	    Student(String n, int a, String d) {
	        name = n;
	        age = a;
	        department = d;
	    }

	    // Method to display student details
	    void display() {
	        System.out.println("Student Name: " + name);
	        System.out.println("Student Age: " + age);
	        System.out.println("Department: " + department);
	        System.out.println("--------------------");
	    }

	    public static void main(String[] args) {

	        // Creating objects
	        Student s1 = new Student("Aji", 21, "Java");
	        Student s2 = new Student("Pri", 22, "Python");

	        // Calling methods
	        s1.display();
	        s2.display();
	    }
	}


