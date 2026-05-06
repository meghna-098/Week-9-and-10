import java.util.Scanner;

public class StringComparison {

    // 🔍 Method to compare strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {

        // If lengths differ → not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // All characters match
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 📥 User input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // 🔍 Using custom method
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        // 🔍 Using built-in equals()
        boolean resultEquals = str1.equals(str2);

        // 📊 Display results
        System.out.println("\nResult using charAt(): " + resultCharAt);
        System.out.println("Result using equals(): " + resultEquals);

        // ✅ Compare both results
        if (resultCharAt == resultEquals) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("Both methods give DIFFERENT results.");
        }

        sc.close();
    }
}