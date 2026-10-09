package EXE_13;
public class EXE3 {

    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Bang cuu chuong 7:");
        printMultiplicationTable(7);

        System.out.println();

        System.out.println("Bang cuu chuong 9:");
        printMultiplicationTable(9);
    }
}