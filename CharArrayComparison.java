import java.util.Scanner;

public class CharArrayComparison {

    // 🔤 User-defined method (without using toCharArray)
    public static char[] getCharsManually(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }

    // 🔍 Compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 📥 Input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // 🔤 User-defined method
        char[] manualArray = getCharsManually(text);

        // 🔤 Built-in method
        char[] builtInArray = text.toCharArray();

        // 🔍 Compare arrays
        boolean isSame = compareCharArrays(manualArray, builtInArray);

        // 📊 Display arrays
        System.out.print("\nCharacters using user-defined method: ");
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nCharacters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        // ✅ Result
        if (isSame) {
            System.out.println("\n\nBoth character arrays are SAME.");
        } else {
            System.out.println("\n\nBoth character arrays are DIFFERENT.");
        }

        sc.close();
    }
}