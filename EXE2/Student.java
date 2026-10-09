
public class Student {
    public static void main(String[] args) {

        Mainone sv1 = new Mainone();
        Mainone sv2 = new Mainone();

        // Student 1
        sv1.name = "Huy";
        sv1.gpa = 5;

        // Student 2
        sv2.name = "Long";
        sv2.gpa = 8;

        if (sv1.isPassed()) {
            System.out.println(sv1.name + " Pass");
        } else {
            System.out.println(sv1.name + " No Pass");
        }

        if (sv2.isPassed()) {
            System.out.println(sv2.name + " Pass");
        } else {
            System.out.println(sv2.name + " No Pass");
        }
    }
}