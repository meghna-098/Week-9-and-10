import java.util.Scanner;

public class SubstringComparison {

    // ✂️ Create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    // 🔍 Compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 📥 Input
        System.out.print("Enter the string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // ✂️ Substring using charAt()
        String manualSubstring = createSubstring(text, start, end);

        // ✂️ Substring using built-in method
        String builtInSubstring = text.substring(start, end);

        // 🔍 Compare both substrings
        boolean isSame = compareStrings(manualSubstring, builtInSubstring);

        // 📊 Output
        System.out.println("\nSubstring using charAt(): " + manualSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);

        if (isSame) {
            System.out.println("Both substrings are SAME.");
        } else {
            System.out.println("Both substrings are DIFFERENT.");
        }

        sc.close();
    }
}