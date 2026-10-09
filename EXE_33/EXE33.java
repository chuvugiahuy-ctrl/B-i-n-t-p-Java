package EXE_33;

public class EXE33 {

    public static int countWordOccurrences(String text, String targetWord) {
        text = text.toLowerCase();
        targetWord = targetWord.toLowerCase();

        String[] words = text.split("[\\s.,!?]+");

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(targetWord)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text = "Java is easy. Learning Java is fun!";

        int result = countWordOccurrences(text, "java");

        System.out.println("So lan xuat hien cua tu java: " + result);
    }
}