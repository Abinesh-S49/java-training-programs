package java_inheritance;


class Product {

    int productid;
    String productName;
    double price;

    Product(int productid, String productName, double price) {
        this.productid = productid;
        this.productName = productName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product ID: " + productid);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }
}

class Electronics extends Product {

    String warranty;

    Electronics(int productid, String productName,
                double price, String warranty) {

        super(productid, productName, price);
        this.warranty = warranty;
    }

    void displayElectronics() {
        System.out.println("\n--- Electronics Details ---");
        displayDetails();
        System.out.println("Warranty: " + warranty);
    }
}

class Clothing extends Product {

    String size;

    Clothing(int productid, String productName,
             double price, String size) {

        super(productid, productName, price);
        this.size = size;
    }

    void displayClothing() {
        System.out.println("\n--- Clothing Details ---");
        displayDetails();
        System.out.println("Dress Size: " + size);
    }
}

class Food extends Product {

    String expiryDate;

    Food(int productid, String productName,
         double price, String expiryDate) {

        super(productid, productName, price);
        this.expiryDate = expiryDate;
    }

    void displayFood() {
        System.out.println("\n--- Food Details ---");
        displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

public class Example2 {

    public static void main(String[] args) {

        Electronics e = new Electronics(
            101, "Laptop", 55000, "2 Years"
        );

        Clothing c = new Clothing(
            102, "T-Shirt", 799, "L"
        );

        Food f = new Food(
            103, "Biscuits", 50, "31-12-2026"
        );

        e.displayElectronics();
        c.displayClothing();
        f.displayFood();
    }
}
