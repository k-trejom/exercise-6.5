import java.util.Scanner;

public class SortNumbers {
    public static void displayNumbers(double num1, double num2, double num3) {
        double min = Math.min(num1, Math.min(num2, num3));
        double max = Math.max(num1, Math.max(num2, num3));
        double mid = num1 + num2 + num3 - min - max;

        System.out.println("The numbers in increasing order: " + min + ", " + mid + "," + max);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displayNumbers(num1, num2, num3);
    }
}
//10272024_TrejoKevin_Exercise6.5
