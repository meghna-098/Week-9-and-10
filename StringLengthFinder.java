import java.util.Scanner;

public class StringLengthFinder {

    // 🔢 Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;

        try {
            // Infinite loop
            while (true) {
                str.charAt(count); // try accessing character
                count++;           // increment count
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds length
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 📥 Input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // 🔢 User-defined method
        int manualLength = findLength(text);

        // 🔢 Built-in method
        int builtInLength = text.length();

        // 📊 Output
        System.out.println("\nLength using user-defined method: " + manualLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        // ✅ Compare results
        if (manualLength == builtInLength) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("Both methods give DIFFERENT results.");
        }

        sc.close();
    }
}