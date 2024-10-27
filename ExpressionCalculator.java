import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть час (година:хвилина): ");
        String time = scanner.nextLine();

        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (hour < 12) {
            System.out.println("Добрий ранок");
        } else if (hour < 17) {
            System.out.println("Добрий день");
        } else if (hour < 22) {
            System.out.println("Добрий вечір");
        } else {
            System.out.println("Добраніч");
        }

        scanner.close();
    }
}



