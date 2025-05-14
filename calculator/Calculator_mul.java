import java.util.Scanner;

class Mul {
    static double output(double a, double b) {
         return a * b;
    }
}
public class Calculator_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double num2 = sc.nextDouble();

        if (operator == '*') {
            System.out.print(Mul.output(num1, num2));
        }
        sc.close();
    }
}
