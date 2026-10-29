package java_polymorphism;


class Login {

    // 1. Login using username and password
    void login(String username, String password) {

        if (username.equals("Abinesh")
                && password.equals("java123")) {

            System.out.println("Login successful using username");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    // 2. Login using ID and password
    void login(int id, String password) {

        if (id == 101 && password.equals("java123")) {

            System.out.println("Login successful using ID");
        } else {
            System.out.println("Invalid ID or password");
        }
    }

    // 3. Login using mobile number and password
    void login(long mobileNumber, String password) {

        if (mobileNumber == 9876543210L
                && password.equals("java123")) {

            System.out.println("Login successful using mobile number");
        } else {
            System.out.println("Invalid mobile number or password");
        }
    }
}

public class Example2_Overloading {

    public static void main(String[] args) {

        Login l = new Login();

        // Login using username
        l.login("Abinesh", "java123");

        // Login using ID
       //  l.login(101, "java123");

        // Login using mobile number
       //  l.login(9876543210L, "java123");
    }
}

