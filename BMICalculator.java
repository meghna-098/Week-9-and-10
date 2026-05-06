import java.util.Scanner;

public class BMICalculator {

    // 🧮 Method to calculate BMI and Status for one person
    public static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return values as String array
        return new String[] {
            String.format("%.2f", heightCm),
            String.format("%.2f", weight),
            String.format("%.2f", bmi),
            status
        };
    }

    // 📊 Method to process all persons
    public static String[][] processBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }

        return result;
    }

    // 📋 Display in tabular format
    public static void displayTable(String[][] result) {

        System.out.println("\n----------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    result[i][0], result[i][1], result[i][2], result[i][3]);
        }

        System.out.println("----------------------------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2]; // 10 persons, weight + height

        // 📥 Input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // 🧮 Process BMI
        String[][] result = processBMI(data);

        // 📊 Display result
        displayTable(result);

        sc.close();
    }
}