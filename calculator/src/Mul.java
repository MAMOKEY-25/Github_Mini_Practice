import java.util.Scanner;

class mul {
    static double output(double num1, double num2) {
        return num1 * num2;
    }
}

public class Mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int index = input.indexOf('*');
        if (index == -1) {
            System.out.println("error");
            return;
        }

        String part1 = input.substring(0, index);
        String part2 = input.substring(index + 1);

        boolean isNum1Decimal = part1.contains(".");
        boolean isNum2Decimal = part2.contains(".");

        if (isNum1Decimal || isNum2Decimal) {
            double num1 = Double.parseDouble(part1);
            double num2 = Double.parseDouble(part2);
            System.out.print(mul.output(num1, num2));
        } else {
            int num1 = Integer.parseInt(part1);
            int num2 = Integer.parseInt(part2);
            System.out.print(num1 * num2);
        }

        scanner.close();
    }
}