import java.util.Scanner;

public class ManualSplitComparison {

    // 🔢 Find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // ✂️ Split text manually using charAt()
    public static String[] manualSplit(String text) {

        int length = findLength(text);

        // Step 1: Count words (spaces + 1)
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int k = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[k++] = i;
            }
        }

        // Step 3: Extract words using indexes
        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];

            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        // Last word
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[wordCount - 1] = lastWord;

        return words;
    }

    // 🔍 Compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 📥 Input using nextLine()
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // ✂️ Manual split
        String[] manualWords = manualSplit(text);

        // ✂️ Built-in split
        String[] builtInWords = text.split(" ");

        // 🔍 Compare
        boolean result = compareArrays(manualWords, builtInWords);

        // 📊 Display results
        System.out.print("\nManual Split: ");
        for (String w : manualWords) {
            System.out.print("[" + w + "] ");
        }

        System.out.print("\nBuilt-in Split: ");
        for (String w : builtInWords) {
            System.out.print("[" + w + "] ");
        }

        // ✅ Final result
        if (result) {
            System.out.println("\n\nBoth methods give the SAME result.");
        } else {
            System.out.println("\n\nBoth methods give DIFFERENT results.");
        }

        sc.close();
    }
}