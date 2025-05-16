import java.util.Scanner;

class mul {
    //실수 곱하기
    static double output(double num1, double num2) {
        return num1 * num2;
    }
}

public class Mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //기호 확인
        int index = input.indexOf('*');
        if (index == -1) {
            System.out.println("error");
            return;
        }

        String part1 = input.substring(0, index);               //* 앞 자르기
        String part2 = input.substring(index + 1);    //* 뒤 자르기

        //둘 중 하나라도 소수면 연산 결과를 소수로 처리
        boolean isNum1 = part1.contains(".");   //입력된 숫자가 실수인지 확인하기
        boolean isNum2 = part2.contains(".");

        //둘 중 하나라도 소수면 소수로 출력 아니면 정수로 출력
        if (isNum1 || isNum2) {
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