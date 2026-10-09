package EXE_23;
public class Maintwo {

    public static void applyDiscount(Order order, double discountPercent) {
        double discount = order.getTotalAmount() * discountPercent / 100;
        double newTotal = order.getTotalAmount() - discount;

        order.setTotalAmount(newTotal);
    }

    public static void main(String[] args) {

        Order order = new Order("ORD01", 1000000);

        System.out.println("Tong tien ban dau: " + order.getTotalAmount() + " VND");

        applyDiscount(order, 15);

        System.out.println("Tong tien sau giam gia: " + order.getTotalAmount() + " VND");
    }
}
