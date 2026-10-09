package EXE_21;


public class Mainone {

    public static Product getMostExpensive(Product p1, Product p2) {
        if (p1.price > p2.price) {
            return p1;
        } else {
            return p2;
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 1500.0);
        Product p2 = new Product("Phone", 800.0);

        Product result = getMostExpensive(p1, p2);

        System.out.println("Name: " + result.name);
        System.out.println("Price: " + result.price);
    }
}