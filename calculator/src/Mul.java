//num1 * num2로 입력
import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();           //첫번째 숫자 입력
        char index = scanner.next().charAt(0);  //기호 입력
        int num2 = scanner.nextInt();           //두번째 숫자 입력

        if (index == '*') {                     //입력한 기호가 *면 작동
            System.out.println(num1*num2);
        }

        scanner.close();                        //스캐너 닫기
    }
}
